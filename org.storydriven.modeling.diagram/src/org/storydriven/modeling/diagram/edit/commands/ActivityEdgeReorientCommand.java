package org.storydriven.modeling.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.diagram.edit.policies.SDMBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ActivityEdgeReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ActivityEdgeReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ActivityEdge) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ActivityNode && newEnd instanceof ActivityNode)) {
			return false;
		}
		ActivityNode target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Activity)) {
			return false;
		}
		Activity container = (Activity) getLink().eContainer();
		return SDMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistActivityEdge_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ActivityNode && newEnd instanceof ActivityNode)) {
			return false;
		}
		ActivityNode source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Activity)) {
			return false;
		}
		Activity container = (Activity) getLink().eContainer();
		return SDMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistActivityEdge_4001(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ActivityEdge getLink() {
		return (ActivityEdge) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ActivityNode getOldSource() {
		return (ActivityNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ActivityNode getNewSource() {
		return (ActivityNode) newEnd;
	}

	/**
	 * @generated
	 */
	protected ActivityNode getOldTarget() {
		return (ActivityNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ActivityNode getNewTarget() {
		return (ActivityNode) newEnd;
	}
}
