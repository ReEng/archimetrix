package de.mdelab.sdm.interpreter.common.adapters.activity;

import java.util.Map;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IActivityNodeAdapter extends IActivityAdapter
{
	public Object getNodeType();
	
	public Map<ISemaphoreAdapter, Integer> getSemaphoreReleases();
	
	public Map<ISemaphoreAdapter, Integer> getSemaphoreAcquires();
}
