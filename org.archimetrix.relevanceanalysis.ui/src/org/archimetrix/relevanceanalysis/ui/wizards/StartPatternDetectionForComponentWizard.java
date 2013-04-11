package org.archimetrix.relevanceanalysis.ui.wizards;


import java.util.ArrayList;
import java.util.List;

import org.archimetrix.commons.wizards.WizardConstants;
import org.archimetrix.relevanceanalysis.ui.views.RelevantComponentsView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.fujaba.commons.console.ReportLevel;
import org.reclipse.structure.inference.DetectPatternsJob;
import org.reclipse.structure.inference.evaluation.SimilarityEvaluator;
import org.reclipse.structure.inference.extended.ModifyCatalogAction;
import org.reclipse.structure.inference.ui.wizards.StartInferenceWizard;

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
      Resource catalogResource = setupCatalogResource();

      ModifyCatalogAction generateAction = new ModifyCatalogAction(catalogResource,
            this.engines, selection);
      PlatformUI.getWorkbench().getDisplay().syncExec(generateAction);

      // let the user confirm annotation result overwriting
      if (abortStarting())
      {
         return false;
      }

      storePageSettings();
      final DetectPatternsJob job = createPatternDetectionJob(catalogResource, getHostResource(),
            engines, ReportLevel.DEBUG, false, false, true, new SimilarityEvaluator());
      
      try
      {
         configureAnnotationsView(job);
      }
      catch (PartInitException e)
      {
         e.printStackTrace();
         return false;
      }
      configureMatchingViews();

      job.schedule();
      return true;
   }


   private Resource setupCatalogResource()
   {
      Resource catalogResource = this.page.getCatalog();
      StringBuilder catalogPath = new StringBuilder(catalogResource.getURI().toPlatformString(false));
      catalogPath.append(".");
      catalogPath.append(WizardConstants.ECORE_FILE_EXTENSION);
      URI uri = URI.createPlatformResourceURI(catalogPath.toString(), true);
      this.engines = catalogResource.getResourceSet().createResource(uri);
      return catalogResource;
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

   private Resource getHostResource() {
      Object[] selectedComponents = RelevantComponentsView.getSelectedComponents();
      ComponentImplementingClassesLink component = null;
      if(selectedComponents.length != 0) {
         component = (ComponentImplementingClassesLink) selectedComponents[0];
      }
      return component.eResource();
   }
   
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
