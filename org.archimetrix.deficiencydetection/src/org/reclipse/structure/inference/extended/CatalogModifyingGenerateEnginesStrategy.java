package org.reclipse.structure.inference.extended;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.reclipse.structure.generator.preparationstrategies.GenerateNewEnginesStrategy;
import org.reclipse.structure.specification.OperatorType;
import org.reclipse.structure.specification.PSAttributeConstraint;
import org.reclipse.structure.specification.PSCatalog;
import org.reclipse.structure.specification.PSNode;
import org.reclipse.structure.specification.PSObject;
import org.reclipse.structure.specification.PSPatternSpecification;
import org.reclipse.structure.specification.SpecificationFactory;
import org.somox.sourcecodedecorator.SourceCodeDecoratorPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;
//import eu.qimpress.samm.staticstructure.StaticstructurePackage;

/**
 * This strategy prepares the detection engines for the deficiency detection in Archimetrix. Because
 * the engines have to be modified to only detect deficiencies in the user-selected components, new
 * engines have to be generated in each detection run (because the component selection might have
 * changed). Therefore, this strategy works exactly like the standard GenerateNewEnginesStrategy
 * from Reclipse, save for the additional modification of the engines in the {@link modifyCatalog}
 * method.
 * 
 * @author mvdetten
 * 
 * @see GenerateNewEnginesStrategy
 */
public class CatalogModifyingGenerateEnginesStrategy extends GenerateNewEnginesStrategy {

    /**
     * Indirect component classes name.
     */
    private static final String INDIRECT_COMPONENT_CLASSES_NAME = "IndirectComponentClasses";

    /**
     * Direct component classes name.
     */
    private static final String DIRECT_COMPONENT_CLASSES_NAME = "DirectComponentClasses";

    /**
     * Object list of selected components.
     */
    Object[] selectedComponents;

    /**
     * The constructor.
     * 
     * 
     * @param catalogResource
     *            The deficiency catalog for which the engines should be generated.
     * @param selectedComponents
     *            The user-selected components in which the deficiencies should be detected.
     */
    public CatalogModifyingGenerateEnginesStrategy(Resource catalogResource, Object[] selectedComponents) {
        super(catalogResource);
        this.selectedComponents = selectedComponents;
    }

    /**
     * Prepares the deficiency detection engines in five steps: 1. The deficiency catalog is loaded.
     * 2. The catalog is modified to be only applicable to the components that were selected by the
     * user. 3. The resource for the detection engines is created and loaded. 4. The engines are
     * generated for the modified catalog. 5. The generated engines are saved.
     * 
     * @see org.reclipse.structure.generator.preparationstrategies.GenerateNewEnginesStrategy#prepareEngines()
     */
    @Override
    public IStatus prepareEngines() {
        PSCatalog catalog;

        try {
            catalog = loadCatalog();
        } catch (IOException e) {
            return this.reporter.error("Pattern catalog could not be loaded: " + e.getMessage());
        }

        modifyCatalog(catalog, this.selectedComponents);

        try {
            createAndLoadEnginesResource();
        } catch (IOException io) {
            return this.reporter.error("Could not create engines resource: " + io.getLocalizedMessage());
        }

        // check for existence
        if (enginesResource == null || !enginesResource.isLoaded()) {
            return this.reporter.error("Engines resource could not be loaded!");
        }

        generateEngines(catalog);

        try {
            saveGeneratedEngines();
        } catch (IOException e) {
            return this.reporter.error("Could not save engines resource:" + e.getLocalizedMessage());
        }

        return Status.OK_STATUS;
    }

    /**
     * Modifies the catalog in order to only detect deficiencies in the selected components. This is
     * achieved by adding an attribute constraint to the two concrete pattern that represent
     * components in the host graph, namely direct component classes pattern and the indirect
     * component classes pattern. The correct attribute expression is determined by a helper method.
     * If no selection is made (i.e. if all components are selected), the catalog is not modified.
     * 
     * @param catalog
     *            The pattern catalog to be modified.
     * @param selectedComponents
     *            The components to which the detection should be confined.
     */


    protected void modifyCatalog(PSCatalog catalog, Object[] selectedComponents) {
        String selectionExpression = getSelectionExpression(selectedComponents);
        // TODO: If all components are selected, no modification should be executed.

        EClass compTypeEClass = SourceCodeDecoratorPackage.eINSTANCE.getComponentImplementingClassesLink();
        //EClass compTypeEClass = StaticstructurePackage.eINSTANCE.getComponentType();
        EAttribute attributeType = IdentifierPackage.eINSTANCE.getIdentifier_Id();

        for (PSPatternSpecification pattern : catalog.getPatternSpecifications()) {
            if (DIRECT_COMPONENT_CLASSES_NAME.equals(pattern.getName())
                    || INDIRECT_COMPONENT_CLASSES_NAME.equals(pattern.getName())) {
                for (PSNode node : pattern.getNodes()) {
                    if (node instanceof PSObject) {
                        PSObject o = (PSObject) node;
                        if (compTypeEClass == o.getInstanceOf()) {
                            // add attribute expression
                            PSAttributeConstraint constraint = SpecificationFactory.eINSTANCE
                                    .createPSAttributeConstraint();
                            constraint.setAttribute(attributeType);
                            constraint.setNode(o);
                            constraint.setOperator(OperatorType.REGULAR_EXPRESSION);
                            constraint.setValueExpression(selectionExpression);
                        }
                    }
                }
            }
        }
    }

    /**
     * Creates the attribute expression for the given component selection. The expression is of the
     * form "(" COMPONENT_ID_1 "," ... "," COMPONENT_ID_N ")" .
     * 
     * @param selectedComponents
     *            The user-selected components. This should not be null or empty as the wizard
     *            should prevent it.
     * @return The attribute expression in form of a String.
     */
    private String getSelectionExpression(Object[] selectedComponents) {
        String expression = "";

        if (selectedComponents == null || selectedComponents.length == 0) {
            // This should not happen as the wizard should prevent selecting no components.
            throw new IllegalStateException("No components have been selected for the detection.");
        }

        for (Object o : this.selectedComponents) {

            RepositoryComponent type = (RepositoryComponent) o;
            String id = type.getId();

            expression += "(" + id + ")|";
        }

        expression = expression.substring(0, expression.length() - 1);

        return expression;
    }

}
