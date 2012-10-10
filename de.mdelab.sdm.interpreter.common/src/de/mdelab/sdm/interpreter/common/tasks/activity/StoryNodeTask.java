package de.mdelab.sdm.interpreter.common.tasks.activity;

import de.mdelab.sdm.interpreter.common.adapters.activity.IStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public abstract class StoryNodeTask<ADAPTER extends IStoryNodeAdapter> extends ActivityNodeTask<ADAPTER>
{

	public StoryNodeTask(Task<?> parentTask, VariableScope variableScope, ADAPTER adapter)
	{
		super(parentTask, variableScope, adapter);
	}
}
