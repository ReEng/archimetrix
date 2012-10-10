package de.mdelab.sdm.interpreter.common.activity.tasks.notifying;

import java.util.concurrent.Exchanger;

import de.mdelab.sdm.interpreter.common.SDMInterpreterConstants;
import de.mdelab.sdm.interpreter.common.activity.adapters.StoryActivityAdapter;
import de.mdelab.sdm.interpreter.common.activity.tasks.StoryActivityTask;
import de.mdelab.sdm.interpreter.common.activity.tasks.ActivityTaskFactory;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class NotifyingActivityTask extends StoryActivityTask
{
	private NotificationReceiver	notificationReceiver;

	protected NotifyingActivityTask(Task<?, ?> parentTask, ActivityTaskFactory taskFactory, VariablesManager variablesManager,
			StoryActivityAdapter adapter, Exchanger<Object> exchanger, NotificationReceiver notificationReceiver)
	{
		super(parentTask, taskFactory, variablesManager, adapter, exchanger);

		assert notificationReceiver != null;

		this.notificationReceiver = notificationReceiver;
	}

	@Override
	protected boolean caseStateReady() throws Exception
	{
		notificationReceiver.beforeActivityExecution(getAdapter());
		return super.caseStateReady();
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		super.caseStateFinishing();
		notificationReceiver.afterActivityExecution(getAdapter(),
				getVariablesManager().getVariable(SDMInterpreterConstants.RETURN_VALUE_VAR_NAME));

	}

}
