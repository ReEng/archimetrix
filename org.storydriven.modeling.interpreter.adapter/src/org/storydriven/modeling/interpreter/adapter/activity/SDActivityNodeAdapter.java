package org.storydriven.modeling.interpreter.adapter.activity;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notifier;
import org.storydriven.modeling.activities.ActivityNode;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityNodeAdapter;
import de.mdelab.sdm.interpreter.common.adapters.activity.ISemaphoreAdapter;

public class SDActivityNodeAdapter<ELEMENT_TYPE extends ActivityNode> extends SDActivityAdapter<ELEMENT_TYPE> implements
		IActivityNodeAdapter
{
	private Map<ISemaphoreAdapter, Integer> semaphoreReleases;
	
	private Map<ISemaphoreAdapter, Integer> semaphoreAcquires;
	
	public SDActivityNodeAdapter(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);
	}

	@Override
	public Object getNodeType()
	{
		return getElement().eClass();
	}

	@Override
	public void setTarget(Notifier newTarget)
	{
		super.setTarget(newTarget);
		// TODO Semaphore
		
		semaphoreAcquires = new HashMap<ISemaphoreAdapter, Integer>();
		semaphoreReleases = new HashMap<ISemaphoreAdapter, Integer>();
		
//		for (ActivityEdge edge : getElement().getIncomings())
//		{
//			/*
//			 * Fill semaphore releases
//			 */
//			for (ReleaseSemaphoreEdge releaseEdge : edge.getReleaseEdges())
//			{
//				ISemaphoreAdapter semaphoreAdapter = getMainAdapterFactory().getSDActivityAdapterFactory().getSemaphoreAdapter(releaseEdge.getSemaphore());
//				
//				semaphoreReleases.put(semaphoreAdapter, releaseEdge.getWeight());
//			}
//
//			/*
//			 * Fill semaphore acquires
//			 */
//			for (AcquireSemaphoreEdge acquireEdge : edge.getAcquireEdges())
//			{
//				ISemaphoreAdapter semaphoreAdapter = null;
//				
//				semaphoreAcquires.put(semaphoreAdapter, acquireEdge.getWeight());
//			}
//		}
	}
	
	@Override
	public Map<ISemaphoreAdapter, Integer> getSemaphoreReleases()
	{
		return semaphoreReleases;
	}
	
	@Override
	public Map<ISemaphoreAdapter, Integer> getSemaphoreAcquires()
	{
		return semaphoreAcquires;
	}
	
   @Override
   public String getName()
   {
      return getElement().getName();
   }
}
