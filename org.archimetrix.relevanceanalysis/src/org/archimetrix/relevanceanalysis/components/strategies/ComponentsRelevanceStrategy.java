package org.archimetrix.relevanceanalysis.components.strategies;

import metricvalues.MetricValuesModel;

import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;


/**
 * A super class for relevance strategies of the component relevance analysis.
 * 
 * @author mcp
 * 
 */
public abstract class ComponentsRelevanceStrategy implements IComponentsStrategy
{

	public double getRelevanceValue(ComponentImplementingClassesLink component,
			MetricValuesModel metricValuesModel) {
		// TODO Auto-generated method stub
		return 0;
	}

}
