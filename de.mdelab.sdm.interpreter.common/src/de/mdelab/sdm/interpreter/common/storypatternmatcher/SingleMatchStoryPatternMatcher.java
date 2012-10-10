package de.mdelab.sdm.interpreter.common.storypatternmatcher;

import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapter;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class SingleMatchStoryPatternMatcher extends StoryPatternMatcher
{

	public SingleMatchStoryPatternMatcher(Task<?> parentTask, VariableScope variableScope, IStoryPatternAdapter storyPatternAdapter)
	{
		super(parentTask, variableScope, storyPatternAdapter);
	}

	@Override
	protected boolean caseStateWorking() throws Exception
	{
		super.caseStateWorking();

		return false;
	}
}
