package org.archimetrix.relevanceanalysis.components.strategies;

import java.util.Set;

import metricvalues.MetricValuesModel;

import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;

/**
 * The class determines the pareto optimal candidates for the component relevance analysis.
 * 
 * @author mcp
 * 
 */
public class ParetoOptimalComponentsResultStrategy extends ComponentsResultStrategy {

    @Override
    public double getRelevanceValue(final ComponentImplementingClassesLink component,
            final MetricValuesModel metricValuesModel) {
        // calculate pareto optimality: 1=true, 0=false
        Set<ComponentImplementingClassesLink> components = this.relevanceResults.getRelevanceSubjects();
        for (ComponentImplementingClassesLink otherComponent : components) {
            // values <0 are ignored because they come from non-applicable strategies
            if (isDominatedByOtherComponent(component, otherComponent)) {
                // a solution is called pareto optimal if and only if there is no solution that
                // dominates this solution
                return 0;
            }
        }
        return 1;
    }

    /**
     * Checks if one component dominates other component.
     * @param component component
     * @param otherComponent other component
     * @return decision bool value
     */
    public boolean isDominatedByOtherComponent(final ComponentImplementingClassesLink component,
            final ComponentImplementingClassesLink otherComponent) {
        // a solution y dominates a solution z iff for each i in [1..n], f_i(y)>=f_i(z) and it
        // exists
        // an i in [1..n] such that f_i(y)>f_i(z).
        boolean greater = false;
        Double[] relevanceValuesForComponent = this.relevanceResults.getRelevanceValues(component);
        for (int i = 0; i < relevanceValuesForComponent.length; i++) {
            Double value = relevanceValuesForComponent[i];
            if (value != null && value >= 0) {
                // values <0 are ignored because they come from non applicable strategies
                Double otherValue = this.relevanceResults.getRelevanceValues(otherComponent)[i];
                if (value > otherValue) {
                    return false;
                } else if (otherValue > value) {
                    greater = true;
                }
            }
        }
        return greater;
    }

}
