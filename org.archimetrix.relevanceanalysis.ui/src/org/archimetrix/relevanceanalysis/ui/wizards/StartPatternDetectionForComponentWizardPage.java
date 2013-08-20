package org.archimetrix.relevanceanalysis.ui.wizards;


import org.archimetrix.commons.wizards.ResourceSelectionSection;
import org.archimetrix.commons.wizards.ResourceSelectionSectionProvider;
import org.archimetrix.commons.wizards.WizardConst;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.fujaba.commons.utils.IDUsingResourceFactory;
import org.reclipse.structure.inference.ui.wizards.StartInferenceWizardPage;


/**
 * This wizard page is used in the StartPatternDetectionForComponentWizard. It contains an input
 * sections for a catalog with bad smell specifications which will be used for the analysis.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class StartPatternDetectionForComponentWizardPage extends StartInferenceWizardPage
{

   private static final String WIZARD_PAGE_DESCRIPTION = "Select the pattern catalog in which the design deficiencies are specified.";

   private Resource catalog;

   private ResourceSelectionSection badSmellsSection;


   public StartPatternDetectionForComponentWizardPage(final String string)
   {
      super(string);
      setTitle(string);
      setDescription(WIZARD_PAGE_DESCRIPTION);
   }


   @Override
   public void createControl(final Composite parent)
   {
      Composite composite = new Composite(parent, SWT.NONE);
      composite.setLayout(new GridLayout());

      ResourceSelectionSectionProvider sectionProvider = new ResourceSelectionSectionProvider();
      Group inputs = sectionProvider.createInputGroup(composite);
      this.badSmellsSection = new ResourceSelectionSectionProvider().addBadSmellsCatalogResourceSelection(inputs, this);

      setControl(composite);
      setPageComplete(false);
   }


   @Override
   public void widgetSelected(final SelectionEvent e)
   {
      widgetDefaultSelected(e);
   }


   @Override
   public void widgetDefaultSelected(final SelectionEvent e)
   {
      setPageComplete(isValid());
   }


   protected boolean isValid()
   {
      if (this.badSmellsSection.getTextField().getText() == null)
      {
         setErrorMessage(WizardConst.WizardConstants_NO_BAD_SMELLS_CATALOG_ERROR_MESSAGE);
      }

      if (this.badSmellsSection.getTextField().getText() != null)
      {
         setErrorMessage(null);
         return true;
      }

      return false;
   }


   @Override
   public void modifyText(final ModifyEvent e)
   {
      if (e.getSource() == this.badSmellsSection.getTextField())
      {
         this.badSmellsSection.getDialog().setInitialSelection(
               ResourcesPlugin.getWorkspace().getRoot().findMember(this.badSmellsSection.getTextField().getText()));
      }

      setPageComplete(isValid());
   }


   public Resource getCatalogResource()
   {
      ResourceSet resourceSet = new ResourceSetImpl();
      resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new IDUsingResourceFactory());
      String text = this.badSmellsSection.getTextField().getText();
      if (text != null && text.length() > 0)
      {
         this.catalog = resourceSet.getResource(URI.createPlatformResourceURI(text, true), true);
      }
      else
      {
         this.catalog = null;
      }
      return this.catalog;
   }


   public boolean isUseExistingEngines()
   {
      return false;
   }

}
