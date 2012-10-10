package de.mdelab.sdm.interpreter.common.storypatternmatcher.strategies;

import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkEndAdapter;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class NextBindingInfo
{
	public IStoryPatternLinkEndAdapter	sourceLinkEndAdapter;

	public IInstanceAdapter				sourceInstanceAdapter;

	public IStoryPatternLinkEndAdapter	targetLinkEndAdapter;
}
