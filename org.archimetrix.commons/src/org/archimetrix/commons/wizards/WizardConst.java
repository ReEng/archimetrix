package org.archimetrix.commons.wizards;

import org.eclipse.osgi.util.NLS;
/**
 * Stores the constants visible to the user.
 * @author Goran Piskachev
 *
 */
public class WizardConst extends NLS {
    private static final String BUNDLE_NAME = "org.archimetrix.commons.wizards.messages"; //$NON-NLS-1$
    public static String WizardConstants_BAD_SMELLS_CATALOG_DESCRIPTION;
    public static String WizardConstants_BAD_SMELLS_CATALOG_EXTENSION;
    public static String WizardConstants_BAD_SMELLS_CATALOG_STRING;
    public static String WizardConstants_BAD_SMELLS_DESCRIPTION;
    public static String WizardConstants_BAD_SMELLS_FILE_EXTENSION;
    public static String WizardConstants_DETECTED_BAD_SMELLS_STRING;
    public static String WizardConstants_ECORE_FILE_EXTENSION;
    public static String WizardConstants_INPUT_LABEL;
    public static String WizardConstants_METRIC_VALUES_MODEL_DESCRIPTION;
    public static String WizardConstants_METRIC_VALUES_MODEL_STRING;
    public static String WizardConstants_NO_BAD_SMELLS_CATALOG_ERROR_MESSAGE;
    public static String WizardConstants_NO_BAD_SMELLS_ERROR_MESSAGE;
    public static String WizardConstants_NO_METRIC_VALUES_ERROR_MESSAGE;
    public static String WizardConstants_NO_REENGINEERING_STRATEGIES_ERROR_MESSAGE;
    public static String WizardConstants_NO_SCD_ERROR_MESSAGE;
    public static String WizardConstants_REENGINEERING_STRATEGIES_DESCRIPTION;
    public static String WizardConstants_REENGINEERING_STRATEGIES_STRING;
    public static String WizardConstants_SELECT_BUTTON_TEXT;
    public static String WizardConstants_SETT_BAD_SMELLS;
    public static String WizardConstants_SETT_METRIC_VALUES_MODEL;
    public static String WizardConstants_SETT_REENGINEERING_STRATEGIES;
    public static String WizardConstants_SETT_SCDM;
    public static String WizardConstants_SOURCE_CODE_DECORATOR_MODEL_DESCRIPTION;
    public static String WizardConstants_SOURCE_CODE_DECORATOR_MODEL_STRING;
    public static String WizardConstants_SOURCECODEDECORATOR_FILE_EXTENSION;
    public static String WizardConstants_STORY_DIAGRAM_ANNOTATION_SOURCE_KEY;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, WizardConst.class);
    }
    /**
     * the constructor.
     */
    private WizardConst() {
    }
}
