package org.archimetrix.architectureprognosis.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ArchitecturePrognosisUIPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.archimetrix.architectureprognosis.ui"; //$NON-NLS-1$

	// The shared instance
   private static ArchitecturePrognosisUIPlugin plugin;
	
	/**
	 * The constructor
	 */
	public ArchitecturePrognosisUIPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(final BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static ArchitecturePrognosisUIPlugin getDefault() {
		return plugin;
	}
	
	  /**
    * Returns an image descriptor for the image file at the given
    * plug-in relative path
    *
    * @param path the path
    * @return the image descriptor
    */
   public static ImageDescriptor getImageDescriptor(final String path) {
      return imageDescriptorFromPlugin(PLUGIN_ID, path);
   }

}
