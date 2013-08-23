package org.archimetrix.relevanceanalysis.components.strategies;

import metricvalues.MetricValuesModel;

import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;

/**
 * The class represents the strategy that calculates the complexity of a component for the component
 * relevance analysis (see [Pla11], Chapter 4).
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public class ComplexityStrategy extends ComponentsRelevanceStrategy {

    @Override
    public double getRelevanceValue(final ComponentImplementingClassesLink component,
            final MetricValuesModel metricValuesModel) {
        // return (getCPC(component) + getCSC() + getCDC() + getCCC()) / 4;
        // return getCSC(component);
        return getCPC(component);
    }

    /**
     * Component Cyclomatic Complexity
     * 
     * @return
     */
    private double getCCC() {
        // TODO not yet implemented
        return 0;
    }

    /**
     * Component Dynamic Complexity
     * 
     * @return
     */
    private double getCDC() {
        // TODO not yet implemented
        return 0;
    }

    /**
     * Component Static Complexity.
     * 
     * @return
     */
    private double getCSC(final ComponentImplementingClassesLink component) {
        ComponentsComplexityCalculator compHelper = ComponentsComplexityCalculator.get();
        double sum = compHelper.getNumberOfGeneralizations(component) + compHelper.getNumberOfReferences(component);
        double max = compHelper.getMaxStaticValuesSum((SourceCodeDecoratorRepository) component.eContainer());
        return sum / max; // normalize
    }

    /**
     * Component Plain Complexity
     * 
     * @param component
     * @return
     */
    private double getCPC(final ComponentImplementingClassesLink component) {
        ComponentsComplexityCalculator compHelper = ComponentsComplexityCalculator.get();
        double sum = compHelper.getAllClasses(component).size() + compHelper.getAllInterfacesSize(component)
                + compHelper.getAllMethods(component).size() + compHelper.getAllAttributes(component).size()
                + compHelper.getAllArguments(component).size();
        double max = compHelper.getMaxValuesSum(((SourceCodeDecoratorRepository) component.eContainer()));
        double result = sum / max; // normalize value
        return result;
    }
}
