package org.storydriven.modeling.interpreter.adapter.m3;


import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;


public class SDClassifierAdapter extends SDM3Adapter<EClassifier> implements IClassifierAdapter
{
   public SDClassifierAdapter(SDMainAdapterFactory mainAdapterFactory)
   {
      super(mainAdapterFactory);
   }


   @Override
   public String getName()
   {
      return getElement().getName();
   }


   public EClassifier getEClassifier()
   {
      return getElement();
   }


   @Override
   public Object getClassifier()
   {
      return getElement();
   }


   @Override
   public boolean isInstance(IInstanceAdapter valueAdapter)
   {
      if (valueAdapter instanceof SDEObjectInstanceAdapter || valueAdapter instanceof SDPrimitiveInstanceAdapter)
      {
         return getElement().isInstance(valueAdapter.getValue());
      }
      else if (valueAdapter instanceof SDObjectSetInstanceAdapter)
      {
         SDObjectSetInstanceAdapter setAdapter = (SDObjectSetInstanceAdapter) valueAdapter;
         for (EObject object : setAdapter.getValue())
         {
            if (!getElement().isInstance(object))
            {
               return false;
            }
         }
         return true;
      }
      else
      {
         return false;
      }

   }
}
