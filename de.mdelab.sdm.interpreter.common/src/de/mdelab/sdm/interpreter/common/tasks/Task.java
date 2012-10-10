package de.mdelab.sdm.interpreter.common.tasks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public abstract class Task<RETURN_VALUE> implements Callable<RETURN_VALUE>
{
	private VariableScope	variableScope;

	private Task<?>			parentTask;

	private ReentrantLock	stateLock;

	private TaskStateEnum	taskState;

	public Task(Task<?> parentTask, VariableScope variableScope)
	{
		assert variableScope != null;

		this.parentTask = parentTask;

		this.variableScope = variableScope;

		stateLock = new ReentrantLock();
		taskState = TaskStateEnum.INITIALIZING;
	}

	public VariableScope getVariableScope()
	{
		return variableScope;
	}

	protected Task<?> getParentTask()
	{
		return parentTask;
	}

	public TaskStateEnum getTaskState()
	{
		return taskState;
	}

	@Override
	public final RETURN_VALUE call() throws Exception
	{
		try
		{
			stateLock.lock();

			boolean suspend = false;

			while (!suspend)
			{
				switch (getTaskState())
				{
					case INITIALIZING:
					{
						suspend = caseStateInitializing();

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
					case COMPLETED:
					{
						suspend = true;

						if (parentTask != null)
						{
							startTask(parentTask);
						}

						break;
					}
					case CANCELLED:
					{
						suspend = true;

						try
						{
							caseStateCancelled();
						}
						catch (Throwable ex)
						{
							variableScope.getInterpreterManager().addException(ex);
						}

						if (parentTask != null && parentTask.getTaskState() != TaskStateEnum.CANCELLED)
						{
							parentTask.cancel();
							// startTask(parentTask);
						}

						break;
					}
				}
			}
		}
		catch (Throwable ex)
		{
			/*
			 * We need to catch all exceptions because they would disappear
			 * otherwise.
			 */
			variableScope.getInterpreterManager().addException(ex);

			cancel();
		}
		finally
		{
			stateLock.unlock();
		}

		return null;
	}

	public boolean isDone()
	{
		return getTaskState() == TaskStateEnum.COMPLETED;
	}

	public boolean isCancelled()
	{
		return getTaskState() == TaskStateEnum.CANCELLED;
	}

	protected void switchToNextState()
	{
		switch (getTaskState())
		{
			case INITIALIZING:
			{
				taskState = TaskStateEnum.WORKING;
				break;
			}
			case WORKING:
			{
				taskState = TaskStateEnum.FINISHING;
				break;
			}
			case FINISHING:
			{
				taskState = TaskStateEnum.COMPLETED;
				break;
			}
			default:
			{
				throw new RuntimeException("Unexpected state: " + getTaskState());
			}
		}
	}

	public void cancel()
	{
		try
		{
			stateLock.lock();

			if (taskState != TaskStateEnum.CANCELLED)
			{
				taskState = TaskStateEnum.CANCELLED;

				startTask(this);
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

	public abstract RETURN_VALUE getReturnValue();

	/**
	 * @return True if the task should be suspended after switching to the
	 *         working state and before executing the working state's behavior.
	 * @throws Exception
	 */
	protected abstract boolean caseStateInitializing() throws Exception;

	/**
	 * @return True if the task should remain in the working state and suspend.
	 *         False if the task should switch immediately to the final state
	 *         without suspension.
	 * @throws Exception
	 */
	protected abstract boolean caseStateWorking() throws Exception;

	protected abstract void caseStateFinishing() throws Exception;

	protected abstract void caseStateCancelled() throws Exception;

	protected void startTask(Task<?> task)
	{
		variableScope.getInterpreterManager().submitTask(task);
	}
}
