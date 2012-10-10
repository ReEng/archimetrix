package org.storydriven.modeling.interpreter.adapter.storypattern;


import org.eclipse.emf.common.notify.Notifier;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.LinkVariable;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkEndAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternObjectAdapter;
import de.mdelab.sdm.interpreter.common.expressions.ExpressionInterpreterFactory;
import de.mdelab.sdm.interpreter.common.expressions.IExpressionInterpreter;
import de.mdelab.sdm.interpreter.common.variables.Variable;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;


public class SDStoryPatternLinkEndAdapter extends SDAbstractLinkVariableEndAdapter<LinkVariable> 
{

   public SDStoryPatternLinkEndAdapter(SDMainAdapterFactory mainAdapterFactory,
         SDAbstractLinkVariableAdapter<? extends AbstractLinkVariable> storyPatternLinkAdapter,
         IStoryPatternObjectAdapter targetStoryPatternObjectAdapter, IPropertyAdapter propertyAdapter)
   {
      super(mainAdapterFactory, storyPatternLinkAdapter, targetStoryPatternObjectAdapter, propertyAdapter);
   }

   
   @Override
   public IInstanceAdapter getInstanceAdapter(VariableScope variableScope)
   {
      IStoryPatternObjectAdapter spo = this.getStoryPatternObjectAdapter();
      IInstanceAdapter instance = null;
      if (spo != null)
      {
         instance = variableScope.getVariable(spo.getName()).getValueAdapter();
      }
      else
      {
         Expression qualifierExpression = this.getElement().getQualifierExpression();
         IExpressionAdapter expressionAdapter = this.getMainAdapterFactory().getExpressionsAdapterFactory()
               .getExpressionAdapter(qualifierExpression);

         ExpressionInterpreterFactory expressionFactory =  variableScope.getInterpreterManager()
               .getMainInterpreterFactory().getExpressionInterpreterFactory();

         Variable variable = null;
         try
         {
            IExpressionInterpreter expressionInterpreter = expressionFactory.getExpressionInterpreter(expressionAdapter
                  .getExpressionLanguage());
            variable = expressionInterpreter.evaluate(expressionAdapter, variableScope, null, null);
         }
         catch (SDMInterpreterException e)
         {
            e.printStackTrace();
         }

         instance = variable.getValueAdapter();

      }


      return instance;
   }


   @Override
   public IInstanceAdapter getKeyInstanceAdapter(VariableScope variableScope)
   {
      Notifier element = this.getStoryPatternLinkAdapter().getTarget();
      if(element == null)
      {
         IStoryPatternLinkEndAdapter keyLinkEnd = this.getStoryPatternLinkAdapter().getLinkEndAdapters().get(1);
         return keyLinkEnd.getKeyInstanceAdapter(variableScope);
      }
      else if(!(element instanceof LinkVariable))
      {
         return null;
      }
      LinkVariable link = (LinkVariable) element;
      
      Expression qualifierExpression = link.getQualifierExpression();
      if(qualifierExpression == null)
      {
         return null;
      }
      IExpressionAdapter expressionAdapter = this.getMainAdapterFactory().getExpressionsAdapterFactory()
            .getExpressionAdapter(qualifierExpression);

      ExpressionInterpreterFactory expressionFactory =  variableScope.getInterpreterManager()
            .getMainInterpreterFactory().getExpressionInterpreterFactory();

      Variable variable = null;
      try
      {
         IExpressionInterpreter expressionInterpreter = expressionFactory.getExpressionInterpreter(expressionAdapter
               .getExpressionLanguage());
         variable = expressionInterpreter.evaluate(expressionAdapter, variableScope, null, null);
      }
      catch (SDMInterpreterException e)
      {
         e.printStackTrace();
      }

      return  variable.getValueAdapter();
   }

}