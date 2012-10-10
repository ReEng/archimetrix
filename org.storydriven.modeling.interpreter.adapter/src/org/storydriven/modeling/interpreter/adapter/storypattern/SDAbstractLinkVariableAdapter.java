package org.storydriven.modeling.interpreter.adapter.storypattern;

import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.AbstractLinkVariable;

import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternLinkAdapter;

public abstract class SDAbstractLinkVariableAdapter<ELEMENT_TYPE extends AbstractLinkVariable> extends
		SDAbstractStoryPatternAdapter<ELEMENT_TYPE> implements IStoryPatternLinkAdapter
{

	public SDAbstractLinkVariableAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}
}