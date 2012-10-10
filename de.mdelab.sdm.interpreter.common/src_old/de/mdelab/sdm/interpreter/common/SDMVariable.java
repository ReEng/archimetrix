package de.mdelab.sdm.interpreter.common;

import de.mdelab.sdm.interpreter.common.m3.adapters.ClassifierAdapter;

/**
 * Lightweight class to hold information of a variable, i.e. the variable's
 * name, classifier, and value.
 * 
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 * 
 * 
 */
public class SDMVariable
{
	private String					name;

	private ClassifierAdapter	classifierAdapter;

	private Object					value;

	/**
	 * Create a new variable.
	 * 
	 * @param name
	 *            The variable's name.
	 * @param classifierAdapter
	 *            An adapter that provides access to the variable's classifier.
	 * @param value
	 *            The variable's value.
	 */
	public SDMVariable(String name, ClassifierAdapter classifierAdapter, Object value)
	{
		assert name != null;
		assert !"".equals(name);
		assert classifierAdapter != null;

		this.name = name;
		this.classifierAdapter = classifierAdapter;
		this.value = value;
	}

	/**
	 * 
	 * @return The variable's name.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * 
	 * @return The adapter of the variable's classifier.
	 */
	public ClassifierAdapter getClassifierAdapter()
	{
		return classifierAdapter;
	}

	/**
	 * 
	 * @return The variable's value.
	 */
	public Object getValue()
	{
		return value;
	}
}
