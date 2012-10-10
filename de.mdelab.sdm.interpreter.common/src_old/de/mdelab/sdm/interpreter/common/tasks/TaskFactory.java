package de.mdelab.sdm.interpreter.common.tasks;

import java.util.concurrent.ExecutorService;

import de.mdelab.sdm.interpreter.common.SDMInterpreter;

public abstract class TaskFactory
{
	/**
	 * Get an adapter for a variables manager.
	 * 
	 * @param variablesManager
	 *            The variables manager to adapt.
	 * @return The variables manager's adapter.
	 */
	public VariablesManager createVariablesManager(SDMInterpreter sdmInterpreter, ClassLoader classLoader, ExecutorService executorService)
	{
		return new VariablesManager(sdmInterpreter, this, classLoader, executorService);
	}

}
