package de.mdelab.sdm.interpreter.common.tasks.activity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IForkJoinNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class ForkJoinNodeTask extends ActivityNodeTask<IForkJoinNodeAdapter>
{

	private List<ActivityTraversalTask>	traversalTasks;

	private AtomicInteger				runningTraversalTasks;

	public ForkJoinNodeTask(Task<?> parentTask, VariableScope variableScope, IForkJoinNodeAdapter adapter)
	{
		super(parentTask, variableScope, adapter);
	}

	@Override
	protected boolean caseStateInitializing() throws Exception
	{
		Collection<IActivityNodeAdapter> nextNodeAdapters = getAdapter().getNextNodeAdapters();

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
		if (traversalTasks != null)
		{
			/*
			 * Merge variables managers into this variables manager
			 */
			List<VariableScope> variableScopes = new ArrayList<VariableScope>();
			for (ActivityTraversalTask task : traversalTasks)
			{
				variableScopes.add(task.getVariableScope());
			}

			getVariableScope().merge(variableScopes);
			
			joinedTasks(traversalTasks);
		}
	}

	@Override
	protected void caseStateCancelled() throws Exception
	{
		for (ActivityTraversalTask task : traversalTasks)
		{
			task.cancel();
		}
	}

	protected void caseJoin(IActivityNodeAdapter nextNodeAdapter)
	{
		setNextNodeAdapter(nextNodeAdapter);

		runningTraversalTasks = new AtomicInteger(1);
	}

	protected void caseFork(Collection<IActivityNodeAdapter> nextNodeAdapters) throws SDMInterpreterException
	{
		traversalTasks = new ArrayList<ActivityTraversalTask>();

		/*
		 * Create a new activity traversal task for each subsequent node
		 */
		for (IActivityNodeAdapter nextNodeAdapter : nextNodeAdapters)
		{
			traversalTasks.add(getVariableScope()
					.getInterpreterManager()
					.getMainInterpreterFactory()
					.getActivityTaskFactory()
					.createActivityTraversalTask(this, getVariableScope().createCopy(), nextNodeAdapter,
							getAdapter().getCorrespondingJoinNodeAdapter()));
		}

		/*
		 * The number of concurrent tasks + this object must be count.
		 */
		runningTraversalTasks = new AtomicInteger(traversalTasks.size());

		setNextNodeAdapter(getAdapter().getCorrespondingJoinNodeAdapter());

		/*
		 * Start tasks
		 */
		for (ActivityTraversalTask task : traversalTasks)
		{
			startTask(task);
		}
	}

	protected void joinedTasks(List<ActivityTraversalTask> traversalTasks)
	{
		// Do nothing
	}
}
