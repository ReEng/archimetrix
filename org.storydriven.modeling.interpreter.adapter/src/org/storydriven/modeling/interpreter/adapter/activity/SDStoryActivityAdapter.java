package org.storydriven.modeling.interpreter.adapter.activity;

import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.activities.StartNode;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.SDMInterpreterException;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.IStoryActivityAdapter;

public class SDStoryActivityAdapter extends SDActivityAdapter<Activity> implements IStoryActivityAdapter
{

	public SDStoryActivityAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public String getName()
	{
		if (getElement().getOwningOperation() != null)
		{
			return (getElement()).getOwningOperation().getOperation().getName();
		}
		else if (getElement().getComment() != null && !"".equals(getElement().getComment()))
		{
			return getElement().getComment();
		}
		else
		{
			return getElement().toString();
		}
	}

	@Override
	public IActivityNodeAdapter getInitialNodeAdapter() throws SDMInterpreterException
	{
		for (ActivityNode node : getElement().getOwnedActivityNodes())
		{
			if (node instanceof StartNode)
			{
				return getMainAdapterFactory().getSDActivityAdapterFactory().getActivityNodeAdapter(node);
			}
		}

		throw new SDMInterpreterException("Activity '" + getName() + "' does not contain an initial node.");

	}

}
