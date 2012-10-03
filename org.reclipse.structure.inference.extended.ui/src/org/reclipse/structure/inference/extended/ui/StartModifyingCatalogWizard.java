/**
 * 
 */
package org.reclipse.structure.inference.extended.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.reclipse.structure.inference.InferenceEngine;
import org.reclipse.structure.inference.InterpreterInferenceEngine;
import org.reclipse.structure.inference.extended.ModifyCatalogAndGenerateAlgorithmsAction;
import org.reclipse.structure.inference.ui.wizards.StartInferenceWizard;

/**
 * @author Oleg
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 *
 */
public class StartModifyingCatalogWizard extends StartInferenceWizard
{
   private ComponentSelectionCatalog selectionPage;
   
   public StartModifyingCatalogWizard(IWorkbench workbench)
   {
      super();
   }

   
   @Override
   public void addPages()
   {
      this.page = new StartModifyingCatalogWizardPage("Structural Patterns Detection");
      //this resource set will only be used for selection and generating story diagrams
      //on perform finish call it will be reseted again
      this.page.initializeResourceSet();
      this.addPage(this.page);
      //add second page here
      this.selectionPage = new ComponentSelectionCatalog("Select Components to be analyzed");
      this.addPage(selectionPage);
      
   }
   
   
   @Override
   public IWizardPage getNextPage(IWizardPage page)
   {
      IWizardPage next = super.getNextPage(page);
      this.selectionPage.setSelection(this.page.getRoot());
      return next;
   }


   /**
    * @see org.eclipse.jface.wizard.Wizard#performFinish()
    */
   @Override
   public boolean performFinish()
   {
      return super.performFinish();
   }

   @Override
   protected void storePageSettings()
   {
      super.storePageSettings();
   }

   @Override
   protected InferenceEngine getInferenceEngine()
   {
      // generate here
      Object[] selection = null;
      if (!selectionPage.isAllChecked())
      {
         selection = selectionPage.getCheckedObjects();
      }
      Resource catalog = page.getCatalog();
      Resource engines = page.getEngines();
      if (!this.page.isUseExistingEngines())
      {
         URI uri = URI.createPlatformResourceURI(catalog.getURI().toPlatformString(false) + ".ecore", true);
         engines = catalog.getResourceSet().createResource(uri);
      }

      ModifyCatalogAndGenerateAlgorithmsAction generateAction = new ModifyCatalogAndGenerateAlgorithmsAction(catalog,
            engines, selection);
      // configure view
      PlatformUI.getWorkbench().getDisplay().syncExec(generateAction);

      // prepare engine
      String name = "Reclipse Structural Inference";
      final InferenceEngine engine = new InterpreterInferenceEngine(name);

      engine.setAstRoot(page.getRoot());
      engine.setCatalog(page.getCatalog());
      engine.setEngines(page.getEngines());
      engine.setAnnotationEvaluator(page.getEvaluator());
      engine.setSearchForAdditionalElements(page.isSearchForAdditionals());
      engine.setReportLevel(page.getReportLevel());
      return engine;
   }



}
