package org.archimetrix.relevanceanalysis.components.strategies;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import metricvalues.Component;
import metricvalues.ComponentCandidate;
import metricvalues.Iteration;
import metricvalues.MetricValue;
import metricvalues.MetricValuesModel;

import org.archimetrix.commons.Messages;
import org.archimetrix.relevanceanalysis.RelevanceAnalysisPlugin;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.java.Type;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;


/**
 * The class calculates the relevance value for the closeness to threshold strategy of the component
 * relevance analysis (see [Pla11], Chapter 4).
 * 
 * @author mcp
 * 
 */
public class ClosenessToThresholdStrategy extends ComponentsRelevanceStrategy {

    /**
     * Metric values model.
     */
    private MetricValuesModel metricValuesModel;

    // TODO: the third worst method !!
    @Override
    public double getRelevanceValue(final ComponentImplementingClassesLink component,
            final MetricValuesModel metricValuesModel) {
        this.metricValuesModel = metricValuesModel;

        double relevanceValue = 0;

        // for overall merge metric values, the iterations with the lowest CurrentMergeThreshold are
        // significant
        List<Iteration> firstIterations = getIterationsWithLowestMergeThreshold();
        for (Iteration iteration : firstIterations) {
            for (ComponentCandidate compCand : iteration.getComponentCandidates()) {
                if (isRelevantForMerge(compCand)) {
                    relevanceValue += getRating(compCand, component);
                }
            }
        }

        // for overall composition metric values, the iterations with the lowest
        // CurrentComposeThreshold are significant
        List<Iteration> lastIterations = getIterationsWithLowestCompositionThreshold();
        for (Iteration iteration : lastIterations) {
            for (ComponentCandidate compCand : iteration.getComponentCandidates()) {
                if (isRelevantForComposition(compCand)) {
                    relevanceValue += getRating(compCand, component);
                }
            }
        }
        double normalizedRelevanceValue = relevanceValue / getScale();
        return normalizedRelevanceValue;
    }

    /**
     * Returns iterations with lowest composition threshold.
     * @return list of iterations
     */
    private List<Iteration> getIterationsWithLowestCompositionThreshold() {
        double lowestCompositionThreshold = this.metricValuesModel.getIterations(
                this.metricValuesModel.getIterationsLength() - 1).getCurCompThreshold();
        List<Iteration> iterations = new ArrayList<Iteration>();
        for (Iteration iteration : this.metricValuesModel.getIterations()) {
            if (iteration.getCurCompThreshold() == lowestCompositionThreshold) {
                iterations.add(iteration);
            }
        }
        return iterations;
    }

    /**
     * Returns iterations with lowest merge threshold.
     * @return list of iterations
     */
    private List<Iteration> getIterationsWithLowestMergeThreshold() {
        double lowestMergeThreshold = this.metricValuesModel.getIterations(0).getCurMergeThreshold();
        List<Iteration> iterations = new ArrayList<Iteration>();
        for (Iteration iteration : this.metricValuesModel.getIterations()) {
            if (iteration.getCurMergeThreshold() == lowestMergeThreshold) {
                iterations.add(iteration);
            }
        }
        return iterations;
    }

    /**
     * Returns the rating.
     * @param compCand component candidate
     * @param component component implementing classes link
     * @return rating value
     */
    private double getRating(final ComponentCandidate compCand, final ComponentImplementingClassesLink component) {
        double rating = 0;
        Component comp1 = compCand.getFirstComponent();
        EcoreUtil.resolveAll(comp1);
        Component comp2 = compCand.getSecondComponent();
        EcoreUtil.resolveAll(comp2);
        rating += getRatingForComponent(component, comp1);
        rating += getRatingForComponent(component, comp2);
        return rating;
    }

    /**
     * Returns rating for component.
     * @param component component implementing classes link
     * @param comp component
     * @return rating
     */
    private double getRatingForComponent(final ComponentImplementingClassesLink component, final Component comp) {
        if (componentAccordsToComponentCandidate(component, comp)) {
            return 1;
        }
        return 0;
    }

