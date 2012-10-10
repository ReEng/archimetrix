package org.storydriven.modeling.interpreter.adapter.activity;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EParameter;
import org.storydriven.modeling.activities.ActivityCallNode;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.calls.ParameterBinding;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.expressions.ObjectVariableExpression;
import org.storydriven.modeling.patterns.expressions.PrimitiveVariableExpression;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.IMainAdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityCallNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.expressions.EclipseBasedExpressionInterpreterFactory;
import de.mdelab.sdm.interpreter.common.expressions.ExpressionInterpreterFactory;
import de.mdelab.sdm.interpreter.common.expressions.IExpressionInterpreter;
import de.mdelab.sdm.interpreter.common.variables.Parameter;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;


public class SDActivityCallNodeAdapter extends SDActivityNodeAdapter<ActivityCallNode> implements
      IActivityCallNodeAdapter
{

   public SDActivityCallNodeAdapter(SDMainAdapterFactory mainAdapterFactory)
   {
      super(mainAdapterFactory);
   }


   @Override
   public IActivityNodeAdapter getNextNodeAdapter()
   {
      assert getElement().getOutgoings().size() == 1;
      assert getElement().getOutgoings().get(0).getTarget() != null;

      ActivityNode nextNode = getElement().getOutgoings().get(0).getTarget();

      IActivityNodeAdapter nextNodeAdapter = getMainAdapterFactory().getSDActivityAdapterFactory()
            .getActivityNodeAdapter(nextNode);

      return nextNodeAdapter;
   }


   @Override
   public IActivityNodeAdapter getNextNodeAdapterForSuccess()
   {
      // TODO Auto-generated method stub
      return null;
   }


   @Override
   public IActivityNodeAdapter getNextNodeAdapterForFailure()
   {
      // TODO Auto-generated method stub
      return null;
   }


   @Override
   public Object getCalledActivity()
   {
      return getElement().getCallee();
   }


   @Override
   public List<Parameter> getParameters(VariableScope variableScope)
   {
      ArrayList<Parameter> parameters = new ArrayList<Parameter>();

      // add parameters from element
      List<ParameterBinding> paramBindings = getElement().getOwnedParameterBindings();
      for (ParameterBinding parameterBinding : paramBindings)
      {
         IExpressionAdapter expressionAdapter = (IExpressionAdapter) getMainAdapterFactory()
               .getSDExpressionsAdapterFactory().getExpressionAdapter(parameterBinding.getValueExpression());
         IExpressionInterpreter expressionInterpreter;
         Variable variable = null;
         try
         {
            expressionInterpreter = variableScope.getInterpreterManager().getMainInterpreterFactory()
                  .getExpressionInterpreterFactory()
                  .getExpressionInterpreter(expressionAdapter.getExpressionLanguage());

            variable = expressionInterpreter.evaluate(expressionAdapter, variableScope, null, null);
         }
         catch (SDMInterpreterException e)
         {
            e.printStackTrace();
         }

         if (variable != null)
         {
            Parameter param = new Parameter(parameterBinding.getParameter().getName(), parameterBinding.getParameter()
                  .getEType(), variable.getValueAdapter().getValue());
            parameters.add(param);
         }
         else
         {
            System.err.println("parameter binding \"" + parameterBinding.getParameter().getName()
                  + "\" evaluated to null");
         }
      }

      return parameters;
   }


   @Override
   public IMainAdapterFactory getAdapterFactory()
   {
      return getMainAdapterFactory();
   }


   @Override
   public ExpressionInterpreterFactory getExpressionInterpreterAdapterFactory()
   {
      return new EclipseBasedExpressionInterpreterFactory();
   }


   @Override
   public String getReturnVariableName(VariableScope variableScope)
   {
      EList<ParameterBinding> paramBinding = getElement().getOwnedParameterBindings();
      EParameter outParam = getElement().getCallee().getOutParameters().get(0);
      for (ParameterBinding pB : paramBinding)
      {
         if (outParam==pB.getParameter())
         {
            if (pB.getValueExpression() instanceof ObjectVariableExpression)
            {
               return ((ObjectVariableExpression) pB.getValueExpression()).getObject().getName();
            }
            else if (pB.getValueExpression() instanceof PrimitiveVariableExpression)
            {
               return ((PrimitiveVariableExpression) pB.getValueExpression()).getPrimitiveVariable().getName();
            }
            else
            {
               IExpressionAdapter expressionAdapter = (IExpressionAdapter) getMainAdapterFactory()
                     .getSDExpressionsAdapterFactory().getExpressionAdapter(pB.getValueExpression());
               IExpressionInterpreter expressionInterpreter;
               Variable variable = null;
               try
               {
                  expressionInterpreter = variableScope.getInterpreterManager().getMainInterpreterFactory()
                        .getExpressionInterpreterFactory()
                        .getExpressionInterpreter(expressionAdapter.getExpressionLanguage());

                  variable = expressionInterpreter.evaluate(expressionAdapter, variableScope, null, null);
               }
               catch (SDMInterpreterException e)
               {
                  e.printStackTrace();
               }
               return variable.getName();
            }
         }
      }
      return null;
   }

}
