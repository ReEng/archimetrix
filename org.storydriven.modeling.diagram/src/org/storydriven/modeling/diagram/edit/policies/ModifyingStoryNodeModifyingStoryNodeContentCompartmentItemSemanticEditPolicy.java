package org.storydriven.modeling.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.modeling.diagram.edit.commands.StoryPatternCreateCommand;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;

/**
 * @generated
 */
public class ModifyingStoryNodeModifyingStoryNodeContentCompartmentItemSemanticEditPolicy
		extends SDMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ModifyingStoryNodeModifyingStoryNodeContentCompartmentItemSemanticEditPolicy() {
		super(SDMElementTypes.ModifyingStoryNode_3011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SDMElementTypes.StoryPattern_3008 == req.getElementType()) {
			return getGEFWrapper(new StoryPatternCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
