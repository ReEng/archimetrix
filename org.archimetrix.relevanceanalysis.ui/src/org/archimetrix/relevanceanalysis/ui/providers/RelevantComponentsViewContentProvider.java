package org.archimetrix.relevanceanalysis.ui.providers;

import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.archimetrix.relevanceanalysis.ui.views.RelevantComponentsView;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;

/**
 * The content provider for the table in the Relevant Components View.
 * 
 * @author mcp
 * 
 */
public class RelevantComponentsViewContentProvider extends AbstractRelevanceAnalysisViewContentProvider {

    /**
     * Relevant components view.
     */
    private final RelevantComponentsView relevantComponentsView;

    /**
     * the constructor.
     * @param relevantComponentsView relevant components view
     */
    public RelevantComponentsViewContentProvider(final RelevantComponentsView relevantComponentsView) {
        this.relevantComponentsView = relevantComponentsView;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object[] getElements(final Object inputElement) {
        RelevanceResults<ComponentImplementingClassesLink> results = (RelevanceResults<ComponentImplementingClassesLink>) inputElement;
        this.relevantComponentsView.setRelevanceResults(results);
        Object[] elements = results.getRelevanceSubjects().toArray();

        return elements;
    }

}
