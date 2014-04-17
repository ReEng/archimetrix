package org.archimetrix.relevanceanalysis.components.strategies;

import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;

/**
 * A super class for result strategies of the component relevance analysis.
 * 
 * @author mcp
 * 
 */
public abstract class ComponentsResultStrategy implements IComponentsStrategy {

    /**
     * Relevance results.
     */
    protected RelevanceResults<ComponentImplementingClassesLink> relevanceResults;

    /**
     * Sets the relevance results.
     * @param relevanceResults relevance results
     */
    public void setRelevanceResults(RelevanceResults<ComponentImplementingClassesLink> relevanceResults) {
        this.relevanceResults = relevanceResults;
    }
}
