package org.fujaba.sdm.ui;

import org.eclipse.core.runtime.Status;
import org.fujaba.commons.AbstractFujabaPlugin;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in life cycle
 */
public class SdmUiPlugin extends AbstractFujabaPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.fujaba.sdm.ui"; //$NON-NLS-1$

	// The shared instance
	private static SdmUiPlugin plugin;
	
	/**
	 * The constructor
	 */
	public SdmUiPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
   public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
   public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static SdmUiPlugin getDefault() {
		return plugin;
	}

   @Override
   protected void log(int severity, String message, Throwable throwable)
   {
      getLog().log(new Status(severity, PLUGIN_ID, message, throwable));
   }

}
