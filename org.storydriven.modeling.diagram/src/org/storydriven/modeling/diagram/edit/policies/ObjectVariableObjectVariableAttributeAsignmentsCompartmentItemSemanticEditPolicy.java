package org.storydriven.modeling.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.storydriven.modeling.diagram.edit.commands.AttributeAssignmentCreateCommand;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;

/**
 * @generated
 */
public class ObjectVariableObjectVariableAttributeAsignmentsCompartmentItemSemanticEditPolicy
		extends SDMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ObjectVariableObjectVariableAttributeAsignmentsCompartmentItemSemanticEditPolicy() {
		super(SDMElementTypes.ObjectVariable_3012);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SDMElementTypes.AttributeAssignment_3013 == req.getElementType()) {
			return getGEFWrapper(new AttributeAssignmentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
