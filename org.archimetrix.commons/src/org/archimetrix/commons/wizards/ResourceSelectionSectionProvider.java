package org.archimetrix.commons.wizards;


import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;


/**
 * The ResourceSelectionSectionProvider provides
 * helper methods to create ResourceSelectionSections
 * for different resources. These sections define a
 * combination of ui elements used in wizards to
 * select a resource from the workspace. The section
 * creates a label, a text field and a dialog.
 *
 * @author mcp
 */
public class ResourceSelectionSectionProvider {
/**
 * Creates groups for inputs.
 * @param parent composite parent
 * @return inputs group
 */
   public Group createInputGroup(final Composite parent) {
      Group inputs = new Group(parent, SWT.SHADOW_IN);
      inputs.setText(WizardConst.WizardConstants_INPUT_LABEL);
      inputs.setLayout(new GridLayout(3, false));
      inputs.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
      return inputs;
   }

/**
 * Adds resource selection section for the source code decorator.
 * @param parent composite parent
 * @param page wizard page
 * @return resource selection section
 */
   public ResourceSelectionSection addSourceCodeDecoratorResourceSelection(
           final Composite parent, final WizardPage page) {
      return new ResourceSelectionSection(parent,
              WizardConst.WizardConstants_SOURCE_CODE_DECORATOR_MODEL_STRING,
              page,
            WizardConst.WizardConstants_SOURCE_CODE_DECORATOR_MODEL_DESCRIPTION,
            WizardConst.WizardConstants_SOURCECODEDECORATOR_FILE_EXTENSION);
   }

/**
 * Adds bad smell resource selection.
 * @param parent composite parent
 * @param page wizard page
 * @return resource selection section
 */
   public ResourceSelectionSection addBadSmellsResourceSelection(
           final Composite parent, final WizardPage page) {
      return new ResourceSelectionSection(parent,
              WizardConst.WizardConstants_DETECTED_BAD_SMELLS_STRING, page,
            WizardConst.WizardConstants_BAD_SMELLS_DESCRIPTION,
            WizardConst.WizardConstants_BAD_SMELLS_FILE_EXTENSION);
   }

/**
 * Adds metric values resource selection.
 * @param parent composite parent
 * @param page wizard page
 * @return resource selection section
 */
   public ResourceSelectionSection addMetricValuesResourceSelection(
           final Composite parent, final WizardPage page) {
      return new ResourceSelectionSection(parent,
              WizardConst.WizardConstants_METRIC_VALUES_MODEL_STRING, page,
            WizardConst.WizardConstants_METRIC_VALUES_MODEL_DESCRIPTION,
            WizardConst.WizardConstants_ECORE_FILE_EXTENSION);
   }

   /**
    * Adds bad smell catalog resource selection.
    * @param parent composite parent
    * @param page wizard page
    * @return resource selection section
    */
   public ResourceSelectionSection addBadSmellsCatalogResourceSelection(
           final Composite parent, final WizardPage page) {
      return new ResourceSelectionSection(parent,
              WizardConst.WizardConstants_BAD_SMELLS_CATALOG_STRING, page,
            WizardConst.WizardConstants_BAD_SMELLS_CATALOG_DESCRIPTION,
            WizardConst.WizardConstants_BAD_SMELLS_CATALOG_EXTENSION);
   }

   /**
    * Adds reengineering strategies selection.
    * @param parent composite parent
    * @param page wizard page
    * @return resource selection section
    */
   public ResourceSelectionSection addReengineeringStrategiesSelection(
           final Composite parent, final WizardPage page) {
      return new ResourceSelectionSection(parent,
              WizardConst.WizardConstants_REENGINEERING_STRATEGIES_STRING, page,
            WizardConst.WizardConstants_REENGINEERING_STRATEGIES_DESCRIPTION,
            WizardConst.WizardConstants_ECORE_FILE_EXTENSION);
   }
}
