package org.storydriven.modeling.interpreter.adapter.storypattern;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.AttributeAssignment;

import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IPropertyAssignmentAdapter;

public class SDAttributeAssignmentAdapter extends SDAbstractStoryPatternAdapter<AttributeAssignment> implements IPropertyAssignmentAdapter
{
	public SDAttributeAssignmentAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public IExpressionAdapter getExpressionAdapter()
	{
		return getMainAdapterFactory().getSDExpressionsAdapterFactory().getExpressionAdapter(getElement().getValueExpression());
	}

	@Override
	public IPropertyAdapter getPropertyAdapter()
	{
		return getMainAdapterFactory().getSDM3AdapterFactory().getEStructuralFeaturePropertyAdapter(getElement().getAttribute());
	}

}