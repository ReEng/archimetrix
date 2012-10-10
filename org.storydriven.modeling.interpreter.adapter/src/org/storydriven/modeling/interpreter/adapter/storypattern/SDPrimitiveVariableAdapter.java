package org.storydriven.modeling.interpreter.adapter.storypattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.PrimitiveVariable;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IPropertyAssignmentAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkEndAdapter;

public class SDPrimitiveVariableAdapter extends SDAbstractVariableAdapter<PrimitiveVariable>
{
	private List<IStoryPatternLinkEndAdapter>	linkEndAdapters;

	public SDPrimitiveVariableAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public IClassifierAdapter getClassifierAdapter()
	{
		return getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(getElement().getClassifier());
	}

	@Override
	public List<IStoryPatternLinkEndAdapter> getLinkEndAdapters()
	{
		if (linkEndAdapters == null)
		{
			linkEndAdapters = new ArrayList<IStoryPatternLinkEndAdapter>();

			SDStoryPatternAdapterFactory storyPatternAdapterFactory = getMainAdapterFactory().getSDStoryPatternAdapterFactory();

			for (AbstractLinkVariable link : getElement().getIncomingLinks())
			{
				IStoryPatternLinkAdapter linkAdapter = storyPatternAdapterFactory.getStoryPatternLinkAdapter(link);

				for (IStoryPatternLinkEndAdapter linkEndAdapter : linkAdapter.getLinkEndAdapters())
				{
					if (linkEndAdapter.getStoryPatternObjectAdapter() == this)
					{
						linkEndAdapters.add(linkEndAdapter);
					}
				}
			}
		}

		return linkEndAdapters;
	}

	@Override
	public List<IPropertyAssignmentAdapter> getPropertyAssignmentAdapters()
	{
		return Collections.emptyList();
	}
	

   @Override
   public boolean isSet()
   {
      return false;
   }
   
   @Override
   public boolean isNegative()
   {
      return false;
   }
}
