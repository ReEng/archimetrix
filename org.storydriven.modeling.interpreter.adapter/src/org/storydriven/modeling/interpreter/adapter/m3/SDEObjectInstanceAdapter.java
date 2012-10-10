package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyValueIterator;

public class SDEObjectInstanceAdapter extends SDM3Adapter<EObject> implements SDInstanceAdapter
{
	public SDEObjectInstanceAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public Object getValue()
	{
		return getElement();
	}
	
	public EObject getEObject()
	{
		return getElement();
	}

	@Override
	public void delete()
	{
		EcoreUtil.delete(getElement(), true);
	}

	@Override
	public IClassifierAdapter getClassifierAdapter()
	{
	   return getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(getElement().eClass());
	}

	@Override
	public void setPropertyValue(IPropertyAdapter propertyAdapter, IInstanceAdapter keyInstanceAdapter, IInstanceAdapter valueAdapter)
	{
		assert propertyAdapter instanceof SDPropertyAdapter;
		assert valueAdapter instanceof SDInstanceAdapter;

		((SDPropertyAdapter) propertyAdapter).setValue(keyInstanceAdapter, this, (SDInstanceAdapter) valueAdapter);
	}

	@Override
	public boolean propertyContainsInstance(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter, IInstanceAdapter instanceAdapter,
			IPropertyAdapter targetPropertyAdapter)
	{
		assert ownedPropertyAdapter instanceof SDPropertyAdapter;
		assert instanceAdapter instanceof SDInstanceAdapter;
		assert targetPropertyAdapter instanceof SDPropertyAdapter;

		return ((SDPropertyAdapter) ownedPropertyAdapter).containsValue(keyInstanceAdapter, this, (SDInstanceAdapter) instanceAdapter,
				(SDPropertyAdapter) targetPropertyAdapter);
	}

	@Override
	public int getPropertyCardinality(IPropertyAdapter ownedPropertyAdapter, IPropertyAdapter targetPropertyAdapter)
	{
		assert ownedPropertyAdapter instanceof SDPropertyAdapter;

		return getMainAdapterFactory().getSDM3AdapterFactory().getTraversalCostCalculator()
				.calculateTraversalCost(getElement(), ownedPropertyAdapter, targetPropertyAdapter);
	}

	@Override
	public IPropertyValueIterator getPropertyTargetIterator(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter, IPropertyAdapter targetPropertyAdapter, Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties)
	{
		assert ownedPropertyAdapter instanceof SDPropertyAdapter;
		assert targetPropertyAdapter instanceof SDPropertyAdapter;

		return ((SDPropertyAdapter) ownedPropertyAdapter).createPropertyTargetIterator(keyInstanceAdapter, this, 
				(SDPropertyAdapter) targetPropertyAdapter, otherBoundProperties);
	}

	@Override
	public void createAssociation(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter,Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds)
	{
		assert ownedPropertyAdapter instanceof SDAssociationEndAdapter;

		((SDAssociationEndAdapter) ownedPropertyAdapter).createAssociation(keyInstanceAdapter, this, otherAssociationEnds);
	}

	@Override
	public void destroyAssociation(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter,Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds)
	{
		assert ownedPropertyAdapter instanceof SDAssociationEndAdapter;

		((SDAssociationEndAdapter) ownedPropertyAdapter).destroyAssociation(keyInstanceAdapter, this, otherAssociationEnds);
	}

	@Override
   public IInstanceAdapter getPropertySetValue(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter, IInstanceAdapter instanceAdapter,
         IPropertyAdapter targetPropertyAdapter)
   {
      assert ownedPropertyAdapter instanceof SDPropertyAdapter;
      assert targetPropertyAdapter instanceof SDPropertyAdapter;
      assert instanceAdapter instanceof SDEObjectInstanceAdapter;

      return ((SDPropertyAdapter) ownedPropertyAdapter).getPropertySetValue(keyInstanceAdapter,
            (SDEObjectInstanceAdapter) instanceAdapter, (SDPropertyAdapter) targetPropertyAdapter);
   }
}
