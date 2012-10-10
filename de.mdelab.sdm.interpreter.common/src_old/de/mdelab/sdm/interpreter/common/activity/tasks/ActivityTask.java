package de.mdelab.sdm.interpreter.common.activity.tasks;

import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityAdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.Adapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public abstract class ActivityTask<AT extends Adapter<ActivityAdapterFactory>, ReturnValueType> extends Task<ActivityTaskFactory, ReturnValueType>
{
	private AT	adapter;

	protected ActivityTask(Task<?, ?> parentTask, ActivityTaskFactory taskFactory, VariablesManager variablesManager, AT adapter)
	{
		super(parentTask, taskFactory, variablesManager);

		assert adapter != null;

		this.adapter = adapter;
	}

	protected AT getAdapter()
	{
		return adapter;
	}
}
