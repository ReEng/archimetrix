/**
 * 
 */
package org.reclipse.structure.inference.extended.ui;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.fujaba.commons.console.ReportLevel;
import org.reclipse.structure.generator.PrepareDetectionEnginesJob;
import org.reclipse.structure.generator.preparationstrategies.AbstractEnginePreparationStrategy;
import org.reclipse.structure.inference.DetectPatternsJob;
import org.reclipse.structure.inference.evaluation.SimilarityEvaluator;
import org.reclipse.structure.inference.extended.CatalogModifyingGenerateEnginesStrategy;
import org.reclipse.structure.inference.ui.wizards.StartInferenceWizard;


/**
 * This wizard is used to start the deficiency detection in Archimetrix. In addition to the
 * {@link StartInferenceWizard}, it also provides a page to select the components in which
 * deficiencies should be detected.
 * 
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 * @see StartInferenceWizard
 */
public class StartModifyingCatalogWizard extends StartInferenceWizard
{
   private ComponentSelectionWizardPage componentSelectionPage;


   public StartModifyingCatalogWizard(IWorkbench workbench)
   {
      super();
   }


   @Override
   public void addPages()
   {
      this.mainWizardPage = new StartModifyingCatalogWizardPage("Design Deficiency Detection");
      // this resource set will only be used for selection and generating story diagrams
      // on perform finish call it will be reset again
      this.mainWizardPage.initializeResourceSet();
      this.addPage(this.mainWizardPage);
      // add second page here
      this.componentSelectionPage = new ComponentSelectionWizardPage("Select Components to be analyzed");
      this.addPage(componentSelectionPage);

   }


   /**
    * @see org.eclipse.jface.wizard.Wizard#getNextPage(org.eclipse.jface.wizard.IWizardPage)
    */
   @Override
   public IWizardPage getNextPage(IWizardPage page)
   {
      IWizardPage next = super.getNextPage(page);
      this.componentSelectionPage.setSelection(this.mainWizardPage.getHostGraphResource());
      return next;
   }


   /**
    * Creates the job that prepares the deficiency detection engines. In Archimetrix, we use the
    * {@link CatalogModifyingGenerateEnginesStrategy} which modifies the catalog - and thus the
    * generated detection engines - such that only the selected components will be considered during
    * the detection.
    * 
    * @see org.reclipse.structure.inference.ui.wizards.StartInferenceWizard#createPrepareEnginesJob()
    */
   @Override
   protected PrepareDetectionEnginesJob createPrepareEnginesJob()
   {
      AbstractEnginePreparationStrategy strategy = new CatalogModifyingGenerateEnginesStrategy(
            mainWizardPage.getCatalogResource(), this.componentSelectionPage.getCheckedObjects());

      return new PrepareDetectionEnginesJob(strategy, mainWizardPage.getReportLevel());
   }


   @Override
   protected void storePageSettings()
   {
      super.storePageSettings();
      // TODO: The selectionPage should also store its settings.
   }


}
