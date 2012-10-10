package org.storydriven.modeling.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.storydriven.modeling.diagram.edit.commands.JunctionNodeCreateCommand;
import org.storydriven.modeling.diagram.edit.commands.ModifyingStoryNodeCreateCommand;
import org.storydriven.modeling.diagram.edit.commands.StartNodeCreateCommand;
import org.storydriven.modeling.diagram.edit.commands.StatementNodeCreateCommand;
import org.storydriven.modeling.diagram.edit.commands.StopNodeCreateCommand;
import org.storydriven.modeling.diagram.edit.commands.StructuredNodeCreateCommand;
import org.storydriven.modeling.diagram.providers.SDMElementTypes;

/**
 * @generated
 */
public class ActivityItemSemanticEditPolicy extends
		SDMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActivityItemSemanticEditPolicy() {
		super(SDMElementTypes.Activity_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SDMElementTypes.StartNode_2001 == req.getElementType()) {
			return getGEFWrapper(new StartNodeCreateCommand(req));
		}
		if (SDMElementTypes.StopNode_2002 == req.getElementType()) {
			return getGEFWrapper(new StopNodeCreateCommand(req));
		}
		if (SDMElementTypes.JunctionNode_2003 == req.getElementType()) {
			return getGEFWrapper(new JunctionNodeCreateCommand(req));
		}
		if (SDMElementTypes.StatementNode_2004 == req.getElementType()) {
			return getGEFWrapper(new StatementNodeCreateCommand(req));
		}
		if (SDMElementTypes.StructuredNode_2005 == req.getElementType()) {
			return getGEFWrapper(new StructuredNodeCreateCommand(req));
		}
		if (SDMElementTypes.ModifyingStoryNode_2007 == req.getElementType()) {
			return getGEFWrapper(new ModifyingStoryNodeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
