package de.mdelab.sdm.interpreter.common.activity.tasks;

import java.util.concurrent.Exchanger;

import de.mdelab.sdm.interpreter.common.SDMVariable;
import de.mdelab.sdm.interpreter.common.activity.adapters.StoryActivityAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class StoryActivityTask extends ActivityTask<StoryActivityAdapter, SDMVariable>
{
	private Exchanger<Object>		exchanger;
	private ActivityTraversalTask	activityTraversalTask;

	protected StoryActivityTask(Task<?, ?> parentTask, ActivityTaskFactory taskFactory, VariablesManager variablesManager,
			StoryActivityAdapter adapter, Exchanger<Object> exchanger)
	{
		super(parentTask, taskFactory, variablesManager, adapter);

		assert exchanger != null;

		this.exchanger = exchanger;
	}

	@Override
	protected boolean caseStateReady() throws Exception
	{
		activityTraversalTask = getTaskFactory().createActivityTraversalTask(this, getVariablesManager(),
				getAdapter().getInitialNodeAdapter(), null);

		getVariablesManager().submitTask(activityTraversalTask);

		return true;
	}

	@Override
	protected boolean caseStateWorking() throws Exception
	{
		assert activityTraversalTask.isDone();

		exchanger.exchange(null);

		return false;
	}

	@Override
	protected void caseStateCancelled() throws Exception
	{
		activityTraversalTask.cancel();
		exchanger.exchange(null);
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		// Do nothing
	}

	@Override
	public SDMVariable getReturnValue()
	{
		return null;
	}
}
