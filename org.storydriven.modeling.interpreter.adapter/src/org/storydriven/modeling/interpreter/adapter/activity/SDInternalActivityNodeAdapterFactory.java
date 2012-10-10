package org.storydriven.modeling.interpreter.adapter.activity;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.storydriven.modeling.activities.ModifyingStoryNode;
import org.storydriven.modeling.activities.StoryNode;
import org.storydriven.modeling.activities.util.ActivitiesAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

public class SDInternalActivityNodeAdapterFactory extends ActivitiesAdapterFactory 
{
	private SDMainAdapterFactory	mainAdapterFactory;

	public SDInternalActivityNodeAdapterFactory(SDMainAdapterFactory mainAdapterFactory)
	{
		assert mainAdapterFactory != null;

		this.mainAdapterFactory = mainAdapterFactory;
	}

	@Override
	protected Adapter createAdapter(Notifier target, Object type)
	{
		if (target instanceof StoryNode)
		{
			if (((StoryNode) target).isForEach())
			{
				if(target instanceof ModifyingStoryNode)
					return createForEachModifyingStoryNodeAdapter();
				else // target is instance of MatchingStoryNode
					return createForEachMatchingStoryNodeAdapter();
			}
			else
			{
				if(target instanceof ModifyingStoryNode)
					return createSingleModifyingStoryNodeAdapter();
				else // target is instance of MatchingStoryNode
					return createSingleMatchingStoryNodeAdapter();
			}
		}
		else
		{
			return super.createAdapter(target, type);
		}
	}

	public Adapter createSingleMatchingStoryNodeAdapter() 
	{
		return new SDSingleMatchingStoryNodeAdapter(mainAdapterFactory);
	}

	public Adapter createSingleModifyingStoryNodeAdapter() 
	{
		return new SDSingleModifyingStoryNodeAdapter(mainAdapterFactory);
	}

	public Adapter createForEachMatchingStoryNodeAdapter() 
	{
		return new SDForEachMatchingStoryNodeAdapter(mainAdapterFactory);
	}

	public Adapter createForEachModifyingStoryNodeAdapter() 
	{
		return new SDForEachModifyingStoryNodeAdapter(mainAdapterFactory);
	}

	@Override
	public Adapter createStartNodeAdapter ()
	{
		return new SDStartNodeAdapter(mainAdapterFactory);
	}

	@Override
	public Adapter createStopNodeAdapter()
	{
		return new SDStopNodeAdapter(mainAdapterFactory);
	}
	
	@Override
	public Adapter createJunctionNodeAdapter()
	{
		return new SDJunctionNodeAdapter(mainAdapterFactory);
	}
	

	@Override
	public Adapter createStatementNodeAdapter()
	{
		return new SDStatementNodeAdapter(mainAdapterFactory);
	}

	@Override
	public Adapter createStoryNodeAdapter()
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public Adapter createMatchingStoryNodeAdapter ()
	{
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Adapter createModifyingStoryNodeAdapter ()
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public Adapter createActivityEdgeAdapter() 
	{
		// TODO Auto-generated method stub
		return super.createActivityEdgeAdapter();
	}

	@Override
	public Adapter createStructuredNodeAdapter() 
	{
		return new SDStructuredNodeAdapter(mainAdapterFactory);
	}

	@Override
	public Adapter createOperationExtensionAdapter() 
	{
		// TODO Auto-generated method stub
		return super.createOperationExtensionAdapter();
	}

	@Override
	public Adapter createActivityCallNodeAdapter() 
	{
		return new SDActivityCallNodeAdapter(mainAdapterFactory);
	}

	
//	
//	@Override
//	public Adapter createSemaphoreAdapter()
//	{
//		return new SDSemaphoreAdapter(mainAdapterFactory);
//	}

}
