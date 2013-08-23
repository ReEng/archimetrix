package org.archimetrix.relevanceanalysis.badsmells.strategies;

import metricvalues.ComponentCandidate;
import metricvalues.MetricValuesModel;

import org.reclipse.structure.inference.annotations.ASGAnnotation;

/**
 * The class determines the length of the vector from the origin for the bad smell relevance
 * analysis.
 * 
 * @author mcp
 * 
 */
public class VectorLengthBadSmellsResultStrategy extends BadSmellsResultStrategy {

    @Override
    public double getRelevanceValue(final ASGAnnotation badSmellAnnotation, final ComponentCandidate comp,
            final MetricValuesModel metricValuesModel) {
        // calculate the length of the vector from the origin
        double sum = 0;
        Double[] relevanceValues = this.relevanceResults.getRelevanceValues(getAnnotation());
        int numberOfConsideredStrategies = 0;
        for (Double value : relevanceValues) {
            if (value != null && value >= 0) {
                numberOfConsideredStrategies++;
                // values <0 are ignored because they come from non applicable strategies
                sum += value * value;
            }
        }
        if (numberOfConsideredStrategies == 0) {
            return 1; // maximal relevance for bad smells without relevance strategies
        }
        double length = Math.sqrt(sum);

        // normalize vector
        double normalizedLength = length / Math.sqrt(numberOfConsideredStrategies);
        return normalizedLength;
    }

}
