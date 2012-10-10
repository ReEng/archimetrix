package de.mdelab.sdm.interpreter.common.activity.tasks;

import java.util.Map.Entry;

import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.DecisionMergeNodeAdapter;
import de.mdelab.sdm.interpreter.common.expressions.adapters.ExpressionAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class DecisionNodeTask extends ActivityNodeTask<DecisionMergeNodeAdapter>
{

	protected DecisionNodeTask(Task<?, ?> parentTask, ActivityTaskFactory taskFactory, VariablesManager variablesManager,
			DecisionMergeNodeAdapter adapter)
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
		for (Entry<ExpressionAdapter, ActivityNodeAdapter> entry : getAdapter().getNextNodesForBooleanCases().entrySet())
		{
			if (getVariablesManager().evaluateExpression(entry.getKey(), null, null).getValue() == Boolean.TRUE)
			{
				setNextNodeAdapter(entry.getValue());

				return false;
			}
		}

		setNextNodeAdapter(getAdapter().getUnconditionalNextNode());
		
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
