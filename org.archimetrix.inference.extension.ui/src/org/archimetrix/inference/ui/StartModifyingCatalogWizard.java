package org.archimetrix.inference.ui;


import java.util.Collection;

import org.archimetrix.inference.ArchimetrixInferenceJob;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.fujaba.commons.console.ReportLevel;
import org.reclipse.structure.inference.notification.InferenceProgressListener;
import org.reclipse.structure.inference.ui.views.annotations.AnnotationView;
import org.reclipse.structure.inference.ui.wizards.SaveAnnotationsWizard;


/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class StartModifyingCatalogWizard extends Wizard
{
   private static final String VID_MATCHED_PATTERNS = "org.reclipse.ui.views.structure.inference.matching.pattern"; //$NON-NLS-1$

   private static final String VID_MATCHED_OBJECTS = "org.reclipse.ui.views.structure.inference.matching.ast"; //$NON-NLS-1$


   private SelectInputDataWizardPage selectInputDataPage;

   private SelectComponentPage selectComponentsPage;


   public StartModifyingCatalogWizard()
   {
      super();

      // configure
      setNeedsProgressMonitor(true);
      setHelpAvailable(false);
      setWindowTitle("Structural Patterns Detection");
      // TODO: get image
      // setDefaultPageImageDescriptor(InferenceUIPlugin.getInstance().getImageDescriptor(
      // InferenceConstants.IMG_START_INFERENCE_WIZARD_BANNER));

      IDialogSettings settings = Activator.getDefault().getDialogSettings();
      IDialogSettings section = settings.getSection(getClass().getCanonicalName());
      if (section == null)
      {
         section = settings.addNewSection(getClass().getCanonicalName());
      }
      setDialogSettings(section);
   }


   @Override
   public void addPages()
   {
      selectInputDataPage = new SelectInputDataWizardPage("Structural Patterns Detection");
      // this resource set will only be used for selection and generating story diagrams
      // on perform finish call it will be reseted again
      selectInputDataPage.initializeResourceSet();
      addPage(selectInputDataPage);

      // add second page here
      selectComponentsPage = new SelectComponentPage();
      addPage(selectComponentsPage);
   }


   @Override
   public boolean performFinish()
   {
      // let the user confirm annotation result overwriting
      if (abortStarting())
      {
         return false;
      }

      // save settings
      storePageSettings();

      // cache views
      IViewPart part = null;
      try
      {
         part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(AnnotationView.ID);
      }
      catch (PartInitException e)
      {
         e.printStackTrace();
         return false;
      }

      // check for existing annotations view
      if (part == null || !(part instanceof AnnotationView))
      {
         return false;
      }

      final AnnotationView annotations = (AnnotationView) part;
      final InferenceProgressListener mPatternView = (InferenceProgressListener) getMatchingView(VID_MATCHED_PATTERNS);
      final InferenceProgressListener mObjectsView = (InferenceProgressListener) getMatchingView(VID_MATCHED_OBJECTS);

      // get paths
      String catalogPath = selectInputDataPage.getCatalogPath();
      String hostPath = selectInputDataPage.getHostPath();
      String enginesPath = selectInputDataPage.getEnginesPath();

      // create and configure the job
      Collection<Object> selectedComponents = selectComponentsPage.getCheckedObjects();
      ReportLevel reportLevel = ReportLevel.DEBUG;
      final ArchimetrixInferenceJob job = new ArchimetrixInferenceJob(catalogPath, hostPath, enginesPath,
            selectedComponents, reportLevel);

      // configure view
      PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable()
      {
         @Override
         public void run()
         {
            if (annotations != null)
            {
               annotations.switchToInference(job.getEngine());
            }
         }
      });

      job.schedule();

      // configure matching views when available
      if (mPatternView != null)
      {
         mPatternView.init();
      }
      if (mObjectsView != null)
      {
         mObjectsView.init();
      }

      return true;
   }


   /**
    * Checks whether there are annotations to save and requests the user to confirm the overwrite of those.
    * 
    * @return Returns whether to abort the start of the inference.
    */
   private boolean abortStarting()
   {
      // check if there are annotations in the view
      AnnotationView annotations = (AnnotationView) getMatchingView(AnnotationView.ID);
      if (annotations != null && !annotations.isEmpty())
      {
         // configuration data
         Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
         String title = "Overwrite Results";
         String message = "There are already annotated results. Do you want to overwrite them?";
         String[] labels = new String[] { "Save", "Overwrite", "Abort" };

         // create the dialog
         MessageDialog dialog = new MessageDialog(shell, title, null, message, MessageDialog.WARNING, labels, 2);

         int result = dialog.open();

         switch (result)
         {
            case 0:
               // save
               IWizard wizard = new SaveAnnotationsWizard(annotations);
               if (new WizardDialog(shell, wizard).open() == Window.OK)
               {
                  return false;
               }
               else
               {
                  return abortStarting();
               }
            case 1:
               // start
               return false;
            default:
               // abort
               return true;
         }
      }

      return false;
   }


   protected void storePageSettings()
   {
      // save page settings
      selectInputDataPage.saveSettings();
   }


   private IViewPart getMatchingView(String id)
   {
      return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(id);
   }


   @Override
   public IWizardPage getNextPage(IWizardPage page)
   {
      IWizardPage next = super.getNextPage(page);
      this.selectComponentsPage.setSelection(this.selectInputDataPage.getRoot());
      return next;
   }
}
