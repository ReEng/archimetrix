package org.storydriven.modeling.interpreter.adapter.storypattern;

import org.eclipse.emf.common.notify.Notifier;
import org.storydriven.modeling.interpreter.adapter.SDAdapter;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

public class SDAbstractStoryPatternAdapter<ELEMENT_TYPE extends Notifier> extends SDAdapter<ELEMENT_TYPE>
{

	public SDAbstractStoryPatternAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public boolean isAdapterForType(Object type)
	{
		return type == getMainAdapterFactory().getStoryPatternAdapterFactory();
	}
}