/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.activities;

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
 * @see org.storydriven.modeling.activities.ActivitiesFactory
 * @model kind="package"
 * @generated
 */
public interface ActivitiesPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "activities";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://ns.storydriven.org/sdm/activities/0.1.0";

   /**
    * The package namespace name.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "sdma";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   ActivitiesPackage eINSTANCE = org.storydriven.modeling.activities.impl.ActivitiesPackageImpl.init();

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.ActivityImpl <em>Activity</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.ActivityImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getActivity()
    * @generated
    */
   int ACTIVITY = 3;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.ActivityNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getActivityNode()
    * @generated
    */
   int ACTIVITY_NODE = 2;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.ActivityEdgeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getActivityEdge()
    * @generated
    */
   int ACTIVITY_EDGE = 1;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.ExceptionVariableImpl <em>Exception Variable</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.ExceptionVariableImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getExceptionVariable()
    * @generated
    */
   int EXCEPTION_VARIABLE = 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE__ANNOTATION = SDMPackage.VARIABLE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE__EXTENSION = SDMPackage.VARIABLE__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE__TYPE = SDMPackage.VARIABLE__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE__GENERIC_TYPE = SDMPackage.VARIABLE__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Variable Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE__VARIABLE_NAME = SDMPackage.VARIABLE__VARIABLE_NAME;

   /**
    * The feature id for the '<em><b>Activity Edge</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE__ACTIVITY_EDGE = SDMPackage.VARIABLE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE__NAME = SDMPackage.VARIABLE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Exception Type</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE__EXCEPTION_TYPE = SDMPackage.VARIABLE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Generic Exception Type</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE__GENERIC_EXCEPTION_TYPE = SDMPackage.VARIABLE_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Exception Variable</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE_FEATURE_COUNT = SDMPackage.VARIABLE_FEATURE_COUNT + 4;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___ECLASS = SDMPackage.VARIABLE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___EIS_PROXY = SDMPackage.VARIABLE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___ERESOURCE = SDMPackage.VARIABLE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___ECONTAINER = SDMPackage.VARIABLE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___ECONTAINING_FEATURE = SDMPackage.VARIABLE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___ECONTAINMENT_FEATURE = SDMPackage.VARIABLE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___ECONTENTS = SDMPackage.VARIABLE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___EALL_CONTENTS = SDMPackage.VARIABLE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___ECROSS_REFERENCES = SDMPackage.VARIABLE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___EGET__ESTRUCTURALFEATURE = SDMPackage.VARIABLE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.VARIABLE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___EUNSET__ESTRUCTURALFEATURE = SDMPackage.VARIABLE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___EINVOKE__EOPERATION_ELIST = SDMPackage.VARIABLE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___GET_EXTENSION__ECLASS = SDMPackage.VARIABLE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___PROVIDE_EXTENSION__ECLASS = SDMPackage.VARIABLE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___GET_ANNOTATION__STRING = SDMPackage.VARIABLE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE___PROVIDE_ANNOTATION__STRING = SDMPackage.VARIABLE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Exception Variable</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXCEPTION_VARIABLE_OPERATION_COUNT = SDMPackage.VARIABLE_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__ANNOTATION = SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__EXTENSION = SDMPackage.EXTENDABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__TARGET = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__SOURCE = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__OWNING_ACTIVITY = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Guard</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__GUARD = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Guard Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__GUARD_EXPRESSION = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Guard Exception</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE__GUARD_EXCEPTION = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 5;

   /**
    * The number of structural features of the '<em>Activity Edge</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE_FEATURE_COUNT = SDMPackage.EXTENDABLE_ELEMENT_FEATURE_COUNT + 6;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___ECLASS = SDMPackage.EXTENDABLE_ELEMENT___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___EIS_PROXY = SDMPackage.EXTENDABLE_ELEMENT___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___ERESOURCE = SDMPackage.EXTENDABLE_ELEMENT___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___ECONTAINER = SDMPackage.EXTENDABLE_ELEMENT___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___ECONTAINING_FEATURE = SDMPackage.EXTENDABLE_ELEMENT___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___ECONTAINMENT_FEATURE = SDMPackage.EXTENDABLE_ELEMENT___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___ECONTENTS = SDMPackage.EXTENDABLE_ELEMENT___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___EALL_CONTENTS = SDMPackage.EXTENDABLE_ELEMENT___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___ECROSS_REFERENCES = SDMPackage.EXTENDABLE_ELEMENT___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___EGET__ESTRUCTURALFEATURE = SDMPackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.EXTENDABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.EXTENDABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.EXTENDABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___EUNSET__ESTRUCTURALFEATURE = SDMPackage.EXTENDABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___EINVOKE__EOPERATION_ELIST = SDMPackage.EXTENDABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___GET_EXTENSION__ECLASS = SDMPackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___PROVIDE_EXTENSION__ECLASS = SDMPackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___GET_ANNOTATION__STRING = SDMPackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE___PROVIDE_ANNOTATION__STRING = SDMPackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Activity Edge</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_EDGE_OPERATION_COUNT = SDMPackage.EXTENDABLE_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__ANNOTATION = SDMPackage.NAMED_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__EXTENSION = SDMPackage.NAMED_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__NAME = SDMPackage.NAMED_ELEMENT__NAME;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__COMMENT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__OUTGOING = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__OWNING_ACTIVITY = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__OWNING_ACTIVITY_NODE = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE__INCOMING = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The number of structural features of the '<em>Activity Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE_FEATURE_COUNT = SDMPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___ECLASS = SDMPackage.NAMED_ELEMENT___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___EIS_PROXY = SDMPackage.NAMED_ELEMENT___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___ERESOURCE = SDMPackage.NAMED_ELEMENT___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___ECONTAINER = SDMPackage.NAMED_ELEMENT___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___ECONTAINING_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___ECONTAINMENT_FEATURE = SDMPackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___ECONTENTS = SDMPackage.NAMED_ELEMENT___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___EALL_CONTENTS = SDMPackage.NAMED_ELEMENT___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___ECROSS_REFERENCES = SDMPackage.NAMED_ELEMENT___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___EUNSET__ESTRUCTURALFEATURE = SDMPackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___EINVOKE__EOPERATION_ELIST = SDMPackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___GET_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___PROVIDE_EXTENSION__ECLASS = SDMPackage.NAMED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___GET_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE___PROVIDE_ANNOTATION__STRING = SDMPackage.NAMED_ELEMENT___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Activity Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_NODE_OPERATION_COUNT = SDMPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__ANNOTATION = SDMPackage.COMMENTABLE_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__EXTENSION = SDMPackage.COMMENTABLE_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__COMMENT = SDMPackage.COMMENTABLE_ELEMENT__COMMENT;

   /**
    * The feature id for the '<em><b>In Parameter</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__IN_PARAMETER = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Out Parameter</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__OUT_PARAMETER = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Contained Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__CONTAINED_PARAMETERS = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__OWNING_OPERATION = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Owned Activity Edge</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__OWNED_ACTIVITY_EDGE = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Precondition</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__PRECONDITION = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 5;

   /**
    * The feature id for the '<em><b>Owned Activity Node</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY__OWNED_ACTIVITY_NODE = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 6;

   /**
    * The number of structural features of the '<em>Activity</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_FEATURE_COUNT = SDMPackage.COMMENTABLE_ELEMENT_FEATURE_COUNT + 7;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___ECLASS = SDMPackage.COMMENTABLE_ELEMENT___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___EIS_PROXY = SDMPackage.COMMENTABLE_ELEMENT___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___ERESOURCE = SDMPackage.COMMENTABLE_ELEMENT___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___ECONTAINER = SDMPackage.COMMENTABLE_ELEMENT___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___ECONTAINING_FEATURE = SDMPackage.COMMENTABLE_ELEMENT___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___ECONTAINMENT_FEATURE = SDMPackage.COMMENTABLE_ELEMENT___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___ECONTENTS = SDMPackage.COMMENTABLE_ELEMENT___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___EALL_CONTENTS = SDMPackage.COMMENTABLE_ELEMENT___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___ECROSS_REFERENCES = SDMPackage.COMMENTABLE_ELEMENT___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___EGET__ESTRUCTURALFEATURE = SDMPackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.COMMENTABLE_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.COMMENTABLE_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.COMMENTABLE_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___EUNSET__ESTRUCTURALFEATURE = SDMPackage.COMMENTABLE_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___EINVOKE__EOPERATION_ELIST = SDMPackage.COMMENTABLE_ELEMENT___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___GET_EXTENSION__ECLASS = SDMPackage.COMMENTABLE_ELEMENT___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___PROVIDE_EXTENSION__ECLASS = SDMPackage.COMMENTABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___GET_ANNOTATION__STRING = SDMPackage.COMMENTABLE_ELEMENT___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY___PROVIDE_ANNOTATION__STRING = SDMPackage.COMMENTABLE_ELEMENT___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Activity</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_OPERATION_COUNT = SDMPackage.COMMENTABLE_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.StructuredNodeImpl <em>Structured Node</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.StructuredNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStructuredNode()
    * @generated
    */
   int STRUCTURED_NODE = 7;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.OperationExtensionImpl <em>Operation Extension</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.OperationExtensionImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getOperationExtension()
    * @generated
    */
   int OPERATION_EXTENSION = 4;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__ANNOTATION = SDMPackage.EXTENSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__EXTENSION = SDMPackage.EXTENSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Base</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__BASE = SDMPackage.EXTENSION__BASE;

   /**
    * The feature id for the '<em><b>Model Base</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__MODEL_BASE = SDMPackage.EXTENSION__MODEL_BASE;

   /**
    * The feature id for the '<em><b>Owning Annotation</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__OWNING_ANNOTATION = SDMPackage.EXTENSION__OWNING_ANNOTATION;

   /**
    * The feature id for the '<em><b>Extendable Base</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__EXTENDABLE_BASE = SDMPackage.EXTENSION__EXTENDABLE_BASE;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__COMMENT = SDMPackage.EXTENSION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>In Parameter</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__IN_PARAMETER = SDMPackage.EXTENSION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Out Parameter</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__OUT_PARAMETER = SDMPackage.EXTENSION_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Contained Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__CONTAINED_PARAMETERS = SDMPackage.EXTENSION_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Operation</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__OPERATION = SDMPackage.EXTENSION_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Return Value</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__RETURN_VALUE = SDMPackage.EXTENSION_FEATURE_COUNT + 5;

   /**
    * The feature id for the '<em><b>Owned Activity</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION__OWNED_ACTIVITY = SDMPackage.EXTENSION_FEATURE_COUNT + 6;

   /**
    * The number of structural features of the '<em>Operation Extension</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION_FEATURE_COUNT = SDMPackage.EXTENSION_FEATURE_COUNT + 7;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___ECLASS = SDMPackage.EXTENSION___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___EIS_PROXY = SDMPackage.EXTENSION___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___ERESOURCE = SDMPackage.EXTENSION___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___ECONTAINER = SDMPackage.EXTENSION___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___ECONTAINING_FEATURE = SDMPackage.EXTENSION___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___ECONTAINMENT_FEATURE = SDMPackage.EXTENSION___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___ECONTENTS = SDMPackage.EXTENSION___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___EALL_CONTENTS = SDMPackage.EXTENSION___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___ECROSS_REFERENCES = SDMPackage.EXTENSION___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___EGET__ESTRUCTURALFEATURE = SDMPackage.EXTENSION___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.EXTENSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.EXTENSION___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.EXTENSION___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___EUNSET__ESTRUCTURALFEATURE = SDMPackage.EXTENSION___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___EINVOKE__EOPERATION_ELIST = SDMPackage.EXTENSION___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___GET_EXTENSION__ECLASS = SDMPackage.EXTENSION___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___PROVIDE_EXTENSION__ECLASS = SDMPackage.EXTENSION___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___GET_ANNOTATION__STRING = SDMPackage.EXTENSION___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___PROVIDE_ANNOTATION__STRING = SDMPackage.EXTENSION___PROVIDE_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Number Of Out Params</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP = SDMPackage.EXTENSION_OPERATION_COUNT + 0;

   /**
    * The number of operations of the '<em>Operation Extension</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int OPERATION_EXTENSION_OPERATION_COUNT = SDMPackage.EXTENSION_OPERATION_COUNT + 1;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.StoryNodeImpl <em>Story Node</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.StoryNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStoryNode()
    * @generated
    */
   int STORY_NODE = 6;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE__ANNOTATION = ACTIVITY_NODE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE__EXTENSION = ACTIVITY_NODE__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE__NAME = ACTIVITY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE__COMMENT = ACTIVITY_NODE__COMMENT;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

   /**
    * The feature id for the '<em><b>For Each</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE__FOR_EACH = ACTIVITY_NODE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Story Pattern</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE__STORY_PATTERN = ACTIVITY_NODE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Story Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 2;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___ECLASS = ACTIVITY_NODE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___EIS_PROXY = ACTIVITY_NODE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___ERESOURCE = ACTIVITY_NODE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___ECONTAINER = ACTIVITY_NODE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___ECONTAINING_FEATURE = ACTIVITY_NODE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___ECONTAINMENT_FEATURE = ACTIVITY_NODE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___ECONTENTS = ACTIVITY_NODE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___EALL_CONTENTS = ACTIVITY_NODE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___ECROSS_REFERENCES = ACTIVITY_NODE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___EGET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = ACTIVITY_NODE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___EIS_SET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___EUNSET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___EINVOKE__EOPERATION_ELIST = ACTIVITY_NODE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___GET_EXTENSION__ECLASS = ACTIVITY_NODE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___PROVIDE_EXTENSION__ECLASS = ACTIVITY_NODE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___GET_ANNOTATION__STRING = ACTIVITY_NODE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE___PROVIDE_ANNOTATION__STRING = ACTIVITY_NODE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Story Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STORY_NODE_OPERATION_COUNT = ACTIVITY_NODE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.JunctionNodeImpl <em>Junction Node</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.JunctionNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getJunctionNode()
    * @generated
    */
   int JUNCTION_NODE = 8;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.StartNodeImpl <em>Start Node</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.StartNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStartNode()
    * @generated
    */
   int START_NODE = 9;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.StatementNodeImpl <em>Statement Node</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.StatementNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStatementNode()
    * @generated
    */
   int STATEMENT_NODE = 10;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.StopNodeImpl <em>Stop Node</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.StopNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStopNode()
    * @generated
    */
   int STOP_NODE = 11;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.ActivityCallNodeImpl <em>Activity Call Node</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.ActivityCallNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getActivityCallNode()
    * @generated
    */
   int ACTIVITY_CALL_NODE = 12;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.MatchingStoryNodeImpl <em>Matching Story Node</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.MatchingStoryNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getMatchingStoryNode()
    * @generated
    */
   int MATCHING_STORY_NODE = 5;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE__ANNOTATION = STORY_NODE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE__EXTENSION = STORY_NODE__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE__NAME = STORY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE__COMMENT = STORY_NODE__COMMENT;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE__OUTGOING = STORY_NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE__OWNING_ACTIVITY = STORY_NODE__OWNING_ACTIVITY;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE__OWNING_ACTIVITY_NODE = STORY_NODE__OWNING_ACTIVITY_NODE;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE__INCOMING = STORY_NODE__INCOMING;

   /**
    * The feature id for the '<em><b>For Each</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE__FOR_EACH = STORY_NODE__FOR_EACH;

   /**
    * The feature id for the '<em><b>Story Pattern</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE__STORY_PATTERN = STORY_NODE__STORY_PATTERN;

   /**
    * The feature id for the '<em><b>Owned Pattern</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE__OWNED_PATTERN = STORY_NODE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Matching Story Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE_FEATURE_COUNT = STORY_NODE_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___ECLASS = STORY_NODE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___EIS_PROXY = STORY_NODE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___ERESOURCE = STORY_NODE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___ECONTAINER = STORY_NODE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___ECONTAINING_FEATURE = STORY_NODE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___ECONTAINMENT_FEATURE = STORY_NODE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___ECONTENTS = STORY_NODE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___EALL_CONTENTS = STORY_NODE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___ECROSS_REFERENCES = STORY_NODE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___EGET__ESTRUCTURALFEATURE = STORY_NODE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = STORY_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = STORY_NODE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___EIS_SET__ESTRUCTURALFEATURE = STORY_NODE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___EUNSET__ESTRUCTURALFEATURE = STORY_NODE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___EINVOKE__EOPERATION_ELIST = STORY_NODE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___GET_EXTENSION__ECLASS = STORY_NODE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___PROVIDE_EXTENSION__ECLASS = STORY_NODE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___GET_ANNOTATION__STRING = STORY_NODE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE___PROVIDE_ANNOTATION__STRING = STORY_NODE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Matching Story Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MATCHING_STORY_NODE_OPERATION_COUNT = STORY_NODE_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__ANNOTATION = ACTIVITY_NODE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__EXTENSION = ACTIVITY_NODE__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__NAME = ACTIVITY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__COMMENT = ACTIVITY_NODE__COMMENT;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

   /**
    * The feature id for the '<em><b>Owned Activity Node</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE__OWNED_ACTIVITY_NODE = ACTIVITY_NODE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Structured Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___ECLASS = ACTIVITY_NODE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___EIS_PROXY = ACTIVITY_NODE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___ERESOURCE = ACTIVITY_NODE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___ECONTAINER = ACTIVITY_NODE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___ECONTAINING_FEATURE = ACTIVITY_NODE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___ECONTAINMENT_FEATURE = ACTIVITY_NODE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___ECONTENTS = ACTIVITY_NODE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___EALL_CONTENTS = ACTIVITY_NODE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___ECROSS_REFERENCES = ACTIVITY_NODE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___EGET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = ACTIVITY_NODE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___EIS_SET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___EUNSET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___EINVOKE__EOPERATION_ELIST = ACTIVITY_NODE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___GET_EXTENSION__ECLASS = ACTIVITY_NODE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___PROVIDE_EXTENSION__ECLASS = ACTIVITY_NODE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___GET_ANNOTATION__STRING = ACTIVITY_NODE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE___PROVIDE_ANNOTATION__STRING = ACTIVITY_NODE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Structured Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STRUCTURED_NODE_OPERATION_COUNT = ACTIVITY_NODE_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE__ANNOTATION = ACTIVITY_NODE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE__EXTENSION = ACTIVITY_NODE__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE__NAME = ACTIVITY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE__COMMENT = ACTIVITY_NODE__COMMENT;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

   /**
    * The number of structural features of the '<em>Junction Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___ECLASS = ACTIVITY_NODE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___EIS_PROXY = ACTIVITY_NODE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___ERESOURCE = ACTIVITY_NODE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___ECONTAINER = ACTIVITY_NODE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___ECONTAINING_FEATURE = ACTIVITY_NODE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___ECONTAINMENT_FEATURE = ACTIVITY_NODE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___ECONTENTS = ACTIVITY_NODE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___EALL_CONTENTS = ACTIVITY_NODE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___ECROSS_REFERENCES = ACTIVITY_NODE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___EGET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = ACTIVITY_NODE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___EIS_SET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___EUNSET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___EINVOKE__EOPERATION_ELIST = ACTIVITY_NODE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___GET_EXTENSION__ECLASS = ACTIVITY_NODE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___PROVIDE_EXTENSION__ECLASS = ACTIVITY_NODE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___GET_ANNOTATION__STRING = ACTIVITY_NODE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE___PROVIDE_ANNOTATION__STRING = ACTIVITY_NODE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Junction Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JUNCTION_NODE_OPERATION_COUNT = ACTIVITY_NODE_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__ANNOTATION = ACTIVITY_NODE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__EXTENSION = ACTIVITY_NODE__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__NAME = ACTIVITY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__COMMENT = ACTIVITY_NODE__COMMENT;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

   /**
    * The number of structural features of the '<em>Start Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___ECLASS = ACTIVITY_NODE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___EIS_PROXY = ACTIVITY_NODE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___ERESOURCE = ACTIVITY_NODE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___ECONTAINER = ACTIVITY_NODE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___ECONTAINING_FEATURE = ACTIVITY_NODE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___ECONTAINMENT_FEATURE = ACTIVITY_NODE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___ECONTENTS = ACTIVITY_NODE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___EALL_CONTENTS = ACTIVITY_NODE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___ECROSS_REFERENCES = ACTIVITY_NODE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___EGET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = ACTIVITY_NODE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___EIS_SET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___EUNSET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___EINVOKE__EOPERATION_ELIST = ACTIVITY_NODE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___GET_EXTENSION__ECLASS = ACTIVITY_NODE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___PROVIDE_EXTENSION__ECLASS = ACTIVITY_NODE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___GET_ANNOTATION__STRING = ACTIVITY_NODE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE___PROVIDE_ANNOTATION__STRING = ACTIVITY_NODE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Start Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int START_NODE_OPERATION_COUNT = ACTIVITY_NODE_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__ANNOTATION = ACTIVITY_NODE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__EXTENSION = ACTIVITY_NODE__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__NAME = ACTIVITY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__COMMENT = ACTIVITY_NODE__COMMENT;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

   /**
    * The feature id for the '<em><b>Statement Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE__STATEMENT_EXPRESSION = ACTIVITY_NODE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Statement Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___ECLASS = ACTIVITY_NODE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___EIS_PROXY = ACTIVITY_NODE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___ERESOURCE = ACTIVITY_NODE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___ECONTAINER = ACTIVITY_NODE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___ECONTAINING_FEATURE = ACTIVITY_NODE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___ECONTAINMENT_FEATURE = ACTIVITY_NODE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___ECONTENTS = ACTIVITY_NODE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___EALL_CONTENTS = ACTIVITY_NODE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___ECROSS_REFERENCES = ACTIVITY_NODE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___EGET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = ACTIVITY_NODE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___EIS_SET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___EUNSET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___EINVOKE__EOPERATION_ELIST = ACTIVITY_NODE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___GET_EXTENSION__ECLASS = ACTIVITY_NODE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___PROVIDE_EXTENSION__ECLASS = ACTIVITY_NODE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___GET_ANNOTATION__STRING = ACTIVITY_NODE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE___PROVIDE_ANNOTATION__STRING = ACTIVITY_NODE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Statement Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STATEMENT_NODE_OPERATION_COUNT = ACTIVITY_NODE_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__ANNOTATION = ACTIVITY_NODE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__EXTENSION = ACTIVITY_NODE__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__NAME = ACTIVITY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__COMMENT = ACTIVITY_NODE__COMMENT;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

   /**
    * The feature id for the '<em><b>Flow Stop Only</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__FLOW_STOP_ONLY = ACTIVITY_NODE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Return Value</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__RETURN_VALUE = ACTIVITY_NODE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Return Values</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE__RETURN_VALUES = ACTIVITY_NODE_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Stop Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 3;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___ECLASS = ACTIVITY_NODE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___EIS_PROXY = ACTIVITY_NODE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___ERESOURCE = ACTIVITY_NODE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___ECONTAINER = ACTIVITY_NODE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___ECONTAINING_FEATURE = ACTIVITY_NODE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___ECONTAINMENT_FEATURE = ACTIVITY_NODE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___ECONTENTS = ACTIVITY_NODE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___EALL_CONTENTS = ACTIVITY_NODE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___ECROSS_REFERENCES = ACTIVITY_NODE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___EGET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = ACTIVITY_NODE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___EIS_SET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___EUNSET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___EINVOKE__EOPERATION_ELIST = ACTIVITY_NODE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___GET_EXTENSION__ECLASS = ACTIVITY_NODE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___PROVIDE_EXTENSION__ECLASS = ACTIVITY_NODE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___GET_ANNOTATION__STRING = ACTIVITY_NODE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE___PROVIDE_ANNOTATION__STRING = ACTIVITY_NODE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Stop Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int STOP_NODE_OPERATION_COUNT = ACTIVITY_NODE_OPERATION_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE__ANNOTATION = ACTIVITY_NODE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE__EXTENSION = ACTIVITY_NODE__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE__NAME = ACTIVITY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE__COMMENT = ACTIVITY_NODE__COMMENT;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE__OWNING_ACTIVITY = ACTIVITY_NODE__OWNING_ACTIVITY;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE__OWNING_ACTIVITY_NODE = ACTIVITY_NODE__OWNING_ACTIVITY_NODE;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

   /**
    * The feature id for the '<em><b>Owned Parameter Bindings</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE__OWNED_PARAMETER_BINDINGS = ACTIVITY_NODE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Callee</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE__CALLEE = ACTIVITY_NODE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Called Activity</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE__CALLED_ACTIVITY = ACTIVITY_NODE_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Activity Call Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 3;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___ECLASS = ACTIVITY_NODE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___EIS_PROXY = ACTIVITY_NODE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___ERESOURCE = ACTIVITY_NODE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___ECONTAINER = ACTIVITY_NODE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___ECONTAINING_FEATURE = ACTIVITY_NODE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___ECONTAINMENT_FEATURE = ACTIVITY_NODE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___ECONTENTS = ACTIVITY_NODE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___EALL_CONTENTS = ACTIVITY_NODE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___ECROSS_REFERENCES = ACTIVITY_NODE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___EGET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ACTIVITY_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = ACTIVITY_NODE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___EIS_SET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___EUNSET__ESTRUCTURALFEATURE = ACTIVITY_NODE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___EINVOKE__EOPERATION_ELIST = ACTIVITY_NODE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___GET_EXTENSION__ECLASS = ACTIVITY_NODE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___PROVIDE_EXTENSION__ECLASS = ACTIVITY_NODE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___GET_ANNOTATION__STRING = ACTIVITY_NODE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE___PROVIDE_ANNOTATION__STRING = ACTIVITY_NODE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Activity Call Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTIVITY_CALL_NODE_OPERATION_COUNT = ACTIVITY_NODE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.impl.ModifyingStoryNodeImpl <em>Modifying Story Node</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.activities.impl.ModifyingStoryNodeImpl
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getModifyingStoryNode()
    * @generated
    */
   int MODIFYING_STORY_NODE = 13;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE__ANNOTATION = STORY_NODE__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE__EXTENSION = STORY_NODE__EXTENSION;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE__NAME = STORY_NODE__NAME;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE__COMMENT = STORY_NODE__COMMENT;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE__OUTGOING = STORY_NODE__OUTGOING;

   /**
    * The feature id for the '<em><b>Owning Activity</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE__OWNING_ACTIVITY = STORY_NODE__OWNING_ACTIVITY;

   /**
    * The feature id for the '<em><b>Owning Activity Node</b></em>' container reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE__OWNING_ACTIVITY_NODE = STORY_NODE__OWNING_ACTIVITY_NODE;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE__INCOMING = STORY_NODE__INCOMING;

   /**
    * The feature id for the '<em><b>For Each</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE__FOR_EACH = STORY_NODE__FOR_EACH;

   /**
    * The feature id for the '<em><b>Story Pattern</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE__STORY_PATTERN = STORY_NODE__STORY_PATTERN;

   /**
    * The feature id for the '<em><b>Owned Rule</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE__OWNED_RULE = STORY_NODE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Modifying Story Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE_FEATURE_COUNT = STORY_NODE_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___ECLASS = STORY_NODE___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___EIS_PROXY = STORY_NODE___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___ERESOURCE = STORY_NODE___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___ECONTAINER = STORY_NODE___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___ECONTAINING_FEATURE = STORY_NODE___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___ECONTAINMENT_FEATURE = STORY_NODE___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___ECONTENTS = STORY_NODE___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___EALL_CONTENTS = STORY_NODE___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___ECROSS_REFERENCES = STORY_NODE___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___EGET__ESTRUCTURALFEATURE = STORY_NODE___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = STORY_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = STORY_NODE___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___EIS_SET__ESTRUCTURALFEATURE = STORY_NODE___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___EUNSET__ESTRUCTURALFEATURE = STORY_NODE___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___EINVOKE__EOPERATION_ELIST = STORY_NODE___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___GET_EXTENSION__ECLASS = STORY_NODE___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___PROVIDE_EXTENSION__ECLASS = STORY_NODE___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___GET_ANNOTATION__STRING = STORY_NODE___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE___PROVIDE_ANNOTATION__STRING = STORY_NODE___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Modifying Story Node</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MODIFYING_STORY_NODE_OPERATION_COUNT = STORY_NODE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.activities.EdgeGuard <em>Edge Guard</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.activities.EdgeGuard
    * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getEdgeGuard()
    * @generated
    */
   int EDGE_GUARD = 14;

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.Activity <em>Activity</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Activity</em>'.
    * @see org.storydriven.modeling.activities.Activity
    * @generated
    */
   EClass getActivity ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.activities.Activity#getOwnedActivityNodes <em>Owned Activity Node</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Owned Activity Node</em>'.
    * @see org.storydriven.modeling.activities.Activity#getOwnedActivityNodes()
    * @see #getActivity()
    * @generated
    */
   EReference getActivity_OwnedActivityNode ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.activities.Activity#getOwnedActivityEdges <em>Owned Activity Edge</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Owned Activity Edge</em>'.
    * @see org.storydriven.modeling.activities.Activity#getOwnedActivityEdges()
    * @see #getActivity()
    * @generated
    */
   EReference getActivity_OwnedActivityEdge ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.activities.Activity#getOwningOperation <em>Owning Operation</em>}'.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Owning Operation</em>'.
    * @see org.storydriven.modeling.activities.Activity#getOwningOperation()
    * @see #getActivity()
    * @generated
    */
   EReference getActivity_OwningOperation ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.activities.Activity#getPrecondition <em>Precondition</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the reference '<em>Precondition</em>'.
    * @see org.storydriven.modeling.activities.Activity#getPrecondition()
    * @see #getActivity()
    * @generated
    */
   EReference getActivity_Precondition ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.ActivityNode <em>Activity Node</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Activity Node</em>'.
    * @see org.storydriven.modeling.activities.ActivityNode
    * @generated
    */
   EClass getActivityNode ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.activities.ActivityNode#getIncomings <em>Incoming</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the reference list '<em>Incoming</em>'.
    * @see org.storydriven.modeling.activities.ActivityNode#getIncomings()
    * @see #getActivityNode()
    * @generated
    */
   EReference getActivityNode_Incoming ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.activities.ActivityNode#getOutgoings <em>Outgoing</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the reference list '<em>Outgoing</em>'.
    * @see org.storydriven.modeling.activities.ActivityNode#getOutgoings()
    * @see #getActivityNode()
    * @generated
    */
   EReference getActivityNode_Outgoing ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.activities.ActivityNode#getOwningActivityNode <em>Owning Activity Node</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the container reference '<em>Owning Activity Node</em>'.
    * @see org.storydriven.modeling.activities.ActivityNode#getOwningActivityNode()
    * @see #getActivityNode()
    * @generated
    */
   EReference getActivityNode_OwningActivityNode ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.activities.ActivityNode#getOwningActivity <em>Owning Activity</em>}'.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Owning Activity</em>'.
    * @see org.storydriven.modeling.activities.ActivityNode#getOwningActivity()
    * @see #getActivityNode()
    * @generated
    */
   EReference getActivityNode_OwningActivity ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.ActivityEdge <em>Activity Edge</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Activity Edge</em>'.
    * @see org.storydriven.modeling.activities.ActivityEdge
    * @generated
    */
   EClass getActivityEdge ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.activities.ActivityEdge#getSource <em>Source</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Source</em>'.
    * @see org.storydriven.modeling.activities.ActivityEdge#getSource()
    * @see #getActivityEdge()
    * @generated
    */
   EReference getActivityEdge_Source ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.activities.ActivityEdge#getGuardExpression <em>Guard Expression</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Guard Expression</em>'.
    * @see org.storydriven.modeling.activities.ActivityEdge#getGuardExpression()
    * @see #getActivityEdge()
    * @generated
    */
   EReference getActivityEdge_GuardExpression ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.activities.ActivityEdge#getOwningActivity <em>Owning Activity</em>}'.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Owning Activity</em>'.
    * @see org.storydriven.modeling.activities.ActivityEdge#getOwningActivity()
    * @see #getActivityEdge()
    * @generated
    */
   EReference getActivityEdge_OwningActivity ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.activities.ActivityEdge#getGuard <em>Guard</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Guard</em>'.
    * @see org.storydriven.modeling.activities.ActivityEdge#getGuard()
    * @see #getActivityEdge()
    * @generated
    */
   EAttribute getActivityEdge_Guard ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.activities.ActivityEdge#getGuardExceptions <em>Guard Exception</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Guard Exception</em>'.
    * @see org.storydriven.modeling.activities.ActivityEdge#getGuardExceptions()
    * @see #getActivityEdge()
    * @generated
    */
   EReference getActivityEdge_GuardException ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.activities.ActivityEdge#getTarget <em>Target</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Target</em>'.
    * @see org.storydriven.modeling.activities.ActivityEdge#getTarget()
    * @see #getActivityEdge()
    * @generated
    */
   EReference getActivityEdge_Target ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.ExceptionVariable <em>Exception Variable</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Exception Variable</em>'.
    * @see org.storydriven.modeling.activities.ExceptionVariable
    * @generated
    */
   EClass getExceptionVariable ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.activities.ExceptionVariable#getName <em>Name</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.storydriven.modeling.activities.ExceptionVariable#getName()
    * @see #getExceptionVariable()
    * @generated
    */
   EAttribute getExceptionVariable_Name ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.activities.ExceptionVariable#getExceptionTypes <em>Exception Type</em>}'.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Exception Type</em>'.
    * @see org.storydriven.modeling.activities.ExceptionVariable#getExceptionTypes()
    * @see #getExceptionVariable()
    * @generated
    */
   EReference getExceptionVariable_ExceptionType ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.activities.ExceptionVariable#getGenericExceptionTypes <em>Generic Exception Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Generic Exception Type</em>'.
    * @see org.storydriven.modeling.activities.ExceptionVariable#getGenericExceptionTypes()
    * @see #getExceptionVariable()
    * @generated
    */
   EReference getExceptionVariable_GenericExceptionType ();

   /**
    * Returns the meta object for the container reference '{@link org.storydriven.modeling.activities.ExceptionVariable#getActivityEdge <em>Activity Edge</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the container reference '<em>Activity Edge</em>'.
    * @see org.storydriven.modeling.activities.ExceptionVariable#getActivityEdge()
    * @see #getExceptionVariable()
    * @generated
    */
   EReference getExceptionVariable_ActivityEdge ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.StructuredNode <em>Structured Node</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Structured Node</em>'.
    * @see org.storydriven.modeling.activities.StructuredNode
    * @generated
    */
   EClass getStructuredNode ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.activities.StructuredNode#getOwnedActivityNodes <em>Owned Activity Node</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Owned Activity Node</em>'.
    * @see org.storydriven.modeling.activities.StructuredNode#getOwnedActivityNodes()
    * @see #getStructuredNode()
    * @generated
    */
   EReference getStructuredNode_OwnedActivityNode ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.OperationExtension <em>Operation Extension</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Operation Extension</em>'.
    * @see org.storydriven.modeling.activities.OperationExtension
    * @generated
    */
   EClass getOperationExtension ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.activities.OperationExtension#getOperation <em>Operation</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the reference '<em>Operation</em>'.
    * @see org.storydriven.modeling.activities.OperationExtension#getOperation()
    * @see #getOperationExtension()
    * @generated
    */
   EReference getOperationExtension_Operation ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.activities.OperationExtension#getReturnValue <em>Return Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Return Value</em>'.
    * @see org.storydriven.modeling.activities.OperationExtension#getReturnValue()
    * @see #getOperationExtension()
    * @generated
    */
   EReference getOperationExtension_ReturnValue ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.activities.OperationExtension#getOwnedActivity <em>Owned Activity</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Owned Activity</em>'.
    * @see org.storydriven.modeling.activities.OperationExtension#getOwnedActivity()
    * @see #getOperationExtension()
    * @generated
    */
   EReference getOperationExtension_OwnedActivity ();

   /**
    * Returns the meta object for the '{@link org.storydriven.modeling.activities.OperationExtension#NumberOfOutParams(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Out Params</em>}' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the '<em>Number Of Out Params</em>' operation.
    * @see org.storydriven.modeling.activities.OperationExtension#NumberOfOutParams(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
    * @generated
    */
   EOperation getOperationExtension__NumberOfOutParams__DiagnosticChain_Map ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.StoryNode <em>Story Node</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Story Node</em>'.
    * @see org.storydriven.modeling.activities.StoryNode
    * @generated
    */
   EClass getStoryNode ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.activities.StoryNode#isForEach <em>For Each</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>For Each</em>'.
    * @see org.storydriven.modeling.activities.StoryNode#isForEach()
    * @see #getStoryNode()
    * @generated
    */
   EAttribute getStoryNode_ForEach ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.activities.StoryNode#getStoryPattern <em>Story Pattern</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Story Pattern</em>'.
    * @see org.storydriven.modeling.activities.StoryNode#getStoryPattern()
    * @see #getStoryNode()
    * @generated
    */
   EReference getStoryNode_StoryPattern ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.JunctionNode <em>Junction Node</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Junction Node</em>'.
    * @see org.storydriven.modeling.activities.JunctionNode
    * @generated
    */
   EClass getJunctionNode ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.StartNode <em>Start Node</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Start Node</em>'.
    * @see org.storydriven.modeling.activities.StartNode
    * @generated
    */
   EClass getStartNode ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.StatementNode <em>Statement Node</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Statement Node</em>'.
    * @see org.storydriven.modeling.activities.StatementNode
    * @generated
    */
   EClass getStatementNode ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.activities.StatementNode#getStatementExpression <em>Statement Expression</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Statement Expression</em>'.
    * @see org.storydriven.modeling.activities.StatementNode#getStatementExpression()
    * @see #getStatementNode()
    * @generated
    */
   EReference getStatementNode_StatementExpression ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.StopNode <em>Stop Node</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Stop Node</em>'.
    * @see org.storydriven.modeling.activities.StopNode
    * @generated
    */
   EClass getStopNode ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.activities.StopNode#isFlowStopOnly <em>Flow Stop Only</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the attribute '<em>Flow Stop Only</em>'.
    * @see org.storydriven.modeling.activities.StopNode#isFlowStopOnly()
    * @see #getStopNode()
    * @generated
    */
   EAttribute getStopNode_FlowStopOnly ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.activities.StopNode#getReturnValue <em>Return Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Return Value</em>'.
    * @see org.storydriven.modeling.activities.StopNode#getReturnValue()
    * @see #getStopNode()
    * @generated
    */
   EReference getStopNode_ReturnValue ();

   /**
    * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.activities.StopNode#getReturnValues <em>Return Values</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Return Values</em>'.
    * @see org.storydriven.modeling.activities.StopNode#getReturnValues()
    * @see #getStopNode()
    * @generated
    */
   EReference getStopNode_ReturnValues ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.ActivityCallNode <em>Activity Call Node</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Activity Call Node</em>'.
    * @see org.storydriven.modeling.activities.ActivityCallNode
    * @generated
    */
   EClass getActivityCallNode ();

   /**
    * Returns the meta object for the reference list '{@link org.storydriven.modeling.activities.ActivityCallNode#getCalledActivities <em>Called Activity</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the reference list '<em>Called Activity</em>'.
    * @see org.storydriven.modeling.activities.ActivityCallNode#getCalledActivities()
    * @see #getActivityCallNode()
    * @generated
    */
   EReference getActivityCallNode_CalledActivity ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.MatchingStoryNode <em>Matching Story Node</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Matching Story Node</em>'.
    * @see org.storydriven.modeling.activities.MatchingStoryNode
    * @generated
    */
   EClass getMatchingStoryNode ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.activities.MatchingStoryNode#getOwnedPattern <em>Owned Pattern</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Owned Pattern</em>'.
    * @see org.storydriven.modeling.activities.MatchingStoryNode#getOwnedPattern()
    * @see #getMatchingStoryNode()
    * @generated
    */
   EReference getMatchingStoryNode_OwnedPattern ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.activities.ModifyingStoryNode <em>Modifying Story Node</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @return the meta object for class '<em>Modifying Story Node</em>'.
    * @see org.storydriven.modeling.activities.ModifyingStoryNode
    * @generated
    */
   EClass getModifyingStoryNode ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.activities.ModifyingStoryNode#getOwnedRule <em>Owned Rule</em>}'.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Owned Rule</em>'.
    * @see org.storydriven.modeling.activities.ModifyingStoryNode#getOwnedRule()
    * @see #getModifyingStoryNode()
    * @generated
    */
   EReference getModifyingStoryNode_OwnedRule ();

   /**
    * Returns the meta object for enum '{@link org.storydriven.modeling.activities.EdgeGuard <em>Edge Guard</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Edge Guard</em>'.
    * @see org.storydriven.modeling.activities.EdgeGuard
    * @generated
    */
   EEnum getEdgeGuard ();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   ActivitiesFactory getActivitiesFactory ();

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
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.ActivityImpl <em>Activity</em>}' class.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.ActivityImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getActivity()
       * @generated
       */
      EClass ACTIVITY = eINSTANCE.getActivity();

      /**
       * The meta object literal for the '<em><b>Owned Activity Node</b></em>' containment reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY__OWNED_ACTIVITY_NODE = eINSTANCE.getActivity_OwnedActivityNode();

      /**
       * The meta object literal for the '<em><b>Owned Activity Edge</b></em>' containment reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY__OWNED_ACTIVITY_EDGE = eINSTANCE.getActivity_OwnedActivityEdge();

      /**
       * The meta object literal for the '<em><b>Owning Operation</b></em>' container reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY__OWNING_OPERATION = eINSTANCE.getActivity_OwningOperation();

      /**
       * The meta object literal for the '<em><b>Precondition</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY__PRECONDITION = eINSTANCE.getActivity_Precondition();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.ActivityNodeImpl <em>Activity Node</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
       * -->
       * 
       * @see org.storydriven.modeling.activities.impl.ActivityNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getActivityNode()
       * @generated
       */
      EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

      /**
       * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_NODE__INCOMING = eINSTANCE.getActivityNode_Incoming();

      /**
       * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_NODE__OUTGOING = eINSTANCE.getActivityNode_Outgoing();

      /**
       * The meta object literal for the '<em><b>Owning Activity Node</b></em>' container reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_NODE__OWNING_ACTIVITY_NODE = eINSTANCE.getActivityNode_OwningActivityNode();

      /**
       * The meta object literal for the '<em><b>Owning Activity</b></em>' container reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_NODE__OWNING_ACTIVITY = eINSTANCE.getActivityNode_OwningActivity();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
       * -->
       * 
       * @see org.storydriven.modeling.activities.impl.ActivityEdgeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getActivityEdge()
       * @generated
       */
      EClass ACTIVITY_EDGE = eINSTANCE.getActivityEdge();

      /**
       * The meta object literal for the '<em><b>Source</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_EDGE__SOURCE = eINSTANCE.getActivityEdge_Source();

      /**
       * The meta object literal for the '<em><b>Guard Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_EDGE__GUARD_EXPRESSION = eINSTANCE.getActivityEdge_GuardExpression();

      /**
       * The meta object literal for the '<em><b>Owning Activity</b></em>' container reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_EDGE__OWNING_ACTIVITY = eINSTANCE.getActivityEdge_OwningActivity();

      /**
       * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ACTIVITY_EDGE__GUARD = eINSTANCE.getActivityEdge_Guard();

      /**
       * The meta object literal for the '<em><b>Guard Exception</b></em>' containment reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_EDGE__GUARD_EXCEPTION = eINSTANCE.getActivityEdge_GuardException();

      /**
       * The meta object literal for the '<em><b>Target</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_EDGE__TARGET = eINSTANCE.getActivityEdge_Target();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.ExceptionVariableImpl <em>Exception Variable</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.ExceptionVariableImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getExceptionVariable()
       * @generated
       */
      EClass EXCEPTION_VARIABLE = eINSTANCE.getExceptionVariable();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EAttribute EXCEPTION_VARIABLE__NAME = eINSTANCE.getExceptionVariable_Name();

      /**
       * The meta object literal for the '<em><b>Exception Type</b></em>' reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference EXCEPTION_VARIABLE__EXCEPTION_TYPE = eINSTANCE.getExceptionVariable_ExceptionType();

      /**
       * The meta object literal for the '<em><b>Generic Exception Type</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EXCEPTION_VARIABLE__GENERIC_EXCEPTION_TYPE = eINSTANCE.getExceptionVariable_GenericExceptionType();

      /**
       * The meta object literal for the '<em><b>Activity Edge</b></em>' container reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference EXCEPTION_VARIABLE__ACTIVITY_EDGE = eINSTANCE.getExceptionVariable_ActivityEdge();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.StructuredNodeImpl <em>Structured Node</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.StructuredNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStructuredNode()
       * @generated
       */
      EClass STRUCTURED_NODE = eINSTANCE.getStructuredNode();

      /**
       * The meta object literal for the '<em><b>Owned Activity Node</b></em>' containment reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference STRUCTURED_NODE__OWNED_ACTIVITY_NODE = eINSTANCE.getStructuredNode_OwnedActivityNode();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.OperationExtensionImpl <em>Operation Extension</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.OperationExtensionImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getOperationExtension()
       * @generated
       */
      EClass OPERATION_EXTENSION = eINSTANCE.getOperationExtension();

      /**
       * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference OPERATION_EXTENSION__OPERATION = eINSTANCE.getOperationExtension_Operation();

      /**
       * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference OPERATION_EXTENSION__RETURN_VALUE = eINSTANCE.getOperationExtension_ReturnValue();

      /**
       * The meta object literal for the '<em><b>Owned Activity</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference OPERATION_EXTENSION__OWNED_ACTIVITY = eINSTANCE.getOperationExtension_OwnedActivity();

      /**
       * The meta object literal for the '<em><b>Number Of Out Params</b></em>' operation.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EOperation OPERATION_EXTENSION___NUMBER_OF_OUT_PARAMS__DIAGNOSTICCHAIN_MAP = eINSTANCE
         .getOperationExtension__NumberOfOutParams__DiagnosticChain_Map();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.StoryNodeImpl <em>Story Node</em>}' class.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.StoryNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStoryNode()
       * @generated
       */
      EClass STORY_NODE = eINSTANCE.getStoryNode();

      /**
       * The meta object literal for the '<em><b>For Each</b></em>' attribute feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EAttribute STORY_NODE__FOR_EACH = eINSTANCE.getStoryNode_ForEach();

      /**
       * The meta object literal for the '<em><b>Story Pattern</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference STORY_NODE__STORY_PATTERN = eINSTANCE.getStoryNode_StoryPattern();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.JunctionNodeImpl <em>Junction Node</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
       * -->
       * 
       * @see org.storydriven.modeling.activities.impl.JunctionNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getJunctionNode()
       * @generated
       */
      EClass JUNCTION_NODE = eINSTANCE.getJunctionNode();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.StartNodeImpl <em>Start Node</em>}' class.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.StartNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStartNode()
       * @generated
       */
      EClass START_NODE = eINSTANCE.getStartNode();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.StatementNodeImpl <em>Statement Node</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.StatementNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStatementNode()
       * @generated
       */
      EClass STATEMENT_NODE = eINSTANCE.getStatementNode();

      /**
       * The meta object literal for the '<em><b>Statement Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference STATEMENT_NODE__STATEMENT_EXPRESSION = eINSTANCE.getStatementNode_StatementExpression();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.StopNodeImpl <em>Stop Node</em>}' class.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.StopNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getStopNode()
       * @generated
       */
      EClass STOP_NODE = eINSTANCE.getStopNode();

      /**
       * The meta object literal for the '<em><b>Flow Stop Only</b></em>' attribute feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EAttribute STOP_NODE__FLOW_STOP_ONLY = eINSTANCE.getStopNode_FlowStopOnly();

      /**
       * The meta object literal for the '<em><b>Return Value</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference STOP_NODE__RETURN_VALUE = eINSTANCE.getStopNode_ReturnValue();

      /**
       * The meta object literal for the '<em><b>Return Values</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference STOP_NODE__RETURN_VALUES = eINSTANCE.getStopNode_ReturnValues();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.ActivityCallNodeImpl <em>Activity Call Node</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.ActivityCallNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getActivityCallNode()
       * @generated
       */
      EClass ACTIVITY_CALL_NODE = eINSTANCE.getActivityCallNode();

      /**
       * The meta object literal for the '<em><b>Called Activity</b></em>' reference list feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference ACTIVITY_CALL_NODE__CALLED_ACTIVITY = eINSTANCE.getActivityCallNode_CalledActivity();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.MatchingStoryNodeImpl <em>Matching Story Node</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.MatchingStoryNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getMatchingStoryNode()
       * @generated
       */
      EClass MATCHING_STORY_NODE = eINSTANCE.getMatchingStoryNode();

      /**
       * The meta object literal for the '<em><b>Owned Pattern</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference MATCHING_STORY_NODE__OWNED_PATTERN = eINSTANCE.getMatchingStoryNode_OwnedPattern();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.impl.ModifyingStoryNodeImpl <em>Modifying Story Node</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.activities.impl.ModifyingStoryNodeImpl
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getModifyingStoryNode()
       * @generated
       */
      EClass MODIFYING_STORY_NODE = eINSTANCE.getModifyingStoryNode();

      /**
       * The meta object literal for the '<em><b>Owned Rule</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference MODIFYING_STORY_NODE__OWNED_RULE = eINSTANCE.getModifyingStoryNode_OwnedRule();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.activities.EdgeGuard <em>Edge Guard</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.activities.EdgeGuard
       * @see org.storydriven.modeling.activities.impl.ActivitiesPackageImpl#getEdgeGuard()
       * @generated
       */
      EEnum EDGE_GUARD = eINSTANCE.getEdgeGuard();

   }

} // ActivitiesPackage
