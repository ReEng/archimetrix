package de.mdelab.sdm.interpreter.common.tasks.activity;

import de.mdelab.sdm.interpreter.common.adapters.activity.ISimpleNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class SimpleActivityNodeTask extends ActivityNodeTask<ISimpleNodeAdapter>
{
	public SimpleActivityNodeTask(Task<?> parentTask, VariableScope variableScope, ISimpleNodeAdapter adapter)
	{
		super(parentTask, variableScope, adapter);
	}

	@Override
	protected boolean caseStateInitializing() throws Exception
	{
		return false;
	}

	@Override
	protected boolean caseStateWorking() throws Exception
	{
		return false;
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		setNextNodeAdapter(getAdapter().getNextNodeAdapter());

		assert getNextNodeAdapter() != null;
	}

	@Override
	protected void caseStateCancelled() throws Exception
	{
		// Do nothing

	}

}
