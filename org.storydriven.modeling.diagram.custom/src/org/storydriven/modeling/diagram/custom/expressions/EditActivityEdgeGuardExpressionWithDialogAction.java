package org.storydriven.modeling.diagram.custom.expressions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IObjectActionDelegate;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.diagram.edit.parts.ActivityEdgeEditPart;
import org.storydriven.modeling.expressions.TextualExpression;
import org.storydriven.modeling.expressions.impl.ExpressionsFactoryImpl;


// TODO abstract all those Abstract Action Delegates and refactor hierachy!!!
public class EditActivityEdgeGuardExpressionWithDialogAction extends CommonEditExpressionWithDialogAction implements 
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
		return EcorePackage.eINSTANCE.getEBoolean();
	}

	protected ActivityEdge getModel() {
		EditPart aEditPart = this.getEditPart();
		return (ActivityEdge) ((View) aEditPart.getModel()).getElement();
	}

	@Override
	protected TransactionalEditingDomain getChangeCommandReceiver() {
		return ((ActivityEdgeEditPart
				) this.getEditPart()).getEditingDomain();
	}

	@Override
	protected Command getChangeAttributeCommand() {
		return new SetCommand(this.getChangeCommandReceiver(), 
									this.getModel(), 
									this.getModel().eClass().getEStructuralFeature("guardExpression"),
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
		TextualExpression e = (TextualExpression) this.getModel().getGuardExpression();
		if(e == null) {
			e = ExpressionsFactoryImpl.eINSTANCE.createTextualExpression();
			this.getChangeCommandReceiver().
						getCommandStack().execute(new SetCommand(this.getChangeCommandReceiver(), 
																this.getModel(), 
																this.getModel().eClass().getEStructuralFeature("guardExpression"),
																e));
		}
		return e;
	}
	
}
