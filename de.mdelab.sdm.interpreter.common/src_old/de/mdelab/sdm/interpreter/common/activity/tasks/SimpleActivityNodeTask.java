package de.mdelab.sdm.interpreter.common.activity.tasks;

import de.mdelab.sdm.interpreter.common.activity.adapters.SimpleNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class SimpleActivityNodeTask extends ActivityNodeTask<SimpleNodeAdapter>
{
	protected SimpleActivityNodeTask(Task<?, ?> parentTask, ActivityTaskFactory taskFactory, VariablesManager variablesManager,
			SimpleNodeAdapter adapter)
	{
		super(parentTask, taskFactory, variablesManager, adapter);
	}

	@Override
	protected boolean caseStateReady() throws Exception
	{
		// Do nothing
		return false;
	}

	@Override
	protected boolean caseStateWorking() throws Exception
	{
		setNextNodeAdapter(getAdapter().getNextNode());
		
		return false;
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		// Do nothing
	}

	@Override
	protected void caseStateCancelled() throws Exception
	{
		// Do nothing
	}
}
