package de.mdelab.sdm.interpreter.common.activity.tasks;

import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class ActivityTraversalTask extends ActivityTask<ActivityNodeAdapter, ActivityNodeAdapter>
{

	private ActivityNodeAdapter								lastNodeAdapter;
	private ActivityNodeTask<? extends ActivityNodeAdapter>	currentTask;

	protected ActivityTraversalTask(Task<?, ?> parentTask, ActivityTaskFactory taskFactory, VariablesManager variablesManager,
			ActivityNodeAdapter firstNodeAdapter, ActivityNodeAdapter lastNodeAdapter)
	{
		super(parentTask, taskFactory, variablesManager, firstNodeAdapter);

		this.lastNodeAdapter = lastNodeAdapter;
	}

	@Override
	protected boolean caseStateReady() throws Exception
	{
		currentTask = getTaskFactory().createActivityNodeTask(this, getVariablesManager(), getAdapter());
		getVariablesManager().submitTask(currentTask);
		
		return true;
	}

	@Override
	protected boolean caseStateWorking() throws Exception
	{
		assert currentTask.isDone();

		ActivityNodeAdapter nextNodeAdapter = currentTask.getReturnValue();

		if (nextNodeAdapter != null && nextNodeAdapter != lastNodeAdapter)
		{
			currentTask = getTaskFactory().createActivityNodeTask(this, getVariablesManager(), nextNodeAdapter);
			getVariablesManager().submitTask(currentTask);
			
			return true;
		}
		else
		{
			currentTask = null;
			return false;
		}

	}

	@Override
	protected void caseStateCancelled() throws Exception
	{
		if (currentTask != null)
		{
			currentTask.cancel();
		}
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		// Do nothing
	}

	@Override
	public ActivityNodeAdapter getReturnValue()
	{
		return null;
	}
}
