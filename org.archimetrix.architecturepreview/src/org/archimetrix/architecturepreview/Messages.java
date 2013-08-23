package org.archimetrix.architecturepreview;

import org.eclipse.osgi.util.NLS;
/**
 * Contains constants.
 * @author Goran Piskachev
 *
 */
public final class Messages extends NLS {
    /**
     * Bundle name.
     */
    private static final String BUNDLE_NAME = "org.archimetrix.architecturepreview.messages"; //$NON-NLS-1$
    public static String ArchitecturePreviewCalculator_COMPOSITE_COMPONENTS_LINE_TITLE;
    public static String ArchitecturePreviewCalculator_INTERFACES_LINE_TITLE;
    public static String ArchitecturePreviewCalculator_MESSAGE_LINE_TITLE;
    public static String ArchitecturePreviewCalculator_PRIMITIVE_COMPONENTS_LINE_TITLE;
    public static String ArchitecturePreviewCalculator_TOTAL_COMPONENTS_LINE_TITLE;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }
}
