package de.mdelab.sdm.interpreter.common.adapters.activity;

import java.util.List;

import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IExpressionNodeAdapter extends ISimpleNodeAdapter
{
	public List<IExpressionAdapter> getExpressionAdapters();
}
