package org.archimetrix.commons.wizards;

import org.eclipse.osgi.util.NLS;

/**
 * Stores the constants visible to the user.
 *
 * @author Goran Piskachev
 *
 */
public final class WizardConst extends NLS {
    /**
     * Bundle name.
     */
    private static final String BUNDLE_NAME =
            "org.archimetrix.commons.wizards.messages"; //$NON-NLS-1$
    /**
     * Bad smells catalog description.
     */
    public static String WizardConstants_BAD_SMELLS_CATALOG_DESCRIPTION;
    /**
     * Bad smells catalog extension.
     */
    public static String WizardConstants_BAD_SMELLS_CATALOG_EXTENSION;
    /**
     * Bad smells catalog string.
     */
    public static String WizardConstants_BAD_SMELLS_CATALOG_STRING;
    /**
     * Bad smells description.
     */
    public static String WizardConstants_BAD_SMELLS_DESCRIPTION;
    /**
     * Bad smells file extension.
     */
    public static String WizardConstants_BAD_SMELLS_FILE_EXTENSION;
    /**
     * Detected bad smells string.
     */
    public static String WizardConstants_DETECTED_BAD_SMELLS_STRING;
    /**
     * Ecore file extension.
     */
    public static String WizardConstants_ECORE_FILE_EXTENSION;
    /**
     * Input label.
     */
    public static String WizardConstants_INPUT_LABEL;
    /**
     * Metric values model description.
     */
    public static String WizardConstants_METRIC_VALUES_MODEL_DESCRIPTION;
    /**
     * Metric values model string.
     */
    public static String WizardConstants_METRIC_VALUES_MODEL_STRING;
    /**
     * No bad smells catalog error message.
     */
    public static String WizardConstants_NO_BAD_SMELLS_CATALOG_ERROR_MESSAGE;
    /**
     * No bad smells error message.
     */
    public static String WizardConstants_NO_BAD_SMELLS_ERROR_MESSAGE;
    /**
     * No metric values error message.
     */
    public static String WizardConstants_NO_METRIC_VALUES_ERROR_MESSAGE;
    /**
     * no reengineering strategies error message.
     */
    public static String
    WizardConstants_NO_REENGINEERING_STRATEGIES_ERROR_MESSAGE;
    /**
     * no scd error message.
     */
    public static String WizardConstants_NO_SCD_ERROR_MESSAGE;
    /**
     * Reengineering strategies description.
     */
    public static String WizardConstants_REENGINEERING_STRATEGIES_DESCRIPTION;
    /**
     * Reengineering strategies string.
     */
    public static String WizardConstants_REENGINEERING_STRATEGIES_STRING;
    /**
     * Select button text.
     */
    public static String WizardConstants_SELECT_BUTTON_TEXT;
    /**
     * Sett bad smells.
     */
    public static String WizardConstants_SETT_BAD_SMELLS;
    /**
     * Sett metric values model.
     */
    public static String WizardConstants_SETT_METRIC_VALUES_MODEL;
    /**
     * Sett reengineering strategies.
     */
    public static String WizardConstants_SETT_REENGINEERING_STRATEGIES;
    /**
     * Sett scdm.
     */
    public static String WizardConstants_SETT_SCDM;
    /**
     * SCDM description.
     */
    public static String
    WizardConstants_SOURCE_CODE_DECORATOR_MODEL_DESCRIPTION;
    /**
     * SCDM string.
     */
    public static String WizardConstants_SOURCE_CODE_DECORATOR_MODEL_STRING;
    /**
     * SCD file extension.
     */
    public static String WizardConstants_SOURCECODEDECORATOR_FILE_EXTENSION;
    /**
     * Story diagram source key.
     */
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
