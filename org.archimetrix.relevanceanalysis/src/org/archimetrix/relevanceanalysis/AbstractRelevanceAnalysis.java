package org.archimetrix.relevanceanalysis;

import metricvalues.MetricValuesModel;

/**
 * An abstract super class for relevance analyses.
 * @author mcp
 *
 * @param <T> results
 */
public abstract class AbstractRelevanceAnalysis<T> {

    /**
     * Number of result strategies.
     */
    public static final int NUMBER_OF_RESULT_STRATEGIES = 2;

    /**
     * Metric values model.
     */
    protected MetricValuesModel metricValuesModel;

    /**
     * Results.
     */
    protected RelevanceResults<T> relevanceValues;

    /**
     * the constructor.
     * @param model metric values model
     */
    public AbstractRelevanceAnalysis(final MetricValuesModel model) {
        this.metricValuesModel = model;
    }

    /**
     * Analysis.
     */
    public abstract void startAnalysis();

    /**
     * Returns the results.
     * @return results
     */
    public RelevanceResults<T> getResult() {
        return relevanceValues;
    }
}
