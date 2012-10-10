package org.storydriven.modeling.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.modeling.diagram.edit.commands.JunctionNode2CreateCommand;
import org.storydriven.modeling.diagram.edit.commands.ModifyingStoryNode2CreateCommand;
import org.storydriven.modeling.diagram.edit.commands.StartNode2CreateCommand;
import org.storydriven.modeling.diagram.edit.commands.StatementNode2CreateCommand;
import org.storydriven.modeling.diagram.edit.commands.StopNode2CreateCommand;
import org.storydriven.modeling.diagram.edit.commands.StructuredNode2CreateCommand;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;

/**
 * @generated
 */
public class StructuredNodeStructuredNodeCompartmentItemSemanticEditPolicy
		extends SDMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredNodeStructuredNodeCompartmentItemSemanticEditPolicy() {
		super(SDMElementTypes.StructuredNode_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SDMElementTypes.JunctionNode_3001 == req.getElementType()) {
			return getGEFWrapper(new JunctionNode2CreateCommand(req));
		}
		if (SDMElementTypes.StartNode_3002 == req.getElementType()) {
			return getGEFWrapper(new StartNode2CreateCommand(req));
		}
		if (SDMElementTypes.StopNode_3004 == req.getElementType()) {
			return getGEFWrapper(new StopNode2CreateCommand(req));
		}
		if (SDMElementTypes.StatementNode_3003 == req.getElementType()) {
			return getGEFWrapper(new StatementNode2CreateCommand(req));
		}
		if (SDMElementTypes.StructuredNode_3005 == req.getElementType()) {
			return getGEFWrapper(new StructuredNode2CreateCommand(req));
		}
		if (SDMElementTypes.ModifyingStoryNode_3011 == req.getElementType()) {
			return getGEFWrapper(new ModifyingStoryNode2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
