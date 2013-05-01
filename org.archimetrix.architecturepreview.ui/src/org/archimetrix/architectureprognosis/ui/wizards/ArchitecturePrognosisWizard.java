package org.archimetrix.architectureprognosis.ui.wizards;


import java.util.List;

import org.archimetrix.architecturepreview.ArchitecturePreview;
import org.archimetrix.architectureprognosis.ui.ArchitecturePrognosisUIPlugin;
import org.archimetrix.architectureprognosis.ui.views.ArchitecturePrognosisView;
import org.archimetrix.commons.ResourceLoader;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.reclipse.structure.inference.annotations.ASGAnnotation;
import org.storydriven.storydiagrams.activities.Activity;

import eu.qimpress.samm.staticstructure.Repository;
import org.somox.sourcecodedecorator.SourceCodeDecoratorPackage;


/**
 * The wizard that starts the architecture prognosis. It can be opened per menu bar or via a context
 * menu on a selected bad smell occurrence in the Relevant Bad Smells View.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ArchitecturePrognosisWizard extends Wizard
{

   private static final class ArchitecturePrognosisJob extends Job
   {
      private final String metricValuesPath;

      private List<List<String>> prognosisResults;

      private ArchitecturePreview prognosis;

      private ASGAnnotation annotation;

      private Activity activity;


      public ArchitecturePrognosisJob(final String name, final ASGAnnotation selectedAnnotation,
            final Activity selectedStrategy, final String metricValuesFilePath)
      {
         super(name);
         this.annotation = selectedAnnotation;
         this.activity = selectedStrategy;
         this.metricValuesPath = metricValuesFilePath;
      }


      @Override
      protected IStatus run(final IProgressMonitor monitor)
      {
         // TODO: use monitor better
         monitor.beginTask(JOB_NAME, 100);
         this.prognosis = new ArchitecturePreview();
         this.prognosisResults = this.prognosis.start(this.annotation, this.activity, this.metricValuesPath);
         monitor.worked(99);
         monitor.done();
         return Status.OK_STATUS;
      }


      public List<List<String>> getPrognosisResults()
      {
         return this.prognosisResults;
      }


      public Repository getNewSammRep()
      {
         return this.prognosis.getNewSammRep();
      }


      public Repository getOriginalSammRep()
      {
         return this.prognosis.getOriginalSammRep();
      }
   }

   private static final String ARCHITECTURE_PROGNOSIS_WIZARD_TITLE = "Architecture Preview";

   private static final String JOB_NAME = "Architecture Preview";

   protected ArchitecturePrognosisWizardPage page;

   protected BadSmellsWizardPage badSmellsPage;

   protected ReengineeringStrategiesWizardPage reengineeringStrategiesPage;

   private ASGAnnotation selectedAnnotation;

   private final ASGAnnotation selectedAnnotationFromRelevantBadSmellsView;

   private Resource deficienciesResource;

   private Resource reengineeringStrategiesResource;


   public ArchitecturePrognosisWizard()
   {
      this(null);
   }


   public ArchitecturePrognosisWizard(final ASGAnnotation selectedAnnotation)
   {
      super();

      // registers the source code decorator package, if it has not been done before
      SourceCodeDecoratorPackage.eINSTANCE.eClass();

      setWindowTitle(ARCHITECTURE_PROGNOSIS_WIZARD_TITLE);

      this.selectedAnnotationFromRelevantBadSmellsView = selectedAnnotation;
      setDialogSettings();
   }


   private void setDialogSettings()
   {
      IDialogSettings settings = ArchitecturePrognosisUIPlugin.getDefault().getDialogSettings();
      IDialogSettings section = settings.getSection(getClass().getCanonicalName());
      if (section == null)
      {
         section = settings.addNewSection(getClass().getCanonicalName());
      }
      setDialogSettings(section);
   }


   @Override
   public boolean performFinish()
   {
      storePageSettings();

      final ArchitecturePrognosisJob job = new ArchitecturePrognosisJob(JOB_NAME, getSelectedAnnotation(),
            this.reengineeringStrategiesPage.getSelectedStrategy(), this.page.getMetricValuesFilePath());
      job.setUser(true);
      job.schedule();
      job.addJobChangeListener(new JobChangeAdapter()
      {
         public void done(final org.eclipse.core.runtime.jobs.IJobChangeEvent event)
         {
            Display.getDefault().asyncExec(new Runnable()
            {
               @Override
               public void run()
               {
                  List<List<String>> results = job.getPrognosisResults();
                  showArchitecturePrognosisResults(results, job.getNewSammRep(), job.getOriginalSammRep());

               }
            });

         }
      });
      return true;
   }


   private void showArchitecturePrognosisResults(final List<List<String>> results, final Repository newSAMM,
         final Repository oldSAMM)
   {
      IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
      try
      {
         ArchitecturePrognosisView architecturePrognosisView = (ArchitecturePrognosisView) activePage
               .showView(ArchitecturePrognosisView.ID);
         architecturePrognosisView.setInput(results);
         architecturePrognosisView.setNewComponentsTreeInput(newSAMM);
         architecturePrognosisView.setOriginalComponentsTreeInput(oldSAMM);
         architecturePrognosisView.setFocus();
      }
      catch (PartInitException e)
      {
         e.printStackTrace();
      }
   }


   protected void storePageSettings()
   {
      this.page.saveSettings();
   }


   @Override
   public IWizardPage getNextPage(final IWizardPage page)
   {
      IWizardPage next = super.getNextPage(page);
      if (next instanceof BadSmellsWizardPage)
      {
         if (selectedAnnotationFromRelevantBadSmellsView == null)
         {
            Resource badSmellsRes = getBadSmellsResource();
            this.badSmellsPage.setSelection(badSmellsRes);
         }
      }
      else if (next instanceof ReengineeringStrategiesWizardPage)
      {
         Resource reengineeringStrategiesRes = getReengineeringStrategiesResource();
         this.reengineeringStrategiesPage.setSelection(reengineeringStrategiesRes);
      }
      return next;
   }


   public Resource getBadSmellsResource()
   {
      if (this.deficienciesResource == null)
      {
         String badSmellsFilePath = this.page.getBadSmellsFilePath();
         deficienciesResource = ResourceLoader.loadResource(badSmellsFilePath);
      }
      return deficienciesResource;
   }


   public Resource getReengineeringStrategiesResource()
   {
      if (this.reengineeringStrategiesResource == null)
      {
         String reengineeringStrategysFilePath = this.page.getReengineeringStrategiesFilePath();
         reengineeringStrategiesResource = ResourceLoader.loadResource(reengineeringStrategysFilePath);
      }
      return reengineeringStrategiesResource;
   }


   @Override
   public void addPages()
   {
      this.page = new ArchitecturePrognosisWizardPage(ARCHITECTURE_PROGNOSIS_WIZARD_TITLE, this,
            this.selectedAnnotationFromRelevantBadSmellsView);
      addPage(this.page);
      if (this.selectedAnnotationFromRelevantBadSmellsView == null)
      {
         this.badSmellsPage = new BadSmellsWizardPage(this);
         addPage(this.badSmellsPage);
      }
      this.reengineeringStrategiesPage = new ReengineeringStrategiesWizardPage(this);
      addPage(this.reengineeringStrategiesPage);
   }


   public void setSelectedAnnotation(final ASGAnnotation annotation)
   {
      this.selectedAnnotation = annotation;
   }


   public ASGAnnotation getSelectedAnnotation()
   {
      if (this.selectedAnnotation != null)
      {
         return this.selectedAnnotation;
      }
      else
      {
         return this.selectedAnnotationFromRelevantBadSmellsView;
      }
   }
}
