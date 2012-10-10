package de.mdelab.sdm.interpreter.common.activity.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.ForkJoinNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public class ForkJoinTask extends ActivityNodeTask<ForkJoinNodeAdapter>
{

	private List<ActivityTraversalTask>	traversalTasks;

	private AtomicInteger				runningTraversalTasks;

	protected ForkJoinTask(Task<?, ?> parentTask, ActivityTaskFactory taskFactory, VariablesManager variablesManager,
			ForkJoinNodeAdapter adapter)
	{
		super(parentTask, taskFactory, variablesManager, adapter);

		traversalTasks = new ArrayList<ActivityTraversalTask>();
	}

	@Override
	protected boolean caseStateReady() throws Exception
	{
		Collection<ActivityNodeAdapter> nextNodeAdapters = getAdapter().getNextNodes();

		assert nextNodeAdapters.size() > 0;

		if (nextNodeAdapters.size() == 1)
		{
			/*
			 * Join node
			 */
			caseJoin(nextNodeAdapters.iterator().next());

			return false;
		}
		else
		{
			caseFork(nextNodeAdapters);

			return true;
		}
	}

	@Override
	protected boolean caseStateWorking() throws Exception
	{
		if (runningTraversalTasks.decrementAndGet() == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		/*
		 * Merge variables managers into this variables manager
		 */
		List<VariablesManager> variablesManagers = new ArrayList<VariablesManager>();
		for (ActivityTraversalTask task : traversalTasks)
		{
			variablesManagers.add(task.getVariablesManager());
		}

		getVariablesManager().merge(variablesManagers);
	}

	@Override
	protected void caseStateCancelled() throws Exception
	{
		for (ActivityTraversalTask task : traversalTasks)
		{
			task.cancel();
		}
	}

	protected void caseJoin(ActivityNodeAdapter nextNodeAdapter)
	{
		setNextNodeAdapter(nextNodeAdapter);

		runningTraversalTasks = new AtomicInteger(1);
	}

	protected void caseFork(Collection<ActivityNodeAdapter> nextNodeAdapters) throws SDMInterpreterException
	{
		/*
		 * Create a new activity traversal task for each subsequent node
		 */
		for (ActivityNodeAdapter nextNodeAdapter : nextNodeAdapters)
		{
			traversalTasks.add(getTaskFactory().createActivityTraversalTask(this, getVariablesManager().createCopy(), nextNodeAdapter,
					getAdapter().getCorrespondingNodeAdapter()));
		}

		/*
		 * The number of concurrent tasks + this object must be count.
		 */
		runningTraversalTasks = new AtomicInteger(traversalTasks.size());

		setNextNodeAdapter(getAdapter().getCorrespondingNodeAdapter());

		/*
		 * Start tasks
		 */
		for (ActivityTraversalTask task : traversalTasks)
		{
			getVariablesManager().submitTask(task);
		}
	}

	protected List<ActivityTraversalTask> getTraversalTasks()
	{
		return traversalTasks;
	}
}
