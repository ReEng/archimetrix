package de.mdelab.sdm.interpreter.common.activity.tasks;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.SDMVariable;
import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityFinalNodeAdapter;
import de.mdelab.sdm.interpreter.common.expressions.adapters.ExpressionAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class ActivityFinalNodeTask extends ActivityNodeTask<ActivityFinalNodeAdapter>
{
	protected ActivityFinalNodeTask(Task<?, ?> parentTask, ActivityTaskFactory taskFactory, VariablesManager variablesManager,
			ActivityFinalNodeAdapter adapter)
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
		 * Get adapter of the return value expression
		 */
		ExpressionAdapter expressionAdapter = getAdapter().getReturnValueExpressionAdapter();

		if (expressionAdapter != null)
		{
			/*
			 * Evaluate expression
			 */
			SDMVariable returnValue = getVariablesManager().evaluateExpression(expressionAdapter, null, null);

			/*
			 * Create a variable for the return value
			 */
			getVariablesManager().createVariable(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME, returnValue.getClassifierAdapter(),
					returnValue.getValue());
		}
		
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
