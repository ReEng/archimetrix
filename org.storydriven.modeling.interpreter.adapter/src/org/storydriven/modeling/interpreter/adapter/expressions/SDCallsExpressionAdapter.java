package org.storydriven.modeling.interpreter.adapter.expressions;

import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.interpreter.calls.ISDExpressionEvaluator;
import org.storydriven.modeling.interpreter.calls.SDCallsConstants;

/**
 * Superclass of all expressions representing an AST node of the "SD calls"
 * (some know a better name?) expression language. It also implements the
 * ISDExpressionEvaluator interface, which defines an evaluate() operation to
 * evaluate the expression.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <ELEMENT_TYPE>
 */
public abstract class SDCallsExpressionAdapter<ELEMENT_TYPE extends Expression> extends SDExpressionAdapter<ELEMENT_TYPE> implements
		ISDExpressionEvaluator
{

	public SDCallsExpressionAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public String getExpressionLanguage()
	{
		return SDCallsConstants.SD_CALLS_LANGUAGE_NAME;
	}
}
