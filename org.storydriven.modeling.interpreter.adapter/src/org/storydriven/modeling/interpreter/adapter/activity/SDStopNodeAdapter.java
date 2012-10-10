package org.storydriven.modeling.interpreter.adapter.activity;


import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityFinalNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionAdapter;


public class SDStopNodeAdapter extends SDActivityNodeAdapter<StopNode> implements IActivityFinalNodeAdapter
{
   public SDStopNodeAdapter(SDMainAdapterFactory mainAdapterFactory)
   {
      super(mainAdapterFactory);
   }


   @Override
   public IExpressionAdapter getReturnValueExpressionAdapter()
   {
      if (getElement().getReturnValue() != null)
      {
         return getMainAdapterFactory().getSDExpressionsAdapterFactory().getExpressionAdapter(
               getElement().getReturnValue());
      }
      else
      {
         return null;
      }
   }

}
