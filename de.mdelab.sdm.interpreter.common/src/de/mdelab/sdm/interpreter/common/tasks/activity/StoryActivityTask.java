package de.mdelab.sdm.interpreter.common.tasks.activity;

import java.util.concurrent.Exchanger;

import de.mdelab.sdm.interpreter.common.adapters.activity.IStoryActivityAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class StoryActivityTask extends ActivityTask<IStoryActivityAdapter, Object>
{
	private Exchanger<Object>		exchanger;

	private ActivityTraversalTask	activityTraversalTask;

	public StoryActivityTask(Task<?> parentTask, VariableScope variableScope, IStoryActivityAdapter activityAdapter,
			Exchanger<Object> exchanger)
	{
		super(parentTask, variableScope, activityAdapter);

		assert exchanger != null;

		this.exchanger = exchanger;
	}

	@Override
	public Object getReturnValue()
	{
		return null;
	}

	@Override
	protected boolean caseStateInitializing() throws Exception
	{
		activityTraversalTask = getVariableScope().getInterpreterManager().getMainInterpreterFactory().getActivityTaskFactory()
				.createActivityTraversalTask(this, getVariableScope(), getAdapter().getInitialNodeAdapter(), null);

		startTask(activityTraversalTask);

		return true;
	}

	@Override
	protected boolean caseStateWorking() throws Exception
	{
		assert activityTraversalTask.isDone();

		return false;
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		exchanger.exchange(null);
	}

	@Override
	protected void caseStateCancelled() throws Exception
	{
		if (activityTraversalTask != null)
		{
			activityTraversalTask.cancel();
		}

		exchanger.exchange(null);
	}

}
