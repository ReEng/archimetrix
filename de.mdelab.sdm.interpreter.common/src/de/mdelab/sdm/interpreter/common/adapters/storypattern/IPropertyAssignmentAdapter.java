package de.mdelab.sdm.interpreter.common.adapters.storypattern;

import de.mdelab.sdm.interpreter.common.adapters.IAdapter;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IPropertyAssignmentAdapter extends IAdapter
{
	public IExpressionAdapter getExpressionAdapter();

	public IPropertyAdapter getPropertyAdapter();
}
