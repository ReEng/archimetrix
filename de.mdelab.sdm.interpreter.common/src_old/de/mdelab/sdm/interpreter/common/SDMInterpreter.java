package de.mdelab.sdm.interpreter.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Executors;

import de.mdelab.sdm.interpreter.common.activity.adapters.StoryActivityAdapter;
import de.mdelab.sdm.interpreter.common.activity.tasks.StoryActivityTask;
import de.mdelab.sdm.interpreter.common.activity.tasks.ActivityTaskFactory;
import de.mdelab.sdm.interpreter.common.storyPattern.StoryPatternMatcherFactory;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

/**
 * 
 * The main class of the SDM interpreter. It can execute story diagrams of
 * arbitrary metamodels using an appropriate adapter factory that must be
 * provided by the caller. These adapters provide access to the actual story
 * diagram model. Most functionality is encapsulated in task, e.g. executing
 * specific activity node types. Tasks are created by a task factory. The tasks
 * and the task factory can be subclassed to extend the task's functionality,
 * e.g., emitting notifications.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * 
 */
public abstract class SDMInterpreter
{
	private VariablesManager				rootVariablesManager;

	private int								threadPoolSize	= SDMInterpreterConstants.THREAD_POOL_SIZE;

	private List<Throwable>					exceptions;

	private SDMInterpreterAdapterFactory	interpreterAdapterFactory;

	private StoryPatternMatcherFactory				matcherFactory;

	private ActivityTaskFactory				taskFactory;

	private ClassLoader						classLoader;

	/**
	 * Create new SDM interpreter.
	 * 
	 * @param interpreterAdapterFactory
	 *            This adapter factory creates the adapters to access the actual
	 *            story diagram model.
	 * @param taskFactory
	 *            This task factory is used to create tasks.
	 * @param classLoader
	 *            This class loader is used to invoke Java methods via
	 *            reflection.
	 */
	public SDMInterpreter(SDMInterpreterAdapterFactory interpreterAdapterFactory, StoryPatternMatcherFactory matcherFactory,
			ActivityTaskFactory taskFactory, ClassLoader classLoader)
	{
		exceptions = new ArrayList<Throwable>();

		assert interpreterAdapterFactory != null;
		assert matcherFactory != null;
		assert taskFactory != null;
		assert classLoader != null;

		this.interpreterAdapterFactory = interpreterAdapterFactory;
		this.matcherFactory = matcherFactory;
		this.taskFactory = taskFactory;
		this.classLoader = classLoader;
	}

	/**
	 * Create a new SDM interpreter with a default task factory.
	 * 
	 * @param interpreterAdapterFactory
	 *            This adapter factory creates the adapters to access the actual
	 *            story diagram model.
	 * @param classLoader
	 *            This class loader is used to invoke Java methods via
	 *            reflection.
	 */
	public SDMInterpreter(SDMInterpreterAdapterFactory interpreterAdapterFactory, StoryPatternMatcherFactory matcherFactory, ClassLoader classLoader)
	{
		this(interpreterAdapterFactory, matcherFactory, new ActivityTaskFactory(), classLoader);
	}

	/**
	 * 
	 * @return The adapter of the top level variables manager. It contains all
	 *         global variables.
	 */
	public VariablesManager getRootVariablesManager()
	{
		return rootVariablesManager;
	}

	/**
	 * 
	 * @return The size of the interpreter's thread pool. This is the maximum
	 *         number of concurrently executed threads.
	 */
	public int getThreadPoolSize()
	{
		return threadPoolSize;
	}

	/**
	 * 
	 * @param threadPoolSize
	 *            The size of the interpreter's thread pool. This is the maximum
	 *            number of concurrently executed threads.
	 */
	public void setThreadPoolSize(int threadPoolSize)
	{
		this.threadPoolSize = threadPoolSize;
	}

	/**
	 * 
	 * @return The adapter factory that creates the adapters to access the story
	 *         diagram model.
	 */
	public SDMInterpreterAdapterFactory getInterpreterAdapterFactory()
	{
		return interpreterAdapterFactory;
	}

	public StoryPatternMatcherFactory getMatcherFactory()
	{
		return matcherFactory;
	}

