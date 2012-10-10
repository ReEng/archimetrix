package de.mdelab.sdm.interpreter.common.activity.tasks;

import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public abstract class ActivityNodeTask<AdapterType extends ActivityNodeAdapter> extends ActivityTask<AdapterType, ActivityNodeAdapter>
{
	private ActivityNodeAdapter	nextNodeAdapter;

	protected ActivityNodeTask(Task<?, ?> parentTask, ActivityTaskFactory taskFactory, VariablesManager variablesManager,
			AdapterType adapter)
	{
		super(parentTask, taskFactory, variablesManager, adapter);
	}

	protected ActivityNodeAdapter getNextNodeAdapter()
	{
		return nextNodeAdapter;
	}

	protected void setNextNodeAdapter(ActivityNodeAdapter nextNodeAdapter)
	{
		this.nextNodeAdapter = nextNodeAdapter;
	}

	@Override
	public ActivityNodeAdapter getReturnValue()
	{
		return nextNodeAdapter;
	}
}
