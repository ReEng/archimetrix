package de.mdelab.sdm.interpreter.common.adapters.expressions;

import de.mdelab.sdm.interpreter.common.adapters.IAdapter;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IExpressionAdapter extends IAdapter
{

	public String getExpressionLanguage();

	public Object getExpression();

}
