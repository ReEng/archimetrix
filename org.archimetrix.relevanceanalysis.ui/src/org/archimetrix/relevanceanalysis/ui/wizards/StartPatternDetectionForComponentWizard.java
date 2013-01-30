package org.archimetrix.relevanceanalysis.ui.wizards;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.archimetrix.commons.wizards.WizardConstants;
import org.archimetrix.relevanceanalysis.ui.views.RelevantComponentsView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.fujaba.commons.console.ReportLevel;
import org.reclipse.structure.inference.InferenceEngine;
import org.reclipse.structure.inference.InterpreterInferenceEngine;
import org.reclipse.structure.inference.evaluation.SimilarityEvaluator;
import org.reclipse.structure.inference.extended.ModifyCatalogAndGenerateAlgorithmsAction;
import org.reclipse.structure.inference.ui.wizards.StartInferenceWizard;
import org.reclipse.structure.specification.PSCatalog;

import eu.qimpress.samm.staticstructure.ComponentType;
import eu.qimpress.sourcecodedecorator.ComponentImplementingClassesLink;


/**
 * This class represents the wizard that is used to start the bad smell detection from the Relevant
 * Components View. It uses the StartPatternDetectionForComponentWizardPage.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class StartPatternDetectionForComponentWizard extends StartInferenceWizard
{
   private static final String RECLIPSE_STRUCTURAL_INFERENCE = "Detect Design Deficiencies";

   private static final String WIZARD_TITLE = "Start Design Deficiency Detection";

   private Resource engines;


   public StartPatternDetectionForComponentWizard(final IWorkbench workbench)
   {
      super();

      setWindowTitle(WIZARD_TITLE);
   }


   @Override
   public boolean performFinish()
   {
      Object[] selection = getSelectedComponents();
      Resource catalog = this.page.getCatalog();
      StringBuilder catalogPath = new StringBuilder(catalog.getURI().toPlatformString(false));
      catalogPath.append(".");
      catalogPath.append(WizardConstants.ECORE_FILE_EXTENSION);
      URI uri = URI.createPlatformResourceURI(catalogPath.toString(), true);
      this.engines = catalog.getResourceSet().createResource(uri);

      ModifyCatalogAndGenerateAlgorithmsAction generateAction = new ModifyCatalogAndGenerateAlgorithmsAction(catalog,
            this.engines, selection);
      PlatformUI.getWorkbench().getDisplay().syncExec(generateAction);

      return super.performFinish();
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


//   @Override
//   protected InferenceEngine getInferenceEngine()
//   {
//      final InferenceEngine engine = new InterpreterInferenceEngine(RECLIPSE_STRUCTURAL_INFERENCE);
//
//      engine.setHost(getSCDM().getContents());
//
//      engine.setCatalog(loadPSCatalog());
//      engine.setEngines(this.engines);
//      engine.setAnnotationEvaluator(new SimilarityEvaluator());
//      engine.setSearchForAdditionalElements(true);
//
//      // TODO this should be configurable due to performance issues
//      engine.setReportLevel(ReportLevel.DEBUG);
//
//      return engine;
//   }


//   private PSCatalog loadPSCatalog()
//   {
//      PSCatalog catalog = null;
//      Resource catalogResource = this.page.getCatalog();
//
//      // load
//      task("Loading catalog input resource");
//      try
//      {
//         catalogResource.load();
//         debug("Catalog input resource loaded.");
//      }
//      catch (IOException e)
//      {
//         e.printStackTrace();
//         return error("The catalog input resource could not be loaded: " + e.getLocalizedMessage());
//      }
//
//      // go through contents
//      for (EObject content : catalogResource.getContents())
//      {
//         if (content instanceof PSCatalog)
//         {
//            catalog = (PSCatalog) content;
//            break;
//         }
//      }
//
//      // check
//      if (catalog == null)
//      {
//         return error("The catalog input resource does not contain a valid catalog!");
//      }
//   }


//   private Resource getSCDM()
//   {
//      ComponentImplementingClassesLink link = (ComponentImplementingClassesLink) RelevantComponentsView
//            .getSelectedComponents()[0];
//      return link.eResource();
//   }


   @Override
   public void addPages()
   {
      this.page = new StartPatternDetectionForComponentWizardPage(WIZARD_TITLE);
      addPage(this.page);
   }


   @Override
   protected void storePageSettings()
   {
   }

}
