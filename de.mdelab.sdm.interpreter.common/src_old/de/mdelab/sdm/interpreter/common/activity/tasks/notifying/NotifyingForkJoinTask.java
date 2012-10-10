package de.mdelab.sdm.interpreter.common.activity.tasks.notifying;

import java.util.Collection;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.ForkJoinNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.tasks.ForkJoinTask;
import de.mdelab.sdm.interpreter.common.activity.tasks.ActivityTaskFactory;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class NotifyingForkJoinTask extends ForkJoinTask
{
	private NotificationReceiver	notificationReceiver;

	protected NotifyingForkJoinTask(Task<?, ?> parentTask, ActivityTaskFactory taskFactory, VariablesManager variablesManager,
			ForkJoinNodeAdapter adapter, NotificationReceiver notificationReceiver)
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
	protected void caseFork(Collection<ActivityNodeAdapter> nextNodeAdapters) throws SDMInterpreterException
	{
		notificationReceiver.beforeFork(getAdapter(), nextNodeAdapters.size());
		super.caseFork(nextNodeAdapters);
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		super.caseStateFinishing();

		if (getTraversalTasks().size() > 1)
		{
			notificationReceiver.afterJoin(getAdapter(), getTraversalTasks().size());
		}

		notificationReceiver.afterActivityNodeExecution(getAdapter());
	}
}
