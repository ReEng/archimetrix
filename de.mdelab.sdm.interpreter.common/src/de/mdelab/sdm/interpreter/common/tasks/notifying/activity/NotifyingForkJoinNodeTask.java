package de.mdelab.sdm.interpreter.common.tasks.notifying.activity;

import java.util.Collection;
import java.util.List;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IForkJoinNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.TaskStateEnum;
import de.mdelab.sdm.interpreter.common.tasks.activity.ActivityTraversalTask;
import de.mdelab.sdm.interpreter.common.tasks.activity.ForkJoinNodeTask;
import de.mdelab.sdm.interpreter.common.tasks.notifying.INotificationReceiver;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class NotifyingForkJoinNodeTask extends ForkJoinNodeTask
{
	private INotificationReceiver notificationReceiver;
	
	public NotifyingForkJoinNodeTask(Task<?> parentTask, VariableScope variableScope, IForkJoinNodeAdapter adapter, INotificationReceiver notificationReceiver)
	{
		super(parentTask, variableScope, adapter);

		assert notificationReceiver != null;
		
		this.notificationReceiver = notificationReceiver;
	}

	@Override
	protected boolean caseStateInitializing() throws Exception
	{
		notificationReceiver.beforeForkJoinNodeExecution(getAdapter());
		return super.caseStateInitializing();
	}
	
	@Override
	protected void caseStateFinishing() throws Exception
	{
		super.caseStateFinishing();
		notificationReceiver.afterForkJoinNodeExecution(getAdapter());
	}
	
	@Override
	protected void caseFork(Collection<IActivityNodeAdapter> nextNodeAdapters) throws SDMInterpreterException
	{
		notificationReceiver.beforeFork(getAdapter(), nextNodeAdapters.size());
		super.caseFork(nextNodeAdapters);
	}
	
	@Override
	protected void joinedTasks(List<ActivityTraversalTask> traversalTasks)
	{
		super.joinedTasks(traversalTasks);
		notificationReceiver.afterJoin(getAdapter(), traversalTasks.size());
	}
	
	@Override
	protected void switchToNextState()
	{
		TaskStateEnum previousState = getTaskState();

		super.switchToNextState();
		
		notificationReceiver.afterTaskStateSwitch(this, previousState, getTaskState());
	}
	
	@Override
	protected void startTask(Task<?> task)
	{
		notificationReceiver.startingTask(this, task);
		super.startTask(task);
	}
}
