package org.storydriven.modeling.interpreter.adapter.storypattern;

import java.util.ArrayList;
import java.util.List;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.AbstractLinkVariable;
import org.storydriven.modeling.patterns.AttributeAssignment;
import org.storydriven.modeling.patterns.BindingSemantics;
import org.storydriven.modeling.patterns.ObjectSetVariable;
import org.storydriven.modeling.patterns.ObjectVariable;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IPropertyAssignmentAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkEndAdapter;

public class SDObjectVariableAdapter extends SDAbstractVariableAdapter<ObjectVariable>
{
	private List<IStoryPatternLinkEndAdapter>	linkEndAdapters;

	public SDObjectVariableAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public IClassifierAdapter getClassifierAdapter()
	{
		return getMainAdapterFactory().getM3AdapterFactory().getClassifierAdapter(getElement().getClassifier());
	}

	@Override
	public List<IPropertyAssignmentAdapter> getPropertyAssignmentAdapters()
	{
		List<IPropertyAssignmentAdapter> adapters = new ArrayList<IPropertyAssignmentAdapter>();

		for (AttributeAssignment aa : getElement().getAttributeAssignments())
		{
			adapters.add(getMainAdapterFactory().getSDStoryPatternAdapterFactory().getPropertyAssignmentAdapter(aa));
		}

		return adapters;
	}

	@Override
	public List<IStoryPatternLinkEndAdapter> getLinkEndAdapters()
	{
		if (linkEndAdapters == null)
		{
			linkEndAdapters = new ArrayList<IStoryPatternLinkEndAdapter>();

			SDStoryPatternAdapterFactory storyPatternAdapterFactory = getMainAdapterFactory().getSDStoryPatternAdapterFactory();

			for (AbstractLinkVariable link : getElement().getOutgoingLinks())
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
   public boolean isSet()
   {
      return getElement() instanceof ObjectSetVariable;
   }

   @Override
   public boolean isNegative()
   {
      return getElement().getBindingSemantics()==BindingSemantics.NEGATIVE;
   }
}
