package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.Map;

import org.eclipse.emf.ecore.EDataType;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyValueIterator;

public class SDPrimitiveInstanceAdapter implements SDInstanceAdapter
{
	private SDMainAdapterFactory	mainAdapterFactory;
	private Object					value;

	public SDPrimitiveInstanceAdapter(SDMainAdapterFactory mainAdapterFactory, Object value, EDataType eDataType)
	{
		assert mainAdapterFactory != null;

		this.mainAdapterFactory = mainAdapterFactory;
		this.value = value;
	}

	@Override
	public Object getValue()
	{
		return value;
	}

	@Override
	public void delete()
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public IClassifierAdapter getClassifierAdapter()
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void setPropertyValue(IPropertyAdapter propertyAdapter, IInstanceAdapter keyInstanceAdapter,IInstanceAdapter valueAdapter)
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean propertyContainsInstance(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter, IInstanceAdapter instanceAdapter,
			IPropertyAdapter targetPropertyAdapter)
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public int getPropertyCardinality(IPropertyAdapter ownedPropertyAdapter, IPropertyAdapter targetPropertyAdapter)
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public IPropertyValueIterator getPropertyTargetIterator(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter, IPropertyAdapter targetPropertyAdapter, Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties)
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void createAssociation(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter, Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds)
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void destroyAssociation(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter, Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds)
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

   @Override
   public IInstanceAdapter getPropertySetValue(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter, IInstanceAdapter instanceAdapter,
         IPropertyAdapter targetPropertyAdapter)
   {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException();
   }


}