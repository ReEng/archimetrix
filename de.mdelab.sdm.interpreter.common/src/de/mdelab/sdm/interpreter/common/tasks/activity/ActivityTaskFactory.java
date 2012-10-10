package de.mdelab.sdm.interpreter.common.tasks.activity;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Exchanger;

import de.mdelab.sdm.interpreter.common.InterpreterManager;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityCallNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityDecisionMergeNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityFinalNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IExpressionNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IForEachFreshMatchStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IForEachPreselectStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IForkJoinNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.ISemaphoreAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.ISimpleNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.ISingleMatchStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IStoryActivityAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.TaskFactory;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class ActivityTaskFactory extends TaskFactory
{
	private Map<ISemaphoreAdapter, SDMSemaphore> semaphores;
	
	public ActivityTaskFactory()
	{
		semaphores = new ConcurrentHashMap<ISemaphoreAdapter, SDMSemaphore>();
	}
	
	public StoryActivityTask createStoryActivityTask(VariableScope variableScope, IStoryActivityAdapter activityAdapter,
			Exchanger<Object> exchanger)
	{
		return new StoryActivityTask(null, variableScope, activityAdapter, exchanger);
	}

	public ActivityTraversalTask createActivityTraversalTask(Task<?> parentTask, VariableScope variableScope,
			IActivityNodeAdapter firstNodeAdapter, IActivityNodeAdapter lastNodeAdapter)
	{
		return new ActivityTraversalTask(parentTask, variableScope, firstNodeAdapter, lastNodeAdapter);
	}

	public ActivityNodeTask<? extends IActivityNodeAdapter> createActivityNodeTask(Task<?> parentTask, VariableScope variableScope,
			IActivityNodeAdapter adapter)
	{
		assert parentTask != null;
		assert variableScope != null;
		assert adapter != null;

		if (adapter instanceof IActivityFinalNodeAdapter)
		{
			return createActivityFinalNodeTask(parentTask, variableScope, (IActivityFinalNodeAdapter) adapter);
		}
		else if (adapter instanceof IActivityDecisionMergeNodeAdapter)
		{
			return createActivityDecisionMergeNodeTask(parentTask, variableScope, (IActivityDecisionMergeNodeAdapter) adapter);
		}
		else if (adapter instanceof IExpressionNodeAdapter)
		{
			return createExpressionNodeTask(parentTask, variableScope, (IExpressionNodeAdapter) adapter);
		}
		else if (adapter instanceof IForkJoinNodeAdapter)
		{
			return createForkJoinNodeTask(parentTask, variableScope, (IForkJoinNodeAdapter) adapter);
		}
		else if (adapter instanceof ISingleMatchStoryNodeAdapter)
		{
			return createSingleMatchStoryNodeTask(parentTask, variableScope, (ISingleMatchStoryNodeAdapter) adapter);
		}
		else if (adapter instanceof IForEachFreshMatchStoryNodeAdapter)
		{
			return createForEachFreshMatchStoryNodeTask(parentTask, variableScope, (IForEachFreshMatchStoryNodeAdapter) adapter);
		}
		else if (adapter instanceof IForEachPreselectStoryNodeAdapter)
		{
			return createForEachPreselectStoryNodeTask(parentTask, variableScope, (IForEachPreselectStoryNodeAdapter) adapter);
		}
      else if (adapter instanceof IActivityCallNodeAdapter)
      {
         return createActivityCallNodeTask(parentTask, variableScope, (IActivityCallNodeAdapter)adapter);
      }
		/*
		 * Put this case last
		 */
		else if (adapter instanceof ISimpleNodeAdapter)
		{
			return createSimpleActivityNodeTask(parentTask, variableScope, (ISimpleNodeAdapter) adapter);
		}
		else
		{
			throw new UnsupportedOperationException("This kind of adapter is not supported: " + adapter);
		}

	}

	private ActivityNodeTask<? extends IActivityNodeAdapter> createForEachPreselectStoryNodeTask(Task<?> parentTask,
			VariableScope variableScope, IForEachPreselectStoryNodeAdapter adapter)
	{
		return new ForEachPreselectStoryNodeTask(parentTask, variableScope, adapter);
	}

	protected ActivityNodeTask<? extends IActivityNodeAdapter> createForEachFreshMatchStoryNodeTask(Task<?> parentTask,
			VariableScope variableScope, IForEachFreshMatchStoryNodeAdapter adapter)
	{

		return new ForEachFreshMatchStoryNodeTask(parentTask, variableScope, adapter);
	}

	protected ActivityNodeTask<? extends IActivityNodeAdapter> createSingleMatchStoryNodeTask(Task<?> parentTask,
			VariableScope variableScope, ISingleMatchStoryNodeAdapter adapter)
	{
		return new SingleMatchStoryNodeTask(parentTask, variableScope, adapter);
	}

	protected ActivityNodeTask<? extends IActivityNodeAdapter> createForkJoinNodeTask(Task<?> parentTask, VariableScope variableScope,
			IForkJoinNodeAdapter adapter)
	{
		return new ForkJoinNodeTask(parentTask, variableScope, adapter);
	}

	protected ActivityNodeTask<? extends IActivityNodeAdapter> createExpressionNodeTask(Task<?> parentTask, VariableScope variableScope,
			IExpressionNodeAdapter adapter)
	{
		return new ExpressionNodeTask(parentTask, variableScope, adapter);
	}

	protected ActivityNodeTask<? extends IActivityNodeAdapter> createActivityDecisionMergeNodeTask(Task<?> parentTask,
			VariableScope variableScope, IActivityDecisionMergeNodeAdapter adapter)
	{
		return new DecisionMergeNodeTask(parentTask, variableScope, adapter);
	}

	protected SimpleActivityNodeTask createSimpleActivityNodeTask(Task<?> parentTask, VariableScope variableScope,
			ISimpleNodeAdapter adapter)
	{
		return new SimpleActivityNodeTask(parentTask, variableScope, adapter);
	}
	
	protected ActivityCallNodeTask createActivityCallNodeTask(Task<?> parentTask, VariableScope variableScope,
	      IActivityCallNodeAdapter adapter)
	{
	   return new ActivityCallNodeTask(parentTask, variableScope, adapter);
	}

	protected ActivityFinalNodeTask createActivityFinalNodeTask(Task<?> parentTask, VariableScope variableScope,
			IActivityFinalNodeAdapter adapter)
	{
		return new ActivityFinalNodeTask(parentTask, variableScope, adapter);
	}

	public SDMSemaphore getSemaphore(ISemaphoreAdapter semaphoreAdapter, InterpreterManager interpreterManager)
	{
		synchronized (semaphoreAdapter)
		{
			SDMSemaphore semaphore = semaphores.get(semaphoreAdapter);
			
			if (semaphore == null)
			{
				semaphore = new SDMSemaphore(interpreterManager, semaphoreAdapter.getMaxTokenCount());
				
				semaphores.put(semaphoreAdapter, semaphore);
			}
			
			return semaphore;
		}
	}
}
