package org.storydriven.modeling.interpreter.adapter.storypattern;

import java.util.ArrayList;
import java.util.List;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.AbstractVariable;
import org.storydriven.modeling.patterns.Constraint;

import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternObjectAdapter;

public abstract class SDAbstractVariableAdapter<ELEMENT_TYPE extends AbstractVariable> extends SDAbstractStoryPatternAdapter<ELEMENT_TYPE>
		implements IStoryPatternObjectAdapter
{
	private List<IExpressionAdapter>	constraintExpressionAdapters;

	public SDAbstractVariableAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public String getName()
	{
		return getElement().getName();
	}

	@Override
	public IExpressionAdapter getAssignmentExpression()
	{
		if (getElement().getBindingExpression() != null)
		{
			return getMainAdapterFactory().getSDExpressionsAdapterFactory().getExpressionAdapter(getElement().getBindingExpression());
		}
		else
		{
			return null;
		}
	}

	@Override
	public List<IExpressionAdapter> getConstraintExpressionAdapters()
	{
		if (constraintExpressionAdapters == null)
		{
			constraintExpressionAdapters = new ArrayList<IExpressionAdapter>();

			for (Constraint constraint : getElement().getConstraints())
			{
				constraintExpressionAdapters.add(getMainAdapterFactory().getSDExpressionsAdapterFactory().getExpressionAdapter(constraint.getConstraintExpression()));
			}
		}

		return constraintExpressionAdapters;
	}

}
