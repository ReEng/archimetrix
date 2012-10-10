package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.Map;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;

public class SDNonNavigablePropertyAdapter extends SDAssociationEndAdapter
{
	private IClassifierAdapter	classifierAdapter;

	public SDNonNavigablePropertyAdapter(SDMainAdapterFactory mainAdapterFactory, IClassifierAdapter classifierAdapter)
	{
		super(mainAdapterFactory);

		this.classifierAdapter = classifierAdapter;
	}

	@Override
	public boolean isNavigable()
	{
		return false;
	}

	@Override
	public IClassifierAdapter getClassifierAdapter()
	{
		return classifierAdapter;
	}

	@Override
	public void createAssociation(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter, Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds)
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void destroyAssociation(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter, Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds)
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public SDPropertyValueIterator<? extends SDPropertyAdapter> createPropertyTargetIterator(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
			SDPropertyAdapter targetProperty, Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties)
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
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
		assert valueAdapter instanceof SDEObjectInstanceAdapter;

		return targetPropertyAdapter.containsValue(keyInstanceAdapter, valueAdapter, (SDInstanceAdapter) instanceAdapter, targetPropertyAdapter);
	}

	@Override
	public String getName()
	{
		return "[not navigable]";
	}

   @Override
   public IInstanceAdapter getPropertySetValue(IInstanceAdapter keyInstanceAdapter,
         SDEObjectInstanceAdapter instanceAdapter, SDPropertyAdapter targetProperty)
   {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException();
   }
}
