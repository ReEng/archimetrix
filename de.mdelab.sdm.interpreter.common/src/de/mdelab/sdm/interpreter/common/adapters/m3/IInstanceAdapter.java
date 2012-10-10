package de.mdelab.sdm.interpreter.common.adapters.m3;

import java.util.Map;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IInstanceAdapter extends IM3Adapter
{
	public Object getValue();

	public IClassifierAdapter getClassifierAdapter();

	public void delete();

	public void setPropertyValue(IPropertyAdapter propertyAdapter, IInstanceAdapter keyInstanceAdapter, IInstanceAdapter valueAdapter);

	public boolean propertyContainsInstance(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter, IInstanceAdapter instanceAdapter,
			IPropertyAdapter targetPropertyAdapter);
	

	public int getPropertyCardinality(IPropertyAdapter ownedPropertyAdapter, IPropertyAdapter targetPropertyAdapter);

	public IPropertyValueIterator getPropertyTargetIterator(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter, IPropertyAdapter targetPropertyAdapter, Map<IPropertyAdapter, IInstanceAdapter> otherBoundProperties);
	
	public IInstanceAdapter getPropertySetValue(IPropertyAdapter ownedPropertyAdapter, IInstanceAdapter keyInstanceAdapter, IInstanceAdapter instanceAdapter, IPropertyAdapter targetPropertyAdapter);

	// public void addPropertyValue(IPropertyAdapter ownedPropertyAdapter,
	// IInstanceAdapter valueAdapter, IPropertyAdapter targetPropertyAdapter);
	//
	// public void removePropertyValue(IPropertyAdapter ownedPropertyAdapter,
	// IInstanceAdapter valueAdapter, IPropertyAdapter targetPropertyAdapter);

	public void createAssociation(IPropertyAdapter ownedPropertyAdapter,IInstanceAdapter keyInstanceAdapter,  Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds);

	public void destroyAssociation(IPropertyAdapter ownedPropertyAdapter,IInstanceAdapter keyInstanceAdapter,  Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds);
}
