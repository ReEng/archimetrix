package org.archimetrix.relevanceanalysis.ui.views;

import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.archimetrix.relevanceanalysis.badsmells.util.RelevanceResultsStorage;
import org.archimetrix.relevanceanalysis.components.strategies.IComponentsStrategy;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;
import org.somox.sourcecodedecorator.impl.ComponentImplementingClassesLinkImpl;

public class RelevantComponentsSorter extends ViewerSorter {
    @Override
    public int compare(final Viewer viewer, final Object e1, final Object e2) {
        ComponentImplementingClassesLinkImpl c1 = (ComponentImplementingClassesLinkImpl) e1;
        ComponentImplementingClassesLinkImpl c2 = (ComponentImplementingClassesLinkImpl) e2;

        RelevanceResults<ComponentImplementingClassesLink> relevanceResults = RelevanceResultsStorage
                .retrieveRelevantComponents(c1.eResource());

        if (relevanceResults != null) {
            // The last elements in the arrays are the total relevance values.
            Double totalRelevanceC1 = relevanceResults.getRelevanceValues(c1)[IComponentsStrategy.NO_OF_RELEVANCE_STRATEGIES];
            Double totalRelevanceC2 = relevanceResults.getRelevanceValues(c2)[IComponentsStrategy.NO_OF_RELEVANCE_STRATEGIES];
            // Multiply comparison by -1 to ensure a reverse sorting order.
            return -1 * totalRelevanceC1.compareTo(totalRelevanceC2);
        }

        return 0;
    };
}
