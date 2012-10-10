package de.mdelab.sdm.interpreter.common.activity.tasks.notifying;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;

import de.mdelab.sdm.interpreter.common.SDMInterpreter;
import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityFinalNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.ExpressionNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.ForkJoinNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.SimpleNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.StoryActivityAdapter;
import de.mdelab.sdm.interpreter.common.activity.tasks.ActivityFinalNodeTask;
import de.mdelab.sdm.interpreter.common.activity.tasks.ActivityNodeTask;
import de.mdelab.sdm.interpreter.common.activity.tasks.StoryActivityTask;
import de.mdelab.sdm.interpreter.common.activity.tasks.ExpressionNodeTask;
import de.mdelab.sdm.interpreter.common.activity.tasks.SimpleActivityNodeTask;
import de.mdelab.sdm.interpreter.common.activity.tasks.ActivityTask;
import de.mdelab.sdm.interpreter.common.activity.tasks.ActivityTaskFactory;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class NotifyingTaskFactory extends ActivityTaskFactory
{
	private NotificationReceiver	notificationReceiver;

	public NotifyingTaskFactory(NotificationReceiver notificationReceiver)
	{
		assert notificationReceiver != null;

		this.notificationReceiver = notificationReceiver;
	}

	@Override
	public StoryActivityTask createActivityTask(VariablesManager variablesManager, StoryActivityAdapter activityAdapter,
			Exchanger<Object> exchanger)
	{
		return new NotifyingActivityTask(null, this, variablesManager, activityAdapter, exchanger, notificationReceiver);
	}

	@Override
	protected SimpleActivityNodeTask createSimpleActivityNodeTask(ActivityTask<?, ?> parentTask, VariablesManager variablesManager,
			SimpleNodeAdapter activityNodeAdapter)
	{
		return new NotifyingSimpleActivityNodeTask(parentTask, this, variablesManager, activityNodeAdapter, notificationReceiver);
	}

	@Override
	protected ActivityFinalNodeTask createActivityFinalNodeTask(ActivityTask<?, ?> parentTask, VariablesManager variablesManager,
			ActivityFinalNodeAdapter activityNodeAdapter)
	{
		return new NotifyingActivityFinalNodeTask(parentTask, this, variablesManager, activityNodeAdapter, notificationReceiver);
	}

	@Override
	protected ExpressionNodeTask createExpressionNodeTask(ActivityTask<?, ?> parentTask, VariablesManager variablesManager,
			ExpressionNodeAdapter activityNodeAdapter)
	{
		return new NotifyingExpressionNodeTask(parentTask, this, variablesManager, activityNodeAdapter, notificationReceiver);
	}

	@Override
	protected ActivityNodeTask<? extends ActivityNodeAdapter> createForkJoinNodeTask(ActivityTask<?, ?> parentTask,
			VariablesManager variablesManager, ForkJoinNodeAdapter activityNodeAdapter)
	{
		return new NotifyingForkJoinTask(parentTask, this, variablesManager, activityNodeAdapter, notificationReceiver);
	}

	@Override
	public VariablesManager createVariablesManager(SDMInterpreter sdmInterpreter, ClassLoader classLoader, ExecutorService executorService)
	{
		return new NotifyingVariablesManager(sdmInterpreter, this, classLoader, executorService, notificationReceiver);
	}

}
