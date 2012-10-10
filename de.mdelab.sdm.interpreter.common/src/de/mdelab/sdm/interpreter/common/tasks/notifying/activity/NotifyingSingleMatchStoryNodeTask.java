package de.mdelab.sdm.interpreter.common.tasks.notifying.activity;

import de.mdelab.sdm.interpreter.common.adapters.activity.ISingleMatchStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.TaskStateEnum;
import de.mdelab.sdm.interpreter.common.tasks.activity.SingleMatchStoryNodeTask;
import de.mdelab.sdm.interpreter.common.tasks.notifying.INotificationReceiver;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class NotifyingSingleMatchStoryNodeTask extends SingleMatchStoryNodeTask
{
	private INotificationReceiver	notificationReceiver;

	public NotifyingSingleMatchStoryNodeTask(Task<?> parentTask, VariableScope variableScope, ISingleMatchStoryNodeAdapter adapter,
			INotificationReceiver notificationReceiver)
	{
		super(parentTask, variableScope, adapter);

		assert notificationReceiver != null;

		this.notificationReceiver = notificationReceiver;
	}
	
	@Override
	protected boolean caseStateInitializing() throws Exception
	{
		notificationReceiver.beforeSingleMatchStoryNodeExecution(getAdapter());
		return super.caseStateInitializing();
	}
	
	@Override
	protected void caseStateFinishing() throws Exception
	{
		super.caseStateFinishing();
		notificationReceiver.afterSingleMatchStoryNodeExecution(getAdapter(), getNextNodeAdapter() == getAdapter().getNextNodeAdapterForSuccess());
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
