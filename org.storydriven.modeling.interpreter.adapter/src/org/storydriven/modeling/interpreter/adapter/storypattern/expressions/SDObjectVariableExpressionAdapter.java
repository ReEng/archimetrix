package org.storydriven.modeling.interpreter.adapter.storypattern.expressions;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.expressions.ObjectVariableExpression;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

public class SDObjectVariableExpressionAdapter extends SDPatternsExpressionAdapter<ObjectVariableExpression>
{

	public SDObjectVariableExpressionAdapter(SDMainAdapterFactory mainAdapterFactory) 
	{
		super(mainAdapterFactory);
	}

	@Override
	public Variable evaluate(IClassifierAdapter contextClassifierAdapter, IInstanceAdapter contextInstanceAdapter, VariableScope variableScope)
			throws SDMInterpreterException 
	{
	   String name = getElement().getObject().getName();
      return variableScope.getVariable(name);
	}

	

}
