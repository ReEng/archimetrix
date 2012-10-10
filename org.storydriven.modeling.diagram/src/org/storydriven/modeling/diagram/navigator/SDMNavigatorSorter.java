package org.storydriven.modeling.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.storydriven.modeling.diagram.part.SDMVisualIDRegistry;

/**
 * @generated
 */
public class SDMNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7019;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SDMNavigatorItem) {
			SDMNavigatorItem item = (SDMNavigatorItem) element;
			return SDMVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
