package org.archimetrix.relevanceanalysis;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * 
 * @author mcp
 *
 * @param <T> relevance subject
 */
public class RelevanceResults<T> {
    
    /**
     * relevance values.
     */
    private Map<T, Double[]> relevanceValues = new HashMap<T, Double[]>();

    /**
     * number of relevance strategies.
     */
    private int numberOfRelevanceStrategies;

    /**
     * Returns number of strategies.
     * @return number of relevance strategies
     */
    public int getNumberOfRelevanceStrategies() {
        return this.numberOfRelevanceStrategies;
    }

    /**
     * Sets the number of strategies.
     * @param numberOfRelevanceStrategies number of relevance strategies
     */
    public RelevanceResults(int numberOfRelevanceStrategies) {
        this.numberOfRelevanceStrategies = numberOfRelevanceStrategies;
    }

    /**
     * Sets the relevance value.
     * @param relevanceSubject subject
     * @param relevanceStrategyIndex index
     * @param relevanceValue value
     */
    public void setRelevanceValue(T relevanceSubject, int relevanceStrategyIndex, Double relevanceValue) {
        if (!this.relevanceValues.containsKey(relevanceSubject)) {
            this.relevanceValues.put(relevanceSubject, new Double[this.numberOfRelevanceStrategies]);
        }
        this.relevanceValues.get(relevanceSubject)[relevanceStrategyIndex] = relevanceValue;
    }

    /**
     * Returns values for strategy.
     * @param strategyIndex index
     * @return values for strategy
     */
    public Double[] getRelevanceValuesForStrategy(int strategyIndex) {
        Double[] values = new Double[this.relevanceValues.keySet().size()];
        int i = 0;
        for (T key : this.relevanceValues.keySet()) {
            values[i] = this.relevanceValues.get(key)[strategyIndex];
            i++;
        }
        return values;
    }

    /**
     * Returns the subject.
     * @return relevance subjects
     */
    public Set<T> getRelevanceSubjects() {
        return this.relevanceValues.keySet();
    }

    /**
     * Returns relevance values.
     * @param relevanceSubject subject
     * @return values
     */
    public Double[] getRelevanceValues(T relevanceSubject) {
        return this.relevanceValues.get(relevanceSubject);
    }
}
