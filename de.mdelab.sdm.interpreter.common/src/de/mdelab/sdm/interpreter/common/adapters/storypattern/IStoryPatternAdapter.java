package de.mdelab.sdm.interpreter.common.adapters.storypattern;

import java.util.List;

import de.mdelab.sdm.interpreter.common.adapters.IAdapter;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IStoryPatternAdapter extends IAdapter
{

	public List<IStoryPatternObjectAdapter> getBoundStoryPatternObjectAdapters();

	public List<IStoryPatternObjectAdapter> getUnboundStoryPatternObjectAdapters();

	public List<IStoryPatternObjectAdapter> getMaybeBoundStoryPatternObjectAdapters();
	
	public List<IStoryPatternObjectAdapter> getOptionalStoryPatternObjectAdapters();
	
   public List<IStoryPatternObjectAdapter> getNegativeStoryPatternObjectAdapters();

	public List<IStoryPatternLinkAdapter> getUnmodifiedStoryPatternLinkAdapters();

	public List<IStoryPatternObjectAdapter> getCreatedStoryPatternObjectAdapters();

	public List<IStoryPatternLinkAdapter> getCreatedStoryPatternLinkAdapters();

	public List<IStoryPatternObjectAdapter> getDeletedStoryPatternObjectAdapters();
	
	public List<IStoryPatternObjectAdapter> getDeletedOptionalStoryPatternObjectAdapters();

	public List<IStoryPatternLinkAdapter> getDeletedStoryPatternLinkAdapters();
	
	public List<IStoryPatternLinkAdapter> getOptionalStoryPatternLinkAdapters();

   public List<IStoryPatternLinkAdapter> getNegativeStoryPatternLinkAdapters();

	public List<IExpressionAdapter> getStoryPatternConstraintAdapters();

	public String getName();

}
