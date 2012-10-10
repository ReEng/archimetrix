package de.mdelab.sdm.interpreter.common.tasks.activity;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

import de.mdelab.sdm.interpreter.common.InterpreterManager;
import de.mdelab.sdm.interpreter.common.tasks.Task;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class SDMSemaphore
{
	private Semaphore			semaphore;

	private InterpreterManager	interpreterManager;

	private List<Task<?>>		waitingTasks;

	private ReentrantLock		lock;

	public SDMSemaphore(InterpreterManager interpreterManager, int tokenCount)
	{
		assert interpreterManager != null;
		assert tokenCount > 0;

		this.interpreterManager = interpreterManager;

		semaphore = new Semaphore(tokenCount);

		waitingTasks = new Vector<Task<?>>();

		lock = new ReentrantLock();
	}

	public boolean acquire(int token, Task<?> callingTask)
	{
		try
		{
			lock.lock();
			if (semaphore.tryAcquire(token))
			{
				return true;
			}
			else
			{
				waitingTasks.add(callingTask);
				return false;
			}
		}
		finally
		{
			lock.unlock();
		}
	}

	public void release(int token)
	{
		try
		{
			lock.lock();

			semaphore.release(token);

			for (Task<?> task : waitingTasks)
			{
				interpreterManager.submitTask(task);
			}
			
			waitingTasks.clear();
		}
		finally
		{
			lock.unlock();
		}
	}
}
