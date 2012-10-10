package de.mdelab.sdm.interpreter.common.activity.tasks;

import de.mdelab.sdm.interpreter.common.activity.adapters.ExpressionNodeAdapter;
import de.mdelab.sdm.interpreter.common.expressions.adapters.ExpressionAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class ExpressionNodeTask extends ActivityNodeTask<ExpressionNodeAdapter>
{

	protected ExpressionNodeTask(Task<?, ?> parentTask, ActivityTaskFactory taskFactory, VariablesManager variablesManager,
			ExpressionNodeAdapter adapter)
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
		/*
		 * Evaluate expressions of all expression adapters
		 */
		VariablesManager variablesManager = getVariablesManager();

		for (ExpressionAdapter expressionAdapter : getAdapter().getExpressionAdapters())
		{
			if (isCancelled())
			{
				return false;
			}

			variablesManager.evaluateExpression(expressionAdapter, null, null);
		}

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
