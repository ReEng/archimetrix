package de.mdelab.sdm.interpreter.common.storypatternmatcher;

import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class ForEachStoryPatternMatcher extends StoryPatternMatcher
{

	public ForEachStoryPatternMatcher(Task<?> parentTask, VariableScope variableScope, IStoryPatternAdapter storyPatternAdapter)
	{
		super(parentTask, variableScope, storyPatternAdapter);
	}

	@Override
	protected boolean caseStateWorking() throws Exception
	{
		super.caseStateWorking();

		if (getReturnValue() == null)
		{
			// no match found
			return false;
		}
		else
		{
			// wake up parent and wait for next search
			startTask(getParentTask());
			return true;
		}
	}
}
