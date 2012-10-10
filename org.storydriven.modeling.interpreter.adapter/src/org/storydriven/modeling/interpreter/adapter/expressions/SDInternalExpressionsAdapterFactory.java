package org.storydriven.modeling.interpreter.adapter.expressions;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.expressions.util.ExpressionsAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

public class SDInternalExpressionsAdapterFactory extends ExpressionsAdapterFactory
{
	private SDMainAdapterFactory	mainAdapterFactory;

	public SDInternalExpressionsAdapterFactory(SDMainAdapterFactory mainAdapterFactory)
	{
		assert mainAdapterFactory != null;

		this.mainAdapterFactory = mainAdapterFactory;
	}

	// @Override
	// public Adapter createCallActionExpressionAdapter()
	// {
	// return new SDECallActionExpressionAdapter(mainAdapterFactory);
	// }
	//
	// @Override
	// public Adapter createStringExpressionAdapter()
	// {
	// return new SDEStringExpressionAdapter(mainAdapterFactory);
	// }

	@Override
	public Adapter createExpressionAdapter()
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public Adapter createTextualExpressionAdapter()
	{
		return new SDTextualExpressionAdapter(mainAdapterFactory);
	}

	@Override
	public Adapter createLiteralExpressionAdapter()
	{
		return new SDLiteralExpressionAdapter(mainAdapterFactory);
	}

	@Override
	public Adapter createNotExpressionAdapter()
	{
		return new SDNotExpressionAdapter(mainAdapterFactory);
	}

	@Override
	public Adapter createComparisonExpressionAdapter()
	{
		return new SDComparisonExpressionAdapter(mainAdapterFactory);
	}

	@Override
	public Adapter createArithmeticExpressionAdapter()
	{
		return new SDArithmeticExpressionAdapter(mainAdapterFactory);
	}

	@Override
	public Adapter createBinaryLogicExpressionAdapter()
	{
		return new SDBinaryLogicExpressionAdapter(mainAdapterFactory);
	}
}
