package org.storydriven.modeling.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionDelegate;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IObjectActionDelegate;
import org.storydriven.modeling.activities.StoryNode;

public class StoryNodeToggleForEachCommand extends AbstractActionDelegate implements
		IObjectActionDelegate {

	StoryNode aNodeElement;
	View theModel;
	
	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		GraphicalEditPart anEditPart = (GraphicalEditPart) (getStructuredSelection().getFirstElement());
		aNodeElement = (StoryNode) ((View) anEditPart.getModel()).getElement();
		theModel = ((View) anEditPart.getModel());
		
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(anEditPart.getEditingDomain(),
					"Toggle StoryNodes for each attribute", null) {
			
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
					IAdaptable info) throws ExecutionException {

				aNodeElement.setForEach(!aNodeElement.isForEach());
				
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
