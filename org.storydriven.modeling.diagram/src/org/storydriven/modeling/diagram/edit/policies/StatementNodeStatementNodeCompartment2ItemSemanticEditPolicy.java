package org.storydriven.modeling.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.modeling.diagram.edit.commands.TextualExpressionCreateCommand;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;

/**
 * @generated
 */
public class StatementNodeStatementNodeCompartment2ItemSemanticEditPolicy
		extends SDMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StatementNodeStatementNodeCompartment2ItemSemanticEditPolicy() {
		super(SDMElementTypes.StatementNode_3003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SDMElementTypes.TextualExpression_3015 == req.getElementType()) {
			return getGEFWrapper(new TextualExpressionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
