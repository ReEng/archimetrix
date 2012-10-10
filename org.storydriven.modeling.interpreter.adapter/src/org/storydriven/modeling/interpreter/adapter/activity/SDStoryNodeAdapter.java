package org.storydriven.modeling.interpreter.adapter.activity;

import org.storydriven.modeling.activities.ActivityEdge;
import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.activities.EdgeGuard;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IStoryNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapter;

public abstract class SDStoryNodeAdapter extends SDActivityNodeAdapter<StoryNode> implements IStoryNodeAdapter
{
	private IActivityNodeAdapter	cachedSuccessAdapter;
	private IActivityNodeAdapter	cachedFailureAdapter;

	public SDStoryNodeAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public IActivityNodeAdapter getNextNodeAdapterForSuccess()
	{
		if (cachedSuccessAdapter == null)
		{
			initializeCache();
		}

		return cachedSuccessAdapter;
	}

	@Override
	public IActivityNodeAdapter getNextNodeAdapterForFailure()
	{
		if (cachedFailureAdapter == null)
		{
			initializeCache();
		}

		return cachedFailureAdapter;
	}

	@Override
	public IStoryPatternAdapter getStoryPatternAdapter()
	{
		return getMainAdapterFactory().getSDStoryPatternAdapterFactory().getStoryPatternAdapter(getElement().getStoryPattern());
	}

	private void initializeCache()
	{
		assert getElement().getOutgoings().size() == 1 || getElement().getOutgoings().size() == 2;

		SDActivityAdapterFactory activityAdapterFactory = getMainAdapterFactory().getSDActivityAdapterFactory();
		for (ActivityEdge edge : getElement().getOutgoings())
		{
			if (getElement().isForEach())
			{
				assert edge.getGuard() == EdgeGuard.EACH_TIME
						|| edge.getGuard() == EdgeGuard.END;

				if (edge.getGuard() == EdgeGuard.EACH_TIME)
				{
					cachedSuccessAdapter = activityAdapterFactory.getActivityNodeAdapter(edge.getTarget());
				}
				else
				{
					cachedFailureAdapter = activityAdapterFactory.getActivityNodeAdapter(edge.getTarget());
				}
			}
			else
			{
				assert edge.getGuard() == EdgeGuard.SUCCESS
						|| edge.getGuard() == EdgeGuard.FAILURE
						|| edge.getGuard() == EdgeGuard.NONE;

				if (edge.getGuard() == EdgeGuard.NONE)
				{
					cachedSuccessAdapter = activityAdapterFactory.getActivityNodeAdapter(edge.getTarget());
					cachedFailureAdapter = cachedSuccessAdapter;
				}
				else if (edge.getGuard() == EdgeGuard.SUCCESS)
				{
					cachedSuccessAdapter = activityAdapterFactory.getActivityNodeAdapter(edge.getTarget());
				}
				else
				{
					cachedFailureAdapter = activityAdapterFactory.getActivityNodeAdapter(edge.getTarget());
				}
			}
		}
	}
}