	/**
	 * 
	 * @return The task factory that creates the tasks to execute specific
	 *         functionality.
	 */
	public ActivityTaskFactory getTaskFactory()
	{
		return taskFactory;
	}

	/**
	 * Creates a new expression interpreter for the specified expression
	 * language. This functionality is to be implemented in subclasses of
	 * SDMInterpreter. If the interpreter runs within Eclipse, discovering
	 * expression interpreters can be done using Eclipse's extension point
	 * mechanism. Outside of Eclipse some other mechanism must be used.
	 * 
	 * @param expressionLanguage
	 *            The name of expression language.
	 * @param variablesManager
	 *            The variables manager to which the new expression interpreter
	 *            will be attached.
	 * @return A new expression interpreter for the specified expression
	 *         language or null if no expression interpreter could be found.
	 */
	public abstract ExpressionInterpreter createExpressionInterpreter(String expressionLanguage, VariablesManager variablesManager);

	/**
	 * Executes a story activity.
	 * 
	 * @param activity
	 *            The activity to execute. It can be an instance of an arbitrary
	 *            metamodel. The adapterFactory of the interpreter must be able
	 *            to create an apropriate adapter for it.
	 * @param activityParameters
	 *            A list of parameters.
	 * @return A map of all variables of the interpreter.
	 * @throws SDMInterpreterException
	 *             If some error occurs during the execution of the story
	 *             diagrams. The inner exception may give more clues about the
	 *             nature of the error.
	 */
	public Map<String, SDMVariable> executeActivity(Object activity, List<SDMVariable> activityParameters) throws SDMInterpreterException
	{
		if (activity == null)
		{
			throw new SDMInterpreterException("activity is null");
		}
		else if (classLoader == null)
		{
			throw new SDMInterpreterException("classLoader is null");
		}
		else if (interpreterAdapterFactory == null)
		{
			throw new SDMInterpreterException("adapterFactory is null");
		}

		/*
		 * Create a new interpreter variables manager
		 */
		rootVariablesManager = taskFactory.createVariablesManager(this, classLoader, Executors.newFixedThreadPool(threadPoolSize));

		/*
		 * Create variables for parameters
		 */
		if (activityParameters != null)
		{
			for (SDMVariable sdmVariable : activityParameters)
			{
				if (sdmVariable.getName() == null || "".equals(sdmVariable.getName()))
				{
					throw new SDMInterpreterException("The name of interpreter variable '" + sdmVariable.toString()
							+ "' must not be empty.");
				}
				else if (sdmVariable.getClassifierAdapter() == null)
				{
					throw new SDMInterpreterException("The classifierWrapper of interpreter variable '" + sdmVariable.getName()
							+ "' must not be null.");
				}

				rootVariablesManager.createVariable(sdmVariable.getName(), sdmVariable.getClassifierAdapter(), sdmVariable.getValue());
			}
		}

		/*
		 * Create exchanger
		 */
		Exchanger<Object> exchanger = new Exchanger<Object>();

		/*
		 * Create an activity adapter and task
		 */
		StoryActivityAdapter activityAdapter = interpreterAdapterFactory.getActivityAdapterFactory().getStoryActivityAdapter(activity);
		StoryActivityTask activityTask = taskFactory.createActivityTask(rootVariablesManager, activityAdapter, exchanger);

		/*
		 * Execute activity
		 */
		rootVariablesManager.submitTask(activityTask);

		try
		{
			/*
			 * Wait for the activity task to finish.
			 */
			exchanger.exchange(null);

			if (activityTask.isCancelled())
			{
				getExceptions().get(0).printStackTrace();
				throw new SDMInterpreterException("Error during story diagram execution.", getExceptions().get(0));
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
			throw new SDMInterpreterException("Error during story diagram execution.", e);
		}

		/*
		 * Return the variables manager's variables.
		 */
		return rootVariablesManager.getVariables();
	}

	/**
	 * 
	 * @return A list of all exceptions occurred during the execution of the
	 *         interpreter.
	 */
	public List<Throwable> getExceptions()
	{
		return exceptions;
	}

	/**
	 * Add an exception to the list of exceptions.
	 * 
	 * @param exception
	 *            An exception that occurred during the execution of the
	 *            interpreter.
	 */
	public void addException(Throwable exception)
	{
		exceptions.add(exception);
	}
}
