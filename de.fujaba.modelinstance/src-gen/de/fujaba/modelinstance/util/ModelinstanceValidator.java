/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.modelinstance.util;

import de.fujaba.modelinstance.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;


/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.fujaba.modelinstance.ModelinstancePackage
 * @generated
 */
public class ModelinstanceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ModelinstanceValidator INSTANCE = new ModelinstanceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.fujaba.modelinstance";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelinstanceValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ModelinstancePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ModelinstancePackage.ROOT_NODE:
				return validateRootNode((RootNode)value, diagnostics, context);
			case ModelinstancePackage.MODEL_ELEMENT_CATEGORY:
				return validateModelElementCategory((ModelElementCategory)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRootNode(RootNode rootNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rootNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElementCategory(ModelElementCategory modelElementCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modelElementCategory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modelElementCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modelElementCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modelElementCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modelElementCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modelElementCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modelElementCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modelElementCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modelElementCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validateModelElementCategory_ExclusivelyContainsValidElements(modelElementCategory, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ExclusivelyContainsValidElements constraint of '<em>Model Element Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL_ELEMENT_CATEGORY__EXCLUSIVELY_CONTAINS_VALID_ELEMENTS__EEXPRESSION = "self.modelElements->select (e | not isValidElement(e))->isEmpty()";

	/**
	 * Validates the ExclusivelyContainsValidElements constraint of '<em>Model Element Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElementCategory_ExclusivelyContainsValidElements(ModelElementCategory modelElementCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ModelinstancePackage.Literals.MODEL_ELEMENT_CATEGORY,
				 modelElementCategory,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ExclusivelyContainsValidElements",
				 MODEL_ELEMENT_CATEGORY__EXCLUSIVELY_CONTAINS_VALID_ELEMENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ModelinstanceValidator
