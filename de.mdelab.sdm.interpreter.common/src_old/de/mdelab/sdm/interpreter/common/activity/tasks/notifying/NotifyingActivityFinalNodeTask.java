package de.mdelab.sdm.interpreter.common.activity.tasks.notifying;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityFinalNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.tasks.ActivityFinalNodeTask;
import de.mdelab.sdm.interpreter.common.activity.tasks.ActivityTaskFactory;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class NotifyingActivityFinalNodeTask extends ActivityFinalNodeTask
{
	private NotificationReceiver	notificationReceiver;

	protected NotifyingActivityFinalNodeTask(Task<?, ?> parentTask, ActivityTaskFactory taskFactory, VariablesManager variablesManager,
			ActivityFinalNodeAdapter adapter, NotificationReceiver notificationReceiver)
	{
		super(parentTask, taskFactory, variablesManager, adapter);

		assert notificationReceiver != null;

		this.notificationReceiver = notificationReceiver;
	}

	@Override
	protected boolean caseStateReady() throws Exception
	{
		notificationReceiver.beforeActivityFinalNodeExecution(getAdapter());

		return super.caseStateReady();
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		super.caseStateFinishing();

		notificationReceiver.afterActivityFinalNodeExecution(getAdapter(),
				getVariablesManager().getVariable(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME));
	}
}
