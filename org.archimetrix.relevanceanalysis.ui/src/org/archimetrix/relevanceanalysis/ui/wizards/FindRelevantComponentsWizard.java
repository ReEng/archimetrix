package org.archimetrix.relevanceanalysis.ui.wizards;


import metricvalues.MetricValuesModel;

import org.archimetrix.commons.ResourceLoader;
import org.archimetrix.relevanceanalysis.AbstractRelevanceAnalysis;
import org.archimetrix.relevanceanalysis.RelevanceAnalysisPlugin;
import org.archimetrix.relevanceanalysis.components.RelevantComponentAnalysis;
import org.archimetrix.relevanceanalysis.ui.RelevanceAnalysisUIPlugin;
import org.archimetrix.relevanceanalysis.ui.views.RelevantComponentsView;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import eu.qimpress.sourcecodedecorator.ComponentImplementingClassesLink;
import eu.qimpress.sourcecodedecorator.SourceCodeDecoratorPackage;
import eu.qimpress.sourcecodedecorator.SourceCodeDecoratorRepository;


/**
 * This class represents the wizard that is used to start the component relevance analysis. It
 * consists of one page: the FindRelevantComponentsWizardPage.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class FindRelevantComponentsWizard extends Wizard
{

   private static final class ComponentRelevanceAnalysisJob extends Job
   {
      private final String metricValuesPath;

      private final String scdPath;

      private Object analysisResult;


      private ComponentRelevanceAnalysisJob(final String name, final String metricValuesPath, final String scdPath)
      {
         super(name);
         this.metricValuesPath = metricValuesPath;
         this.scdPath = scdPath;
      }


      @Override
      protected IStatus run(final IProgressMonitor monitor)
      {
         monitor.beginTask(JOB_NAME, 100);
         log("Component Relevance Analysis started.");
         
         Resource scdRes = loadSourceCodeDecorator(monitor);
         Resource metricValuesRes = loadMetricValuesModel(monitor);
         analyzeComponentRelevance(monitor, scdRes, metricValuesRes);
         
         monitor.done();
         return Status.OK_STATUS;
      }


      private void analyzeComponentRelevance(final IProgressMonitor monitor,
            Resource sourceCodeDecorator, Resource metricValues)
      {
         MetricValuesModel metricValuesModel = (MetricValuesModel) metricValues.getContents().get(0);
         SourceCodeDecoratorRepository scdModel = (SourceCodeDecoratorRepository) sourceCodeDecorator.getContents().get(0);
         AbstractRelevanceAnalysis<ComponentImplementingClassesLink> analysis = new RelevantComponentAnalysis(scdModel, metricValuesModel);
         
         monitor.subTask("Analyzing component relevance...");
         log("Starting analysis");
         analysis.startAnalysis();
         log("Analysis finished");
         monitor.worked(49);
         this.analysisResult = analysis.getResult();
      }


      private Resource loadMetricValuesModel(final IProgressMonitor monitor)
      {
         monitor.subTask("Loading metric values model...");
         Resource metricValuesRes = ResourceLoader.loadResource(this.metricValuesPath);
         monitor.worked(25);
         log("Metric values model loaded.");
         return metricValuesRes;
      }


      private Resource loadSourceCodeDecorator(final IProgressMonitor monitor)
      {
         monitor.subTask("Loading source code decorator...");
         Resource scdRes = ResourceLoader.loadResource(this.scdPath);
         monitor.worked(25);
         log("Source Code Decorator loaded.");
         return scdRes;
      }


      public Object getAnalysisResult()
      {
         return this.analysisResult;
      }
   }


   private static final String PAGE_TITLE = "Find Relevant Components";

   private static final String JOB_NAME = "Component Relevance Analysis";

   protected FindRelevantComponentsWizardPage page;


   public FindRelevantComponentsWizard()
   {
      super();

      SourceCodeDecoratorPackage.eINSTANCE.eClass();

      setWindowTitle(PAGE_TITLE);

      IDialogSettings settings = RelevanceAnalysisUIPlugin.getDefault().getDialogSettings();
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

      final String metricValuesPath = this.page.getMetricValuesFilePath();
      final String scdPath = this.page.getSCDFilePath();

      final ComponentRelevanceAnalysisJob job = new ComponentRelevanceAnalysisJob(JOB_NAME, metricValuesPath, scdPath);
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
                  Object results = job.getAnalysisResult();
                  showResultView(results);
               }
            });

         }
      });
      return true;
   }


   private void showResultView(final Object results)
   {
      IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
      try
      {
         IViewPart relevantComponentsView = activePage.showView(RelevantComponentsView.ID);
         ((RelevantComponentsView) relevantComponentsView).setInput(results);
         relevantComponentsView.setFocus();
      }
      catch (PartInitException e)
      {
         RelevanceAnalysisUIPlugin.getDefault().logError("Error occurred during opening result view.", e);
      }
   }


   protected void storePageSettings()
   {
      this.page.saveSettings();
   }


   @Override
   public void addPages()
   {
      this.page = new FindRelevantComponentsWizardPage(PAGE_TITLE);
      addPage(this.page);
   }
   
   private static void log(String message)
   {
      RelevanceAnalysisPlugin.getDefault().log(message, null);
   }
}
