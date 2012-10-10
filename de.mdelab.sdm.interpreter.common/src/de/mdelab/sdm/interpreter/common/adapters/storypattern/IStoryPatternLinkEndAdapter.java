package de.mdelab.sdm.interpreter.common.adapters.storypattern;

import de.mdelab.sdm.interpreter.common.adapters.IAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IPropertyAdapter;
import de.mdelab.sdm.interpreter.common.variables.VariableScope;

/**
 * @author Stephan Hildebrandt
 * @author Sebastian Wätzoldt
 */
public interface IStoryPatternLinkEndAdapter extends IAdapter
{
	public IStoryPatternLinkAdapter getStoryPatternLinkAdapter();

	public IStoryPatternObjectAdapter getStoryPatternObjectAdapter();

	public IPropertyAdapter getPropertyAdapter();
	
	public IInstanceAdapter getInstanceAdapter(VariableScope variableScope);
	
	public IInstanceAdapter getKeyInstanceAdapter(VariableScope variableScope);
}
