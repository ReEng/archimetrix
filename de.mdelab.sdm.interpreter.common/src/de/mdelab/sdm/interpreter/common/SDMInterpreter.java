package de.mdelab.sdm.interpreter.common;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Exchanger;

import de.mdelab.sdm.interpreter.common.adapters.IMainAdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.activity.IStoryActivityAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IM3AdapterFactory;
import de.mdelab.sdm.interpreter.common.tasks.activity.StoryActivityTask;
import de.mdelab.sdm.interpreter.common.variables.Parameter;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */

public class SDMInterpreter
{
	private InterpreterManager	interpreterManager;

	public SDMInterpreter(MainInterpreterFactory mainInterpreterFactory, IMainAdapterFactory mainAdapterFactory, ClassLoader classLoader)
	{
		assert mainInterpreterFactory != null;
		assert mainAdapterFactory != null;
		assert classLoader != null;

		/*
		 * Create new interpreter manager
		 */
		interpreterManager = new InterpreterManager(mainAdapterFactory, mainInterpreterFactory, classLoader);
	}

	@SuppressWarnings("unchecked")
	public Map<String, Variable> executeActivity(Object activity) throws SDMInterpreterException
	{
		return executeActivity(activity, Collections.EMPTY_LIST);
	}

	public Map<String, Variable> executeActivity(Object activity, List<Parameter> parameters) throws SDMInterpreterException
	{
		return executeActivity(activity, parameters, SDMInterpreterConstants.NUMBER_OF_THREADS);
	}
	
	public Map<String, Variable> executeActivity(Object activity, List<Parameter> parameters, int threadPoolSize) throws SDMInterpreterException
	{
		/*
		 * Initialize interpreter manager
		 */
		interpreterManager.initialize(threadPoolSize);
		
		/*
		 * Create new variable scope
		 */
		VariableScope variableScope = new VariableScope(interpreterManager);

		/*
		 * Add parameters to variable scope
		 */
		IM3AdapterFactory m3AdapterFactory = interpreterManager.getMainAdapterFactory().getM3AdapterFactory();
		for (Parameter p : parameters)
		{
			IClassifierAdapter classifierAdapter = m3AdapterFactory.getClassifierAdapter(p.getClassifier());
			variableScope.createVariable(p.getName(), classifierAdapter,
					m3AdapterFactory.getInstanceAdapter(p.getValue(), classifierAdapter));
		}

		/*
		 * Create activity adapter
		 */
		IStoryActivityAdapter storyActivityAdapter = interpreterManager.getMainAdapterFactory().getActivityAdapterFactory()
				.getStoryActivityAdapter(activity);

		/*
		 * Create exchanger
		 */
		Exchanger<Object> exchanger = new Exchanger<Object>();

		/*
		 * Create story activity task
		 */
		StoryActivityTask storyActivityTask = this.interpreterManager.getMainInterpreterFactory().getActivityTaskFactory()
				.createStoryActivityTask(variableScope, storyActivityAdapter, exchanger);

		interpreterManager.submitTask(storyActivityTask);

		try
		{
			exchanger.exchange(null);
			
			interpreterManager.shutdown();
		}
		catch (InterruptedException e)
		{
			throw new SDMInterpreterException("Error during story diagram execution.", e);
		}

		if (!variableScope.getInterpreterManager().getExceptions().isEmpty())
		{
			for (Throwable t : variableScope.getInterpreterManager().getExceptions())
			{
				t.printStackTrace();
			}

			throw new SDMInterpreterException("Error during story diagram execution.", variableScope.getInterpreterManager()
					.getExceptions().get(0));
		}

		return variableScope.getVariables();
	}
}