    /**
     * Returns the scale.
     * @return scale
     */
    private int getScale() {
        int scale = 0;
        for (Iteration iteration : getIterationsWithLowestMergeThreshold()) {
            scale += iteration.getComponentCandidatesLength();
        }
        for (Iteration iteration : getIterationsWithLowestCompositionThreshold()) {
            scale += iteration.getComponentCandidatesLength();
        }
        return scale * 2; // * 2 because of pair (firstComp+secondComp)
    }

    /**
     * Checks if two components have same names.
     * @param component component implementing classes link
     * @param comp component
     * @return decision bool value
     */
    private boolean componentAccordsToComponentCandidate(final ComponentImplementingClassesLink component,
            final Component comp) {
        EcoreUtil.resolveAll(component);
        for (Type compGastClass : comp.getClasses()) {
            for (Type componentGastClass : component.getImplementingClasses()) {
                if (compGastClass.getName().equals(componentGastClass.getName())) {
                    return true;
                }

            }
        }
        for (ComponentImplementingClassesLink subComp : component.getSubComponents()) {
            if (componentAccordsToComponentCandidate(subComp, comp)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the component candidate is relevant for merging.
     * @param compCand component candidate
     * @return decision bool value
     */
    private boolean isRelevantForMerge(final ComponentCandidate compCand) {
        double mergeMetricValue = getOverallMergeMetricValue(compCand);
        double currentMergeThreshold = getCurrentMergeThreshold();
        double deviation = currentMergeThreshold - mergeMetricValue;
        if (Math.abs(deviation) <= getEpsilon()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if component candidate is relevant for composition.
     * @param compCand component candidate
     * @return decision bool value
     */
    private boolean isRelevantForComposition(final ComponentCandidate compCand) {
        double compositionMetricValue = getOverallCompositionMetricValue(compCand);
        double currentCompositionThreshold = getCurrentCompositionThreshold();
        double deviation = currentCompositionThreshold - compositionMetricValue;
        if (Math.abs(deviation) <= getEpsilon()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns merge threshold.
     * @return merge threshold
     */
    private double getCurrentMergeThreshold() {
        // current merge threshold from first iteration
        return this.metricValuesModel.getIterations()[0].getCurMergeThreshold();
    }

    /**
     * Returns composition threshold.
     * @return composition threshold
     */
    private double getCurrentCompositionThreshold() {
        // current composition threshold from last iteration
        return this.metricValuesModel.getIterations()[this.metricValuesModel.getIterationsLength() - 1]
                .getCurCompThreshold();
    }

    /**
     * Returns overall merge metric value.
     * @param compCand component candidate
     * @return overall merge metric value
     */
    private double getOverallMergeMetricValue(final ComponentCandidate compCand) {
        for (MetricValue metricValue : compCand.getMetricValues()) {
            if (metricValue.getMetricID().endsWith(Messages.ClusteringConstants_DEFAULT_MERGE_INDICATING_METRIC)) {
                return metricValue.getValue();
            }
        }
        return 0;
    }

    /**
     * Returns overall composition metric value.
     * @param compCand component candidate
     * @return overall composition metric value
     */
    private double getOverallCompositionMetricValue(final ComponentCandidate compCand) {
        for (MetricValue metricValue : compCand.getMetricValues()) {
            if (metricValue.getMetricID().endsWith(Messages.ClusteringConstants_DEFAULT_COMPOSITION_INDICATING_METRIC)) {
                return metricValue.getValue();
            }
        }
        return 0;
    }

    /**
     * Returns epsilon.
     * @return epsilon value
     */
    private double getEpsilon() {
        Properties properties = new Properties();
        try {
            InputStream stream = RelevanceAnalysisPlugin.getDefault().getBundle()
                    .getEntry(Messages.ConfigConstants_CONFIG_PROPERTIES_FILE).openStream();
            properties.load(stream);
            stream.close();

            return Double.parseDouble(properties.getProperty(Messages.ConfigConstants_RELEVANCEANALYSIS_EPSILON));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

}
