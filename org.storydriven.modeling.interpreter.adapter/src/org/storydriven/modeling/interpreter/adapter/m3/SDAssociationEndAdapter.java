package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.Map;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;

public abstract class SDAssociationEndAdapter extends SDPropertyAdapter
{

	public SDAssociationEndAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	public abstract void createAssociation(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
			Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds);

	public abstract void destroyAssociation(IInstanceAdapter keyInstanceAdapter, SDEObjectInstanceAdapter instanceAdapter,
			Map<IPropertyAdapter, IInstanceAdapter> otherAssociationEnds);
	
   public boolean containsKeyValue(IInstanceAdapter instanceAdapter, SDInstanceAdapter keyInstanceAdapter,
         SDInstanceAdapter valueAdapter, SDPropertyAdapter targetPropertyAdapter)
   {
      return containsValue(keyInstanceAdapter, instanceAdapter, valueAdapter, targetPropertyAdapter);
   }
}
