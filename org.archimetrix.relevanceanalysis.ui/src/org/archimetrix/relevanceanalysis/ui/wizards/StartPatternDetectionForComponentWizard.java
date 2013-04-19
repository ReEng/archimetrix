package org.archimetrix.relevanceanalysis.ui.wizards;


import java.util.ArrayList;
import java.util.List;

import org.archimetrix.relevanceanalysis.ui.views.RelevantComponentsView;
import org.eclipse.ui.IWorkbench;
import org.reclipse.structure.generator.PrepareDetectionEnginesJob;
import org.reclipse.structure.generator.preparationstrategies.AbstractEnginePreparationStrategy;
import org.reclipse.structure.inference.extended.CatalogModifyingGenerateEnginesStrategy;
import org.reclipse.structure.inference.ui.wizards.StartInferenceWizard;

import eu.qimpress.samm.staticstructure.ComponentType;
import eu.qimpress.sourcecodedecorator.ComponentImplementingClassesLink;


/**
 * This class represents the wizard that is used to start the deficiency detection from the Relevant
 * Components View. It uses the StartPatternDetectionForComponentWizardPage.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class StartPatternDetectionForComponentWizard extends StartInferenceWizard
{

   private static final String WIZARD_TITLE = "Start Design Deficiency Detection";

   /**
    * The constructor.
    * 
    * @param workbench The active workbench.
    */
   public StartPatternDetectionForComponentWizard(final IWorkbench workbench)
   {

      setWindowTitle(WIZARD_TITLE);
   }


   /**
    * Creates the job that prepares the deficiency detection engines. In Archimetrix, we use the
    * {@link CatalogModifyingGenerateEnginesStrategy} which modifies the catalog - and thus the
    * generated detection engines - such that only the selected components will be considered during
    * the detection.
    * 
    * In this case the selection is obtained from the {@link RelevantComponentsView}.
    * 
    * @see org.reclipse.structure.inference.ui.wizards.StartInferenceWizard#createPrepareEnginesJob()
    * @see org.reclipse.structure.inference.extended.ui.StartModifyingCatalogWizard#createPrepareEnginesJob()
    */
   @Override
   protected PrepareDetectionEnginesJob createPrepareEnginesJob()
   {
      AbstractEnginePreparationStrategy strategy = new CatalogModifyingGenerateEnginesStrategy(
            mainWizardPage.getCatalogResource(), getSelectedComponents());

      return new PrepareDetectionEnginesJob(strategy, mainWizardPage.getReportLevel());
   }


   private Object[] getSelectedComponents()
   {
      Object[] selectedComponentImplementingClassesLinks = RelevantComponentsView.getSelectedComponents();
      List<ComponentType> selectedComponents = new ArrayList<ComponentType>();
      for (Object object : selectedComponentImplementingClassesLinks)
      {
         ComponentImplementingClassesLink link = (ComponentImplementingClassesLink) object;
         selectedComponents.add(link.getComponent());
      }
      return selectedComponents.toArray();
   }


   @Override
   public void addPages()
   {
      this.mainWizardPage = new StartPatternDetectionForComponentWizardPage(WIZARD_TITLE);
      addPage(this.mainWizardPage);
   }

}
