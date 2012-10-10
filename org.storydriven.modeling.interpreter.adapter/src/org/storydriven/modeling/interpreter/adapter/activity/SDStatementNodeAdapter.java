package org.storydriven.modeling.interpreter.adapter.activity;

import java.util.ArrayList;
import java.util.List;

import org.storydriven.modeling.activities.StatementNode;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IExpressionNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;

public class SDStatementNodeAdapter extends SDActivityNodeAdapter<StatementNode> implements IExpressionNodeAdapter
{

	public SDStatementNodeAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public IActivityNodeAdapter getNextNodeAdapter()
	{
		assert getElement().getOutgoings().size() == 1;
		assert getElement().getOutgoings().get(0).getTarget() != null;
		return getMainAdapterFactory().getSDActivityAdapterFactory().getActivityNodeAdapter(getElement().getOutgoings().get(0).getTarget());
	}

	@Override
	public List<IExpressionAdapter> getExpressionAdapters()
	{
		assert getElement().getStatementExpression() != null;

		List<IExpressionAdapter> expressionAdapters = new ArrayList<IExpressionAdapter>();
		expressionAdapters
				.add(getMainAdapterFactory().getSDExpressionsAdapterFactory().getExpressionAdapter(getElement().getStatementExpression()));

		return expressionAdapters;
	}

}