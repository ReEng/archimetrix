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

public class SDEReferenceAdapter extends SDAssociationEndAdapter implements SDEStructuralFeaturePropertyAdapter<EReference>
{
	private EReference	eReference;

	public SDEReferenceAdapter(SDMainAdapterFactory mainAdapterFactory, EReference eReference)
	{
		super(mainAdapterFactory);

		assert eReference != null;

		this.eReference = eReference;
	}

	@Override
	public boolean isNavigable()
	{
		return true;
	}

	@Override
	public IClassifierAdapter getClassifierAdapter()
	{
		return getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(getFeature().getEContainingClass());
	}

	@Override
	public EReference getFeature()
	{
		return eReference;
	}

	@Override
	public SDPropertyValueIterator<SDEReferenceAdapter> createPropertyTargetIterator(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
			SDPropertyAdapter targetProperty, Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties)
	{
		return new SDEReferenceValueIterator(getMainAdapterFactory(), keyInstanceAdapter, instanceAdapter, this);
	}

	@Override
	public void createAssociation(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter, Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds)
	{
		assert otherAssociationEnds.size() == 1;
		
		if(keyInstanceAdapter == null)
		{
   		if (!getFeature().isMany())
   		{
   			instanceAdapter.getEObject().eSet(getFeature(), otherAssociationEnds.values().iterator().next().getValue());
   		}
   		else
   		{
   			@SuppressWarnings("unchecked")
   			List<Object> list = (List<Object>) instanceAdapter.getEObject().eGet(getFeature());
   
   			Object value = otherAssociationEnds.values().iterator().next().getValue();
   			if(value instanceof Collection)
   			{
   			   list.addAll((Collection) value);
   			}
   			else
   			{
   			   list.add(value);
   			}
   		}
		}
		else
		{
		   if (this.eReference.isMany())
	      {
	         EList<EObject> list = getValueListForKey(keyInstanceAdapter, instanceAdapter);

	         IInstanceAdapter valueAdapter = otherAssociationEnds.values().iterator().next();
	         if(valueAdapter instanceof SDObjectSetInstanceAdapter)
	         {
	            list.addAll((Collection<EObject>) valueAdapter.getValue());
	         }
	         else
	         {
	            list.add((EObject) valueAdapter.getValue());
	         }
	      }
	      else
	      {
	         setValueForKey(keyInstanceAdapter, instanceAdapter);
	      }
		}
	}

   private void setValueForKey(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter)
   {
      getKeyValueMap(instanceAdapter).put(keyInstanceAdapter, instanceAdapter.getEObject());
   }

   private EMap<Object, Object> getKeyValueMap(SDEObjectInstanceAdapter instanceAdapter)
   {
      return ((EMap<Object, Object>) instanceAdapter.getEObject().eGet(this.eReference));
   }

   private EList<EObject> getValueListForKey(IInstanceAdapter keyInstanceAdapter,
         SDEObjectInstanceAdapter instanceAdapter)
   {
      EMap<Object, Object> map = getKeyValueMap(instanceAdapter);
      EList<EObject> list = (EList<EObject>) map.get(keyInstanceAdapter.getValue());
      if (list == null)
      {
         list = new BasicEList<EObject>();
         map.put(keyInstanceAdapter.getValue(), list);
         list = (EList<EObject>) map.get(keyInstanceAdapter.getValue());
      }
      return list;
   }

	@Override
	public void destroyAssociation(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter, Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds)
	{
		assert otherAssociationEnds.size() == 1;

		if(keyInstanceAdapter == null)
		{
   		if (!getFeature().isMany())
   		{
   			instanceAdapter.getEObject().eSet(getFeature(), null);
   		}
   		else
   		{
   			@SuppressWarnings("unchecked")
   			List<Object> list = (List<Object>) instanceAdapter.getEObject().eGet(getFeature());
   
   			list.remove(otherAssociationEnds.values().iterator().next().getValue());
   		}
		}
		else
		{
		   if (!getFeature().isMany())
         {
		      getKeyValueMap(instanceAdapter).put(keyInstanceAdapter.getValue(), null);
         }
         else
         {
            getValueListForKey(keyInstanceAdapter, instanceAdapter).remove(otherAssociationEnds.values().iterator().next().getValue());
         }
		}
	}

