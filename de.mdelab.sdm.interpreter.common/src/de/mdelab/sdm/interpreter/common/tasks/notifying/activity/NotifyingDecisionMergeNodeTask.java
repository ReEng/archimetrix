package de.mdelab.sdm.interpreter.common.tasks.notifying.activity;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityDecisionMergeNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.TaskStateEnum;
import de.mdelab.sdm.interpreter.common.tasks.activity.DecisionMergeNodeTask;
import de.mdelab.sdm.interpreter.common.tasks.notifying.INotificationReceiver;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class NotifyingDecisionMergeNodeTask extends DecisionMergeNodeTask
{
	private INotificationReceiver	notificationReceiver;

	public NotifyingDecisionMergeNodeTask(Task<?> parentTask, VariableScope variableScope, IActivityDecisionMergeNodeAdapter adapter,
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
