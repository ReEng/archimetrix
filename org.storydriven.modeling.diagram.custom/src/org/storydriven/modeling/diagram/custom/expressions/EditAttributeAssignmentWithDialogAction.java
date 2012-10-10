package org.storydriven.modeling.diagram.custom.expressions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IObjectActionDelegate;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.diagram.edit.parts.AttributeAssignmentEditPart;
import org.storydriven.modeling.expressions.TextualExpression;
import org.storydriven.modeling.expressions.impl.ExpressionsFactoryImpl;
import org.storydriven.modeling.patterns.AttributeAssignment;


// TODO abstract all those Abstract Action Delegates and refactor hierachy!!!
public class EditAttributeAssignmentWithDialogAction extends CommonEditExpressionWithDialogAction implements 
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

	protected EClassifier getExpectedReturnType() {
		return this.getModel().getAttribute() != null ? this.getModel().getAttribute().getEAttributeType() : null;
	}

	protected AttributeAssignment getModel() {
		AttributeAssignmentEditPart aaEditPart = this.getEditPart();
		return (AttributeAssignment) ((View) aaEditPart.getModel()).getElement();
	}

	@Override
	protected TransactionalEditingDomain getChangeCommandReceiver() {
		return this.getEditPart().getEditingDomain();
	}

	@Override
	protected Command getChangeAttributeCommand() {
		return new SetCommand(this.getEditPart().getEditingDomain(), 
									this.getModel(), 
									this.getModel().eClass().getEStructuralFeature("ValueExpression"),
									null);
	
	}

	protected AttributeAssignmentEditPart getEditPart() {
		return (AttributeAssignmentEditPart) this.getStructuredSelection().getFirstElement();
	}
	
	@Override
	protected Activity getActivity() {
		return (Activity) ((View) ((GraphicalEditPart) this.getEditPart().getRoot().getChildren().get(0)).getModel()).getElement();
	}

	
	protected TextualExpression getExpression() {
		TextualExpression e = (TextualExpression) this.getModel().getValueExpression();
		if(e == null) {
			e = ExpressionsFactoryImpl.eINSTANCE.createTextualExpression();
			this.getChangeCommandReceiver().
						getCommandStack().execute(new SetCommand(this.getEditPart().getEditingDomain(), 
																this.getModel(), 
																this.getModel().eClass().getEStructuralFeature("valueExpression"),
																e));
		}
		return e;
	}
	
}
