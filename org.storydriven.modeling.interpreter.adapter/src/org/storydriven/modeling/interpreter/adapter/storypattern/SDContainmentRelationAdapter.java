package org.storydriven.modeling.interpreter.adapter.storypattern;

import java.util.List;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.m3.SDClassifierAdapter;
import org.storydriven.modeling.interpreter.adapter.m3.SDPropertyAdapter;
import org.storydriven.modeling.patterns.ContainmentRelation;

import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkEndAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternObjectAdapter;

public class SDContainmentRelationAdapter extends SDAbstractLinkVariableAdapter<ContainmentRelation>
{

	private List<IStoryPatternLinkEndAdapter>	linkEndAdapters;
	
	public SDContainmentRelationAdapter(SDMainAdapterFactory mainAdapterFactory) 
	{
		super(mainAdapterFactory);
	}


	@Override
	public List<IStoryPatternLinkEndAdapter> getLinkEndAdapters() 
	{
		if (linkEndAdapters == null)
		{
			SDStoryPatternAdapterFactory storyPatternAdapterFactory = getMainAdapterFactory().getSDStoryPatternAdapterFactory();
			
			IStoryPatternObjectAdapter sourceSPOAdapter = storyPatternAdapterFactory.getStoryPatternObjectAdapter(getElement().getSource());
			IStoryPatternObjectAdapter targetSPOAdapter = storyPatternAdapterFactory.getStoryPatternObjectAdapter(getElement().getTarget());

			SDClassifierAdapter sourceClassifierAdapter = (SDClassifierAdapter)getMainAdapterFactory().getSDM3AdapterFactory().getClassifierAdapter(
					getElement().getSource().getClassifier());
	
			SDPropertyAdapter targetPropertyAdapter = (SDPropertyAdapter) getMainAdapterFactory().getSDM3AdapterFactory()
				.getContainmentPropertyAdapter(sourceClassifierAdapter);

			SDStoryPatternLinkEndAdapter targetLinkEndAdapter = storyPatternAdapterFactory.getStoryPatternLinkEndAdapter(getElement(),
					targetSPOAdapter, targetPropertyAdapter);
	
			linkEndAdapters.add(targetLinkEndAdapter);
			
			SDPropertyAdapter sourcePropertyAdapter = (SDPropertyAdapter) getMainAdapterFactory().getSDM3AdapterFactory().getEStructuralFeaturePropertyAdapter(getElement().getSource().eContainmentFeature());

			SDStoryPatternLinkEndAdapter sourceLinkEndAdapter = storyPatternAdapterFactory.getStoryPatternLinkEndAdapter(getElement(),
					sourceSPOAdapter, sourcePropertyAdapter);
			
			linkEndAdapters.add(sourceLinkEndAdapter);
			
		}
		
		return linkEndAdapters;
	}

}
