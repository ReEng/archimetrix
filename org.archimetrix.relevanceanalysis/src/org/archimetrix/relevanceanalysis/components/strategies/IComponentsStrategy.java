package org.archimetrix.relevanceanalysis.components.strategies;

import metricvalues.MetricValuesModel;

import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;

/**
 * The interface for relevance strategies of the component relevance analysis.
 * 
 * @author mcp
 * 
 */
public interface IComponentsStrategy {
    /**
     * Number of relevance strategies.
     */
    int NO_OF_RELEVANCE_STRATEGIES = 2;

    /**
     * Returns relevance value.
     * @param component component implementing classes link
     * @param metricValuesModel metric values model
     * @return relevance value
     */
    public double getRelevanceValue(ComponentImplementingClassesLink component, MetricValuesModel metricValuesModel);

}
