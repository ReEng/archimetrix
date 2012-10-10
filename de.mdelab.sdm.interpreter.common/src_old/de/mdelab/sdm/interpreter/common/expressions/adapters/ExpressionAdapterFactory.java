package de.mdelab.sdm.interpreter.common.expressions.adapters;

import de.mdelab.sdm.interpreter.common.SDMInterpreterAdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.AdapterFactory;

public abstract class ExpressionAdapterFactory extends AdapterFactory
{
	public ExpressionAdapterFactory(SDMInterpreterAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);

		assert mainAdapterFactory != null;
	}

	public abstract ExpressionAdapter getExpressionAdapter(Object expression);

	public abstract StringExpressionAdapter getStringExpressionAdapter(Object stringExpression);
}
