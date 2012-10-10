package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;

public class SDEAttributeAdapter extends SDPropertyAdapter implements SDEStructuralFeaturePropertyAdapter<EAttribute>
{
	private EAttribute	eAttribute;

	public SDEAttributeAdapter(SDMainAdapterFactory mainAdapterFactory, EAttribute eAttribute)
	{
		super(mainAdapterFactory);

		assert eAttribute != null;

		this.eAttribute = eAttribute;
	}

	@Override
	public boolean isNavigable()
	{
		return true;
	}

	@Override
	public EAttribute getFeature()
	{
		return eAttribute;
	}

	@Override
	public IClassifierAdapter getClassifierAdapter()
	{
		return getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(getFeature().getEContainingClass());
	}

	@Override
   public SDPropertyValueIterator<SDEAttributeAdapter> createPropertyTargetIterator(
         IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
         SDPropertyAdapter targetProperty, Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties)
	{
		return new SDEAttributeValueIterator(getMainAdapterFactory(), instanceAdapter, this);
	}

	@Override
   public void setValue(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
         SDInstanceAdapter valueAdapter)
	{
		instanceAdapter.getEObject().eSet(getFeature(), valueAdapter.getValue());
	}

	@SuppressWarnings("unchecked")
	@Override
   public boolean containsValue(IInstanceAdapter keyInstanceAdapter, IInstanceAdapter instanceAdapter,
         SDInstanceAdapter valueAdapter, SDPropertyAdapter targetPropertyAdapter)
	{
	   if(instanceAdapter instanceof SDEObjectInstanceAdapter)
	   {
	      EObject object = ((SDEObjectInstanceAdapter) instanceAdapter).getEObject();
	      return singleContainsValue(valueAdapter, object);
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
	         if(!singleContainsValue(valueAdapter, object))
	         {
	            return false;
	         }
	      }
	      
	      return true;
	   }
	}

   private boolean singleContainsValue(SDInstanceAdapter valueAdapter, EObject object)
   {
      if (!getFeature().isMany())
		{
			return object.eGet(getFeature()) == valueAdapter.getValue();
		}
		else
		{
			return ((List<Object>) object.eGet(getFeature())).contains(valueAdapter.getValue());
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
