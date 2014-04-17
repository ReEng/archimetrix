package org.archimetrix.relevanceanalysis.ui.providers;

import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.archimetrix.relevanceanalysis.ui.views.RelevantBadSmellsView;
import org.reclipse.structure.inference.annotations.ASGAnnotation;

/**
 * The content provider for the table in the Relevant Bad Smells View.
 * 
 * @author mcp
 * 
 */
public class RelevantBadSmellsViewContentProvider extends AbstractRelevanceAnalysisViewContentProvider {
    /**
     * relevance bad smell view.
     */
    private final RelevantBadSmellsView relevantBadSmellsView;

    /**
     * the constructor.
     * @param relevantBadSmellsView bad smell view
     */
    public RelevantBadSmellsViewContentProvider(final RelevantBadSmellsView relevantBadSmellsView) {
        this.relevantBadSmellsView = relevantBadSmellsView;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object[] getElements(final Object inputElement) {
        RelevanceResults<ASGAnnotation> results = (RelevanceResults<ASGAnnotation>) inputElement;
        this.relevantBadSmellsView.setRelevanceResults(results);
        Object[] elements = results.getRelevanceSubjects().toArray();

        return elements;
    }

}
