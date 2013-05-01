package org.archimetrix.relevanceanalysis.components.strategies;

import metricvalues.MetricValuesModel;

import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;


/**
 * A super class for relevance strategies of the component relevance analysis.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
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
