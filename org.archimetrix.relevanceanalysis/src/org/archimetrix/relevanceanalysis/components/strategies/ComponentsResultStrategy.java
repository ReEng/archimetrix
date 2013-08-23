package org.archimetrix.relevanceanalysis.components.strategies;

import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;

/**
 * A super class for result strategies of the component relevance analysis.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public abstract class ComponentsResultStrategy implements IComponentsStrategy {

    protected RelevanceResults<ComponentImplementingClassesLink> relevanceResults;

    public void setRelevanceResults(RelevanceResults<ComponentImplementingClassesLink> relevanceResults) {
        this.relevanceResults = relevanceResults;
    }
}
