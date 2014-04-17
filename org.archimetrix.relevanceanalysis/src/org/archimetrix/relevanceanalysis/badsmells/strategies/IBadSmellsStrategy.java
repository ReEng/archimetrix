package org.archimetrix.relevanceanalysis.badsmells.strategies;

import metricvalues.ComponentCandidate;
import metricvalues.MetricValuesModel;

import org.reclipse.structure.inference.annotations.ASGAnnotation;

/**
 * This interface should be implemented by relevance strategies of the bad smell relevance analysis.
 * 
 * @author mcp
 * 
 */
public interface IBadSmellsStrategy {

    /**
     * Number of ranking metrics.
     */
    int NO_OF_RANKING_METRICS = 4;

    /**
     * Returns relevance value.
     * @param badSmellAnnotation bad smell annotation
     * @param comp component candidate
     * @param metricValuesModel metric values model
     * @return relevance value
     */
    public double getRelevanceValue(ASGAnnotation badSmellAnnotation, ComponentCandidate comp,
            MetricValuesModel metricValuesModel);

}
