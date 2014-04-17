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
    /**
     * Coupling.
     */
    public static String ClusteringConstants_COUPLING;
    /**
     * Default composition indicating metric.
     */
    public static String
    ClusteringConstants_DEFAULT_COMPOSITION_INDICATING_METRIC;
    /**
     * Default merge indicating metric.
     */
    public static String ClusteringConstants_DEFAULT_MERGE_INDICATING_METRIC;
    /**
     * Directory mapping.
     */
    public static String ClusteringConstants_DIRECTORY_MAPPING;
    /**
     * Name resemblance.
     */
    public static String ClusteringConstants_NAME_RESEMBLANCE;
    /**
     * Package mapping.
     */
    public static String ClusteringConstants_PACKAGE_MAPPING;
    /**
     * Slaq.
     */
    public static String ClusteringConstants_SLAQ;
    /**
     * Subsystem component.
     */
    public static String ClusteringConstants_SUBSYSTEM_COMPONENT;
    /**
     * Config properties file.
     */
    public static String ConfigConstants_CONFIG_PROPERTIES_FILE;
    /**
     * Property separator.
     */
    public static String ConfigConstants_PROPERTY_SEPARATOR;
    /**
     * Relevance analysis annotation names.
     */
    public static String ConfigConstants_RELEVANCEANALYSIS_ANNOTATION_NAMES;
    /**
     * Relevance analysis epsilon.
     */
    public static String ConfigConstants_RELEVANCEANALYSIS_EPSILON;
    /**
     * Called class role.
     */
    public static String PatternConstants_CALLED_CLASS_ROLE;
    /**
     * Calling class role.
     */
    public static String PatternConstants_CALLING_CLASS_ROLE;
    /**
     * Data class pattern name.
     */
    public static String PatternConstants_DATA_CLASS_PATTERN_NAME;
    /**
     * Distorted illegal method access bc pattern.
     */
    public static String
    PatternConstants_DISTORTED_ILLEGAL_METHOD_ACCESS_BC_PATTERN;
    /**
     * Distorted illegal method access patterns.
     */
    public static String
    PatternConstants_DISTORTED_ILLEGAL_METHOD_ACCESS_PATTERN;
    /**
     * Illegal method access bc pattern.
     */
    public static String PatternConstants_ILLEGAL_METHOD_ACCESS_BC_PATTERN;
    /**
     * Illegal method access pattern.
     */
    public static String PatternConstants_ILLEGAL_METHOD_ACCESS_PATTERN;
    /**
     * IV accessed method owner role.
     */
    public static String PatternConstants_IV_ACCESSED_METHOD_OWNER_ROLE;
    /**
     * IV accessing class role.
     */
    public static String PatternConstants_IV_ACCESSING_CLASS_ROLE;
    /**
     * Non to communication pattern name.
     */
    public static String PatternConstants_NON_TO_COMMUNICATION_PATTERN_NAME;
    /**
     * Non to role.
     */
    public static String PatternConstants_NON_TO_ROLE;
    /**
     * Undercover to role.
     */
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
