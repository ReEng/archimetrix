package de.mdelab.sdm.interpreter.common;

import de.mdelab.sdm.interpreter.common.expressions.adapters.ExpressionAdapterFactory;
import de.mdelab.sdm.interpreter.common.m3.adapters.M3AdapterFactory;

public abstract class AdapterFactoryFactory
{
	public abstract ExpressionAdapterFactory getExpressionAdapterFactory();

	public abstract M3AdapterFactory getM3AdapterFactory();
}
