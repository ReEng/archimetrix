package org.storydriven.modeling.diagram.custom.expressions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IObjectActionDelegate;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.StatementNode;
import org.storydriven.modeling.diagram.edit.parts.StatementNodeEditPart;
import org.storydriven.modeling.expressions.TextualExpression;
import org.storydriven.modeling.expressions.impl.ExpressionsFactoryImpl;


// TODO abstract all those Abstract Action Delegates and refactor hierachy!!!
public class EditStatementExpressionWithDialogAction extends CommonEditExpressionWithDialogAction implements 
	IObjectActionDelegate{

	EditExpressionDialog expressionDialog;
	
	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		expressionDialog = new EditExpressionDialog(null);
		expressionDialog.setExpectedReturnType(this.getExpectedReturnType());
		expressionDialog.setChangeAttributeCommand(this.getChangeAttributeCommand(), this.getChangeCommandReceiver());
		expressionDialog.setExpression(this.getExpression());
		expressionDialog.setActivity(this.getActivity());
		expressionDialog.open();		
	}

	protected StatementNode getModel() {
		EditPart aEditPart = this.getEditPart();
		return (StatementNode) ((View) aEditPart.getModel()).getElement();
	}

	@Override
	protected TransactionalEditingDomain getChangeCommandReceiver() {
		return ((StatementNodeEditPart) this.getEditPart()).getEditingDomain();
	}

	@Override
	protected Command getChangeAttributeCommand() {
		return new SetCommand(this.getChangeCommandReceiver(), 
									this.getModel(), 
									this.getModel().eClass().getEStructuralFeature("statementExpression"),
									null);
	
	}

	protected EditPart getEditPart() {
		return (EditPart) this.getStructuredSelection().getFirstElement();
	}
	
	@Override
	protected Activity getActivity() {
		return (Activity) ((View) ((GraphicalEditPart) this.getEditPart().getRoot().getChildren().get(0)).getModel()).getElement();
	}

	
	protected TextualExpression getExpression() {
		TextualExpression e = (TextualExpression) this.getModel().getStatementExpression();
		if(e == null) {
			e = ExpressionsFactoryImpl.eINSTANCE.createTextualExpression();
			this.getChangeCommandReceiver().
						getCommandStack().execute(new SetCommand(this.getChangeCommandReceiver(), 
																this.getModel(), 
																this.getModel().eClass().getEStructuralFeature("statementExpression"),
																e));
		}
		return e;
	}
	
}
