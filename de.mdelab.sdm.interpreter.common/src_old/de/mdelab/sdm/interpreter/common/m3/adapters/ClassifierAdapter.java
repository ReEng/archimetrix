package de.mdelab.sdm.interpreter.common.m3.adapters;


/**
 * Superclass of all adapters of classifiers. Provides operations to access the
 * name and classifier.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * 
 */
public abstract class ClassifierAdapter extends M3Adapter
{
	protected ClassifierAdapter(M3AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * 
	 * @return The classifier.
	 */
	public abstract Object getClassifier();

	/**
	 * 
	 * @return The name of the classifier.
	 */
	public abstract String getName();
}
