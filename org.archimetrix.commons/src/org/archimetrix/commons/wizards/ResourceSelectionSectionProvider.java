package org.archimetrix.commons.wizards;


import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;


/**
 * The ResourceSelectionSectionProvider provides helper methods to create ResourceSelectionSections
 * for different resources. These sections define a combination of ui elements used in wizards to
 * select a resource from the workspace. The section creates a label, a text field and a dialog.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ResourceSelectionSectionProvider
{

   public Group createInputGroup(final Composite parent)
   {
      Group inputs = new Group(parent, SWT.SHADOW_IN);
      inputs.setText(WizardConstants.INPUT_LABEL);
      inputs.setLayout(new GridLayout(3, false));
      inputs.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
      return inputs;
   }


   public ResourceSelectionSection addSourceCodeDecoratorResourceSelection(final Composite parent, final WizardPage page)
   {
      return new ResourceSelectionSection(parent, WizardConstants.SOURCE_CODE_DECORATOR_MODEL_STRING, page,
            WizardConstants.SOURCE_CODE_DECORATOR_MODEL_DESCRIPTION, WizardConstants.SOURCECODEDECORATOR_FILE_EXTENSION);
   }


   public ResourceSelectionSection addBadSmellsResourceSelection(final Composite parent, final WizardPage page)
   {
      return new ResourceSelectionSection(parent, WizardConstants.DETECTED_BAD_SMELLS_STRING, page,
            WizardConstants.BAD_SMELLS_DESCRIPTION, WizardConstants.BAD_SMELLS_FILE_EXTENSION);
   }


   public ResourceSelectionSection addMetricValuesResourceSelection(final Composite parent, final WizardPage page)
   {
      return new ResourceSelectionSection(parent, WizardConstants.METRIC_VALUES_MODEL_STRING, page,
            WizardConstants.METRIC_VALUES_MODEL_DESCRIPTION, WizardConstants.ECORE_FILE_EXTENSION);
   }


   public ResourceSelectionSection addBadSmellsCatalogResourceSelection(final Composite parent, final WizardPage page)
   {
      return new ResourceSelectionSection(parent, WizardConstants.BAD_SMELLS_CATALOG_STRING, page,
            WizardConstants.BAD_SMELLS_CATALOG_DESCRIPTION, WizardConstants.BAD_SMELLS_CATALOG_EXTENSION);
   }


   public ResourceSelectionSection addReengineeringStrategiesSelection(final Composite parent, final WizardPage page)
   {
      return new ResourceSelectionSection(parent, WizardConstants.REENGINEERING_STRATEGIES_STRING, page,
            WizardConstants.REENGINEERING_STRATEGIES_DESCRIPTION, WizardConstants.ECORE_FILE_EXTENSION);
   }
}
