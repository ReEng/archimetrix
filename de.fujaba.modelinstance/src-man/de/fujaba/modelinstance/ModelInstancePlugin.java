package de.fujaba.modelinstance;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import de.fujaba.modelinstance.categories.ModelElementCategoryRegistry;


public class ModelInstancePlugin implements BundleActivator {

	private static ModelInstancePlugin instance;
	private static BundleContext context;
	private ModelElementCategoryRegistry modelElementCategoryRegistry;

	static BundleContext getContext() {
		return context;
	}

	public static ModelInstancePlugin getInstance() {
		return instance;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		ModelInstancePlugin.instance = this;
		ModelInstancePlugin.context = bundleContext;
		
		modelElementCategoryRegistry = new ModelElementCategoryRegistry();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		ModelInstancePlugin.instance = null;
		ModelInstancePlugin.context = null;
		modelElementCategoryRegistry = null;
	}
	

	public ModelElementCategoryRegistry getModelElementCategoryRegistry() {
		return modelElementCategoryRegistry;
	}

}
