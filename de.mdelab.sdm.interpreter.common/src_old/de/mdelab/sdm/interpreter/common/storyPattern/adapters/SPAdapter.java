package de.mdelab.sdm.interpreter.common.storyPattern.adapters;

public abstract class SPAdapter
{
	private StoryPatternAdapterFactory	adapterFactory;

	public SPAdapter(StoryPatternAdapterFactory adapterFactory)
	{
		assert adapterFactory != null;

		this.adapterFactory = adapterFactory;
	}

	protected StoryPatternAdapterFactory getAdapterFactory()
	{
		return adapterFactory;
	}
}
