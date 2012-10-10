package org.storydriven.modeling.diagram.providers;

import org.storydriven.modeling.activities.ModifyingStoryNode;
import org.storydriven.modeling.diagram.part.SDMDiagramEditorPlugin;
import org.storydriven.modeling.patterns.PatternsFactory;
import org.storydriven.modeling.patterns.StoryPattern;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_ModifyingStoryNode_2007(ModifyingStoryNode instance) {
		try {
			StoryPattern newInstance_0_0 = PatternsFactory.eINSTANCE
					.createStoryPattern();
			instance.setOwnedRule(newInstance_0_0);
			newInstance_0_0.setComment("");

		} catch (RuntimeException e) {
			SDMDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ModifyingStoryNode_3011(ModifyingStoryNode instance) {
		try {
			StoryPattern newInstance_0_0 = PatternsFactory.eINSTANCE
					.createStoryPattern();
			instance.setOwnedRule(newInstance_0_0);
			newInstance_0_0.setComment("");

		} catch (RuntimeException e) {
			SDMDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = SDMDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			SDMDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
