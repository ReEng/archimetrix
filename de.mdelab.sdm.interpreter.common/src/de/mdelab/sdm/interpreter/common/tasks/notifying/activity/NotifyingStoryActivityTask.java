package de.mdelab.sdm.interpreter.common.tasks.notifying.activity;

import java.util.concurrent.Exchanger;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.adapters.activity.IStoryActivityAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.TaskStateEnum;
import de.mdelab.sdm.interpreter.common.tasks.activity.StoryActivityTask;
import de.mdelab.sdm.interpreter.common.tasks.notifying.INotificationReceiver;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class NotifyingStoryActivityTask extends StoryActivityTask
{
	private INotificationReceiver	notificationReceiver;

	public NotifyingStoryActivityTask(Task<?> parentTask, VariableScope variableScope, IStoryActivityAdapter activityAdapter,
			Exchanger<Object> exchanger, INotificationReceiver notificationReceiver)
	{
		super(parentTask, variableScope, activityAdapter, exchanger);

		assert notificationReceiver != null;

		this.notificationReceiver = notificationReceiver;
	}

	@Override
	protected boolean caseStateInitializing() throws Exception
	{
		notificationReceiver.beforeActivityExecution(getAdapter());
		return super.caseStateInitializing();
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		super.caseStateFinishing();
		notificationReceiver.afterActivityExecution(getAdapter(),
				getVariableScope().getVariable(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME));
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
