package org.storydriven.modeling.interpreter.adapter.storypattern.expressions;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.patterns.expressions.util.ExpressionsAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

public class SDInternalPatternsExpressionsAdapterFactory extends ExpressionsAdapterFactory
{
	private SDMainAdapterFactory	mainAdapterFactory;

	public SDInternalPatternsExpressionsAdapterFactory(SDMainAdapterFactory mainAdapterFactory)
	{
		assert mainAdapterFactory != null;

		this.mainAdapterFactory = mainAdapterFactory;
	}

	@Override
	public Adapter createAttributeValueExpressionAdapter() 
	{
		return new SDAttributeValueExpressionAdapter(mainAdapterFactory);
	}

	@Override
	public Adapter createObjectVariableExpressionAdapter() 
	{
		return new SDObjectVariableExpressionAdapter(mainAdapterFactory);
	}

	@Override
	public Adapter createObjectSetSizeExpressionAdapter() 
	{
		return new SDObjectSetSizeExpressionAdapter(mainAdapterFactory);
	}

	@Override
	public Adapter createPrimitiveVariableExpressionAdapter() 
	{
		return new SDPrimitiveVariableExpressionAdapter(mainAdapterFactory);
	}

	
}