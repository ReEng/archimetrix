package org.archimetrix.relevanceanalysis.badsmells.strategies;

import metricvalues.ComponentCandidate;
import metricvalues.Iteration;
import metricvalues.MetricValue;
import metricvalues.MetricValuesModel;

import org.archimetrix.commons.Messages;
import org.archimetrix.relevanceanalysis.badsmells.util.BadSmellOccurrenceUtil;
import org.archimetrix.relevanceanalysis.badsmells.util.MergeIndicationFunctionCalculator;
import org.archimetrix.relevanceanalysis.badsmells.util.SoMoXConfigurationCreator;
import org.reclipse.structure.inference.annotations.ASGAnnotation;
import org.somox.configuration.SoMoXConfiguration;

/**
 * This class calculates the relevance value for the relevance strategy "Higher Interface Adherence"
 * (see [Pla11], Chapter 4).
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class HigherInterfaceAdherenceStrategy extends BadSmellsRelevanceStrategy {

    private static final double COUPLING_THRESHOLD = 0.3;

    // TODO: to investigate a more adequate heuristic for this value is future work
    private static final int NEW_INTERFACE_ADHERENCE_VALUE = 1;

    @Override
    public double getRelevanceValue(final ASGAnnotation badSmellAnnotation, final ComponentCandidate compCand,
            final MetricValuesModel metricValuesModel) {
        if (!applicable(BadSmellOccurrenceUtil.get().getBadSmellName(badSmellAnnotation))) {
            return -1;
        }
        double mergeThreshold = ((Iteration) compCand.eContainer()).getCurMergeThreshold();
        double currentMergeValue = 0;
        double couplingValue = 0;
        double nameResemblanceValue = 0;
        double slaqValue = 0;
        double subsystemComponentValue = 0;
        double packageMappingValue = 0;
        double directoryMappingValue = 0;
        for (MetricValue metricValue : compCand.getMetricValues()) {
            if (metricValue.getMetricID().endsWith(Messages.ClusteringConstants_DEFAULT_MERGE_INDICATING_METRIC)) {
                currentMergeValue = metricValue.getValue();
            } else if (metricValue.getMetricID().endsWith(Messages.ClusteringConstants_COUPLING)) {
                couplingValue = metricValue.getValue();
            } else if (metricValue.getMetricID().endsWith(Messages.ClusteringConstants_NAME_RESEMBLANCE)) {
                nameResemblanceValue = metricValue.getValue();
            } else if (metricValue.getMetricID().endsWith(Messages.ClusteringConstants_SUBSYSTEM_COMPONENT)) {
                subsystemComponentValue = metricValue.getValue();
            } else if (metricValue.getMetricID().endsWith(Messages.ClusteringConstants_SLAQ)) {
                slaqValue = metricValue.getValue();
            } else if (metricValue.getMetricID().endsWith(Messages.ClusteringConstants_PACKAGE_MAPPING)) {
                packageMappingValue = metricValue.getValue();
            } else if (metricValue.getMetricID().endsWith(Messages.ClusteringConstants_DIRECTORY_MAPPING)) {
                directoryMappingValue = metricValue.getValue();
            }
        }
        if (couplingValue < COUPLING_THRESHOLD) {
            return 0;
        }
        double newMergeValue = getMergeValue(nameResemblanceValue, couplingValue, NEW_INTERFACE_ADHERENCE_VALUE,
                subsystemComponentValue, slaqValue, packageMappingValue, directoryMappingValue, metricValuesModel);
        double relevanceValue = 0;
        if ((currentMergeValue < mergeThreshold && newMergeValue >= mergeThreshold)
                || (currentMergeValue >= mergeThreshold && newMergeValue < mergeThreshold)) {
            double deviation = Math.abs(mergeThreshold - newMergeValue);
            relevanceValue = deviation;
        }
        // TODO consider composition, too
        return relevanceValue;
    }

    private double getMergeValue(final double nameResemblanceValue, final double couplingValue,
            final double interfaceAdherenceValue, final double subsystemComponentValue, final double slaqValue,
            final double packageMappingValue, final double directoryMappingValue,
            final MetricValuesModel metricValuesModel) {
        SoMoXConfiguration somoxConfiguration = SoMoXConfigurationCreator.createSoMoXConfig(metricValuesModel);
        MergeIndicationFunctionCalculator mergeHelper = new MergeIndicationFunctionCalculator(somoxConfiguration);
        return mergeHelper.computeOverallDirectedMetricValue(
                mergeHelper.getNameResemblanceStrategy(nameResemblanceValue, couplingValue),
                mergeHelper.getInterfaceAdherenceStrategy(interfaceAdherenceValue, couplingValue),
                mergeHelper.getSubsystemComponentStrategy(subsystemComponentValue, slaqValue),
                mergeHelper.getHierarchyMappingStrategy(packageMappingValue, directoryMappingValue));
    }

    @Override
    public boolean applicable(final String badSmellName) {
        if (badSmellName.equals(Messages.PatternConstants_ILLEGAL_METHOD_ACCESS_PATTERN)
                || badSmellName.equals(Messages.PatternConstants_ILLEGAL_METHOD_ACCESS_BC_PATTERN)) {
            return true;
        }
        return false;
    }

}
