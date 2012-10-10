package de.mdelab.sdm.interpreter.common.storyPattern.tasks;

import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.tasks.VariablesManager;

public abstract class SPTask<ReturnValueType> extends Task<SPTaskFactory, ReturnValueType>
{
	protected SPTask(Task<?, ?> parentTask, SPTaskFactory taskFactory, VariablesManager variablesManager)
	{
		super(parentTask, taskFactory, variablesManager);
	}

}
