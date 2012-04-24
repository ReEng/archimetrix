package org.archimetrix.commons.wizards;


/**
 * Provides constants that are used in wizards.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public interface WizardConstants
{

   public static final String SELECT_BUTTON_TEXT = "Select...";

   public static final String INPUT_LABEL = "Input";


   public static final String METRIC_VALUES_MODEL_DESCRIPTION = "Select the Metric Values Model";

   public static final String METRIC_VALUES_MODEL_STRING = "Metric Values Model";

   public static final String BAD_SMELLS_DESCRIPTION = "Select the Detected Bad Smells";

   public static final String DETECTED_BAD_SMELLS_STRING = "Detected Bad Smells";

   public static final String SOURCE_CODE_DECORATOR_MODEL_DESCRIPTION = "Select the Source Code Decorator Model";

   public static final String SOURCE_CODE_DECORATOR_MODEL_STRING = "Source Code Decorator Model";

   public static final String BAD_SMELLS_CATALOG_DESCRIPTION = "Select the Bad Smells catalog";

   public static final String BAD_SMELLS_CATALOG_STRING = "Bad Smells Catalog";

   public static final String REENGINEERING_STRATEGIES_DESCRIPTION = "Select an ecore file that contains Reengineering Strategies";

   public static final String REENGINEERING_STRATEGIES_STRING = "Reengineering Strategies";


   public static final String BAD_SMELLS_FILE_EXTENSION = "psa";

   public static final String BAD_SMELLS_CATALOG_EXTENSION = "psc";

   public static final String ECORE_FILE_EXTENSION = "ecore";

   public static final String SOURCECODEDECORATOR_FILE_EXTENSION = "sourcecodedecorator";


   public static final String NO_REENGINEERING_STRATEGIES_ERROR_MESSAGE = "A resource with the reengineering strategies in form of story diagrams has to be given.";

   public static final String NO_BAD_SMELLS_CATALOG_ERROR_MESSAGE = "A resource with the bad smells catalog has to be given.";

   public static final String NO_SCD_ERROR_MESSAGE = "A resource with the source code decorator of the program to be analyzed has to be provided.";

   public static final String NO_METRIC_VALUES_ERROR_MESSAGE = "A resource with the metric values from the clustering has to be provided.";

   public static final String NO_BAD_SMELLS_ERROR_MESSAGE = "A resource with the detected bad smells has to be provided.";


   public static final String SETT_SCDM = "scdm";

   public static final String SETT_BAD_SMELLS = "bad_smells";

   public static final String SETT_METRIC_VALUES_MODEL = "metric_values_model";

   public static final String SETT_REENGINEERING_STRATEGIES = "reengineering_strategies";


   public static final String STORY_DIAGRAM_ANNOTATION_SOURCE_KEY = "http://ns.storydriven.org/extension";

}
