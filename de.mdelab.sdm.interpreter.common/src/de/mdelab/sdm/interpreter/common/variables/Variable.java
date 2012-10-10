package de.mdelab.sdm.interpreter.common.variables;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public class Variable
{
	private String				name;

	private IClassifierAdapter	classifierAdapter;

	private IInstanceAdapter	valueAdapter;

	public Variable(String name, IClassifierAdapter classifierAdapter, IInstanceAdapter valueAdapter)
	{
		assert name != null;
		assert !"".equals(name);
		assert classifierAdapter != null;

		this.name = name;
		this.classifierAdapter = classifierAdapter;
		this.valueAdapter = valueAdapter;
	}

	public String getName()
	{
		return name;
	}

	public IClassifierAdapter getClassifierAdapter()
	{
		return classifierAdapter;
	}

	public IInstanceAdapter getValueAdapter()
	{
		return valueAdapter;
	}
}
