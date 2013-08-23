package org.archimetrix.relevanceanalysis.components.strategies;

import metricvalues.MetricValuesModel;

import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;

/**
 * The interface for relevance strategies of the component relevance analysis.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public interface IComponentsStrategy {
    public static final int NO_OF_RELEVANCE_STRATEGIES = 2;

    public double getRelevanceValue(ComponentImplementingClassesLink component, MetricValuesModel metricValuesModel);

}
