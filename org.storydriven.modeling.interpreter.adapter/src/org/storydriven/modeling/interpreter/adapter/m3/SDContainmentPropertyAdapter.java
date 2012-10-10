package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.Map;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;

public class SDContainmentPropertyAdapter  extends SDAssociationEndAdapter
{
	private SDClassifierAdapter classifierAdapter;
	
	public SDContainmentPropertyAdapter(SDMainAdapterFactory mainAdapterFactory, SDClassifierAdapter classifierAdapter)
	{
		super(mainAdapterFactory);
		
		assert classifierAdapter != null;
		
		this.classifierAdapter = classifierAdapter;
	}

	@Override
	public boolean isNavigable()
	{
		return true;
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
		return new SDContainmentPropertyValueIterator(getMainAdapterFactory(), instanceAdapter, this);
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
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public String getName()
	{
		return "[eContainment()]";
	}

   @Override
   public IInstanceAdapter getPropertySetValue(IInstanceAdapter keyInstanceAdapter,
         SDEObjectInstanceAdapter instanceAdapter, SDPropertyAdapter targetProperty)
   {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException();
   }
}
