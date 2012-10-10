package de.mdelab.sdm.interpreter.common.tasks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public abstract class Task<TF, ReturnValueType> implements Callable<ReturnValueType>
{
	private Task<?, ?>			parentTask;
	private TF					taskFactory;
	private VariablesManager	variablesManager;
	private TaskStateEnum		currentTaskState;
	private ReentrantLock		stateLock;

	protected Task(Task<?, ?> parentTask, TF taskFactory, VariablesManager variablesManager)
	{
		assert taskFactory != null;
		assert variablesManager != null;

		this.parentTask = parentTask;
		this.taskFactory = taskFactory;
		this.variablesManager = variablesManager;

		currentTaskState = TaskStateEnum.READY;
		stateLock = new ReentrantLock();
	}

	protected TF getTaskFactory()
	{
		return taskFactory;
	}

	protected Task<?, ?> getParentTask()
	{
		return parentTask;
	}

	public VariablesManager getVariablesManager()
	{
		return variablesManager;
	}

	public abstract ReturnValueType getReturnValue();

	public TaskStateEnum getCurrentTaskState()
	{
		stateLock.lock();

		TaskStateEnum state = currentTaskState;

		stateLock.unlock();

		return state;
	}

	@Override
	public final ReturnValueType call() throws Exception
	{
		try
		{
			boolean suspend = false;

			while (!suspend)
			{
				switch (getCurrentTaskState())
				{
					case READY:
					{
						suspend = caseStateReady();

						switchToNextState();

						break;
					}
					case WORKING:
					{
						suspend = caseStateWorking();

						if (!suspend)
						{
							switchToNextState();
						}

						break;
					}
					case FINISHING:
					{
						caseStateFinishing();

						switchToNextState();

						break;
					}
					case COMPLETE:
					{
						suspend = true;

						if (parentTask != null)
						{
							getVariablesManager().submitTask(parentTask);
						}

						break;
					}
					case CANCELLED:
					{
						suspend = true;

						caseStateCancelled();

						if (parentTask != null)
						{
							parentTask.cancel();
							getVariablesManager().submitTask(parentTask);
						}

						break;
					}
				}
			}
		}
		catch (Throwable ex)
		{
			cancel();

			/*
			 * We need to catch all exceptions because they would disappear
			 * otherwise.
			 */
			getVariablesManager().addException(ex);

			if (parentTask != null)
			{
				parentTask.cancel();
				getVariablesManager().submitTask(parentTask);
			}
		}

		return null;
	}

	/**
	 * 
	 * @return True if the task should be suspended after switching to the
	 *         working state and before executing the working state's behavior.
	 * @throws Exception
	 */
	protected abstract boolean caseStateReady() throws Exception;

	/**
	 * 
	 * @return True if the task should remain in the working state and suspend.
	 *         False if the task should switch immediately to the final state
	 *         without suspension.
	 * @throws Exception
	 */
	protected abstract boolean caseStateWorking() throws Exception;

	protected abstract void caseStateFinishing() throws Exception;

	protected abstract void caseStateCancelled() throws Exception;

	public boolean isDone()
	{
		return getCurrentTaskState() == TaskStateEnum.COMPLETE;
	}

	public boolean isCancelled()
	{
		return getCurrentTaskState() == TaskStateEnum.CANCELLED;
	}

	protected void switchToNextState()
	{
		stateLock.lock();

		try
		{
			switch (getCurrentTaskState())
			{
				case READY:
				{
					currentTaskState = TaskStateEnum.WORKING;
					break;
				}
				case WORKING:
				{
					currentTaskState = TaskStateEnum.FINISHING;
					break;
				}
				case FINISHING:
				{
					currentTaskState = TaskStateEnum.COMPLETE;
					break;
				}
				default:
				{
					assert false;
				}
			}
		}
		catch (Throwable e)
		{
			e.printStackTrace();
			throw new RuntimeException("Error during task state switch.");
		}
		finally
		{
			stateLock.unlock();
		}
	}

	public void cancel()
	{
		try
		{
			stateLock.lock();

			if (currentTaskState != TaskStateEnum.CANCELLED)
			{
				currentTaskState = TaskStateEnum.CANCELLED;

				getVariablesManager().submitTask(this);
			}
		}
		catch (Throwable e)
		{
			e.printStackTrace();
			throw new RuntimeException("Error during task state switch.", e);
		}
		finally
		{
			stateLock.unlock();
		}
	}
}
