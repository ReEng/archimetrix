package org.archimetrix.relevanceanalysis;

import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
public class RelevanceAnalysisPlugin extends AbstractUIPlugin {

    /**
     * Plugin id.
     */
    public static final String PLUGIN_ID = "org.archimetrix.relevanceanalysis"; //$NON-NLS-1$

    /**
     * the shared instance.
     */
    private static RelevanceAnalysisPlugin plugin;

    /**
     * The constructor.
     */
    public RelevanceAnalysisPlugin() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    /**
     * Starts the plugin.
     * @param context bundle context
     * @throws Exception exception
     */
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    /**
     * Stops the plugin.
     * @param context bundle context
     * @throws Exception exception
     */
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static RelevanceAnalysisPlugin getDefault() {
        return plugin;
    }

    /**
     * Returns an image descriptor for the image file at the given plug-in relative path.
     * 
     * @param path
     *            the path
     * @return the image descriptor
     */
    public static ImageDescriptor getImageDescriptor(final String path) {
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    }

    /**
     * Log.
     * @param msg message
     */
    public void log(final String msg) {
        log(msg, null);
    }

    /**
     * Log.
     * @param msg message
     * @param e exception
     */
    public void log(final String msg, final Exception e) {
        getLog().log(new Status(Status.INFO, PLUGIN_ID, Status.OK, msg, e));
    }
}
