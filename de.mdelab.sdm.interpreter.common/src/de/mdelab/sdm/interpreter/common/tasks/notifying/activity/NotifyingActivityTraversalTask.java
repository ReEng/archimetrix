package de.mdelab.sdm.interpreter.common.tasks.notifying.activity;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.TaskStateEnum;
import de.mdelab.sdm.interpreter.common.tasks.activity.ActivityTraversalTask;
import de.mdelab.sdm.interpreter.common.tasks.notifying.INotificationReceiver;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class NotifyingActivityTraversalTask extends ActivityTraversalTask
{
	private INotificationReceiver	notificationReceiver;

	public NotifyingActivityTraversalTask(Task<?> parentTask, VariableScope variableScope, IActivityNodeAdapter firstNodeAdapter,
			IActivityNodeAdapter lastNodeAdapter, INotificationReceiver notificationReceiver)
	{
		super(parentTask, variableScope, firstNodeAdapter, lastNodeAdapter);
		
		assert notificationReceiver != null;
		
		this.notificationReceiver = notificationReceiver;
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