	@Override
	public void setValue(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter, SDInstanceAdapter valueAdapter)
	{
		instanceAdapter.getEObject().eSet(getFeature(), valueAdapter.getValue());
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean containsValue(IInstanceAdapter keyInstanceAdapter, IInstanceAdapter instance, SDInstanceAdapter valueAdapter,
			SDPropertyAdapter targetPropertyAdapter)
	{
	   if (keyInstanceAdapter == null)
      {
         if (instance instanceof SDEObjectInstanceAdapter)
         {
            SDEObjectInstanceAdapter instanceAdapter = (SDEObjectInstanceAdapter) instance;
            if (!getFeature().isMany())
            {
               return instanceAdapter.getEObject().eGet(getFeature()) == valueAdapter.getValue();
            }
            else
            {
               return ((List<Object>) instanceAdapter.getEObject().eGet(getFeature()))
                     .contains(valueAdapter.getValue());
            }
         }
         else
         {
            SDObjectSetInstanceAdapter instanceAdapter = (SDObjectSetInstanceAdapter) instance;

            if (!getFeature().isMany())
            {
               if (instanceAdapter.getValue().isEmpty())
               {
                  return false;
               }

               for (EObject object : instanceAdapter.getValue())
               {
                  if (object.eGet(getFeature()) != valueAdapter.getValue())
                  {
                     return false;
                  }
               }
               return true;
            }
            else
            {
               for (EObject object : instanceAdapter.getValue())
               {
                  if (((List<Object>) object.eGet(getFeature())).contains(valueAdapter.getValue()))
                  {
                     return false;
                  }
               }
               return true;
            }
         }
      }
	   else
	   {
	      if (instance instanceof SDEObjectInstanceAdapter)
         {
            SDEObjectInstanceAdapter instanceAdapter = (SDEObjectInstanceAdapter) instance;
            if (!getFeature().isMany())
            {
               return getKeyValueMap(instanceAdapter).get(keyInstanceAdapter.getValue()) == valueAdapter.getValue();
            }
            else
            {
               List<EObject> valueList = getValueListForKey(keyInstanceAdapter, instanceAdapter);
               if(valueAdapter instanceof SDObjectSetInstanceAdapter)
               {
                  return valueList.containsAll(((SDObjectSetInstanceAdapter)valueAdapter).getValue());
               }
               return valueList.contains(valueAdapter.getValue());
            }
         }
         else
         {
            SDObjectSetInstanceAdapter instanceAdapter = (SDObjectSetInstanceAdapter) instance;

            if (!getFeature().isMany())
            {
               if (instanceAdapter.getValue().isEmpty())
               {
                  return false;
               }

               for (EObject object : instanceAdapter.getValue())
               {
                  if (object.eGet(getFeature()) != valueAdapter.getValue())
                  {
                     return false;
                  }
               }
               return true;
            }
            else
            {
               for (EObject object : instanceAdapter.getValue())
               {
                  if (((List<Object>) object.eGet(getFeature())).contains(valueAdapter.getValue()))
                  {
                     return false;
                  }
               }
               return true;
            }
         }
	   }

	}

	@Override
	public String getName()
	{
		return getFeature().getName();
	}

   @Override
   public IInstanceAdapter getPropertySetValue(IInstanceAdapter keyInstanceAdapter,
         SDEObjectInstanceAdapter instanceAdapter, SDPropertyAdapter targetProperty)
   {
      if(keyInstanceAdapter == null)
      {
         if (!getFeature().isMany())
         {
            return getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(instanceAdapter.getEObject().eGet(getFeature()), 
            getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(getFeature().getEType()));
         }
         else
         {
            return getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(((List<Object>) instanceAdapter.getEObject().eGet(getFeature())),
            getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(getFeature().getEType()));
         }
      }
      else
      {
         List<EObject> list = Collections.emptyList();
         @SuppressWarnings("unchecked")
         EMap<Object, Object> map = (EMap<Object, Object>) instanceAdapter.getEObject().eGet(eReference);
         if (map.containsKey((keyInstanceAdapter.getValue())))
         {

            list = (List<EObject>) map.get(keyInstanceAdapter.getValue());

         }
         else
         {
            return null;
         }

         return getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(list,
               getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(eReference.getEType()));
      }
   }

   @Override
   public int getTraversalCost(EObject instance)
   {
      if (!getFeature().isMany())
      {
         return 1;
      }
      else
      {
         return ((List<?>) instance.eGet(getFeature())).size();
      }
   }
}
