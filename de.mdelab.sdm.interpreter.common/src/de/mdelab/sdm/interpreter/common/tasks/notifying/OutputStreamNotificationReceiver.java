package de.mdelab.sdm.interpreter.common.tasks.notifying;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Map.Entry;

import de.mdelab.sdm.interpreter.common.adapters.IAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityFinalNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IForEachFreshMatchStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IForkJoinNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.ISingleMatchStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IStoryActivityAdapter;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkEndAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternObjectAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.TaskStateEnum;
import de.mdelab.sdm.interpreter.common.variables.Variable;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class OutputStreamNotificationReceiver implements INotificationReceiver
{
	private PrintStream	printStream;

	public OutputStreamNotificationReceiver()
	{
		this(System.out);
	}

	public OutputStreamNotificationReceiver(OutputStream outputStream)
	{
		assert outputStream != null;

		setOutputStream(outputStream);
	}

	public void setOutputStream(OutputStream outputStream)
	{
		this.printStream = new PrintStream(outputStream);
	}

	@Override
	public synchronized void beforeActivityExecution(IStoryActivityAdapter activityAdapter)
	{
		printStream.println("Executing activity '" + activityAdapter.getName() + "'...");
	}

	@Override
	public synchronized void afterActivityExecution(IStoryActivityAdapter activityAdapter, Variable returnValue)
	{
		if (returnValue != null)
		{
			printStream.println("Activity '" + activityAdapter.getName() + "' was executed with return value '"
					+ returnValue.getValueAdapter().getValue() + "'.");
		}
		else
		{
			printStream.println("Activity '" + activityAdapter.getName() + "' was executed without return value.");

		}
		printStream.println();
	}

	@Override
	public synchronized void beforeActivityNodeExecution(IActivityNodeAdapter activityNodeAdapter)
	{
		printStream.println("Executing activity node '" + activityNodeAdapter.getName() + "' (" + activityNodeAdapter.getNodeType()
				+ ")...");
	}

	@Override
	public synchronized void afterActivityNodeExecution(IActivityNodeAdapter activityNodeAdapter)
	{
		printStream.println("Activity node '" + activityNodeAdapter.getName() + "' (" + activityNodeAdapter.getNodeType()
				+ ") was executed.");
	}

	@Override
	public synchronized void beforeActivityFinalNodeExecution(IActivityFinalNodeAdapter activityFinalNodeAdapter)
	{
		printStream.println("Executing activity final node '" + activityFinalNodeAdapter.getName() + "'...");
	}

	@Override
	public synchronized void afterActivityFinalNodeExecution(IActivityFinalNodeAdapter activityFinalNodeAdapter, Variable returnValue)
	{
		if (returnValue == null)
		{
			printStream.println("Activity final node '" + activityFinalNodeAdapter.getName() + "' was executed without return value.");
		}
		else
		{
			printStream.println("Activity final node '" + activityFinalNodeAdapter.getName() + "' was with return value '"
					+ returnValue.getValueAdapter().getValue() + "'.");
		}

	}

	//
	// @Override
	// public synchronized void variableCreated(SDMVariable sdmVariable)
	// {
	// printStream.println("Variable created: " + sdmVariable.getName() + " : "
	// + sdmVariable.getClassifierAdapter().getName() + " = "
	// + sdmVariable.getValue());
	// }
	//
	// @Override
	// public synchronized void variableDeleted(SDMVariable sdmVariable)
	// {
	// printStream.println("Variable deleted: " + sdmVariable.getName() + " : "
	// + sdmVariable.getClassifierAdapter().getName() + " = "
	// + sdmVariable.getValue());
	//
	// }
	//
	@Override
	public synchronized void beforeExpressionEvaluation(IExpressionAdapter expressionAdapter, IClassifierAdapter contextClassifierAdapter,
			Object contextInstance)
	{
		printStream.println("Evaluating expression '" + expressionAdapter.getExpression() + "'...");
	}

	@Override
	public synchronized void afterExpressionEvaluation(IExpressionAdapter expressionAdapter, IClassifierAdapter contextClassifierAdapter,
			Object contextInstance, Variable result)
	{
	   Object value = result == null ? null : result.getValueAdapter().getValue();
		printStream.println("Evaluated expression '" + expressionAdapter.getExpression() + "' = '" + value 
				+ "'.");
	}

	@Override
	public synchronized void beforeForkJoinNodeExecution(IForkJoinNodeAdapter forkJoinNodeAdapter)
	{
		printStream.println("Executing fork/join node '" + forkJoinNodeAdapter.getName() + "'...");

	}

	@Override
	public synchronized void afterForkJoinNodeExecution(IForkJoinNodeAdapter forkJoinNodeAdapter)
	{
		printStream.println("Fork/join node '" + forkJoinNodeAdapter.getName() + "' executed.");
	}

	@Override
	public synchronized void beforeFork(IForkJoinNodeAdapter forkJoinNodeAdapter, int forkedThreads)
	{
		printStream.println("Forking " + forkedThreads + " threads.");
	}

	@Override
	public synchronized void afterJoin(IForkJoinNodeAdapter forkJoinNodeAdapter, int joinedThreads)
	{
		printStream.println("Joined " + joinedThreads + " threads.");
	}

	@Override
	public void executionCancelled(IAdapter adapter, Throwable exception)
	{
		exception.printStackTrace(printStream);
		printStream.println("Execution was cancelled.");
	}

	@Override
	public void afterTaskStateSwitch(Task<?> task, TaskStateEnum previousState, TaskStateEnum currentState)
	{
		printStream
				.println("* Task '" + task.getClass().getSimpleName() + "' switched from " + previousState + " to " + currentState + ".");
	}

	@Override
	public void startingTask(Task<?> caller, Task<?> callee)
	{
		printStream.println("# Task '" + caller.getClass().getSimpleName() + "' starts '" + callee.getClass().getSimpleName() + "'.");
	}

	@Override
	public void beforeSingleMatchStoryNodeExecution(ISingleMatchStoryNodeAdapter singleMatchStoryNodeAdapter)
	{
		printStream.println("Executing single-match story node '" + singleMatchStoryNodeAdapter.getName() + "'.");
	}

	@Override
	public void afterSingleMatchStoryNodeExecution(ISingleMatchStoryNodeAdapter singleMatchStoryNodeAdapter, boolean successful)
	{
		printStream.print("Single-match story node '" + singleMatchStoryNodeAdapter.getName() + "' execution ");

		if (successful)
		{
			printStream.println("was successful.");
		}
		else
		{
			printStream.println("failed.");
		}
	}

	@Override
	public void beforeForEachFreshMatchStoryNodeExecution(IForEachFreshMatchStoryNodeAdapter forEachFreshMatchStoryNodeAdapter)
	{
		printStream.println("Executing for-each fresh-match story node '" + forEachFreshMatchStoryNodeAdapter.getName() + "'.");

	}

	@Override
	public void afterForEachFreshMatchStoryNodeExecution(IForEachFreshMatchStoryNodeAdapter forEachFreshMatchStoryNodeAdapter,
			boolean successful)
	{
		printStream.print("For-each fresh-match story node '" + forEachFreshMatchStoryNodeAdapter.getName() + "' execution ");

		if (successful)
		{
			printStream.println("was successful.");
		}
		else
		{
			printStream.println("failed.");
		}
	}

	@Override
	public void instanceObjectCreated(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter)
	{
		printStream.println("Instance object created for story pattern object '" + storyPatternObjectAdapter.getName() + "': "
				+ instanceAdapter.getValue());
	}

	@Override
	public void attributeValueAssignment(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter,
			IPropertyAdapter propertyAdapter, IInstanceAdapter newValueAdapter)
	{
		printStream.println("Attribute value assigned: " + storyPatternObjectAdapter.getName() + "." + propertyAdapter.getName() + " := "
				+ newValueAdapter.getValue() + " (bound to '" + instanceAdapter.getValue() + "')");
	}

	@Override
	public void storyPatternObjectBound(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter)
	{
		printStream.println("Story pattern object bound: " + storyPatternObjectAdapter.getName() + " -> " + instanceAdapter.getValue());
	}

	@Override
	public void beforeInstanceObjectDeleted(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter)
	{
		printStream.println("Deleting instance object: " + storyPatternObjectAdapter.getName() + " (bound to " + instanceAdapter.getValue()
				+ ")");
	}

	@Override
	public void afterInstanceObjectDeleted(IStoryPatternObjectAdapter storyPatternObjectAdapter, IInstanceAdapter instanceAdapter)
	{
		printStream.println("Deleted instance object: " + storyPatternObjectAdapter.getName() + " (bound to " + instanceAdapter.getValue()
				+ ")");
	}

	@Override
	public void instanceLinkCreated(IStoryPatternLinkAdapter storyPatternLinkAdapter,
			Map<IStoryPatternLinkEndAdapter, IInstanceAdapter> linkEndBindings)
	{
		printStream.println("Created instance link:");

		for (Entry<IStoryPatternLinkEndAdapter, IInstanceAdapter> entry : linkEndBindings.entrySet())
		{
		   if(entry.getKey().getStoryPatternObjectAdapter()!=null){
	         printStream.println("\t" + entry.getKey().getStoryPatternObjectAdapter().getName() + "."
	               + entry.getKey().getPropertyAdapter().getName() + " (bound to " + entry.getValue().getValue() + ")");
		   }
		}
	}

	@Override
	public void beforeInstanceLinkDelete(IStoryPatternLinkAdapter storyPatternLinkAdapter,
			Map<IStoryPatternLinkEndAdapter, IInstanceAdapter> linkEndBindings)
	{
		printStream.println("Deleting instance link:");

		for (Entry<IStoryPatternLinkEndAdapter, IInstanceAdapter> entry : linkEndBindings.entrySet())
		{
			printStream.println("\t" + entry.getKey().getStoryPatternObjectAdapter().getName() + "."
					+ entry.getKey().getPropertyAdapter().getName() + " (bound to " + entry.getValue().getValue() + ")");
		}
	}

	@Override
	public void afterInstanceLinkDelete(IStoryPatternLinkAdapter storyPatternLinkAdapter,
			Map<IStoryPatternLinkEndAdapter, IInstanceAdapter> linkEndBindings)
	{
		printStream.println("Deleted instance link:");

		for (Entry<IStoryPatternLinkEndAdapter, IInstanceAdapter> entry : linkEndBindings.entrySet())
		{
			printStream.println("\t" + entry.getKey().getStoryPatternObjectAdapter().getName() + "."
					+ entry.getKey().getPropertyAdapter().getName() + " (bound to " + entry.getValue().getValue() + ")");
		}
	}

	@Override
	public void checkStoryPatternObjectConstraintSuccessful(IStoryPatternObjectAdapter storyPatternObjectAdapter,
			IInstanceAdapter instanceAdapter, IExpressionAdapter expressionAdapter)
	{
		printStream.println("Constraint '" + expressionAdapter.getExpression() + "' holds on story pattern object '"
				+ storyPatternObjectAdapter.getName() + "' (bound to " + instanceAdapter.getValue() + ")");
	}

	@Override
	public void checkStoryPatternObjectConstraintFailed(IStoryPatternObjectAdapter storyPatternObjectAdapter,
			IInstanceAdapter instanceAdapter, IExpressionAdapter expressionAdapter)
	{
		printStream.println("Constraint '" + expressionAdapter.getExpression() + "' does not hold on story pattern object '"
				+ storyPatternObjectAdapter.getName() + "' (bound to " + instanceAdapter.getValue() + ")");
	}

	@Override
	public void checkStoryPatternConstraintSuccessful(IStoryPatternAdapter storyPatternAdapter, IExpressionAdapter expressionAdapter)
	{
		printStream.println("Constraint '" + expressionAdapter.getExpression() + "' holds on story pattern '" + storyPatternAdapter.getName() + "'");
	}

	@Override
	public void checkStoryPatternConstraintFailed(IStoryPatternAdapter storyPatternAdapter, IExpressionAdapter expressionAdapter)
	{
		printStream.println("Constraint '" + expressionAdapter.getExpression() + "' does not hold on story pattern '" + storyPatternAdapter.getName() + "'");
	}

	// @Override
	// public void storyPatternLinkCheckSuccessful(IStoryPatternLinkAdapter
	// storyPatternLinkAdapter, VariableScope variableScope)
	// {
	// printStream.println("Story pattern link check successful - link ends: ");
	//
	// for (IStoryPatternLinkEndAdapter linkEndAdapter :
	// storyPatternLinkAdapter.getLinkEndAdapters())
	// {
	// printStream.println("--- " +
	// linkEndAdapter.getStoryPatternObjectAdapter().getName() + " --> "
	// + linkEndAdapter.getPropertyAdapter().getName() + " (bound to "
	// +
	// variableScope.getVariable(linkEndAdapter.getStoryPatternObjectAdapter().getName()).getValueAdapter().getValue()
	// + ")");
	// }
	// }

}
