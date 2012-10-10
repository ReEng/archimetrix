package de.mdelab.sdm.interpreter.common.tasks.activity;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.ISemaphoreAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class ActivityTraversalTask extends ActivityTask<IActivityNodeAdapter, Object>
{
	private IActivityNodeAdapter								lastNodeAdapter;
	private ActivityNodeTask<? extends IActivityNodeAdapter>	currentTask;
	private boolean												semaphoresReleased;

	public ActivityTraversalTask(Task<?> parentTask, VariableScope variableScope, IActivityNodeAdapter firstNodeAdapter,
			IActivityNodeAdapter lastNodeAdapter)
	{
		super(parentTask, variableScope, firstNodeAdapter);

		assert parentTask != null;

		this.lastNodeAdapter = lastNodeAdapter;

		semaphoresReleased = false;
	}

	@Override
	public Object getReturnValue()
	{
		return null;
	}

	@Override
	protected boolean caseStateInitializing() throws Exception
	{
		// Do nothing

		return false;
	}

	@Override
	protected boolean caseStateWorking() throws Exception
	{
		IActivityNodeAdapter nextNodeAdapter;

		if (currentTask == null)
		{
			nextNodeAdapter = getAdapter();
		}
		else
		{
			nextNodeAdapter = currentTask.getReturnValue();
		}

		if (nextNodeAdapter != null)
		{
			/*
			 * Release all semaphores before executing the activity node
			 */
			if (!semaphoresReleased)
			{
				releaseSemaphores(nextNodeAdapter.getSemaphoreReleases());
				semaphoresReleased = true;
			}

			/*
			 * Acquire all semaphores before executing the activity node
			 */
			if (!acquireSemaphores(nextNodeAdapter.getSemaphoreAcquires()))
			{
				return true;
			}

			semaphoresReleased = false;

			if (nextNodeAdapter != lastNodeAdapter)
			{
				/*
				 * Start a task for the next node
				 */
				currentTask = getVariableScope().getInterpreterManager().getMainInterpreterFactory().getActivityTaskFactory()
						.createActivityNodeTask(this, getVariableScope(), nextNodeAdapter);

				startTask(currentTask);

				return true;
			}

		}

		/*
		 * The traversal task reaches the last node adapter or could not found a
		 * next node adapter.
		 */
		currentTask = null;
		return false;
	}

	protected boolean acquireSemaphores(Map<ISemaphoreAdapter, Integer> semaphores)
	{
		Map<ISemaphoreAdapter, Integer> acquiredSemaphores = new HashMap<ISemaphoreAdapter, Integer>();

		for (Entry<ISemaphoreAdapter, Integer> entry : semaphores.entrySet())
		{
			SDMSemaphore sdmSemaphore = getVariableScope().getInterpreterManager().getMainInterpreterFactory().getActivityTaskFactory()
					.getSemaphore(entry.getKey(), getVariableScope().getInterpreterManager());

			if (sdmSemaphore.acquire(entry.getValue(), this))
			{
				acquiredSemaphores.put(entry.getKey(), entry.getValue());
			}
			else
			{
				releaseSemaphores(acquiredSemaphores);
				return false;
			}
		}

		return true;
	}

	protected void releaseSemaphores(Map<ISemaphoreAdapter, Integer> semaphores)
	{
		for (Entry<ISemaphoreAdapter, Integer> entry : semaphores.entrySet())
		{
			SDMSemaphore sdmSemaphore = getVariableScope().getInterpreterManager().getMainInterpreterFactory().getActivityTaskFactory()
					.getSemaphore(entry.getKey(), getVariableScope().getInterpreterManager());

			sdmSemaphore.release(entry.getValue());
		}
	}

	@Override
	protected void caseStateFinishing() throws Exception
	{
		// Do nothing
	}

	@Override
	protected void caseStateCancelled() throws Exception
	{
		if (currentTask != null)
		{
			currentTask.cancel();
		}
	}

}
