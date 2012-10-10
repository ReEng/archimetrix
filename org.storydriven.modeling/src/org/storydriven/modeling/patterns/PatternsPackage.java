/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.modeling.SDMPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package contains all classes for modeling story patterns that may be 
 * embedded into StoryActivityNodes of an Activity.
 * <!-- end-model-doc -->
 * @see org.storydriven.modeling.patterns.PatternsFactory
 * @model kind="package"
 * @generated
 */
public interface PatternsPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "patterns";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://ns.storydriven.org/sdm/patterns/0.1.0";

   /**
    * The package namespace name.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "sdmp";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   PatternsPackage eINSTANCE = org.storydriven.modeling.patterns.impl.PatternsPackageImpl.init();

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.impl.AttributeAssignmentImpl <em>Attribute Assignment</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.patterns.impl.AttributeAssignmentImpl
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getAttributeAssignment()
    * @generated
    */
   int ATTRIBUTE_ASSIGNMENT = 5;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl <em>Object Variable</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.patterns.impl.ObjectVariableImpl
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getObjectVariable()
    * @generated
    */
   int OBJECT_VARIABLE = 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.impl.AbstractVariableImpl <em>Abstract Variable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.patterns.impl.AbstractVariableImpl
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getAbstractVariable()
    * @generated
    */
   int ABSTRACT_VARIABLE = 1;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE__ANNOTATION = SDMPackage.VARIABLE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE__EXTENSION = SDMPackage.VARIABLE__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE__TYPE = SDMPackage.VARIABLE__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE__GENERIC_TYPE = SDMPackage.VARIABLE__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Variable Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE__VARIABLE_NAME = SDMPackage.VARIABLE__VARIABLE_NAME;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE__NAME = SDMPackage.VARIABLE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE__PATTERN = SDMPackage.VARIABLE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Binding State</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE__BINDING_STATE = SDMPackage.VARIABLE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE__BINDING_EXPRESSION = SDMPackage.VARIABLE_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE__CONSTRAINT = SDMPackage.VARIABLE_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Incoming Link</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE__INCOMING_LINK = SDMPackage.VARIABLE_FEATURE_COUNT + 5;

   /**
    * The number of structural features of the '<em>Abstract Variable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE_FEATURE_COUNT = SDMPackage.VARIABLE_FEATURE_COUNT + 6;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___ECLASS = SDMPackage.VARIABLE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___EIS_PROXY = SDMPackage.VARIABLE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___ERESOURCE = SDMPackage.VARIABLE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___ECONTAINER = SDMPackage.VARIABLE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___ECONTAINING_FEATURE = SDMPackage.VARIABLE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___ECONTAINMENT_FEATURE = SDMPackage.VARIABLE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___ECONTENTS = SDMPackage.VARIABLE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___EALL_CONTENTS = SDMPackage.VARIABLE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___ECROSS_REFERENCES = SDMPackage.VARIABLE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___EGET__ESTRUCTURALFEATURE = SDMPackage.VARIABLE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___EUNSET__ESTRUCTURALFEATURE = SDMPackage.VARIABLE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___EINVOKE__EOPERATION_ELIST = SDMPackage.VARIABLE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___GET_EXTENSION__ECLASS = SDMPackage.VARIABLE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___PROVIDE_EXTENSION__ECLASS = SDMPackage.VARIABLE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___GET_ANNOTATION__STRING = SDMPackage.VARIABLE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE___PROVIDE_ANNOTATION__STRING = SDMPackage.VARIABLE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Abstract Variable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_VARIABLE_OPERATION_COUNT = SDMPackage.VARIABLE_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__ANNOTATION = ABSTRACT_VARIABLE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__EXTENSION = ABSTRACT_VARIABLE__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__TYPE = ABSTRACT_VARIABLE__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__GENERIC_TYPE = ABSTRACT_VARIABLE__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Variable Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__VARIABLE_NAME = ABSTRACT_VARIABLE__VARIABLE_NAME;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__NAME = ABSTRACT_VARIABLE__NAME;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__PATTERN = ABSTRACT_VARIABLE__PATTERN;

   /**
    * The feature id for the '<em><b>Binding State</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__BINDING_STATE = ABSTRACT_VARIABLE__BINDING_STATE;

   /**
    * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__BINDING_EXPRESSION = ABSTRACT_VARIABLE__BINDING_EXPRESSION;

   /**
    * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__CONSTRAINT = ABSTRACT_VARIABLE__CONSTRAINT;

   /**
    * The feature id for the '<em><b>Incoming Link</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__INCOMING_LINK = ABSTRACT_VARIABLE__INCOMING_LINK;

   /**
    * The feature id for the '<em><b>Outgoing Link</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__OUTGOING_LINK = ABSTRACT_VARIABLE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Link Order Constraint</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT = ABSTRACT_VARIABLE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__BINDING_SEMANTICS = ABSTRACT_VARIABLE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__BINDING_OPERATOR = ABSTRACT_VARIABLE_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Attribute Assignment</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT = ABSTRACT_VARIABLE_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Classifier</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE__CLASSIFIER = ABSTRACT_VARIABLE_FEATURE_COUNT + 5;

   /**
    * The number of structural features of the '<em>Object Variable</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE_FEATURE_COUNT = ABSTRACT_VARIABLE_FEATURE_COUNT + 6;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___ECLASS = ABSTRACT_VARIABLE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___EIS_PROXY = ABSTRACT_VARIABLE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___ERESOURCE = ABSTRACT_VARIABLE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___ECONTAINER = ABSTRACT_VARIABLE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___ECONTAINING_FEATURE = ABSTRACT_VARIABLE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___ECONTAINMENT_FEATURE = ABSTRACT_VARIABLE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___ECONTENTS = ABSTRACT_VARIABLE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___EALL_CONTENTS = ABSTRACT_VARIABLE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___ECROSS_REFERENCES = ABSTRACT_VARIABLE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___EGET__ESTRUCTURALFEATURE = ABSTRACT_VARIABLE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___EINVOKE__EOPERATION_ELIST = ABSTRACT_VARIABLE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___GET_EXTENSION__ECLASS = ABSTRACT_VARIABLE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___PROVIDE_EXTENSION__ECLASS = ABSTRACT_VARIABLE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___GET_ANNOTATION__STRING = ABSTRACT_VARIABLE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE___PROVIDE_ANNOTATION__STRING = ABSTRACT_VARIABLE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Object Variable</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_VARIABLE_OPERATION_COUNT = ABSTRACT_VARIABLE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.impl.AbstractLinkVariableImpl <em>Abstract Link Variable</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.patterns.impl.AbstractLinkVariableImpl
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getAbstractLinkVariable()
    * @generated
    */
   int ABSTRACT_LINK_VARIABLE = 3;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.impl.LinkConstraintImpl <em>Link Constraint</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.patterns.impl.LinkConstraintImpl
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getLinkConstraint()
    * @generated
    */
   int LINK_CONSTRAINT = 4;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.impl.ConstraintImpl <em>Constraint</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.patterns.impl.ConstraintImpl
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getConstraint()
    * @generated
    */
   int CONSTRAINT = 2;

   /**
    * The feature id for the '<em><b>Constraint Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONSTRAINT__CONSTRAINT_EXPRESSION = 0;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONSTRAINT__PATTERN = 1;

   /**
    * The feature id for the '<em><b>Object Variable</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONSTRAINT__OBJECT_VARIABLE = 2;

   /**
    * The number of structural features of the '<em>Constraint</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONSTRAINT_FEATURE_COUNT = 3;

   /**
    * The number of operations of the '<em>Constraint</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONSTRAINT_OPERATION_COUNT = 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE__NAME = SDMPackage.NAMED_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE__SOURCE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Second Link Constraint</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>First Link Constraint</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Binding State</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE__BINDING_STATE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE__PATTERN = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE__TARGET = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

   /**
    * The number of structural features of the '<em>Abstract Link Variable</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___ECLASS = SDMPackage.NAMED_ELEMENT___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___EIS_PROXY = SDMPackage.NAMED_ELEMENT___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___ERESOURCE = SDMPackage.NAMED_ELEMENT___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___ECONTAINER = SDMPackage.NAMED_ELEMENT___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___ECONTAINING_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___ECONTAINMENT_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___ECONTENTS = SDMPackage.NAMED_ELEMENT___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___EALL_CONTENTS = SDMPackage.NAMED_ELEMENT___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___ECROSS_REFERENCES = SDMPackage.NAMED_ELEMENT___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___EUNSET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___EINVOKE__EOPERATION_ELIST = SDMPackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___GET_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___PROVIDE_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___GET_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE___PROVIDE_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Abstract Link Variable</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ABSTRACT_LINK_VARIABLE_OPERATION_COUNT = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT__ANNOTATION = SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT__EXTENSION = SDMPackage.EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Index</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT__INDEX = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT__CONSTRAINT_TYPE = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Negative</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT__NEGATIVE = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>First Link</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT__FIRST_LINK = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Referencing Object</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT__REFERENCING_OBJECT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Second Link</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT__SECOND_LINK = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 5;

   /**
    * The number of structural features of the '<em>Link Constraint</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT_FEATURE_COUNT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 6;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___ECLASS = SDMPackage.EXTENDABLE_ELEMENT___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___EIS_PROXY = SDMPackage.EXTENDABLE_ELEMENT___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___ERESOURCE = SDMPackage.EXTENDABLE_ELEMENT___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___ECONTAINER = SDMPackage.EXTENDABLE_ELEMENT___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___ECONTAINING_FEATURE = SDMPackage.EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___ECONTAINMENT_FEATURE = SDMPackage.EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___ECONTENTS = SDMPackage.EXTENDABLE_ELEMENT___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___EALL_CONTENTS = SDMPackage.EXTENDABLE_ELEMENT___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___ECROSS_REFERENCES = SDMPackage.EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___EGET__ESTRUCTURALFEATURE = SDMPackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE = SDMPackage.EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___EINVOKE__EOPERATION_ELIST = SDMPackage.EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___GET_EXTENSION__ECLASS = SDMPackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___PROVIDE_EXTENSION__ECLASS = SDMPackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___GET_ANNOTATION__STRING = SDMPackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT___PROVIDE_ANNOTATION__STRING = SDMPackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Link Constraint</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_CONSTRAINT_OPERATION_COUNT = SDMPackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Attribute</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ATTRIBUTE_ASSIGNMENT__ATTRIBUTE = 0;

   /**
    * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION = 1;

   /**
    * The feature id for the '<em><b>Object Variable</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE = 2;

   /**
    * The number of structural features of the '<em>Attribute Assignment</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT = 3;

   /**
    * The number of operations of the '<em>Attribute Assignment</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ATTRIBUTE_ASSIGNMENT_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.impl.PathImpl <em>Path</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.patterns.impl.PathImpl
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getPath()
    * @generated
    */
   int PATH = 8;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.impl.LinkVariableImpl <em>Link Variable</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.patterns.impl.LinkVariableImpl
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getLinkVariable()
    * @generated
    */
   int LINK_VARIABLE = 9;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.impl.ContainmentRelationImpl <em>Containment Relation</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.patterns.impl.ContainmentRelationImpl
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getContainmentRelation()
    * @generated
    */
   int CONTAINMENT_RELATION = 10;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.impl.StoryPatternImpl <em>Story Pattern</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.patterns.impl.StoryPatternImpl
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getStoryPattern()
    * @generated
    */
   int STORY_PATTERN = 13;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.impl.MatchingPatternImpl <em>Matching Pattern</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.patterns.impl.MatchingPatternImpl
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getMatchingPattern()
    * @generated
    */
   int MATCHING_PATTERN = 11;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.impl.ObjectSetVariableImpl <em>Object Set Variable</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.patterns.impl.ObjectSetVariableImpl
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getObjectSetVariable()
    * @generated
    */
   int OBJECT_SET_VARIABLE = 6;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__ANNOTATION = OBJECT_VARIABLE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__EXTENSION = OBJECT_VARIABLE__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__TYPE = OBJECT_VARIABLE__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__GENERIC_TYPE = OBJECT_VARIABLE__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Variable Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__VARIABLE_NAME = OBJECT_VARIABLE__VARIABLE_NAME;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__NAME = OBJECT_VARIABLE__NAME;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__PATTERN = OBJECT_VARIABLE__PATTERN;

   /**
    * The feature id for the '<em><b>Binding State</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__BINDING_STATE = OBJECT_VARIABLE__BINDING_STATE;

   /**
    * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__BINDING_EXPRESSION = OBJECT_VARIABLE__BINDING_EXPRESSION;

   /**
    * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__CONSTRAINT = OBJECT_VARIABLE__CONSTRAINT;

   /**
    * The feature id for the '<em><b>Incoming Link</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__INCOMING_LINK = OBJECT_VARIABLE__INCOMING_LINK;

   /**
    * The feature id for the '<em><b>Outgoing Link</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__OUTGOING_LINK = OBJECT_VARIABLE__OUTGOING_LINK;

   /**
    * The feature id for the '<em><b>Link Order Constraint</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__LINK_ORDER_CONSTRAINT = OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT;

   /**
    * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__BINDING_SEMANTICS = OBJECT_VARIABLE__BINDING_SEMANTICS;

   /**
    * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__BINDING_OPERATOR = OBJECT_VARIABLE__BINDING_OPERATOR;

   /**
    * The feature id for the '<em><b>Attribute Assignment</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__ATTRIBUTE_ASSIGNMENT = OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT;

   /**
    * The feature id for the '<em><b>Classifier</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE__CLASSIFIER = OBJECT_VARIABLE__CLASSIFIER;

   /**
    * The number of structural features of the '<em>Object Set Variable</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE_FEATURE_COUNT = OBJECT_VARIABLE_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___ECLASS = OBJECT_VARIABLE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___EIS_PROXY = OBJECT_VARIABLE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___ERESOURCE = OBJECT_VARIABLE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___ECONTAINER = OBJECT_VARIABLE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___ECONTAINING_FEATURE = OBJECT_VARIABLE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___ECONTAINMENT_FEATURE = OBJECT_VARIABLE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___ECONTENTS = OBJECT_VARIABLE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___EALL_CONTENTS = OBJECT_VARIABLE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___ECROSS_REFERENCES = OBJECT_VARIABLE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___EGET__ESTRUCTURALFEATURE = OBJECT_VARIABLE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = OBJECT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = OBJECT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = OBJECT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___EUNSET__ESTRUCTURALFEATURE = OBJECT_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___EINVOKE__EOPERATION_ELIST = OBJECT_VARIABLE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___GET_EXTENSION__ECLASS = OBJECT_VARIABLE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___PROVIDE_EXTENSION__ECLASS = OBJECT_VARIABLE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___GET_ANNOTATION__STRING = OBJECT_VARIABLE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE___PROVIDE_ANNOTATION__STRING = OBJECT_VARIABLE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Object Set Variable</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OBJECT_SET_VARIABLE_OPERATION_COUNT = OBJECT_VARIABLE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.impl.PrimitiveVariableImpl <em>Primitive Variable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.patterns.impl.PrimitiveVariableImpl
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getPrimitiveVariable()
    * @generated
    */
   int PRIMITIVE_VARIABLE = 7;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE__ANNOTATION = ABSTRACT_VARIABLE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE__EXTENSION = ABSTRACT_VARIABLE__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE__TYPE = ABSTRACT_VARIABLE__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE__GENERIC_TYPE = ABSTRACT_VARIABLE__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Variable Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE__VARIABLE_NAME = ABSTRACT_VARIABLE__VARIABLE_NAME;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE__NAME = ABSTRACT_VARIABLE__NAME;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE__PATTERN = ABSTRACT_VARIABLE__PATTERN;

   /**
    * The feature id for the '<em><b>Binding State</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE__BINDING_STATE = ABSTRACT_VARIABLE__BINDING_STATE;

   /**
    * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE__BINDING_EXPRESSION = ABSTRACT_VARIABLE__BINDING_EXPRESSION;

   /**
    * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE__CONSTRAINT = ABSTRACT_VARIABLE__CONSTRAINT;

   /**
    * The feature id for the '<em><b>Incoming Link</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE__INCOMING_LINK = ABSTRACT_VARIABLE__INCOMING_LINK;

   /**
    * The feature id for the '<em><b>Classifier</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE__CLASSIFIER = ABSTRACT_VARIABLE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Primitive Variable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE_FEATURE_COUNT = ABSTRACT_VARIABLE_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___ECLASS = ABSTRACT_VARIABLE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___EIS_PROXY = ABSTRACT_VARIABLE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___ERESOURCE = ABSTRACT_VARIABLE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___ECONTAINER = ABSTRACT_VARIABLE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___ECONTAINING_FEATURE = ABSTRACT_VARIABLE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___ECONTAINMENT_FEATURE = ABSTRACT_VARIABLE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___ECONTENTS = ABSTRACT_VARIABLE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___EALL_CONTENTS = ABSTRACT_VARIABLE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___ECROSS_REFERENCES = ABSTRACT_VARIABLE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___EGET__ESTRUCTURALFEATURE = ABSTRACT_VARIABLE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___EINVOKE__EOPERATION_ELIST = ABSTRACT_VARIABLE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___GET_EXTENSION__ECLASS = ABSTRACT_VARIABLE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___PROVIDE_EXTENSION__ECLASS = ABSTRACT_VARIABLE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___GET_ANNOTATION__STRING = ABSTRACT_VARIABLE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE___PROVIDE_ANNOTATION__STRING = ABSTRACT_VARIABLE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Primitive Variable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRIMITIVE_VARIABLE_OPERATION_COUNT = ABSTRACT_VARIABLE_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH__ANNOTATION = ABSTRACT_LINK_VARIABLE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH__EXTENSION = ABSTRACT_LINK_VARIABLE__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH__NAME = ABSTRACT_LINK_VARIABLE__NAME;

   /**
    * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH__BINDING_SEMANTICS = ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS;

   /**
    * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH__BINDING_OPERATOR = ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR;

   /**
    * The feature id for the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH__SOURCE = ABSTRACT_LINK_VARIABLE__SOURCE;

   /**
    * The feature id for the '<em><b>Second Link Constraint</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH__SECOND_LINK_CONSTRAINT = ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT;

   /**
    * The feature id for the '<em><b>First Link Constraint</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH__FIRST_LINK_CONSTRAINT = ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT;

   /**
    * The feature id for the '<em><b>Binding State</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH__BINDING_STATE = ABSTRACT_LINK_VARIABLE__BINDING_STATE;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH__PATTERN = ABSTRACT_LINK_VARIABLE__PATTERN;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH__TARGET = ABSTRACT_LINK_VARIABLE__TARGET;

   /**
    * The feature id for the '<em><b>Path Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH__PATH_EXPRESSION = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Path</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH_FEATURE_COUNT = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___ECLASS = ABSTRACT_LINK_VARIABLE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___EIS_PROXY = ABSTRACT_LINK_VARIABLE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___ERESOURCE = ABSTRACT_LINK_VARIABLE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___ECONTAINER = ABSTRACT_LINK_VARIABLE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___ECONTAINING_FEATURE = ABSTRACT_LINK_VARIABLE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___ECONTAINMENT_FEATURE = ABSTRACT_LINK_VARIABLE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___ECONTENTS = ABSTRACT_LINK_VARIABLE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___EALL_CONTENTS = ABSTRACT_LINK_VARIABLE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___ECROSS_REFERENCES = ABSTRACT_LINK_VARIABLE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___EGET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_LINK_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___EINVOKE__EOPERATION_ELIST = ABSTRACT_LINK_VARIABLE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___GET_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___PROVIDE_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___GET_ANNOTATION__STRING = ABSTRACT_LINK_VARIABLE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH___PROVIDE_ANNOTATION__STRING = ABSTRACT_LINK_VARIABLE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Path</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH_OPERATION_COUNT = ABSTRACT_LINK_VARIABLE_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE__ANNOTATION = ABSTRACT_LINK_VARIABLE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE__EXTENSION = ABSTRACT_LINK_VARIABLE__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE__NAME = ABSTRACT_LINK_VARIABLE__NAME;

   /**
    * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE__BINDING_SEMANTICS = ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS;

   /**
    * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE__BINDING_OPERATOR = ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR;

   /**
    * The feature id for the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE__SOURCE = ABSTRACT_LINK_VARIABLE__SOURCE;

   /**
    * The feature id for the '<em><b>Second Link Constraint</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE__SECOND_LINK_CONSTRAINT = ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT;

   /**
    * The feature id for the '<em><b>First Link Constraint</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE__FIRST_LINK_CONSTRAINT = ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT;

   /**
    * The feature id for the '<em><b>Binding State</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE__BINDING_STATE = ABSTRACT_LINK_VARIABLE__BINDING_STATE;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE__PATTERN = ABSTRACT_LINK_VARIABLE__PATTERN;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE__TARGET = ABSTRACT_LINK_VARIABLE__TARGET;

   /**
    * The feature id for the '<em><b>Source End</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE__SOURCE_END = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Target End</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE__TARGET_END = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Qualifier Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE__QUALIFIER_EXPRESSION = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Link Variable</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE_FEATURE_COUNT = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 3;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___ECLASS = ABSTRACT_LINK_VARIABLE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___EIS_PROXY = ABSTRACT_LINK_VARIABLE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___ERESOURCE = ABSTRACT_LINK_VARIABLE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___ECONTAINER = ABSTRACT_LINK_VARIABLE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___ECONTAINING_FEATURE = ABSTRACT_LINK_VARIABLE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___ECONTAINMENT_FEATURE = ABSTRACT_LINK_VARIABLE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___ECONTENTS = ABSTRACT_LINK_VARIABLE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___EALL_CONTENTS = ABSTRACT_LINK_VARIABLE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___ECROSS_REFERENCES = ABSTRACT_LINK_VARIABLE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___EGET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_LINK_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___EINVOKE__EOPERATION_ELIST = ABSTRACT_LINK_VARIABLE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___GET_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___PROVIDE_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___GET_ANNOTATION__STRING = ABSTRACT_LINK_VARIABLE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE___PROVIDE_ANNOTATION__STRING = ABSTRACT_LINK_VARIABLE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Link Variable</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_VARIABLE_OPERATION_COUNT = ABSTRACT_LINK_VARIABLE_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION__ANNOTATION = ABSTRACT_LINK_VARIABLE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION__EXTENSION = ABSTRACT_LINK_VARIABLE__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION__NAME = ABSTRACT_LINK_VARIABLE__NAME;

   /**
    * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION__BINDING_SEMANTICS = ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS;

   /**
    * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION__BINDING_OPERATOR = ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR;

   /**
    * The feature id for the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION__SOURCE = ABSTRACT_LINK_VARIABLE__SOURCE;

   /**
    * The feature id for the '<em><b>Second Link Constraint</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION__SECOND_LINK_CONSTRAINT = ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT;

   /**
    * The feature id for the '<em><b>First Link Constraint</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION__FIRST_LINK_CONSTRAINT = ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT;

   /**
    * The feature id for the '<em><b>Binding State</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION__BINDING_STATE = ABSTRACT_LINK_VARIABLE__BINDING_STATE;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION__PATTERN = ABSTRACT_LINK_VARIABLE__PATTERN;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION__TARGET = ABSTRACT_LINK_VARIABLE__TARGET;

   /**
    * The number of structural features of the '<em>Containment Relation</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION_FEATURE_COUNT = ABSTRACT_LINK_VARIABLE_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___ECLASS = ABSTRACT_LINK_VARIABLE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___EIS_PROXY = ABSTRACT_LINK_VARIABLE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___ERESOURCE = ABSTRACT_LINK_VARIABLE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___ECONTAINER = ABSTRACT_LINK_VARIABLE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___ECONTAINING_FEATURE = ABSTRACT_LINK_VARIABLE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___ECONTAINMENT_FEATURE = ABSTRACT_LINK_VARIABLE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___ECONTENTS = ABSTRACT_LINK_VARIABLE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___EALL_CONTENTS = ABSTRACT_LINK_VARIABLE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___ECROSS_REFERENCES = ABSTRACT_LINK_VARIABLE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___EGET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_LINK_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_LINK_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_LINK_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___EINVOKE__EOPERATION_ELIST = ABSTRACT_LINK_VARIABLE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___GET_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___PROVIDE_EXTENSION__ECLASS = ABSTRACT_LINK_VARIABLE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___GET_ANNOTATION__STRING = ABSTRACT_LINK_VARIABLE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION___PROVIDE_ANNOTATION__STRING = ABSTRACT_LINK_VARIABLE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Containment Relation</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINMENT_RELATION_OPERATION_COUNT = ABSTRACT_LINK_VARIABLE_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN__ANNOTATION = SDMPackage.COMMENTABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN__EXTENSION = SDMPackage.COMMENTABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN__COMMENT = SDMPackage.COMMENTABLE_ELEMENT__COMMENT;

   /**
    * The feature id for the '<em><b>Variable</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN__VARIABLE = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN__CONSTRAINT = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Link Variable</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN__LINK_VARIABLE = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Parent Pattern</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN__PARENT_PATTERN = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Contained Pattern</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN__CONTAINED_PATTERN = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN__BINDING_SEMANTICS = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

   /**
    * The feature id for the '<em><b>Template Signature</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN__TEMPLATE_SIGNATURE = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 6;

   /**
    * The number of structural features of the '<em>Story Pattern</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN_FEATURE_COUNT = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 7;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___ECLASS = SDMPackage.COMMENTABLE_ELEMENT___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___EIS_PROXY = SDMPackage.COMMENTABLE_ELEMENT___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___ERESOURCE = SDMPackage.COMMENTABLE_ELEMENT___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___ECONTAINER = SDMPackage.COMMENTABLE_ELEMENT___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___ECONTAINING_FEATURE = SDMPackage.COMMENTABLE_ELEMENT___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___ECONTAINMENT_FEATURE = SDMPackage.COMMENTABLE_ELEMENT___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___ECONTENTS = SDMPackage.COMMENTABLE_ELEMENT___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___EALL_CONTENTS = SDMPackage.COMMENTABLE_ELEMENT___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___ECROSS_REFERENCES = SDMPackage.COMMENTABLE_ELEMENT___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___EGET__ESTRUCTURALFEATURE = SDMPackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.COMMENTABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.COMMENTABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___EUNSET__ESTRUCTURALFEATURE = SDMPackage.COMMENTABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___EINVOKE__EOPERATION_ELIST = SDMPackage.COMMENTABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___GET_EXTENSION__ECLASS = SDMPackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___PROVIDE_EXTENSION__ECLASS = SDMPackage.COMMENTABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___GET_ANNOTATION__STRING = SDMPackage.COMMENTABLE_ELEMENT___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN___PROVIDE_ANNOTATION__STRING = SDMPackage.COMMENTABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Story Pattern</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_PATTERN_OPERATION_COUNT = SDMPackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN__ANNOTATION = STORY_PATTERN__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN__EXTENSION = STORY_PATTERN__EXTENSION;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN__COMMENT = STORY_PATTERN__COMMENT;

   /**
    * The feature id for the '<em><b>Variable</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN__VARIABLE = STORY_PATTERN__VARIABLE;

   /**
    * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN__CONSTRAINT = STORY_PATTERN__CONSTRAINT;

   /**
    * The feature id for the '<em><b>Link Variable</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN__LINK_VARIABLE = STORY_PATTERN__LINK_VARIABLE;

   /**
    * The feature id for the '<em><b>Parent Pattern</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN__PARENT_PATTERN = STORY_PATTERN__PARENT_PATTERN;

   /**
    * The feature id for the '<em><b>Contained Pattern</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN__CONTAINED_PATTERN = STORY_PATTERN__CONTAINED_PATTERN;

   /**
    * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN__BINDING_SEMANTICS = STORY_PATTERN__BINDING_SEMANTICS;

   /**
    * The feature id for the '<em><b>Template Signature</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN__TEMPLATE_SIGNATURE = STORY_PATTERN__TEMPLATE_SIGNATURE;

   /**
    * The number of structural features of the '<em>Matching Pattern</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN_FEATURE_COUNT = STORY_PATTERN_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___ECLASS = STORY_PATTERN___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___EIS_PROXY = STORY_PATTERN___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___ERESOURCE = STORY_PATTERN___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___ECONTAINER = STORY_PATTERN___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___ECONTAINING_FEATURE = STORY_PATTERN___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___ECONTAINMENT_FEATURE = STORY_PATTERN___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___ECONTENTS = STORY_PATTERN___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___EALL_CONTENTS = STORY_PATTERN___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___ECROSS_REFERENCES = STORY_PATTERN___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___EGET__ESTRUCTURALFEATURE = STORY_PATTERN___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___EGET__ESTRUCTURALFEATURE_BOOLEAN = STORY_PATTERN___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___ESET__ESTRUCTURALFEATURE_OBJECT = STORY_PATTERN___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___EIS_SET__ESTRUCTURALFEATURE = STORY_PATTERN___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___EUNSET__ESTRUCTURALFEATURE = STORY_PATTERN___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___EINVOKE__EOPERATION_ELIST = STORY_PATTERN___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___GET_EXTENSION__ECLASS = STORY_PATTERN___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___PROVIDE_EXTENSION__ECLASS = STORY_PATTERN___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___GET_ANNOTATION__STRING = STORY_PATTERN___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___PROVIDE_ANNOTATION__STRING = STORY_PATTERN___PROVIDE_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>No Modifier In Matching Pattern</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN___NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTICCHAIN_MAP = STORY_PATTERN_OPERATION_COUNT + 0;

   /**
    * The number of operations of the '<em>Matching Pattern</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_PATTERN_OPERATION_COUNT = STORY_PATTERN_OPERATION_COUNT + 1;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.impl.ContainerVariableImpl <em>Container Variable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.patterns.impl.ContainerVariableImpl
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getContainerVariable()
    * @generated
    */
   int CONTAINER_VARIABLE = 12;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__ANNOTATION = OBJECT_VARIABLE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__EXTENSION = OBJECT_VARIABLE__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__TYPE = OBJECT_VARIABLE__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__GENERIC_TYPE = OBJECT_VARIABLE__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Variable Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__VARIABLE_NAME = OBJECT_VARIABLE__VARIABLE_NAME;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__NAME = OBJECT_VARIABLE__NAME;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__PATTERN = OBJECT_VARIABLE__PATTERN;

   /**
    * The feature id for the '<em><b>Binding State</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__BINDING_STATE = OBJECT_VARIABLE__BINDING_STATE;

   /**
    * The feature id for the '<em><b>Binding Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__BINDING_EXPRESSION = OBJECT_VARIABLE__BINDING_EXPRESSION;

   /**
    * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__CONSTRAINT = OBJECT_VARIABLE__CONSTRAINT;

   /**
    * The feature id for the '<em><b>Incoming Link</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__INCOMING_LINK = OBJECT_VARIABLE__INCOMING_LINK;

   /**
    * The feature id for the '<em><b>Outgoing Link</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__OUTGOING_LINK = OBJECT_VARIABLE__OUTGOING_LINK;

   /**
    * The feature id for the '<em><b>Link Order Constraint</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__LINK_ORDER_CONSTRAINT = OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT;

   /**
    * The feature id for the '<em><b>Binding Semantics</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__BINDING_SEMANTICS = OBJECT_VARIABLE__BINDING_SEMANTICS;

   /**
    * The feature id for the '<em><b>Binding Operator</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__BINDING_OPERATOR = OBJECT_VARIABLE__BINDING_OPERATOR;

   /**
    * The feature id for the '<em><b>Attribute Assignment</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__ATTRIBUTE_ASSIGNMENT = OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT;

   /**
    * The feature id for the '<em><b>Classifier</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE__CLASSIFIER = OBJECT_VARIABLE__CLASSIFIER;

   /**
    * The number of structural features of the '<em>Container Variable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE_FEATURE_COUNT = OBJECT_VARIABLE_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___ECLASS = OBJECT_VARIABLE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___EIS_PROXY = OBJECT_VARIABLE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___ERESOURCE = OBJECT_VARIABLE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___ECONTAINER = OBJECT_VARIABLE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___ECONTAINING_FEATURE = OBJECT_VARIABLE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___ECONTAINMENT_FEATURE = OBJECT_VARIABLE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___ECONTENTS = OBJECT_VARIABLE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___EALL_CONTENTS = OBJECT_VARIABLE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___ECROSS_REFERENCES = OBJECT_VARIABLE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___EGET__ESTRUCTURALFEATURE = OBJECT_VARIABLE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = OBJECT_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = OBJECT_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = OBJECT_VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___EUNSET__ESTRUCTURALFEATURE = OBJECT_VARIABLE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___EINVOKE__EOPERATION_ELIST = OBJECT_VARIABLE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___GET_EXTENSION__ECLASS = OBJECT_VARIABLE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___PROVIDE_EXTENSION__ECLASS = OBJECT_VARIABLE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___GET_ANNOTATION__STRING = OBJECT_VARIABLE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE___PROVIDE_ANNOTATION__STRING = OBJECT_VARIABLE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Container Variable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTAINER_VARIABLE_OPERATION_COUNT = OBJECT_VARIABLE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.BindingState <em>Binding State</em>}' enum.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.patterns.BindingState
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getBindingState()
    * @generated
    */
   int BINDING_STATE = 14;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.BindingSemantics <em>Binding Semantics</em>}' enum.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.patterns.BindingSemantics
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getBindingSemantics()
    * @generated
    */
   int BINDING_SEMANTICS = 15;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.BindingOperator <em>Binding Operator</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.patterns.BindingOperator
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getBindingOperator()
    * @generated
    */
   int BINDING_OPERATOR = 16;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.patterns.LinkConstraintType <em>Link Constraint Type</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.patterns.LinkConstraintType
    * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getLinkConstraintType()
    * @generated
    */
   int LINK_CONSTRAINT_TYPE = 17;

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.patterns.AttributeAssignment <em>Attribute Assignment</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Attribute Assignment</em>'.
    * @see org.storydriven.modeling.patterns.AttributeAssignment
    * @generated
    */
   EClass getAttributeAssignment ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.patterns.AttributeAssignment#getObjectVariable <em>Object Variable</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the container reference '<em>Object Variable</em>'.
    * @see org.storydriven.modeling.patterns.AttributeAssignment#getObjectVariable()
    * @see #getAttributeAssignment()
    * @generated
    */
   EReference getAttributeAssignment_ObjectVariable ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.patterns.AttributeAssignment#getAttribute <em>Attribute</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the reference '<em>Attribute</em>'.
    * @see org.storydriven.modeling.patterns.AttributeAssignment#getAttribute()
    * @see #getAttributeAssignment()
    * @generated
    */
   EReference getAttributeAssignment_Attribute ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.patterns.AttributeAssignment#getValueExpression <em>Value Expression</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Value Expression</em>'.
    * @see org.storydriven.modeling.patterns.AttributeAssignment#getValueExpression()
    * @see #getAttributeAssignment()
    * @generated
    */
   EReference getAttributeAssignment_ValueExpression ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.patterns.ObjectVariable <em>Object Variable</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Object Variable</em>'.
    * @see org.storydriven.modeling.patterns.ObjectVariable
    * @generated
    */
   EClass getObjectVariable ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.patterns.ObjectVariable#getBindingSemantics <em>Binding Semantics</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Binding Semantics</em>'.
    * @see org.storydriven.modeling.patterns.ObjectVariable#getBindingSemantics()
    * @see #getObjectVariable()
    * @generated
    */
   EAttribute getObjectVariable_BindingSemantics ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.patterns.ObjectVariable#getBindingOperator <em>Binding Operator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Binding Operator</em>'.
    * @see org.storydriven.modeling.patterns.ObjectVariable#getBindingOperator()
    * @see #getObjectVariable()
    * @generated
    */
   EAttribute getObjectVariable_BindingOperator ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.patterns.ObjectVariable#getOutgoingLinks <em>Outgoing Link</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Outgoing Link</em>'.
    * @see org.storydriven.modeling.patterns.ObjectVariable#getOutgoingLinks()
    * @see #getObjectVariable()
    * @generated
    */
   EReference getObjectVariable_OutgoingLink ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.patterns.ObjectVariable#getLinkOrderConstraints <em>Link Order Constraint</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Link Order Constraint</em>'.
    * @see org.storydriven.modeling.patterns.ObjectVariable#getLinkOrderConstraints()
    * @see #getObjectVariable()
    * @generated
    */
   EReference getObjectVariable_LinkOrderConstraint ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.patterns.ObjectVariable#getClassifier <em>Classifier</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the reference '<em>Classifier</em>'.
    * @see org.storydriven.modeling.patterns.ObjectVariable#getClassifier()
    * @see #getObjectVariable()
    * @generated
    */
   EReference getObjectVariable_Classifier ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.patterns.AbstractVariable <em>Abstract Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Abstract Variable</em>'.
    * @see org.storydriven.modeling.patterns.AbstractVariable
    * @generated
    */
   EClass getAbstractVariable ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.patterns.AbstractVariable#getPattern <em>Pattern</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Pattern</em>'.
    * @see org.storydriven.modeling.patterns.AbstractVariable#getPattern()
    * @see #getAbstractVariable()
    * @generated
    */
   EReference getAbstractVariable_Pattern ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.patterns.AbstractVariable#getBindingState <em>Binding State</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Binding State</em>'.
    * @see org.storydriven.modeling.patterns.AbstractVariable#getBindingState()
    * @see #getAbstractVariable()
    * @generated
    */
   EAttribute getAbstractVariable_BindingState ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.patterns.AbstractVariable#getBindingExpression <em>Binding Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Binding Expression</em>'.
    * @see org.storydriven.modeling.patterns.AbstractVariable#getBindingExpression()
    * @see #getAbstractVariable()
    * @generated
    */
   EReference getAbstractVariable_BindingExpression ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.patterns.AbstractVariable#getConstraints <em>Constraint</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Constraint</em>'.
    * @see org.storydriven.modeling.patterns.AbstractVariable#getConstraints()
    * @see #getAbstractVariable()
    * @generated
    */
   EReference getAbstractVariable_Constraint ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.patterns.AbstractVariable#getIncomingLinks <em>Incoming Link</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Incoming Link</em>'.
    * @see org.storydriven.modeling.patterns.AbstractVariable#getIncomingLinks()
    * @see #getAbstractVariable()
    * @generated
    */
   EReference getAbstractVariable_IncomingLink ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.patterns.ObjectVariable#getAttributeAssignments <em>Attribute Assignment</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Attribute Assignment</em>'.
    * @see org.storydriven.modeling.patterns.ObjectVariable#getAttributeAssignments()
    * @see #getObjectVariable()
    * @generated
    */
   EReference getObjectVariable_AttributeAssignment ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.patterns.AbstractLinkVariable <em>Abstract Link Variable</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @return the meta object for class '<em>Abstract Link Variable</em>'.
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable
    * @generated
    */
   EClass getAbstractLinkVariable ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingSemantics <em>Binding Semantics</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Binding Semantics</em>'.
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingSemantics()
    * @see #getAbstractLinkVariable()
    * @generated
    */
   EAttribute getAbstractLinkVariable_BindingSemantics ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingOperator <em>Binding Operator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Binding Operator</em>'.
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingOperator()
    * @see #getAbstractLinkVariable()
    * @generated
    */
   EAttribute getAbstractLinkVariable_BindingOperator ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getTarget <em>Target</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the reference '<em>Target</em>'.
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable#getTarget()
    * @see #getAbstractLinkVariable()
    * @generated
    */
   EReference getAbstractLinkVariable_Target ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getSecondLinkConstraints <em>Second Link Constraint</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Second Link Constraint</em>'.
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable#getSecondLinkConstraints()
    * @see #getAbstractLinkVariable()
    * @generated
    */
   EReference getAbstractLinkVariable_SecondLinkConstraint ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getFirstLinkConstraints <em>First Link Constraint</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>First Link Constraint</em>'.
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable#getFirstLinkConstraints()
    * @see #getAbstractLinkVariable()
    * @generated
    */
   EReference getAbstractLinkVariable_FirstLinkConstraint ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingState <em>Binding State</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Binding State</em>'.
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable#getBindingState()
    * @see #getAbstractLinkVariable()
    * @generated
    */
   EAttribute getAbstractLinkVariable_BindingState ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getPattern <em>Pattern</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the container reference '<em>Pattern</em>'.
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable#getPattern()
    * @see #getAbstractLinkVariable()
    * @generated
    */
   EReference getAbstractLinkVariable_Pattern ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.patterns.AbstractLinkVariable#getSource <em>Source</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the reference '<em>Source</em>'.
    * @see org.storydriven.modeling.patterns.AbstractLinkVariable#getSource()
    * @see #getAbstractLinkVariable()
    * @generated
    */
   EReference getAbstractLinkVariable_Source ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.patterns.LinkConstraint <em>Link Constraint</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Link Constraint</em>'.
    * @see org.storydriven.modeling.patterns.LinkConstraint
    * @generated
    */
   EClass getLinkConstraint ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.patterns.LinkConstraint#getIndex <em>Index</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Index</em>'.
    * @see org.storydriven.modeling.patterns.LinkConstraint#getIndex()
    * @see #getLinkConstraint()
    * @generated
    */
   EAttribute getLinkConstraint_Index ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.patterns.LinkConstraint#getConstraintType <em>Constraint Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Constraint Type</em>'.
    * @see org.storydriven.modeling.patterns.LinkConstraint#getConstraintType()
    * @see #getLinkConstraint()
    * @generated
    */
   EAttribute getLinkConstraint_ConstraintType ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.patterns.LinkConstraint#isNegative <em>Negative</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Negative</em>'.
    * @see org.storydriven.modeling.patterns.LinkConstraint#isNegative()
    * @see #getLinkConstraint()
    * @generated
    */
   EAttribute getLinkConstraint_Negative ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.patterns.LinkConstraint#getFirstLink <em>First Link</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>First Link</em>'.
    * @see org.storydriven.modeling.patterns.LinkConstraint#getFirstLink()
    * @see #getLinkConstraint()
    * @generated
    */
   EReference getLinkConstraint_FirstLink ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.patterns.LinkConstraint#getReferencingObject <em>Referencing Object</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Referencing Object</em>'.
    * @see org.storydriven.modeling.patterns.LinkConstraint#getReferencingObject()
    * @see #getLinkConstraint()
    * @generated
    */
   EReference getLinkConstraint_ReferencingObject ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.patterns.LinkConstraint#getSecondLink <em>Second Link</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Second Link</em>'.
    * @see org.storydriven.modeling.patterns.LinkConstraint#getSecondLink()
    * @see #getLinkConstraint()
    * @generated
    */
   EReference getLinkConstraint_SecondLink ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.patterns.Constraint <em>Constraint</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Constraint</em>'.
    * @see org.storydriven.modeling.patterns.Constraint
    * @generated
    */
   EClass getConstraint ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.patterns.Constraint#getConstraintExpression <em>Constraint Expression</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Constraint Expression</em>'.
    * @see org.storydriven.modeling.patterns.Constraint#getConstraintExpression()
    * @see #getConstraint()
    * @generated
    */
   EReference getConstraint_ConstraintExpression ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.patterns.Constraint#getPattern <em>Pattern</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the container reference '<em>Pattern</em>'.
    * @see org.storydriven.modeling.patterns.Constraint#getPattern()
    * @see #getConstraint()
    * @generated
    */
   EReference getConstraint_Pattern ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.patterns.Constraint#getObjectVariable <em>Object Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Object Variable</em>'.
    * @see org.storydriven.modeling.patterns.Constraint#getObjectVariable()
    * @see #getConstraint()
    * @generated
    */
   EReference getConstraint_ObjectVariable ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.patterns.Path <em>Path</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Path</em>'.
    * @see org.storydriven.modeling.patterns.Path
    * @generated
    */
   EClass getPath ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.patterns.Path#getPathExpression <em>Path Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Path Expression</em>'.
    * @see org.storydriven.modeling.patterns.Path#getPathExpression()
    * @see #getPath()
    * @generated
    */
   EReference getPath_PathExpression ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.patterns.LinkVariable <em>Link Variable</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Link Variable</em>'.
    * @see org.storydriven.modeling.patterns.LinkVariable
    * @generated
    */
   EClass getLinkVariable ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.patterns.LinkVariable#getSourceEnd <em>Source End</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @return the meta object for the reference '<em>Source End</em>'.
    * @see org.storydriven.modeling.patterns.LinkVariable#getSourceEnd()
    * @see #getLinkVariable()
    * @generated
    */
   EReference getLinkVariable_SourceEnd ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.patterns.LinkVariable#getTargetEnd <em>Target End</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @return the meta object for the reference '<em>Target End</em>'.
    * @see org.storydriven.modeling.patterns.LinkVariable#getTargetEnd()
    * @see #getLinkVariable()
    * @generated
    */
   EReference getLinkVariable_TargetEnd ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.patterns.LinkVariable#getQualifierExpression <em>Qualifier Expression</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Qualifier Expression</em>'.
    * @see org.storydriven.modeling.patterns.LinkVariable#getQualifierExpression()
    * @see #getLinkVariable()
    * @generated
    */
   EReference getLinkVariable_QualifierExpression ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.patterns.ContainmentRelation <em>Containment Relation</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Containment Relation</em>'.
    * @see org.storydriven.modeling.patterns.ContainmentRelation
    * @generated
    */
   EClass getContainmentRelation ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.patterns.MatchingPattern <em>Matching Pattern</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Matching Pattern</em>'.
    * @see org.storydriven.modeling.patterns.MatchingPattern
    * @generated
    */
   EClass getMatchingPattern ();

   /**
    * Returns the meta object for the '{@link org.storydriven.modeling.patterns.MatchingPattern#NoModifierInMatchingPattern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Modifier In Matching Pattern</em>}' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the '<em>No Modifier In Matching Pattern</em>' operation.
    * @see org.storydriven.modeling.patterns.MatchingPattern#NoModifierInMatchingPattern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
    * @generated
    */
   EOperation getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.patterns.PrimitiveVariable <em>Primitive Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Primitive Variable</em>'.
    * @see org.storydriven.modeling.patterns.PrimitiveVariable
    * @generated
    */
   EClass getPrimitiveVariable ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.patterns.PrimitiveVariable#getClassifier <em>Classifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Classifier</em>'.
    * @see org.storydriven.modeling.patterns.PrimitiveVariable#getClassifier()
    * @see #getPrimitiveVariable()
    * @generated
    */
   EReference getPrimitiveVariable_Classifier ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.patterns.ContainerVariable <em>Container Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Container Variable</em>'.
    * @see org.storydriven.modeling.patterns.ContainerVariable
    * @generated
    */
   EClass getContainerVariable ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.patterns.ObjectSetVariable <em>Object Set Variable</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Object Set Variable</em>'.
    * @see org.storydriven.modeling.patterns.ObjectSetVariable
    * @generated
    */
   EClass getObjectSetVariable ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.patterns.StoryPattern <em>Story Pattern</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Story Pattern</em>'.
    * @see org.storydriven.modeling.patterns.StoryPattern
    * @generated
    */
   EClass getStoryPattern ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.patterns.StoryPattern#getVariables <em>Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Variable</em>'.
    * @see org.storydriven.modeling.patterns.StoryPattern#getVariables()
    * @see #getStoryPattern()
    * @generated
    */
   EReference getStoryPattern_Variable ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.patterns.StoryPattern#getLinkVariables <em>Link Variable</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Link Variable</em>'.
    * @see org.storydriven.modeling.patterns.StoryPattern#getLinkVariables()
    * @see #getStoryPattern()
    * @generated
    */
   EReference getStoryPattern_LinkVariable ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.patterns.StoryPattern#getConstraints <em>Constraint</em>}'.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Constraint</em>'.
    * @see org.storydriven.modeling.patterns.StoryPattern#getConstraints()
    * @see #getStoryPattern()
    * @generated
    */
   EReference getStoryPattern_Constraint ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.patterns.StoryPattern#getParentPattern <em>Parent Pattern</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Parent Pattern</em>'.
    * @see org.storydriven.modeling.patterns.StoryPattern#getParentPattern()
    * @see #getStoryPattern()
    * @generated
    */
   EReference getStoryPattern_ParentPattern ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.patterns.StoryPattern#getContainedPatterns <em>Contained Pattern</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Contained Pattern</em>'.
    * @see org.storydriven.modeling.patterns.StoryPattern#getContainedPatterns()
    * @see #getStoryPattern()
    * @generated
    */
   EReference getStoryPattern_ContainedPattern ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.patterns.StoryPattern#getBindingSemantics <em>Binding Semantics</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Binding Semantics</em>'.
    * @see org.storydriven.modeling.patterns.StoryPattern#getBindingSemantics()
    * @see #getStoryPattern()
    * @generated
    */
   EAttribute getStoryPattern_BindingSemantics ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.patterns.StoryPattern#getTemplateSignature <em>Template Signature</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Template Signature</em>'.
    * @see org.storydriven.modeling.patterns.StoryPattern#getTemplateSignature()
    * @see #getStoryPattern()
    * @generated
    */
   EReference getStoryPattern_TemplateSignature ();

   /**
    * Returns the meta object for enum '{@link org.storydriven.modeling.patterns.BindingState <em>Binding State</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for enum '<em>Binding State</em>'.
    * @see org.storydriven.modeling.patterns.BindingState
    * @generated
    */
   EEnum getBindingState ();

   /**
    * Returns the meta object for enum '{@link org.storydriven.modeling.patterns.BindingSemantics <em>Binding Semantics</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for enum '<em>Binding Semantics</em>'.
    * @see org.storydriven.modeling.patterns.BindingSemantics
    * @generated
    */
   EEnum getBindingSemantics ();

   /**
    * Returns the meta object for enum '{@link org.storydriven.modeling.patterns.BindingOperator <em>Binding Operator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Binding Operator</em>'.
    * @see org.storydriven.modeling.patterns.BindingOperator
    * @generated
    */
   EEnum getBindingOperator ();

   /**
    * Returns the meta object for enum '{@link org.storydriven.modeling.patterns.LinkConstraintType <em>Link Constraint Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Link Constraint Type</em>'.
    * @see org.storydriven.modeling.patterns.LinkConstraintType
    * @generated
    */
   EEnum getLinkConstraintType ();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   PatternsFactory getPatternsFactory ();

   /**
    * <!-- begin-user-doc --> Defines literals for the meta objects that represent
    * <ul>
    * <li>each class,</li>
    * <li>each feature of each class,</li>
    * <li>each enum,</li>
    * <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.impl.AttributeAssignmentImpl <em>Attribute Assignment</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.patterns.impl.AttributeAssignmentImpl
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getAttributeAssignment()
       * @generated
       */
      EClass ATTRIBUTE_ASSIGNMENT = eINSTANCE.getAttributeAssignment();

      /**
       * The meta object literal for the '<em><b>Object Variable</b></em>' container reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE = eINSTANCE.getAttributeAssignment_ObjectVariable();

      /**
       * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ATTRIBUTE_ASSIGNMENT__ATTRIBUTE = eINSTANCE.getAttributeAssignment_Attribute();

      /**
       * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION = eINSTANCE.getAttributeAssignment_ValueExpression();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.impl.ObjectVariableImpl <em>Object Variable</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.patterns.impl.ObjectVariableImpl
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getObjectVariable()
       * @generated
       */
      EClass OBJECT_VARIABLE = eINSTANCE.getObjectVariable();

      /**
       * The meta object literal for the '<em><b>Binding Semantics</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute OBJECT_VARIABLE__BINDING_SEMANTICS = eINSTANCE.getObjectVariable_BindingSemantics();

      /**
       * The meta object literal for the '<em><b>Binding Operator</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute OBJECT_VARIABLE__BINDING_OPERATOR = eINSTANCE.getObjectVariable_BindingOperator();

      /**
       * The meta object literal for the '<em><b>Outgoing Link</b></em>' reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference OBJECT_VARIABLE__OUTGOING_LINK = eINSTANCE.getObjectVariable_OutgoingLink();

      /**
       * The meta object literal for the '<em><b>Link Order Constraint</b></em>' containment reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference OBJECT_VARIABLE__LINK_ORDER_CONSTRAINT = eINSTANCE.getObjectVariable_LinkOrderConstraint();

      /**
       * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference OBJECT_VARIABLE__CLASSIFIER = eINSTANCE.getObjectVariable_Classifier();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.impl.AbstractVariableImpl <em>Abstract Variable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.patterns.impl.AbstractVariableImpl
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getAbstractVariable()
       * @generated
       */
      EClass ABSTRACT_VARIABLE = eINSTANCE.getAbstractVariable();

      /**
       * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ABSTRACT_VARIABLE__PATTERN = eINSTANCE.getAbstractVariable_Pattern();

      /**
       * The meta object literal for the '<em><b>Binding State</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ABSTRACT_VARIABLE__BINDING_STATE = eINSTANCE.getAbstractVariable_BindingState();

      /**
       * The meta object literal for the '<em><b>Binding Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ABSTRACT_VARIABLE__BINDING_EXPRESSION = eINSTANCE.getAbstractVariable_BindingExpression();

      /**
       * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ABSTRACT_VARIABLE__CONSTRAINT = eINSTANCE.getAbstractVariable_Constraint();

      /**
       * The meta object literal for the '<em><b>Incoming Link</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ABSTRACT_VARIABLE__INCOMING_LINK = eINSTANCE.getAbstractVariable_IncomingLink();

      /**
       * The meta object literal for the '<em><b>Attribute Assignment</b></em>' containment reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT = eINSTANCE.getObjectVariable_AttributeAssignment();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.impl.AbstractLinkVariableImpl <em>Abstract Link Variable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.patterns.impl.AbstractLinkVariableImpl
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getAbstractLinkVariable()
       * @generated
       */
      EClass ABSTRACT_LINK_VARIABLE = eINSTANCE.getAbstractLinkVariable();

      /**
       * The meta object literal for the '<em><b>Binding Semantics</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS = eINSTANCE.getAbstractLinkVariable_BindingSemantics();

      /**
       * The meta object literal for the '<em><b>Binding Operator</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR = eINSTANCE.getAbstractLinkVariable_BindingOperator();

      /**
       * The meta object literal for the '<em><b>Target</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ABSTRACT_LINK_VARIABLE__TARGET = eINSTANCE.getAbstractLinkVariable_Target();

      /**
       * The meta object literal for the '<em><b>Second Link Constraint</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINT = eINSTANCE
         .getAbstractLinkVariable_SecondLinkConstraint();

      /**
       * The meta object literal for the '<em><b>First Link Constraint</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINT = eINSTANCE
         .getAbstractLinkVariable_FirstLinkConstraint();

      /**
       * The meta object literal for the '<em><b>Binding State</b></em>' attribute feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EAttribute ABSTRACT_LINK_VARIABLE__BINDING_STATE = eINSTANCE.getAbstractLinkVariable_BindingState();

      /**
       * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ABSTRACT_LINK_VARIABLE__PATTERN = eINSTANCE.getAbstractLinkVariable_Pattern();

      /**
       * The meta object literal for the '<em><b>Source</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ABSTRACT_LINK_VARIABLE__SOURCE = eINSTANCE.getAbstractLinkVariable_Source();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.impl.LinkConstraintImpl <em>Link Constraint</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.patterns.impl.LinkConstraintImpl
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getLinkConstraint()
       * @generated
       */
      EClass LINK_CONSTRAINT = eINSTANCE.getLinkConstraint();

      /**
       * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute LINK_CONSTRAINT__INDEX = eINSTANCE.getLinkConstraint_Index();

      /**
       * The meta object literal for the '<em><b>Constraint Type</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute LINK_CONSTRAINT__CONSTRAINT_TYPE = eINSTANCE.getLinkConstraint_ConstraintType();

      /**
       * The meta object literal for the '<em><b>Negative</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute LINK_CONSTRAINT__NEGATIVE = eINSTANCE.getLinkConstraint_Negative();

      /**
       * The meta object literal for the '<em><b>First Link</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference LINK_CONSTRAINT__FIRST_LINK = eINSTANCE.getLinkConstraint_FirstLink();

      /**
       * The meta object literal for the '<em><b>Referencing Object</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference LINK_CONSTRAINT__REFERENCING_OBJECT = eINSTANCE.getLinkConstraint_ReferencingObject();

      /**
       * The meta object literal for the '<em><b>Second Link</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference LINK_CONSTRAINT__SECOND_LINK = eINSTANCE.getLinkConstraint_SecondLink();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.impl.ConstraintImpl <em>Constraint</em>}' class.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @see org.storydriven.modeling.patterns.impl.ConstraintImpl
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getConstraint()
       * @generated
       */
      EClass CONSTRAINT = eINSTANCE.getConstraint();

      /**
       * The meta object literal for the '<em><b>Constraint Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference CONSTRAINT__CONSTRAINT_EXPRESSION = eINSTANCE.getConstraint_ConstraintExpression();

      /**
       * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference CONSTRAINT__PATTERN = eINSTANCE.getConstraint_Pattern();

      /**
       * The meta object literal for the '<em><b>Object Variable</b></em>' container reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference CONSTRAINT__OBJECT_VARIABLE = eINSTANCE.getConstraint_ObjectVariable();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.impl.PathImpl <em>Path</em>}' class.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @see org.storydriven.modeling.patterns.impl.PathImpl
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getPath()
       * @generated
       */
      EClass PATH = eINSTANCE.getPath();

      /**
       * The meta object literal for the '<em><b>Path Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference PATH__PATH_EXPRESSION = eINSTANCE.getPath_PathExpression();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.impl.LinkVariableImpl <em>Link Variable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
       * -->
       * 
       * @see org.storydriven.modeling.patterns.impl.LinkVariableImpl
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getLinkVariable()
       * @generated
       */
      EClass LINK_VARIABLE = eINSTANCE.getLinkVariable();

      /**
       * The meta object literal for the '<em><b>Source End</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference LINK_VARIABLE__SOURCE_END = eINSTANCE.getLinkVariable_SourceEnd();

      /**
       * The meta object literal for the '<em><b>Target End</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference LINK_VARIABLE__TARGET_END = eINSTANCE.getLinkVariable_TargetEnd();

      /**
       * The meta object literal for the '<em><b>Qualifier Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference LINK_VARIABLE__QUALIFIER_EXPRESSION = eINSTANCE.getLinkVariable_QualifierExpression();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.impl.ContainmentRelationImpl <em>Containment Relation</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.patterns.impl.ContainmentRelationImpl
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getContainmentRelation()
       * @generated
       */
      EClass CONTAINMENT_RELATION = eINSTANCE.getContainmentRelation();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.impl.MatchingPatternImpl <em>Matching Pattern</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.patterns.impl.MatchingPatternImpl
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getMatchingPattern()
       * @generated
       */
      EClass MATCHING_PATTERN = eINSTANCE.getMatchingPattern();

      /**
       * The meta object literal for the '<em><b>No Modifier In Matching Pattern</b></em>' operation.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EOperation MATCHING_PATTERN___NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTICCHAIN_MAP = eINSTANCE
         .getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.impl.PrimitiveVariableImpl <em>Primitive Variable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.patterns.impl.PrimitiveVariableImpl
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getPrimitiveVariable()
       * @generated
       */
      EClass PRIMITIVE_VARIABLE = eINSTANCE.getPrimitiveVariable();

      /**
       * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PRIMITIVE_VARIABLE__CLASSIFIER = eINSTANCE.getPrimitiveVariable_Classifier();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.impl.ContainerVariableImpl <em>Container Variable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.patterns.impl.ContainerVariableImpl
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getContainerVariable()
       * @generated
       */
      EClass CONTAINER_VARIABLE = eINSTANCE.getContainerVariable();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.impl.ObjectSetVariableImpl <em>Object Set Variable</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.patterns.impl.ObjectSetVariableImpl
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getObjectSetVariable()
       * @generated
       */
      EClass OBJECT_SET_VARIABLE = eINSTANCE.getObjectSetVariable();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.impl.StoryPatternImpl <em>Story Pattern</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
       * -->
       * 
       * @see org.storydriven.modeling.patterns.impl.StoryPatternImpl
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getStoryPattern()
       * @generated
       */
      EClass STORY_PATTERN = eINSTANCE.getStoryPattern();

      /**
       * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference STORY_PATTERN__VARIABLE = eINSTANCE.getStoryPattern_Variable();

      /**
       * The meta object literal for the '<em><b>Link Variable</b></em>' containment reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference STORY_PATTERN__LINK_VARIABLE = eINSTANCE.getStoryPattern_LinkVariable();

      /**
       * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference STORY_PATTERN__CONSTRAINT = eINSTANCE.getStoryPattern_Constraint();

      /**
       * The meta object literal for the '<em><b>Parent Pattern</b></em>' container reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference STORY_PATTERN__PARENT_PATTERN = eINSTANCE.getStoryPattern_ParentPattern();

      /**
       * The meta object literal for the '<em><b>Contained Pattern</b></em>' containment reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference STORY_PATTERN__CONTAINED_PATTERN = eINSTANCE.getStoryPattern_ContainedPattern();

      /**
       * The meta object literal for the '<em><b>Binding Semantics</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute STORY_PATTERN__BINDING_SEMANTICS = eINSTANCE.getStoryPattern_BindingSemantics();

      /**
       * The meta object literal for the '<em><b>Template Signature</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference STORY_PATTERN__TEMPLATE_SIGNATURE = eINSTANCE.getStoryPattern_TemplateSignature();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.BindingState <em>Binding State</em>}' enum.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @see org.storydriven.modeling.patterns.BindingState
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getBindingState()
       * @generated
       */
      EEnum BINDING_STATE = eINSTANCE.getBindingState();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.BindingSemantics <em>Binding Semantics</em>}' enum.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @see org.storydriven.modeling.patterns.BindingSemantics
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getBindingSemantics()
       * @generated
       */
      EEnum BINDING_SEMANTICS = eINSTANCE.getBindingSemantics();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.BindingOperator <em>Binding Operator</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.patterns.BindingOperator
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getBindingOperator()
       * @generated
       */
      EEnum BINDING_OPERATOR = eINSTANCE.getBindingOperator();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.patterns.LinkConstraintType <em>Link Constraint Type</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.patterns.LinkConstraintType
       * @see org.storydriven.modeling.patterns.impl.PatternsPackageImpl#getLinkConstraintType()
       * @generated
       */
      EEnum LINK_CONSTRAINT_TYPE = eINSTANCE.getLinkConstraintType();

   }

} // PatternsPackage
