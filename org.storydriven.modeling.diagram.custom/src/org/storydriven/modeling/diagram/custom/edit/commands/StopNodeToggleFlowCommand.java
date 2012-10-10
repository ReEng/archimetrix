package org.storydriven.modeling.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IObjectActionDelegate;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.diagram.edit.parts.StopNodeEditPart;

public class StopNodeToggleFlowCommand extends AbstractActionDelegate implements
		IObjectActionDelegate {

	StopNode aStopNode;
	
	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		StopNodeEditPart stopNodeEditPart = ((StopNodeEditPart) getStructuredSelection().getFirstElement());
		aStopNode = (StopNode) ((View) stopNodeEditPart.getModel()).getElement();
		
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(stopNodeEditPart.getEditingDomain(),
					"Toggle StopNode FlowStopOnly Attribute", null) {
			
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
					IAdaptable info) throws ExecutionException {

				aStopNode.setFlowStopOnly(!aStopNode.isFlowStopOnly());
				
				return CommandResult.newOKCommandResult();
			}
		};
		
		try
		{
			OperationHistoryFactory.getOperationHistory().execute(command, new NullProgressMonitor(), null);
		}
		catch (ExecutionException ee) {
			ee.printStackTrace();
		}
	}

}
