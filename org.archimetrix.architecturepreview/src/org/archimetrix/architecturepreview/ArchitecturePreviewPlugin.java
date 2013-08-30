package org.archimetrix.architecturepreview;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
public class ArchitecturePreviewPlugin extends AbstractUIPlugin {

    /**
     * The plug-in ID.
     */
	public static final String PLUGIN_ID = "org.archimetrix.architecturepreview"; //$NON-NLS-1$

	/**
	 * The shared instance.
	 */
	private static ArchitecturePreviewPlugin plugin;
	
	/**
	 * The constructor.
	 */
	public ArchitecturePreviewPlugin() {
	}

	/*
	 * (non-Javadoc)
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
	public static ArchitecturePreviewPlugin getDefault() {
		return plugin;
	}

}
