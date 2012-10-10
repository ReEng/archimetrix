package org.storydriven.modeling.diagram.custom.expressions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.ui.IActionDelegate;

// TODO abstract all those Abstract Action Delegates
public class EditExpressionWithDialogAction extends AbstractActionDelegate implements IActionDelegate{

	EditExpressionDialog expressionDialog;
	
	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		expressionDialog = new EditExpressionDialog(null);
		expressionDialog.setExpectedReturnType(null);
		expressionDialog.open();		
	}

}
