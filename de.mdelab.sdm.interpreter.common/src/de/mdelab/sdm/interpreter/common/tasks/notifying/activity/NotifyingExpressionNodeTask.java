package de.mdelab.sdm.interpreter.common.tasks.notifying.activity;

import de.mdelab.sdm.interpreter.common.adapters.activity.IExpressionNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.TaskStateEnum;
import de.mdelab.sdm.interpreter.common.tasks.activity.ExpressionNodeTask;
import de.mdelab.sdm.interpreter.common.tasks.notifying.INotificationReceiver;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class NotifyingExpressionNodeTask extends ExpressionNodeTask
{
	private INotificationReceiver	notificationReceiver;

	public NotifyingExpressionNodeTask(Task<?> parentTask, VariableScope variableScope, IExpressionNodeAdapter adapter,
			INotificationReceiver notificationReceiver)
	{
		super(parentTask, variableScope, adapter);

		assert notificationReceiver != null;

		this.notificationReceiver = notificationReceiver;
	}

	@Override
	protected boolean caseStateInitializing() throws Exception
	{
		notificationReceiver.beforeActivityNodeExecution(getAdapter());
		return super.caseStateInitializing();
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		super.caseStateFinishing();
		notificationReceiver.afterActivityNodeExecution(getAdapter());
	}

	@Override
	protected void caseStateCancelled() throws Exception
	{
		notificationReceiver.executionCancelled(getAdapter(), getVariableScope().getInterpreterManager().getRootException());
		super.caseStateCancelled();
	}
	
	@Override
	protected void switchToNextState()
	{
		TaskStateEnum previousState = getTaskState();

		super.switchToNextState();
		
		notificationReceiver.afterTaskStateSwitch(this, previousState, getTaskState());
	}
	
	@Override
	protected void startTask(Task<?> task)
	{
		notificationReceiver.startingTask(this, task);
		super.startTask(task);
	}
}
