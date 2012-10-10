package de.mdelab.sdm.interpreter.common.storypatternmatcher;

import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapter;
import de.mdelab.sdm.interpreter.common.storypatternmatcher.strategies.MatchingStrategy;
import de.mdelab.sdm.interpreter.common.tasks.Task;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class StoryPatternMatcherFactory
{
	private MatchingStrategy	matchingStrategy;

	public StoryPatternMatcherFactory()
	{
		this.matchingStrategy = createMatchingStrategy();
	}

	public StoryPatternMatcher createSingleMatchStoryPatternMatcher(Task<?> parentTask, VariableScope variableScope,
			IStoryPatternAdapter storyPatternAdapter)
	{
		return new SingleMatchStoryPatternMatcher(parentTask, variableScope, storyPatternAdapter);
	}

	public StoryPatternMatcher createForEachStoryPatternMatcher(Task<?> parentTask, VariableScope variableScope,
			IStoryPatternAdapter storyPatternAdapter)
	{
		return new ForEachStoryPatternMatcher(parentTask, variableScope, storyPatternAdapter);
	}

	public MatchingStrategy getMatchingStrategy()
	{
		return matchingStrategy;
	}

	protected MatchingStrategy createMatchingStrategy()
	{
		return new MatchingStrategy();
	}

}
