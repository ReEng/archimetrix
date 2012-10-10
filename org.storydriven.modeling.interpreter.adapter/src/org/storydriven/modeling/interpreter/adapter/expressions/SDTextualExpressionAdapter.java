package org.storydriven.modeling.interpreter.adapter.expressions;

import org.storydriven.modeling.expressions.TextualExpression;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.expressions.IStringExpressionAdapter;

public class SDTextualExpressionAdapter extends SDExpressionAdapter<TextualExpression> implements IStringExpressionAdapter
{
	private Object ast;
	
	public SDTextualExpressionAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public String getExpressionLanguage()
	{
		return getElement().getLanguage();
	}

	@Override
	public Object getExpression()
	{
		return getExpressionString();
	}

	@Override
	public Object getAST()
	{
		return ast;
	}

	@Override
	public void setAST(Object ast)
	{
		this.ast = ast;
	}

	@Override
	public String getExpressionString()
	{
		return getElement().getExpressionText();
	}
}
