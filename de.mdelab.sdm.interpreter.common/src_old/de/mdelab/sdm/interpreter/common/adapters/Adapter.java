package de.mdelab.sdm.interpreter.common.adapters;

/**
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * @param <AF>
 *            The adapter factory that creates this adapter.
 */
public abstract class Adapter<AF extends AdapterFactory>
{
	private AF	adapterFactory;

	/**
	 * Creates a new adapter
	 * 
	 * @param adapterFactory
	 *            The adapter factory that created this adapter.
	 */
	protected Adapter(AF adapterFactory)
	{
		assert adapterFactory != null;

		this.adapterFactory = adapterFactory;
	}

	/**
	 * 
	 * @return The adapter factory that created this adapter.
	 */
	public AF getAdapterFactory()
	{
		return adapterFactory;
	}

	/**
	 * 
	 * @param adapterFactory
	 *            The adapter factory that created this adapter.
	 */
	public void setAdapterFactory(AF adapterFactory)
	{
		this.adapterFactory = adapterFactory;
	}
}
