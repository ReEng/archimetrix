package de.mdelab.sdm.interpreter.common.adapters.activity;

import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapter;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IStoryNodeAdapter extends IActivityNodeAdapter
{
	public IActivityNodeAdapter getNextNodeAdapterForSuccess();

	public IActivityNodeAdapter getNextNodeAdapterForFailure();

	public IStoryPatternAdapter getStoryPatternAdapter();
}
