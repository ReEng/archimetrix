package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;

public class SDEContainerPropertyAdapter extends SDAssociationEndAdapter
{
	private IClassifierAdapter	classifierAdapter;
	
	private boolean indirectContainment;

	public SDEContainerPropertyAdapter(SDMainAdapterFactory mainAdapterFactory, IClassifierAdapter classifierAdapter, boolean indirectContainment)
	{
		super(mainAdapterFactory);

		assert classifierAdapter != null;

		this.classifierAdapter = classifierAdapter;
		
		this.indirectContainment = indirectContainment;
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
	public SDPropertyValueIterator<SDEContainerPropertyAdapter> createPropertyTargetIterator(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
			SDPropertyAdapter targetProperty, Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties)
	{
		return new SDEContainerValueIterator(getMainAdapterFactory(), instanceAdapter, this, indirectContainment);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean containsValue(IInstanceAdapter keyInstanceAdapter, IInstanceAdapter instanceAdapter, SDInstanceAdapter valueAdapter,
			SDPropertyAdapter targetPropertyAdapter)
	{
		assert targetPropertyAdapter instanceof SDEReferenceAdapter;

		EObject eObject = (EObject) valueAdapter.getValue();
		EReference eReference = ((SDEReferenceAdapter) targetPropertyAdapter).getFeature();

		if (!eReference.isMany())
		{
			return eObject.eGet(eReference) == instanceAdapter.getValue();
		}
		else
		{
			return ((List<Object>) eObject.eGet(eReference)).contains(instanceAdapter.getValue());
		}
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
	public void setValue(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter, SDInstanceAdapter valueAdapter)
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	public boolean isIndirectContainment()
	{
		return indirectContainment;
	}

	@Override
	public String getName()
	{
		return "[eContainer()]";
	}

   @Override
   public IInstanceAdapter getPropertySetValue(IInstanceAdapter keyInstanceAdapter,
         SDEObjectInstanceAdapter instanceAdapter, SDPropertyAdapter targetProperty)
   {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException();
   }
}
