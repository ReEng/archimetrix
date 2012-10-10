package de.mdelab.sdm.interpreter.common.expressions.adapters;

import de.mdelab.sdm.interpreter.common.adapters.Adapter;

/**
 * Superclass of all adapters for expressions. Provides operations to access the
 * expression and it's language name.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * 
 */
public abstract class ExpressionAdapter extends Adapter<ExpressionAdapterFactory>
{
	protected ExpressionAdapter(ExpressionAdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * 
	 * @return The name of the language of the expression.
	 */
	public abstract String getExpressionLanguage();

	/**
	 * 
	 * @return The expression.
	 */
	public abstract Object getExpression();

}
