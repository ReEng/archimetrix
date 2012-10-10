package org.storydriven.modeling.interpreter.adapter.expressions;

import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.interpreter.adapter.SDAdapter;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;

public abstract class SDExpressionAdapter<ELEMENT_TYPE extends Expression> extends SDAdapter<ELEMENT_TYPE> implements IExpressionAdapter
{

	public SDExpressionAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public boolean isAdapterForType(Object type)
	{
		return type == getMainAdapterFactory().getExpressionsAdapterFactory();
	}

	@Override
	public Object getExpression()
	{
		return getElement();
	}
}
