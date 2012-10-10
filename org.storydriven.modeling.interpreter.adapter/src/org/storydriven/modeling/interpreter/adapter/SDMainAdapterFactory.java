package org.storydriven.modeling.interpreter.adapter;


import org.storydriven.modeling.interpreter.adapter.activity.SDActivityAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.expressions.SDExpressionsAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.m3.SDM3AdapterFactory;
import org.storydriven.modeling.interpreter.adapter.storypattern.SDStoryPatternAdapterFactory;

import de.mdelab.sdm.interpreter.common.adapters.IMainAdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.activity.IActivityAdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.expressions.IExpressionsAdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.m3.IM3AdapterFactory;
import de.mdelab.sdm.interpreter.common.adapters.storypattern.IStoryPatternAdapterFactory;


public class SDMainAdapterFactory implements IMainAdapterFactory 
{
	protected SDStoryPatternAdapterFactory 	storyPatternAdapterFactory;
	protected SDActivityAdapterFactory		activityAdapterFactory;
	protected SDExpressionsAdapterFactory expressionsAdapterFactory;
	protected SDM3AdapterFactory m3AdapterFactory;
	
	public SDMainAdapterFactory() 
	{
		this.storyPatternAdapterFactory = new SDStoryPatternAdapterFactory(this);
		this.activityAdapterFactory = new SDActivityAdapterFactory(this);
		this.expressionsAdapterFactory = new SDExpressionsAdapterFactory(this);
		this.m3AdapterFactory = new SDM3AdapterFactory(this);
	}

	@Override
	public IStoryPatternAdapterFactory getStoryPatternAdapterFactory()
	{
		return getSDStoryPatternAdapterFactory();
	}

	public SDStoryPatternAdapterFactory getSDStoryPatternAdapterFactory()
	{
		return storyPatternAdapterFactory;
	}



	@Override
	public IActivityAdapterFactory getActivityAdapterFactory()
	{
		return getSDActivityAdapterFactory();
	}

	public SDActivityAdapterFactory getSDActivityAdapterFactory()
	{
		return activityAdapterFactory;
	}

	@Override
	public IM3AdapterFactory getM3AdapterFactory()
	{
		return getSDM3AdapterFactory();
	}

	public SDM3AdapterFactory getSDM3AdapterFactory()
	{
		return m3AdapterFactory;
	}

	@Override
	public IExpressionsAdapterFactory getExpressionsAdapterFactory()
	{
		return getSDExpressionsAdapterFactory();
	}

	public SDExpressionsAdapterFactory getSDExpressionsAdapterFactory()
	{
		return expressionsAdapterFactory;
	}
}
