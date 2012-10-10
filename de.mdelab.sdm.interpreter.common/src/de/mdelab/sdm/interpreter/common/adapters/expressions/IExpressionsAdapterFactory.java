package de.mdelab.sdm.interpreter.common.adapters.expressions;

import de.mdelab.sdm.interpreter.common.adapters.IAdapterFactory;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IExpressionsAdapterFactory extends IAdapterFactory
{
	public IExpressionAdapter getExpressionAdapter(Object expression);
}
