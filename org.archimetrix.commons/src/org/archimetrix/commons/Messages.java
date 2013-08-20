package org.archimetrix.commons;

import org.eclipse.osgi.util.NLS;

/**
 * Stores the string attributes visible to the user.
 * @author Goran Piskachev
 *
 */
public final class Messages extends NLS {
    /**
     * Bundle name.
     */
    private static final String BUNDLE_NAME =
            "org.archimetrix.commons.messages"; //$NON-NLS-1$
    public static String ClusteringConstants_COUPLING;
    public static String ClusteringConstants_DEFAULT_COMPOSITION_INDICATING_METRIC;
    public static String ClusteringConstants_DEFAULT_MERGE_INDICATING_METRIC;
    public static String ClusteringConstants_DIRECTORY_MAPPING;
    public static String ClusteringConstants_NAME_RESEMBLANCE;
    public static String ClusteringConstants_PACKAGE_MAPPING;
    public static String ClusteringConstants_SLAQ;
    public static String ClusteringConstants_SUBSYSTEM_COMPONENT;
    public static String ConfigConstants_CONFIG_PROPERTIES_FILE;
    public static String ConfigConstants_PROPERTY_SEPARATOR;
    public static String ConfigConstants_RELEVANCEANALYSIS_ANNOTATION_NAMES;
    public static String ConfigConstants_RELEVANCEANALYSIS_EPSILON;
    public static String PatternConstants_CALLED_CLASS_ROLE;
    public static String PatternConstants_CALLING_CLASS_ROLE;
    public static String PatternConstants_DATA_CLASS_PATTERN_NAME;
    public static String PatternConstants_DISTORTED_ILLEGAL_METHOD_ACCESS_BC_PATTERN;
    public static String PatternConstants_DISTORTED_ILLEGAL_METHOD_ACCESS_PATTERN;
    public static String PatternConstants_ILLEGAL_METHOD_ACCESS_BC_PATTERN;
    public static String PatternConstants_ILLEGAL_METHOD_ACCESS_PATTERN;
    public static String PatternConstants_IV_ACCESSED_METHOD_OWNER_ROLE;
    public static String PatternConstants_IV_ACCESSING_CLASS_ROLE;
    public static String PatternConstants_NON_TO_COMMUNICATION_PATTERN_NAME;
    public static String PatternConstants_NON_TO_ROLE;
    public static String PatternConstants_UNDERCOVER_TO_ROLE;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }
/**
 * The constructor.
 */
    private Messages() {
    }
}
