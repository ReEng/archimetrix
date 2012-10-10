package de.mdelab.sdm.interpreter.common.activity.tasks.notifying;

import java.io.OutputStream;
import java.io.PrintStream;

import de.mdelab.sdm.interpreter.common.SDMVariable;
import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityFinalNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.ActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.ForkJoinNodeAdapter;
import de.mdelab.sdm.interpreter.common.activity.adapters.StoryActivityAdapter;
import de.mdelab.sdm.interpreter.common.expressions.adapters.ExpressionAdapter;
import de.mdelab.sdm.interpreter.common.m3.adapters.ClassifierAdapter;

public class OutputStreamNotificationReceiver implements NotificationReceiver
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
	public synchronized void beforeActivityExecution(StoryActivityAdapter activityAdapter)
	{
		printStream.println("Executing activity '" + activityAdapter.getName() + "'...");
	}

	@Override
	public synchronized void afterActivityExecution(StoryActivityAdapter activityAdapter, SDMVariable returnValue)
	{
		if (returnValue != null)
		{
			printStream.println("Activity '" + activityAdapter.getName() + "' was executed with return value '" + returnValue.getValue()
					+ "'.");
		}
		else
		{
			printStream.println("Activity '" + activityAdapter.getName() + "' was executed without return value.");

		}
		printStream.println();
	}

	@Override
	public synchronized void beforeActivityNodeExecution(ActivityNodeAdapter activityNodeAdapter)
	{
		printStream.println("Executing activity node '" + activityNodeAdapter.getName() + "' (" + activityNodeAdapter.getNodeType()
				+ ")...");
	}

	@Override
	public synchronized void afterActivityNodeExecution(ActivityNodeAdapter activityNodeAdapter)
	{
		printStream.println("Activity node '" + activityNodeAdapter.getName() + "' (" + activityNodeAdapter.getNodeType()
				+ ") was executed.");
	}

	@Override
	public synchronized void beforeActivityFinalNodeExecution(ActivityFinalNodeAdapter activityFinalNodeAdapter)
	{
		printStream.println("Executing activity final node '" + activityFinalNodeAdapter.getName() + "'...");
	}

	@Override
	public synchronized void afterActivityFinalNodeExecution(ActivityFinalNodeAdapter activityFinalNodeAdapter, SDMVariable returnValue)
	{
		if (returnValue == null)
		{
			printStream.println("Activity final node '" + activityFinalNodeAdapter.getName() + "' was executed without return value.");
		}
		else
		{
			printStream.println("Activity final node '" + activityFinalNodeAdapter.getName() + "' was with return value '"
					+ returnValue.getValue() + "'.");
		}

	}

	@Override
	public synchronized void variableCreated(SDMVariable sdmVariable)
	{
		printStream.println("Variable created: " + sdmVariable.getName() + " : " + sdmVariable.getClassifierAdapter().getName() + " = "
				+ sdmVariable.getValue());
	}

	@Override
	public synchronized void variableDeleted(SDMVariable sdmVariable)
	{
		printStream.println("Variable deleted: " + sdmVariable.getName() + " : " + sdmVariable.getClassifierAdapter().getName() + " = "
				+ sdmVariable.getValue());

	}

	@Override
	public synchronized void beforeExpressionEvaluation(ExpressionAdapter expressionAdapter,
			ClassifierAdapter contextClassifierAdapter, Object contextInstance)
	{
		printStream.println("Evaluating expression '" + expressionAdapter.getExpression() + "'...");
	}

	@Override
	public synchronized void afterExpressionEvaluation(ExpressionAdapter expressionAdapter,
			ClassifierAdapter contextClassifierAdapter, Object contextInstance, SDMVariable result)
	{
		printStream.println("Evaluated expression '" + expressionAdapter.getExpression() + "' = '" + result.getValue() + "'.");
	}

	@Override
	public synchronized void beforeForkJoinNodeExecution(ForkJoinNodeAdapter forkJoinNodeAdapter)
	{
		printStream.println("Executing fork/join node '" + forkJoinNodeAdapter.getName() + "'...");

	}

	@Override
	public synchronized void afterForkJoinNodeExecution(ForkJoinNodeAdapter forkJoinNodeAdapter)
	{
		printStream.println("Fork/join node '" + forkJoinNodeAdapter.getName() + "' executed.");
	}

	@Override
	public synchronized void beforeFork(ForkJoinNodeAdapter forkJoinNodeAdapter, int forkedThreads)
	{
		printStream.println("Forking " + forkedThreads + " threads.");
	}

	@Override
	public synchronized void afterJoin(ForkJoinNodeAdapter forkJoinNodeAdapter, int joinedThreads)
	{
		printStream.println("Joined " + joinedThreads + " threads.");
	}

}
