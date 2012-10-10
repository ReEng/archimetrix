package org.storydriven.modeling.interpreter.adapter.m3;


import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;


public class SDMapEntryReferencePropertyAdapter extends SDAssociationEndAdapter
{
   private EReference eReference;

   private SDMapEntryKeyPropertyAdapter keyPropertyAdapter;

   private SDMapEntryValuePropertyAdapter valuePropertyAdapter;


   public SDMapEntryReferencePropertyAdapter(SDMainAdapterFactory mainAdapterFactory, EReference eReference)
   {
      super(mainAdapterFactory);

      assert eReference != null;

      this.eReference = eReference;
   }


   protected EReference geteReference()
   {
      return eReference;
   }


   @Override
   public boolean isNavigable()
   {
      return true;
   }


   @Override
   public IClassifierAdapter getClassifierAdapter()
   {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException();
   }


   @SuppressWarnings("unchecked")
   @Override
   public void createAssociation(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
         Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds)
   {
      assert otherAssociationEnds.size() == 1 || otherAssociationEnds.size() == 2;

      /*
       * Find the key and value property adapters
       */
      SDMapEntryKeyPropertyAdapter keyPropertyAdapter = null;
      SDMapEntryValuePropertyAdapter valuePropertyAdapter = null;

      for (IPropertyAdapter propertyAdapter : otherAssociationEnds.keySet())
      {
         if (propertyAdapter instanceof SDMapEntryKeyPropertyAdapter)
         {
            assert keyPropertyAdapter == null;

            keyPropertyAdapter = (SDMapEntryKeyPropertyAdapter) propertyAdapter;
         }
         else if (propertyAdapter instanceof SDMapEntryValuePropertyAdapter)
         {
            assert valuePropertyAdapter == null;

            valuePropertyAdapter = (SDMapEntryValuePropertyAdapter) propertyAdapter;
         }
         else
         {
            throw new RuntimeException("Unexpected kind of property adapter: " + propertyAdapter);
         }
      }

      assert keyPropertyAdapter != null;

      /*
       * Get the key and value objects
       */
      Object keyObject = otherAssociationEnds.get(keyPropertyAdapter).getValue();
      Object valueObject = null;

      IInstanceAdapter valueInstanceAdapter = otherAssociationEnds.get(valuePropertyAdapter);

      if (valueInstanceAdapter != null)
      {
         valueObject = valueInstanceAdapter.getValue();
      }

      if (this.geteReference().getUpperBound() == -1)
      {
         EMap<Object, Object> map = ((EMap<Object, Object>) instanceAdapter.getEObject().eGet(this.geteReference()));
         EList<EObject> list = (EList<EObject>) map.get(keyObject);
         if (list == null)
         {
            list = new BasicEList<EObject>();
            map.put(keyObject, list);
            list = (EList<EObject>) map.get(keyObject);
         }

         if(valueInstanceAdapter instanceof SDObjectSetInstanceAdapter)
         {
            list.addAll((Collection<EObject>) valueObject);
         }
         else
         {
            list.add((EObject) valueObject);
         }
//         ((EMap<Object, Object>) instanceAdapter.getEObject().eGet(this.geteReference())).put(keyObject, list);
//         map.put(keyObject, list);
      }
      else
      {
         ((EMap<Object, Object>) instanceAdapter.getEObject().eGet(this.geteReference())).put(keyObject, valueObject);
      }
   }


   @Override
   public void destroyAssociation(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
         Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds)
   {
      @SuppressWarnings("unchecked")
      EMap<Object, Object> map = (EMap<Object, Object>) instanceAdapter.getEObject().eGet(geteReference());
      if (this.geteReference().getUpperBound() == -1)
      {
         for (Object o : map.values())
         {
            @SuppressWarnings("unchecked")
            List<EObject> list = (List<EObject>) o;
            list.remove(instanceAdapter);
         }
      }
      else
      {
         map.remove(instanceAdapter);
      }
   }


   @Override
   public SDPropertyValueIterator<? extends SDPropertyAdapter> createPropertyTargetIterator(
         IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
         SDPropertyAdapter targetProperty, Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties)
   {
      if (targetProperty instanceof SDMapEntryKeyPropertyAdapter)
      {
         return new SDMapEntryKeyPropertyValueIterator(getMainAdapterFactory(), instanceAdapter, this,
               otherBoundProperties);
      }
      else
      {
         return new SDMapEntryValuePropertyValueIterator(getMainAdapterFactory(), instanceAdapter, this,
               otherBoundProperties);
      }
   }


   @Override
   public void setValue(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter, SDInstanceAdapter valueAdapter)
   {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException();
   }


