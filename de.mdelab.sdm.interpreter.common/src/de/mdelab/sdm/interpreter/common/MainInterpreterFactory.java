package de.mdelab.sdm.interpreter.common;

import de.mdelab.sdm.interpreter.common.expressions.ExpressionInterpreterFactory;
import de.mdelab.sdm.interpreter.common.storypatternmatcher.StoryPatternMatcherFactory;
import de.mdelab.sdm.interpreter.common.tasks.activity.ActivityTaskFactory;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */

public class MainInterpreterFactory
{
	private ExpressionInterpreterFactory	expressionInterpreterFactory;

	private ActivityTaskFactory				activityTaskFactory;

	private StoryPatternMatcherFactory		storyPatternMatcherFactory;

	public MainInterpreterFactory(ExpressionInterpreterFactory expressionInterpreterFactory)
	{
		assert expressionInterpreterFactory != null;

		this.expressionInterpreterFactory = expressionInterpreterFactory;
	}

	public final ActivityTaskFactory getActivityTaskFactory()
	{
		if (activityTaskFactory == null)
		{
			activityTaskFactory = createActivityTaskFactory();
		}

		return activityTaskFactory;
	}

	protected ActivityTaskFactory createActivityTaskFactory()
	{
		return new ActivityTaskFactory();
	}

	public StoryPatternMatcherFactory getPatternMatcherFactory()
	{
		if (storyPatternMatcherFactory == null)
		{
			storyPatternMatcherFactory = createStoryPatternMatcherFactory();
		}

		return storyPatternMatcherFactory;
	}

	protected StoryPatternMatcherFactory createStoryPatternMatcherFactory()
	{
		return new StoryPatternMatcherFactory();
	}

	public ExpressionInterpreterFactory getExpressionInterpreterFactory()
	{
		return expressionInterpreterFactory;
	}

}
