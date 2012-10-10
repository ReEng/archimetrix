package de.mdelab.sdm.interpreter.common.tasks.notifying.activity;

import de.mdelab.sdm.interpreter.common.adapters.activity.IForEachFreshMatchStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.TaskStateEnum;
import de.mdelab.sdm.interpreter.common.tasks.activity.ForEachFreshMatchStoryNodeTask;
import de.mdelab.sdm.interpreter.common.tasks.notifying.INotificationReceiver;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class NotifyingForEachFreshMatchStoryNodeTask extends ForEachFreshMatchStoryNodeTask
{
	private INotificationReceiver	notificationReceiver;

	public NotifyingForEachFreshMatchStoryNodeTask(Task<?> parentTask, VariableScope variableScope,
			IForEachFreshMatchStoryNodeAdapter adapter, INotificationReceiver notificationReceiver)
	{
		super(parentTask, variableScope, adapter);

		assert notificationReceiver != null;

		this.notificationReceiver = notificationReceiver;
	}

	@Override
	protected boolean caseStateInitializing() throws Exception
	{
		notificationReceiver.beforeForEachFreshMatchStoryNodeExecution(getAdapter());
		return super.caseStateInitializing();
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		super.caseStateFinishing();
		notificationReceiver.afterForEachFreshMatchStoryNodeExecution(getAdapter(), getNextNodeAdapter() == getAdapter()
				.getNextNodeAdapterForSuccess());
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
