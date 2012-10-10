package org.storydriven.modeling.interpreter.adapter.storypattern.expressions;

import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.expressions.SDExpressionAdapter;
import org.storydriven.modeling.interpreter.calls.ISDExpressionEvaluator;
import org.storydriven.modeling.interpreter.adapter.storypattern.SDStoryPatternConstants;

public abstract class SDPatternsExpressionAdapter <ELEMENT_TYPE extends Expression> extends SDExpressionAdapter<ELEMENT_TYPE> implements
		ISDExpressionEvaluator
{

	public SDPatternsExpressionAdapter(SDMainAdapterFactory mainAdapterFactory) 
	{
		super(mainAdapterFactory);
	}

	@Override
	public String getExpressionLanguage() 
	{
		return SDStoryPatternConstants.SD_PATTERNS_LANGUAGE_NAME;
	}

}
