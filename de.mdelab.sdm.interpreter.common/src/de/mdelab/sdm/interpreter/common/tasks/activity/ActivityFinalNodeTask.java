package de.mdelab.sdm.interpreter.common.tasks.activity;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityFinalNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.expressions.IExpressionInterpreter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class ActivityFinalNodeTask extends ActivityNodeTask<IActivityFinalNodeAdapter>
{

	public ActivityFinalNodeTask(Task<?> parentTask, VariableScope variableScope, IActivityFinalNodeAdapter adapter)
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
		/*
		 * Get adapter of the return value expression
		 */
		IExpressionAdapter expressionAdapter = getAdapter().getReturnValueExpressionAdapter();

		if (expressionAdapter != null)
		{
			/*
			 * Evaluate expression
			 */
			IExpressionInterpreter expressionInterpreter = getVariableScope().getInterpreterManager().getMainInterpreterFactory()
					.getExpressionInterpreterFactory().getExpressionInterpreter(expressionAdapter.getExpressionLanguage());

			assert expressionInterpreter != null;

			Variable variable = null;

			try
			{
				getVariableScope().getInterpreterManager().getReadLock().lock();

				variable = expressionInterpreter.evaluate(expressionAdapter, getVariableScope(), null, null);
			}
			finally
			{
				getVariableScope().getInterpreterManager().getReadLock().unlock();
			}
			/*
			 * Create a variable for the return value
			 */
			getVariableScope().createVariable(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME, variable.getClassifierAdapter(),
					variable.getValueAdapter());
		}

		getVariableScope().getInterpreterManager().setFinalNodeReached();

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
