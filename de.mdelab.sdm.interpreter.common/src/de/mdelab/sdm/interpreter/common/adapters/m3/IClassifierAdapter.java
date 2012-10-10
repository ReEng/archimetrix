package de.mdelab.sdm.interpreter.common.adapters.m3;


/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IClassifierAdapter extends IM3Adapter
{
	public String getName();

	public Object getClassifier();

	/**
	 * Check whether value is an instance of this classifier.
	 * 
	 * @param value
	 * @return
	 */
	public boolean isInstance(IInstanceAdapter value);
}