   @Override
   public boolean containsValue(IInstanceAdapter keyInstanceAdapter, IInstanceAdapter instanceAdapter, SDInstanceAdapter valueAdapter,
         SDPropertyAdapter targetPropertyAdapter)
   {
      if(instanceAdapter instanceof SDEObjectInstanceAdapter)
      {
         return singleContains(valueAdapter, targetPropertyAdapter, ((SDEObjectInstanceAdapter) instanceAdapter).getEObject());
      }
      else
      {
         SDObjectSetInstanceAdapter adapter = (SDObjectSetInstanceAdapter) instanceAdapter;
         if(adapter.getValue().isEmpty())
         {
            return false;
         }
         for(EObject object : adapter.getValue())
         {
            if(!singleContains(valueAdapter, targetPropertyAdapter, object))
            {
               return false;
            }
         }
         return true;
      }
   }


   private boolean singleContains(SDInstanceAdapter valueAdapter, SDPropertyAdapter targetPropertyAdapter,
         EObject object)
   {
      @SuppressWarnings("unchecked")
      EMap<Object, Object> map = (EMap<Object, Object>) object.eGet(geteReference());

      if (targetPropertyAdapter == getKeyPropertyAdapter())
      {
         /*
          * Check if the underlying map contains the key
          */
         return map.containsKey(valueAdapter.getValue());
      }
      else if (targetPropertyAdapter == getValuePropertyAdapter())
      {
         if (this.geteReference().getUpperBound() == -1)
         {
            if(map.values().isEmpty())
            {
               return false;
            }
            for (Object o : map.values())
            {
               @SuppressWarnings("unchecked")
               List<EObject> list = (List<EObject>) o;
               if (list.contains(valueAdapter.getValue()))
               {
                  return true;
               }
            }
            return false;
         }
         return map.containsValue(valueAdapter.getValue());
      }
      else
      {
         throw new RuntimeException("targetPropertyAdapter '" + targetPropertyAdapter
               + "' does not belong to this association.");
      }
   }
   
   


   @Override
   public boolean containsKeyValue(IInstanceAdapter instanceAdapter, SDInstanceAdapter keyAdapter,
         SDInstanceAdapter valueAdapter, SDPropertyAdapter targetPropertyAdapter)
   {
      if(instanceAdapter instanceof SDEObjectInstanceAdapter)
      {
         return singleContainsKeyValue(keyAdapter, valueAdapter, ((SDEObjectInstanceAdapter) instanceAdapter).getEObject());
      }
      else
      {
         SDObjectSetInstanceAdapter adapter = (SDObjectSetInstanceAdapter) instanceAdapter;
         if(adapter.getValue().isEmpty())
         {
            return false;
         }
         for(EObject object : adapter.getValue())
         {
            if(!singleContainsKeyValue(keyAdapter, valueAdapter, object))
            {
               return false;
            }
         }
         return true;
      }
   }


   private boolean singleContainsKeyValue(SDInstanceAdapter keyAdapter, SDInstanceAdapter valueAdapter, EObject object)
   {
      @SuppressWarnings("unchecked")
      EMap<Object, Object> map = (EMap<Object, Object>) object.eGet(geteReference());
      if (map.containsKey((keyAdapter.getValue())))
      {
         @SuppressWarnings("unchecked")
         List<EObject> list = (List<EObject>) map.get(keyAdapter.getValue());
         return list.contains(valueAdapter.getValue());
      }
      
      return false;
   }


   @Override
   public void setOppositePropertyAdapters(List<SDPropertyAdapter> oppositePropertyAdapters)
   {
      super.setOppositePropertyAdapters(oppositePropertyAdapters);

      for (SDPropertyAdapter endAdapter : oppositePropertyAdapters)
      {
         if (endAdapter instanceof SDMapEntryKeyPropertyAdapter)
         {
            keyPropertyAdapter = (SDMapEntryKeyPropertyAdapter) endAdapter;
         }
         else if (endAdapter instanceof SDMapEntryValuePropertyAdapter)
         {
            valuePropertyAdapter = (SDMapEntryValuePropertyAdapter) endAdapter;
         }
         else
         {
            throw new RuntimeException("Unexpected kind of association end adapter: " + endAdapter);
         }
      }
   }


   public SDMapEntryKeyPropertyAdapter getKeyPropertyAdapter()
   {
      return keyPropertyAdapter;
   }


   public SDMapEntryValuePropertyAdapter getValuePropertyAdapter()
   {
      return valuePropertyAdapter;
   }


   @Override
   public String getName()
   {
      return geteReference().getName();
   }


   @Override
   public IInstanceAdapter getPropertySetValue(IInstanceAdapter keyInstanceAdapter,
         SDEObjectInstanceAdapter instanceAdapter, SDPropertyAdapter targetProperty)
   {
      List<EObject> list = Collections.emptyList();
      @SuppressWarnings("unchecked")
      EMap<Object, Object> map = (EMap<Object, Object>) instanceAdapter.getEObject().eGet(geteReference());
      if (map.containsKey((keyInstanceAdapter.getValue())))
      {

         list = (List<EObject>) map.get(keyInstanceAdapter.getValue());

      }
      else
      {
         return null;
      }

      return getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(list,
            getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(geteReference().getEType()));
   }
}
