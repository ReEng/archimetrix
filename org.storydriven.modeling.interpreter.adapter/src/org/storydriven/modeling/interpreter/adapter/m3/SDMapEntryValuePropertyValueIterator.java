package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;

public class SDMapEntryValuePropertyValueIterator extends SDPropertyValueIterator<SDMapEntryReferencePropertyAdapter>
{
	private Iterator<Entry<Object, Object>>	featureIterator;
	
	private Iterator<Object> internalIterator, boundKeyIterator;
	
	private Object boundKeyValue;
	
	private Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties;

	public SDMapEntryValuePropertyValueIterator(SDMainAdapterFactory mainAdapterFactory, SDEObjectInstanceAdapter instanceAdapter,
			SDMapEntryReferencePropertyAdapter propertyAdapter, Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties)
	{
		super(mainAdapterFactory, instanceAdapter, propertyAdapter);
		
		assert otherBoundProperties != null;
		
		this.otherBoundProperties = otherBoundProperties;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IInstanceAdapter getNext()
	{
		if (featureIterator == null)
		{
			featureIterator = ((EMap<Object, Object>) getInstanceAdapter().getEObject().eGet(getPropertyAdapter().geteReference()))
					.iterator();
			
		}

		if(getPropertyAdapter().geteReference().getUpperBound() == -1)
      {
         //n-ary, so we have list of values, not only one
         // we need the internal iterator
		   if(internalIterator == null || !internalIterator.hasNext())
		   {
		      while(featureIterator.hasNext() && (internalIterator == null || !internalIterator.hasNext()))
		      {
		         Collection<Object> collection = (Collection<Object>)featureIterator.next().getValue();
		         internalIterator = collection.iterator();
		      }
		      
		      if(!featureIterator.hasNext() 
		            && !internalIterator.hasNext())
		      {
		         // all elements returned
		         return null;
		      }
		   }
		   
		   return getNextN_aryValue();
      }
		else
		{
		   if (featureIterator.hasNext())
	      {
	         return getNextUnaryValue();
	      }
	      else
	      {
	         /*
	          * All possible values have already been returned.
	          */
	         return null;
	      }  
		}
	}

   private IInstanceAdapter getNextN_aryValue()
   {
      EClass mapEntryEClass = (EClass) getPropertyAdapter().geteReference().getEType();

      EClassifier valueClassifier = mapEntryEClass.getEStructuralFeature("value").getEType();

      /*
       * Check if the key is already bound to an instance object.
       */
      IInstanceAdapter boundKeyInstanceAdapter = otherBoundProperties.get(getPropertyAdapter().getKeyPropertyAdapter());

      if (boundKeyInstanceAdapter == null)
      {
         /*
          * There is no bound key. Return the next value of the map.
          */
         return getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(internalIterator.next(),
               getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(valueClassifier));
      }
      else
      {
         /*
          * The key is already bound. Query the map for the value that
          * belongs to this key
          */
         EMap<Object, Object> map = ((EMap<Object, Object>) getInstanceAdapter().getEObject().eGet(
               getPropertyAdapter().geteReference()));

         Object valueObject = map.get(boundKeyInstanceAdapter.getValue());
         if(boundKeyValue != valueObject && valueObject != null)
         {
            boundKeyIterator = ((Collection<Object>)valueObject).iterator();
         }

         if (valueObject != null && boundKeyIterator.hasNext())
         {
            return getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(boundKeyIterator.next(),
                  getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(valueClassifier));
         }
         else
         {
            /*
             * There is no value for this key.
             */
            return null;
         }
      }
   }

   private IInstanceAdapter getNextUnaryValue()
   {
      EClass mapEntryEClass = (EClass) getPropertyAdapter().geteReference().getEType();

      EClassifier valueClassifier = mapEntryEClass.getEStructuralFeature("value").getEType();

      /*
       * Check if the key is already bound to an instance object.
       */
      IInstanceAdapter boundKeyInstanceAdapter = otherBoundProperties.get(getPropertyAdapter().getKeyPropertyAdapter());

      if (boundKeyInstanceAdapter == null)
      {
      	/*
      	 * There is no bound key. Return the next value of the map.
      	 */
      	return getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(featureIterator.next().getValue(),
      			getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(valueClassifier));
      }
      else
      {
      	/*
      	 * The key is already bound. Query the map for the value that
      	 * belongs to this key
      	 */
      	EMap<Object, Object> map = ((EMap<Object, Object>) getInstanceAdapter().getEObject().eGet(
      			getPropertyAdapter().geteReference()));

      	Object valueObject = map.get(boundKeyInstanceAdapter.getValue());

      	if (valueObject != null)
      	{
      		return getMainAdapterFactory().getM3AdapterFactory().getInstanceAdapter(valueObject,
      				getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(valueClassifier));
      	}
      	else
      	{
      		/*
      		 * There is no value for this key.
      		 */
      		return null;
      	}
      }
   }

}
