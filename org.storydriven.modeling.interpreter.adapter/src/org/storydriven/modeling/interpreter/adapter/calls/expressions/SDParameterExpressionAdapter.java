package org.storydriven.modeling.interpreter.adapter.calls.expressions;


import org.storydriven.modeling.calls.expressions.ParameterExpression;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.expressions.SDExpressionAdapter;
import org.storydriven.modeling.interpreter.calls.ISDExpressionEvaluator;
import org.storydriven.modeling.interpreter.calls.SDCallsConstants;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;


public class SDParameterExpressionAdapter extends SDExpressionAdapter<ParameterExpression> implements ISDExpressionEvaluator
{

   public SDParameterExpressionAdapter(SDMainAdapterFactory mainAdapterFactory)
   {
      super(mainAdapterFactory);
   }


   @Override
   public Variable evaluate(IClassifierAdapter contextClassifierAdapter, IInstanceAdapter contextInstanceAdapter,
         VariableScope variableScope) throws SDMInterpreterException
   {      
      String name = getElement().getParameter().getVariableName();
      return variableScope.getVariable(name);

   }


   @Override
   public String getExpressionLanguage()
   {
      return SDCallsConstants.SD_CALLS_LANGUAGE_NAME;
   }
}
