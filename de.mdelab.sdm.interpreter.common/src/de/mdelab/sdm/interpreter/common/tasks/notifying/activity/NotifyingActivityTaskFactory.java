package de.mdelab.sdm.interpreter.common.tasks.notifying.activity;

import java.util.concurrent.Exchanger;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityDecisionMergeNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityFinalNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IExpressionNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IForEachFreshMatchStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IForkJoinNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.ISimpleNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.ISingleMatchStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IStoryActivityAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.activity.ActivityFinalNodeTask;
import de.mdelab.sdm.interpreter.common.tasks.activity.ActivityNodeTask;
import de.mdelab.sdm.interpreter.common.tasks.activity.ActivityTaskFactory;
import de.mdelab.sdm.interpreter.common.tasks.activity.ActivityTraversalTask;
import de.mdelab.sdm.interpreter.common.tasks.activity.SimpleActivityNodeTask;
import de.mdelab.sdm.interpreter.common.tasks.activity.StoryActivityTask;
import de.mdelab.sdm.interpreter.common.tasks.notifying.INotificationReceiver;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class NotifyingActivityTaskFactory extends ActivityTaskFactory
{
	private INotificationReceiver	notificationReceiver;

	public NotifyingActivityTaskFactory(INotificationReceiver notificationReceiver)
	{
		this.notificationReceiver = notificationReceiver;
	}

	@Override
	public StoryActivityTask createStoryActivityTask(VariableScope variableScope, IStoryActivityAdapter activityAdapter,
			Exchanger<Object> exchanger)
	{
		return new NotifyingStoryActivityTask(null, variableScope, activityAdapter, exchanger, notificationReceiver);
	}

	@Override
	protected SimpleActivityNodeTask createSimpleActivityNodeTask(Task<?> parentTask, VariableScope variableScope,
			ISimpleNodeAdapter adapter)
	{
		return new NotifyingSimpleActivityNodeTask(parentTask, variableScope, adapter, notificationReceiver);
	}

	@Override
	protected ActivityNodeTask<? extends IActivityNodeAdapter> createExpressionNodeTask(Task<?> parentTask, VariableScope variableScope,
			IExpressionNodeAdapter adapter)
	{
		return new NotifyingExpressionNodeTask(parentTask, variableScope, adapter, notificationReceiver);
	}

	@Override
	protected ActivityNodeTask<? extends IActivityNodeAdapter> createActivityDecisionMergeNodeTask(Task<?> parentTask,
			VariableScope variableScope, IActivityDecisionMergeNodeAdapter adapter)
	{
		return new NotifyingDecisionMergeNodeTask(parentTask, variableScope, adapter, notificationReceiver);
	}

	@Override
	protected ActivityFinalNodeTask createActivityFinalNodeTask(Task<?> parentTask, VariableScope variableScope,
			IActivityFinalNodeAdapter adapter)
	{
		return new NotifyingActivityFinalNodeTask(parentTask, variableScope, adapter, notificationReceiver);
	}

	@Override
	protected ActivityNodeTask<? extends IActivityNodeAdapter> createForkJoinNodeTask(Task<?> parentTask, VariableScope variableScope,
			IForkJoinNodeAdapter adapter)
	{
		return new NotifyingForkJoinNodeTask(parentTask, variableScope, adapter, notificationReceiver);
	}

	@Override
	protected ActivityNodeTask<? extends IActivityNodeAdapter> createSingleMatchStoryNodeTask(Task<?> parentTask,
			VariableScope variableScope, ISingleMatchStoryNodeAdapter adapter)
	{
		return new NotifyingSingleMatchStoryNodeTask(parentTask, variableScope, adapter, notificationReceiver);
	}

	@Override
	protected ActivityNodeTask<? extends IActivityNodeAdapter> createForEachFreshMatchStoryNodeTask(Task<?> parentTask,
			VariableScope variableScope, IForEachFreshMatchStoryNodeAdapter adapter)
	{
		return new NotifyingForEachFreshMatchStoryNodeTask(parentTask, variableScope, adapter, notificationReceiver);
	}

	@Override
	public ActivityTraversalTask createActivityTraversalTask(Task<?> parentTask, VariableScope variableScope,
			IActivityNodeAdapter firstNodeAdapter, IActivityNodeAdapter lastNodeAdapter)
	{
		return new NotifyingActivityTraversalTask(parentTask, variableScope, firstNodeAdapter, lastNodeAdapter, notificationReceiver);
	}
}
