package de.mdelab.sdm.interpreter.common.activity.tasks.notifying;

import de.mdelab.sdm.interpreter.common.activity.adapters.ExpressionNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.tasks.ExpressionNodeTask;
import de.mdelab.sdm.interpreter.common.activity.tasks.ActivityTaskFactory;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class NotifyingExpressionNodeTask extends ExpressionNodeTask
{
	private NotificationReceiver	notificationReceiver;

	protected NotifyingExpressionNodeTask(Task<?, ?> parentTask, ActivityTaskFactory taskFactory, VariablesManager variablesManager,
			ExpressionNodeAdapter adapter, NotificationReceiver notificationReceiver)
	{
		super(parentTask, taskFactory, variablesManager, adapter);

		assert notificationReceiver != null;

		this.notificationReceiver = notificationReceiver;
	}

	@Override
	protected boolean caseStateReady() throws Exception
	{
		notificationReceiver.beforeActivityNodeExecution(getAdapter());
		return super.caseStateReady();
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		super.caseStateFinishing();
		notificationReceiver.afterActivityNodeExecution(getAdapter());
	}
}
