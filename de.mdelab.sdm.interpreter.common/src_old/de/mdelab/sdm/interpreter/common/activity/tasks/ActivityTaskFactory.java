package de.mdelab.sdm.interpreter.common.activity.tasks;

import java.util.concurrent.Exchanger;

import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityFinalNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.DecisionMergeNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.ExpressionNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.ForkJoinNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.SimpleNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.StoryActivityAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.StoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.TaskFactory;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class ActivityTaskFactory extends TaskFactory
{
	public StoryActivityTask createActivityTask(VariablesManager variablesManager, StoryActivityAdapter activityAdapter,
			Exchanger<Object> exchanger)
	{
		return new StoryActivityTask(null, this, variablesManager, activityAdapter, exchanger);
	}

	public ActivityNodeTask<? extends ActivityNodeAdapter> createActivityNodeTask(ActivityTask<?, ?> parentTask,
			VariablesManager variablesManager, ActivityNodeAdapter activityNodeAdapter)
	{
		if (activityNodeAdapter instanceof ActivityFinalNodeAdapter)
		{
			return createActivityFinalNodeTask(parentTask, variablesManager, (ActivityFinalNodeAdapter) activityNodeAdapter);
		}
		else if (activityNodeAdapter instanceof ExpressionNodeAdapter)
		{
			return createExpressionNodeTask(parentTask, variablesManager, (ExpressionNodeAdapter) activityNodeAdapter);
		}
		else if (activityNodeAdapter instanceof DecisionMergeNodeAdapter)
		{
			return createDecisionNodeTask(parentTask, variablesManager, (DecisionMergeNodeAdapter) activityNodeAdapter);
		}
		else if (activityNodeAdapter instanceof StoryNodeAdapter)
		{
			return createSingleMatchStoryNodeTask(parentTask, variablesManager, (StoryNodeAdapter) activityNodeAdapter);
		}
		else if (activityNodeAdapter instanceof ForkJoinNodeAdapter)
		{
			return createForkJoinNodeTask(parentTask, variablesManager, (ForkJoinNodeAdapter) activityNodeAdapter);
		}
		else if (activityNodeAdapter instanceof SimpleNodeAdapter)
		{
			return createSimpleActivityNodeTask(parentTask, variablesManager, (SimpleNodeAdapter) activityNodeAdapter);
		}
		else
		{
			throw new UnsupportedOperationException("This kind of adapter is not supported: " + activityNodeAdapter);
		}
	}

	protected ActivityNodeTask<? extends ActivityNodeAdapter> createForkJoinNodeTask(ActivityTask<?, ?> parentTask,
			VariablesManager variablesManager, ForkJoinNodeAdapter activityNodeAdapter)
	{
		return new ForkJoinTask(parentTask, this, variablesManager, activityNodeAdapter);
	}

	protected SimpleActivityNodeTask createSimpleActivityNodeTask(ActivityTask<?, ?> parentTask, VariablesManager variablesManager,
			SimpleNodeAdapter activityNodeAdapter)
	{
		return new SimpleActivityNodeTask(parentTask, this, variablesManager, activityNodeAdapter);
	}

	protected ActivityFinalNodeTask createActivityFinalNodeTask(ActivityTask<?, ?> parentTask, VariablesManager variablesManager,
			ActivityFinalNodeAdapter activityNodeAdapter)
	{
		return new ActivityFinalNodeTask(parentTask, this, variablesManager, activityNodeAdapter);
	}

	protected ExpressionNodeTask createExpressionNodeTask(ActivityTask<?, ?> parentTask, VariablesManager variablesManager,
			ExpressionNodeAdapter activityNodeAdapter)
	{
		return new ExpressionNodeTask(parentTask, this, variablesManager, activityNodeAdapter);
	}

	protected ActivityTraversalTask createActivityTraversalTask(ActivityTask<?, ?> parentTask, VariablesManager variablesManager,
			ActivityNodeAdapter firstNodeAdapter, ActivityNodeAdapter lastNodeAdapter)
	{
		return new ActivityTraversalTask(parentTask, this, variablesManager, firstNodeAdapter, lastNodeAdapter);
	}

	protected DecisionNodeTask createDecisionNodeTask(ActivityTask<?, ?> parentTask, VariablesManager variablesManager,
			DecisionMergeNodeAdapter activityNodeAdapter)
	{
		return new DecisionNodeTask(parentTask, this, variablesManager, activityNodeAdapter);
	}

	protected SingleMatchStoryNodeTask createSingleMatchStoryNodeTask(Task<?, ?> parentTask, VariablesManager variablesManager,
			StoryNodeAdapter adapter)
	{
		return new SingleMatchStoryNodeTask(parentTask, this, variablesManager, adapter);
	}
}
