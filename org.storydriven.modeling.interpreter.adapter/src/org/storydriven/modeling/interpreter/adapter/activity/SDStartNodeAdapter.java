package org.storydriven.modeling.interpreter.adapter.activity;


import org.storydriven.modeling.activities.StartNode;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.ISimpleNodeAdapter;


public class SDStartNodeAdapter extends SDActivityNodeAdapter<StartNode> implements ISimpleNodeAdapter
{

   public SDStartNodeAdapter(SDMainAdapterFactory mainAdapterFactory)
   {
      super(mainAdapterFactory);
   }


   @Override
   public IActivityNodeAdapter getNextNodeAdapter()
   {
      assert getElement().getOutgoings().size() == 1;
      assert getElement().getOutgoings().get(0).getTarget() != null;

      return getMainAdapterFactory().getSDActivityAdapterFactory().getActivityNodeAdapter(
            getElement().getOutgoings().get(0).getTarget());
   }

}
