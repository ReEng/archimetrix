package de.mdelab.sdm.interpreter.common.adapters.storypattern;

import java.util.List;

import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IStoryPatternObjectAdapter extends IStoryPatternElementAdapter
{
	public String getName();

	public IClassifierAdapter getClassifierAdapter();

	public IExpressionAdapter getAssignmentExpression();

	public List<IPropertyAssignmentAdapter> getPropertyAssignmentAdapters();

	public List<IStoryPatternLinkEndAdapter> getLinkEndAdapters();

	public List<IExpressionAdapter> getConstraintExpressionAdapters();
	
	public boolean isSet();

   public boolean isNegative();
}
