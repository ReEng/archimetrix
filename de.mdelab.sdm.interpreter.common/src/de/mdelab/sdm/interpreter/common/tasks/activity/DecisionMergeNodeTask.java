package de.mdelab.sdm.interpreter.common.tasks.activity;

import java.util.Map.Entry;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityDecisionMergeNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.TaskStateEnum;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class DecisionMergeNodeTask extends ActivityNodeTask<IActivityDecisionMergeNodeAdapter>
{

	public DecisionMergeNodeTask(Task<?> parentTask, VariableScope variableScope, IActivityDecisionMergeNodeAdapter adapter)
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
		for (Entry<IExpressionAdapter, IActivityNodeAdapter> entry : getAdapter().getNextNodesForBooleanCases().entrySet())
		{
			if (getTaskState() == TaskStateEnum.CANCELLED)
			{
				return false;
			}

			try
			{
				getVariableScope().getInterpreterManager().getReadLock().lock();

				if (((Boolean)getVariableScope().getInterpreterManager().getMainInterpreterFactory().getExpressionInterpreterFactory()
						.getExpressionInterpreter(entry.getKey().getExpressionLanguage())
						.evaluate(entry.getKey(), getVariableScope(), null, null).getValueAdapter().getValue()).booleanValue() == Boolean.TRUE)
				{
					setNextNodeAdapter(entry.getValue());

					return false;
				}
			}
			finally
			{
				getVariableScope().getInterpreterManager().getReadLock().unlock();
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
