package de.mdelab.sdm.interpreter.common.adapters.activity;

import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IActivityFinalNodeAdapter extends IActivityNodeAdapter
{
	public IExpressionAdapter getReturnValueExpressionAdapter();
}
