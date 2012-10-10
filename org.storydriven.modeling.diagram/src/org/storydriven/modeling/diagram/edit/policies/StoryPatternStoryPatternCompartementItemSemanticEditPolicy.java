package org.storydriven.modeling.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.modeling.diagram.edit.commands.ObjectVariableCreateCommand;
import org.storydriven.modeling.diagram.edit.commands.PrimitiveVariableCreateCommand;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;

/**
 * @generated
 */
public class StoryPatternStoryPatternCompartementItemSemanticEditPolicy extends
		SDMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StoryPatternStoryPatternCompartementItemSemanticEditPolicy() {
		super(SDMElementTypes.StoryPattern_3008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SDMElementTypes.ObjectVariable_3012 == req.getElementType()) {
			return getGEFWrapper(new ObjectVariableCreateCommand(req));
		}
		if (SDMElementTypes.PrimitiveVariable_3014 == req.getElementType()) {
			return getGEFWrapper(new PrimitiveVariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
