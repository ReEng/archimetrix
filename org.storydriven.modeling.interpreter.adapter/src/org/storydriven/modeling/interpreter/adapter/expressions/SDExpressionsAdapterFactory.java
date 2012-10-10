package org.storydriven.modeling.interpreter.adapter.expressions;


import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.interpreter.adapter.SDAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.calls.expressions.SDInternalCallsExpressionsAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.storypattern.expressions.SDInternalPatternsExpressionsAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionsAdapterFactory;


public class SDExpressionsAdapterFactory extends SDAdapterFactory implements IExpressionsAdapterFactory
{
   private SDInternalExpressionsAdapterFactory internalExpressionsAdapterFactory;

   private SDInternalCallsExpressionsAdapterFactory internalCallsExpressionsAdapterFactory;

   private AdapterFactoryImpl internalPatternsExpressionsAdapterFactory;


   public SDExpressionsAdapterFactory(SDMainAdapterFactory mainAdapterFactory)
   {
      super(mainAdapterFactory);

      internalExpressionsAdapterFactory = new SDInternalExpressionsAdapterFactory(mainAdapterFactory);
      
      internalCallsExpressionsAdapterFactory = new SDInternalCallsExpressionsAdapterFactory(mainAdapterFactory);
      
      internalPatternsExpressionsAdapterFactory = new SDInternalPatternsExpressionsAdapterFactory(mainAdapterFactory);
   }


   @SuppressWarnings("unchecked")
   public SDExpressionAdapter<? extends Expression> getExpressionAdapter(Object expression)
   {
      assert expression instanceof Expression;

      Expression exp = (Expression) expression;

      /*
       * The expressions classes are spread over several packages. Therefore, we need several
       * adapter factories, one for each package. Here, we need to check, in which package the
       * EClass of the expression resides and call the appropriate adapter factory.
       */
      if (exp.eClass().getEPackage() == org.storydriven.modeling.expressions.ExpressionsPackage.eINSTANCE)
      {
         synchronized (exp)
         {
            return (SDExpressionAdapter<? extends Expression>) internalExpressionsAdapterFactory.adapt(exp, this);
         }
      }
      else if (exp.eClass().getEPackage() == org.storydriven.modeling.patterns.expressions.ExpressionsPackage.eINSTANCE)
      {
         synchronized (exp)
         {
            return (SDExpressionAdapter<? extends Expression>) internalPatternsExpressionsAdapterFactory.adapt(exp, this);

         }
      }
      else if (exp.eClass().getEPackage() == org.storydriven.modeling.calls.expressions.ExpressionsPackage.eINSTANCE)
      {
         synchronized (exp)
         {
            return (SDExpressionAdapter<? extends Expression>) internalCallsExpressionsAdapterFactory.adapt(exp, this);
         }
      }
      else
      {
         throw new UnsupportedOperationException();
      }
   }
}
