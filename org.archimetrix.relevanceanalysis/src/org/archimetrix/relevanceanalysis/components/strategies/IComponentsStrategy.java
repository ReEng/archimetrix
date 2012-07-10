package org.archimetrix.relevanceanalysis.components.strategies;


import metricvalues.MetricValuesModel;
import eu.qimpress.sourcecodedecorator.ComponentImplementingClassesLink;

/**
 * The interface for relevance strategies of the component relevance analysis.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public interface IComponentsStrategy
{

   public double getRelevanceValue(ComponentImplementingClassesLink component, MetricValuesModel metricValuesModel);

}
