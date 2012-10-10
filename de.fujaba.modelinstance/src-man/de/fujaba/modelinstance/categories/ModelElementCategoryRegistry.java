package de.fujaba.modelinstance.categories;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;

public class ModelElementCategoryRegistry {
	private static final String EXTENSION_POINT_ID = "de.fujaba.modelinstance.modelelementcategory";

	public boolean isValidCategory(String key, EObject modelElement) {
		if (key == null || modelElement == null)  {
			return false;
		}
		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(EXTENSION_POINT_ID);
		for (IConfigurationElement configElement : config) {
			String extensionKey = configElement.getAttribute("key");
			String extensionClass = configElement.getAttribute("class");
			if (key.equals(extensionKey) && hasType(modelElement, extensionClass)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * We use reflection to find out, if the given object is of type "className".
	 * 
	 * @param object The object, which type should be checked. 
	 * @param className The className to compare with.
	 * @return true, if object is of type "className".
	 */
	private boolean hasType(Object object, String className) {
		Class<?> clazz = null;
		try {
			clazz = Class.forName(className);
		} catch (ClassNotFoundException e) {
			// do nothing
		}
		if (clazz != null) {
			return clazz.isAssignableFrom(object.getClass());
		}
		return false;
	}

}
