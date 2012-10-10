package de.mdelab.sdm.interpreter.common.adapters;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityAdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionsAdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.m3.IM3AdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapterFactory;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IMainAdapterFactory
{
	public IStoryPatternAdapterFactory getStoryPatternAdapterFactory();

	public IM3AdapterFactory getM3AdapterFactory();

	public IExpressionsAdapterFactory getExpressionsAdapterFactory();

	public IActivityAdapterFactory getActivityAdapterFactory();
}
