package de.mdelab.sdm.interpreter.common.adapters.storypattern;

import java.util.List;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IStoryPatternLinkAdapter extends IStoryPatternElementAdapter
{
	public List<IStoryPatternLinkEndAdapter> getLinkEndAdapters();

	// public IAssociationAdapter getAssociationAdapter();
}
