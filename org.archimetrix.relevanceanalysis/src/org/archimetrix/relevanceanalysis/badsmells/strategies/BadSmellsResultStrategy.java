package org.archimetrix.relevanceanalysis.badsmells.strategies;

import org.archimetrix.relevanceanalysis.RelevanceResults;
import org.reclipse.structure.inference.annotations.ASGAnnotation;

/**
 * A super class for result strategies of the bad smell relevance analysis.
 * 
 * @author mcp
 * 
 */
public abstract class BadSmellsResultStrategy implements IBadSmellsStrategy {
    
    /**
     * annotation.
     */
    private ASGAnnotation annotation;

    /**
     * returns annotation.
     * @return annotation
     */
    public ASGAnnotation getAnnotation() {
        return this.annotation;
    }

    /**
     * sets annotation.
     * @param annotation annotation
     */
    public void setAnnotation(final ASGAnnotation annotation) {
        this.annotation = annotation;
    }

    /**
     * Relevance results.
     */
    protected RelevanceResults<ASGAnnotation> relevanceResults;

    /**
     * Sets relevance results.
     * @param relevanceResults results
     */
    public void setRelevanceResults(RelevanceResults<ASGAnnotation> relevanceResults) {
        this.relevanceResults = relevanceResults;
    }

}
