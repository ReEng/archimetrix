package org.storydriven.modeling.interpreter.adapter.activity;

import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.interpreter.adapter.SDAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityAdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.activity.IStoryActivityAdapter;


public class SDActivityAdapterFactory extends SDAdapterFactory implements IActivityAdapterFactory
{
	private SDInternalActivityAdapterFactory		internalActivityAdapterFactory;
	private SDInternalActivityNodeAdapterFactory	internalActivityNodeAdapterFactory;

	public SDActivityAdapterFactory(SDMainAdapterFactory mainAdapterFactory) {
		super(mainAdapterFactory);

		internalActivityAdapterFactory = new SDInternalActivityAdapterFactory(mainAdapterFactory);
		internalActivityNodeAdapterFactory = new SDInternalActivityNodeAdapterFactory(mainAdapterFactory);
	}

	@Override
	public IStoryActivityAdapter getStoryActivityAdapter(Object storyActivity) 
	{
		assert storyActivity instanceof Activity;

		synchronized (storyActivity)
		{
			return (IStoryActivityAdapter) internalActivityAdapterFactory.adapt((Activity) storyActivity, this);
		}

	}

	@SuppressWarnings("unchecked")
	public SDActivityNodeAdapter<? extends ActivityNode> getActivityNodeAdapter(Object activityNode)
	{
		assert activityNode instanceof ActivityNode;

		synchronized (activityNode)
		{
			return (SDActivityNodeAdapter<? extends ActivityNode>) internalActivityNodeAdapterFactory.adapt((ActivityNode) activityNode,
					this);
		}
	}

//	public SDSemaphoreAdapter getSemaphoreAdapter(Semaphore semaphore)
//	{
//			return (SDSemaphoreAdapter) internalActivityNodeAdapterFactory.adapt(semaphore, this);
//	}
}
