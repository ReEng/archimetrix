package de.mdelab.sdm.interpreter.common.tasks.activity;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public abstract class ActivityNodeTask<ADAPTER extends IActivityNodeAdapter> extends ActivityTask<ADAPTER, IActivityNodeAdapter>
{
	private IActivityNodeAdapter	nextNodeAdapter;

	public ActivityNodeTask(Task<?> parentTask, VariableScope variableScope, ADAPTER adapter)
	{
		super(parentTask, variableScope, adapter);

		assert parentTask != null;
	}

	protected IActivityNodeAdapter getNextNodeAdapter()
	{
		return nextNodeAdapter;
	}

	protected void setNextNodeAdapter(IActivityNodeAdapter nextNodeAdapter)
	{
		this.nextNodeAdapter = nextNodeAdapter;
	}

	@Override
	public IActivityNodeAdapter getReturnValue()
	{
		return nextNodeAdapter;
	}
}
