package org.archimetrix.relevanceanalysis.badsmells.strategies;

import metricvalues.ComponentCandidate;
import metricvalues.MetricValue;
import metricvalues.MetricValuesModel;

import org.archimetrix.commons.Messages;
import org.archimetrix.relevanceanalysis.badsmells.util.BadSmellOccurrenceUtil;
import org.reclipse.structure.inference.annotations.ASGAnnotation;

/**
 * This class calculates the relevance value for the relevance strategy "External Accesses" (see
 * [Pla11], Chapter 4).
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ExternalAccessesStrategy extends BadSmellsRelevanceStrategy {

    @Override
    public double getRelevanceValue(final ASGAnnotation badSmellAnnotation, final ComponentCandidate compCand,
            final MetricValuesModel metricValuesModel) {
        if (!applicable(BadSmellOccurrenceUtil.get().getBadSmellName(badSmellAnnotation))) {
            return -1;
        }
        double value = 0;
        for (MetricValue metricValue : compCand.getMetricValues()) {
            if (metricValue.getMetricID().endsWith("ExternalAccessesCount")) {
                value = 1 - (metricValue.getValue() / 100);
            }
        }
        return value;
    }

    @Override
    public boolean applicable(final String badSmellName) {
        if (badSmellName.equals(Messages.PatternConstants_ILLEGAL_METHOD_ACCESS_BC_PATTERN)
                || badSmellName.equals(Messages.PatternConstants_ILLEGAL_METHOD_ACCESS_PATTERN)) {
            return true;
        }
        return false;
    }

}
