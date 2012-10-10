package de.mdelab.sdm.interpreter.common.variables;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class Parameter
{
	private String	name;

	private Object	classifier;

	private Object	value;

	public Parameter(String name, Object classifier, Object value)
	{
		this.name = name;
		this.classifier = classifier;
		this.value = value;
	}

	public String getName()
	{
		return name;
	}

	public Object getClassifier()
	{
		return classifier;
	}

	public Object getValue()
	{
		return value;
	}
}
