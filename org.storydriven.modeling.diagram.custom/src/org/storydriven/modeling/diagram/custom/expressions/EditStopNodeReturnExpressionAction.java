package org.storydriven.modeling.diagram.custom.expressions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IObjectActionDelegate;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.diagram.edit.parts.StopNodeEditPart;

// TODO abstract all those Abstract Action Delegates
public class EditStopNodeReturnExpressionAction extends AbstractActionDelegate implements IObjectActionDelegate{

	EditExpressionDialog expressionDialog;
	ChooseActivityOutParameterDialog parameterDialog;
	
	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		
		parameterDialog = new ChooseActivityOutParameterDialog(null);
		parameterDialog.setParameterList(this.getActivity().getOutParameters());
		parameterDialog.setChangeCommandReceiver(this.getChangeCommandReceiver());
		parameterDialog.setNode(this.getModel());
		parameterDialog.setEditPart(this.getEditPart());
		
		parameterDialog.open();
	}

	protected Activity getActivity() {
		StopNodeEditPart ep = this.getEditPart();
		return (Activity) ((View) ((GraphicalEditPart) ep.getRoot().getChildren().get(0)).getModel()).getElement();
	}
	
	protected StopNodeEditPart getEditPart() {
		return (StopNodeEditPart) this.getStructuredSelection().getFirstElement();
	}
	
	protected StopNode getModel() {
		StopNodeEditPart aaEditPart = this.getEditPart();
		return (StopNode) ((View) aaEditPart.getModel()).getElement();
	}

	protected TransactionalEditingDomain getChangeCommandReceiver() {
		return this.getEditPart().getEditingDomain();
	}
	
}
