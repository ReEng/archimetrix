package org.reclipse.structure.inference.extended.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
public class Activator extends AbstractUIPlugin {

    /**
     * The plug-in ID.
     */
    public static final String PLUGIN_ID =
            "org.reclipse.structure.inference.extended.ui"; //$NON-NLS-1$

    /**
     * The shared instance.
     */
    private static Activator plugin;

    /**
     * The constructor.
     */

    /**
     * Activator.
     */
    public Activator() {

    }


    /*
     * (non-Javadoc)
     *  @see org.eclipse.ui.plugin.AbstractUIPlugin#start(
     *  org.osgi.framework.BundleContext)
     */
    /**
     * Starts the plugin.
     * @param context bundle context
     * @throws Exception exception
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(
     * org.osgi.framework.BundleContext)
     */
    /**
     * Stops the plugin.
     * @param context bundle context
     * @throws Exception exception
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
        }

    /**
     * Returns the shared instance.
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
        }

}
