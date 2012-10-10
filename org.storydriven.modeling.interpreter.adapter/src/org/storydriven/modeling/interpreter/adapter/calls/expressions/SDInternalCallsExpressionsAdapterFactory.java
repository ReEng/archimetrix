package org.storydriven.modeling.interpreter.adapter.calls.expressions;

import org.eclipse.emf.common.notify.Adapter;
import org.storydriven.modeling.calls.expressions.util.ExpressionsAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

public class SDInternalCallsExpressionsAdapterFactory extends ExpressionsAdapterFactory
{
	private SDMainAdapterFactory	mainAdapterFactory;

	public SDInternalCallsExpressionsAdapterFactory(SDMainAdapterFactory mainAdapterFactory)
	{
		assert mainAdapterFactory != null;

		this.mainAdapterFactory = mainAdapterFactory;
	}

	@Override
	public Adapter createMethodCallExpressionAdapter()
	{
		return new SDMethodCallExpressionAdapter(mainAdapterFactory);
	}

   @Override
   public Adapter createParameterExpressionAdapter()
   {
      return new SDParameterExpressionAdapter(mainAdapterFactory);
   }
	
	
}
