package de.mdelab.sdm.interpreter.common.activity.adapters;

import de.mdelab.sdm.interpreter.common.SDMInterpreterAdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.AdapterFactory;

/**
 * Superclass of all adapter factories. Provides operations to get adapters for
 * specific purposes. Subclasses should make sure that the adapters are attached
 * to the elements they adapt and return that adapter instead of always creating
 * a new adapter for an element. So the adapter factory creates only one adapter
 * in total for each element.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * 
 */
public abstract class ActivityAdapterFactory extends AdapterFactory
{
	public ActivityAdapterFactory(SDMInterpreterAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);

		assert mainAdapterFactory != null;
	}

	/**
	 * Get an adapter for an activity.
	 * 
	 * @param activity
	 *            The activity to adapt.
	 * @return The activity's adapter.
	 */
	public abstract StoryActivityAdapter getStoryActivityAdapter(Object activity);

	/**
	 * Get an adapter for an activity node.
	 * 
	 * @param activityNode
	 *            The activity node to adapt.
	 * @return The activity node's adapter.
	 */
	public abstract ActivityNodeAdapter getActivityNodeAdapter(Object activityNode);
}
