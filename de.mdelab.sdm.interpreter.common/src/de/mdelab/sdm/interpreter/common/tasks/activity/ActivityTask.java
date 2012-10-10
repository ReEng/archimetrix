package de.mdelab.sdm.interpreter.common.tasks.activity;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public abstract class ActivityTask<ADAPTER extends IActivityAdapter, RETURN_VALUE> extends Task<RETURN_VALUE>
{
	private ADAPTER	adapter;

	public ActivityTask(Task<?> parentTask, VariableScope variableScope, ADAPTER adapter)
	{
		super(parentTask, variableScope);

		assert adapter != null;

		this.adapter = adapter;
	}

	protected ADAPTER getAdapter()
	{
		return adapter;
	}
}
