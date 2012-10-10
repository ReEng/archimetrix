package de.mdelab.sdm.interpreter.common.tasks.activity;

import de.mdelab.sdm.interpreter.common.adapters.activity.IExpressionNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class ExpressionNodeTask extends ActivityNodeTask<IExpressionNodeAdapter>
{

	public ExpressionNodeTask(Task<?> parentTask, VariableScope variableScope, IExpressionNodeAdapter adapter)
	{
		super(parentTask, variableScope, adapter);
	}

	@Override
	protected boolean caseStateInitializing() throws Exception
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

		for (IExpressionAdapter expressionAdapter : getAdapter().getExpressionAdapters())
		{
			if (isCancelled())
			{
				return false;
			}

			try
			{
				getVariableScope().getInterpreterManager().getWriteLock().lock();

				getVariableScope().getInterpreterManager().getMainInterpreterFactory().getExpressionInterpreterFactory()
						.getExpressionInterpreter(expressionAdapter.getExpressionLanguage())
						.evaluate(expressionAdapter, getVariableScope(), null, null);
			}
			finally
			{
				getVariableScope().getInterpreterManager().getWriteLock().unlock();
			}
		}

		setNextNodeAdapter(getAdapter().getNextNodeAdapter());

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
