package org.archimetrix.relevanceanalysis.badsmells.strategies;

import metricvalues.ComponentCandidate;
import metricvalues.MetricValue;
import metricvalues.MetricValuesModel;

import org.archimetrix.commons.Messages;
import org.archimetrix.relevanceanalysis.badsmells.util.BadSmellOccurrenceUtil;
import org.reclipse.structure.inference.annotations.ASGAnnotation;

/**
 * This class calculates the relevance value for the relevance strategy "Class Locations" (see
 * [Pla11], Chapter 4).
 * 
 * @author mcp
 * 
 */
public class ClassLocationsStrategy extends BadSmellsRelevanceStrategy {

    @Override
    public double getRelevanceValue(final ASGAnnotation badSmellAnnotation, final ComponentCandidate compCand,
            final MetricValuesModel metricValuesModel) {
        if (!applicable(BadSmellOccurrenceUtil.get().getBadSmellName(badSmellAnnotation))) {
            return -1;
        }
        double value = 0;
        for (MetricValue metricValue : compCand.getMetricValues()) {
            if (metricValue.getMetricID().endsWith(Messages.ClusteringConstants_PACKAGE_MAPPING)) {
                value = 1 - metricValue.getValue();
            }
        }
        return value;
    }

    @Override
    public boolean applicable(final String badSmellName) {
        if (badSmellName.equals(Messages.PatternConstants_ILLEGAL_METHOD_ACCESS_BC_PATTERN)
                || badSmellName.equals(Messages.PatternConstants_ILLEGAL_METHOD_ACCESS_PATTERN)
                || badSmellName.equals(Messages.PatternConstants_NON_TO_COMMUNICATION_PATTERN_NAME)) {
            return true;
        }
        return false;
    }

}
