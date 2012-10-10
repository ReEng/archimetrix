/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * The base package for all expressions which can be used for modeling activities
 * and patterns.
 * <!-- end-model-doc -->
 * @see org.storydriven.modeling.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "expressions";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://ns.storydriven.org/sdm/expressions/0.1.0";

   /**
    * The package namespace name.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "sdme";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   ExpressionsPackage eINSTANCE = org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl.init();

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.expressions.impl.ExpressionImpl
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getExpression()
    * @generated
    */
   int EXPRESSION = 7;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION__ANNOTATION = SDMPackage.TYPED_ELEMENT__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION__EXTENSION = SDMPackage.TYPED_ELEMENT__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION__TYPE = SDMPackage.TYPED_ELEMENT__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION__GENERIC_TYPE = SDMPackage.TYPED_ELEMENT__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION__COMMENT = SDMPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION_FEATURE_COUNT = SDMPackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___ECLASS = SDMPackage.TYPED_ELEMENT___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___EIS_PROXY = SDMPackage.TYPED_ELEMENT___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___ERESOURCE = SDMPackage.TYPED_ELEMENT___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___ECONTAINER = SDMPackage.TYPED_ELEMENT___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___ECONTAINING_FEATURE = SDMPackage.TYPED_ELEMENT___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___ECONTAINMENT_FEATURE = SDMPackage.TYPED_ELEMENT___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___ECONTENTS = SDMPackage.TYPED_ELEMENT___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___EALL_CONTENTS = SDMPackage.TYPED_ELEMENT___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___ECROSS_REFERENCES = SDMPackage.TYPED_ELEMENT___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___EGET__ESTRUCTURALFEATURE = SDMPackage.TYPED_ELEMENT___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = SDMPackage.TYPED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = SDMPackage.TYPED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = SDMPackage.TYPED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___EUNSET__ESTRUCTURALFEATURE = SDMPackage.TYPED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___EINVOKE__EOPERATION_ELIST = SDMPackage.TYPED_ELEMENT___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___GET_EXTENSION__ECLASS = SDMPackage.TYPED_ELEMENT___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___PROVIDE_EXTENSION__ECLASS = SDMPackage.TYPED_ELEMENT___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___GET_ANNOTATION__STRING = SDMPackage.TYPED_ELEMENT___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION___PROVIDE_ANNOTATION__STRING = SDMPackage.TYPED_ELEMENT___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EXPRESSION_OPERATION_COUNT = SDMPackage.TYPED_ELEMENT_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.impl.TextualExpressionImpl <em>Textual Expression</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.expressions.impl.TextualExpressionImpl
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getTextualExpression()
    * @generated
    */
   int TEXTUAL_EXPRESSION = 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION__ANNOTATION = EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION__EXTENSION = EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION__TYPE = EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION__GENERIC_TYPE = EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION__COMMENT = EXPRESSION__COMMENT;

   /**
    * The feature id for the '<em><b>Expression Text</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION__EXPRESSION_TEXT = EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Language</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION__LANGUAGE = EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Language Version</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION__LANGUAGE_VERSION = EXPRESSION_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Textual Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___ECLASS = EXPRESSION___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___EIS_PROXY = EXPRESSION___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___ERESOURCE = EXPRESSION___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___ECONTAINER = EXPRESSION___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___ECONTAINING_FEATURE = EXPRESSION___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___ECONTAINMENT_FEATURE = EXPRESSION___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___ECONTENTS = EXPRESSION___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___EALL_CONTENTS = EXPRESSION___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___ECROSS_REFERENCES = EXPRESSION___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___EGET__ESTRUCTURALFEATURE = EXPRESSION___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___EUNSET__ESTRUCTURALFEATURE = EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___EINVOKE__EOPERATION_ELIST = EXPRESSION___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___GET_EXTENSION__ECLASS = EXPRESSION___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___PROVIDE_EXTENSION__ECLASS = EXPRESSION___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___GET_ANNOTATION__STRING = EXPRESSION___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION___PROVIDE_ANNOTATION__STRING = EXPRESSION___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Textual Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TEXTUAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.expressions.impl.LiteralExpressionImpl
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getLiteralExpression()
    * @generated
    */
   int LITERAL_EXPRESSION = 1;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION__ANNOTATION = EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION__EXTENSION = EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION__TYPE = EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION__GENERIC_TYPE = EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION__COMMENT = EXPRESSION__COMMENT;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Value Type</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION__VALUE_TYPE = EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Literal Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___ECLASS = EXPRESSION___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___EIS_PROXY = EXPRESSION___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___ERESOURCE = EXPRESSION___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___ECONTAINER = EXPRESSION___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___ECONTAINING_FEATURE = EXPRESSION___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___ECONTAINMENT_FEATURE = EXPRESSION___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___ECONTENTS = EXPRESSION___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___EALL_CONTENTS = EXPRESSION___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___ECROSS_REFERENCES = EXPRESSION___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___EGET__ESTRUCTURALFEATURE = EXPRESSION___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___EUNSET__ESTRUCTURALFEATURE = EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___EINVOKE__EOPERATION_ELIST = EXPRESSION___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___GET_EXTENSION__ECLASS = EXPRESSION___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___PROVIDE_EXTENSION__ECLASS = EXPRESSION___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___GET_ANNOTATION__STRING = EXPRESSION___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION___PROVIDE_ANNOTATION__STRING = EXPRESSION___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Literal Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LITERAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.impl.NotExpressionImpl <em>Not Expression</em>}' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.expressions.impl.NotExpressionImpl
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getNotExpression()
    * @generated
    */
   int NOT_EXPRESSION = 2;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION__ANNOTATION = EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION__EXTENSION = EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION__TYPE = EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION__GENERIC_TYPE = EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION__COMMENT = EXPRESSION__COMMENT;

   /**
    * The feature id for the '<em><b>Negated Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION__NEGATED_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Not Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___ECLASS = EXPRESSION___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___EIS_PROXY = EXPRESSION___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___ERESOURCE = EXPRESSION___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___ECONTAINER = EXPRESSION___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___ECONTAINING_FEATURE = EXPRESSION___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___ECONTAINMENT_FEATURE = EXPRESSION___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___ECONTENTS = EXPRESSION___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___EALL_CONTENTS = EXPRESSION___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___ECROSS_REFERENCES = EXPRESSION___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___EGET__ESTRUCTURALFEATURE = EXPRESSION___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___EUNSET__ESTRUCTURALFEATURE = EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___EINVOKE__EOPERATION_ELIST = EXPRESSION___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___GET_EXTENSION__ECLASS = EXPRESSION___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___PROVIDE_EXTENSION__ECLASS = EXPRESSION___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___GET_ANNOTATION__STRING = EXPRESSION___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION___PROVIDE_ANNOTATION__STRING = EXPRESSION___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Not Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NOT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.expressions.impl.BinaryExpressionImpl
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getBinaryExpression()
    * @generated
    */
   int BINARY_EXPRESSION = 3;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION__ANNOTATION = EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION__EXTENSION = EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION__TYPE = EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION__GENERIC_TYPE = EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION__COMMENT = EXPRESSION__COMMENT;

   /**
    * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION__LEFT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION__RIGHT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Binary Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___ECLASS = EXPRESSION___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___EIS_PROXY = EXPRESSION___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___ERESOURCE = EXPRESSION___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___ECONTAINER = EXPRESSION___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___ECONTAINING_FEATURE = EXPRESSION___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___ECONTAINMENT_FEATURE = EXPRESSION___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___ECONTENTS = EXPRESSION___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___EALL_CONTENTS = EXPRESSION___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___ECROSS_REFERENCES = EXPRESSION___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___EGET__ESTRUCTURALFEATURE = EXPRESSION___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___EUNSET__ESTRUCTURALFEATURE = EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___EINVOKE__EOPERATION_ELIST = EXPRESSION___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___GET_EXTENSION__ECLASS = EXPRESSION___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___PROVIDE_EXTENSION__ECLASS = EXPRESSION___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___GET_ANNOTATION__STRING = EXPRESSION___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION___PROVIDE_ANNOTATION__STRING = EXPRESSION___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Binary Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.impl.ComparisonExpressionImpl <em>Comparison Expression</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.expressions.impl.ComparisonExpressionImpl
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getComparisonExpression()
    * @generated
    */
   int COMPARISON_EXPRESSION = 4;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION__EXTENSION = BINARY_EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION__TYPE = BINARY_EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION__GENERIC_TYPE = BINARY_EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION__COMMENT = BINARY_EXPRESSION__COMMENT;

   /**
    * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION__LEFT_EXPRESSION = BINARY_EXPRESSION__LEFT_EXPRESSION;

   /**
    * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION__RIGHT_EXPRESSION = BINARY_EXPRESSION__RIGHT_EXPRESSION;

   /**
    * The feature id for the '<em><b>Operator</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Comparison Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___ECLASS = BINARY_EXPRESSION___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___EIS_PROXY = BINARY_EXPRESSION___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___ERESOURCE = BINARY_EXPRESSION___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___ECONTAINER = BINARY_EXPRESSION___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___ECONTAINING_FEATURE = BINARY_EXPRESSION___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___ECONTAINMENT_FEATURE = BINARY_EXPRESSION___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___ECONTENTS = BINARY_EXPRESSION___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___EALL_CONTENTS = BINARY_EXPRESSION___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___ECROSS_REFERENCES = BINARY_EXPRESSION___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___EGET__ESTRUCTURALFEATURE = BINARY_EXPRESSION___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = BINARY_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = BINARY_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = BINARY_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___EUNSET__ESTRUCTURALFEATURE = BINARY_EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___EINVOKE__EOPERATION_ELIST = BINARY_EXPRESSION___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___GET_EXTENSION__ECLASS = BINARY_EXPRESSION___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___PROVIDE_EXTENSION__ECLASS = BINARY_EXPRESSION___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___GET_ANNOTATION__STRING = BINARY_EXPRESSION___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION___PROVIDE_ANNOTATION__STRING = BINARY_EXPRESSION___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Comparison Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPARISON_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.expressions.impl.ArithmeticExpressionImpl
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getArithmeticExpression()
    * @generated
    */
   int ARITHMETIC_EXPRESSION = 5;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION__EXTENSION = BINARY_EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION__TYPE = BINARY_EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION__GENERIC_TYPE = BINARY_EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION__COMMENT = BINARY_EXPRESSION__COMMENT;

   /**
    * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION__LEFT_EXPRESSION = BINARY_EXPRESSION__LEFT_EXPRESSION;

   /**
    * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION__RIGHT_EXPRESSION = BINARY_EXPRESSION__RIGHT_EXPRESSION;

   /**
    * The feature id for the '<em><b>Operator</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Arithmetic Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___ECLASS = BINARY_EXPRESSION___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___EIS_PROXY = BINARY_EXPRESSION___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___ERESOURCE = BINARY_EXPRESSION___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___ECONTAINER = BINARY_EXPRESSION___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___ECONTAINING_FEATURE = BINARY_EXPRESSION___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___ECONTAINMENT_FEATURE = BINARY_EXPRESSION___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___ECONTENTS = BINARY_EXPRESSION___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___EALL_CONTENTS = BINARY_EXPRESSION___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___ECROSS_REFERENCES = BINARY_EXPRESSION___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___EGET__ESTRUCTURALFEATURE = BINARY_EXPRESSION___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = BINARY_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = BINARY_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = BINARY_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___EUNSET__ESTRUCTURALFEATURE = BINARY_EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___EINVOKE__EOPERATION_ELIST = BINARY_EXPRESSION___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___GET_EXTENSION__ECLASS = BINARY_EXPRESSION___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___PROVIDE_EXTENSION__ECLASS = BINARY_EXPRESSION___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___GET_ANNOTATION__STRING = BINARY_EXPRESSION___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION___PROVIDE_ANNOTATION__STRING = BINARY_EXPRESSION___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Arithmetic Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ARITHMETIC_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.impl.BinaryLogicExpressionImpl <em>Binary Logic Expression</em>}' class.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @see org.storydriven.modeling.expressions.impl.BinaryLogicExpressionImpl
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getBinaryLogicExpression()
    * @generated
    */
   int BINARY_LOGIC_EXPRESSION = 6;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION__EXTENSION = BINARY_EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION__TYPE = BINARY_EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION__GENERIC_TYPE = BINARY_EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION__COMMENT = BINARY_EXPRESSION__COMMENT;

   /**
    * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION__LEFT_EXPRESSION = BINARY_EXPRESSION__LEFT_EXPRESSION;

   /**
    * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION__RIGHT_EXPRESSION = BINARY_EXPRESSION__RIGHT_EXPRESSION;

   /**
    * The feature id for the '<em><b>Operator</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Binary Logic Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___ECLASS = BINARY_EXPRESSION___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___EIS_PROXY = BINARY_EXPRESSION___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___ERESOURCE = BINARY_EXPRESSION___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___ECONTAINER = BINARY_EXPRESSION___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___ECONTAINING_FEATURE = BINARY_EXPRESSION___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___ECONTAINMENT_FEATURE = BINARY_EXPRESSION___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___ECONTENTS = BINARY_EXPRESSION___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___EALL_CONTENTS = BINARY_EXPRESSION___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___ECROSS_REFERENCES = BINARY_EXPRESSION___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___EGET__ESTRUCTURALFEATURE = BINARY_EXPRESSION___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = BINARY_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = BINARY_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = BINARY_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___EUNSET__ESTRUCTURALFEATURE = BINARY_EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___EINVOKE__EOPERATION_ELIST = BINARY_EXPRESSION___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___GET_EXTENSION__ECLASS = BINARY_EXPRESSION___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___PROVIDE_EXTENSION__ECLASS = BINARY_EXPRESSION___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___GET_ANNOTATION__STRING = BINARY_EXPRESSION___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION___PROVIDE_ANNOTATION__STRING = BINARY_EXPRESSION___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Binary Logic Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINARY_LOGIC_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.LogicOperator <em>Logic Operator</em>}' enum.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.expressions.LogicOperator
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getLogicOperator()
    * @generated
    */
   int LOGIC_OPERATOR = 8;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.ComparingOperator <em>Comparing Operator</em>}' enum.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.expressions.ComparingOperator
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getComparingOperator()
    * @generated
    */
   int COMPARING_OPERATOR = 9;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see org.storydriven.modeling.expressions.ArithmeticOperator
    * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getArithmeticOperator()
    * @generated
    */
   int ARITHMETIC_OPERATOR = 10;

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.expressions.Expression <em>Expression</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Expression</em>'.
    * @see org.storydriven.modeling.expressions.Expression
    * @generated
    */
   EClass getExpression ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.expressions.TextualExpression <em>Textual Expression</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Textual Expression</em>'.
    * @see org.storydriven.modeling.expressions.TextualExpression
    * @generated
    */
   EClass getTextualExpression ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.expressions.TextualExpression#getExpressionText <em>Expression Text</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Expression Text</em>'.
    * @see org.storydriven.modeling.expressions.TextualExpression#getExpressionText()
    * @see #getTextualExpression()
    * @generated
    */
   EAttribute getTextualExpression_ExpressionText ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.expressions.TextualExpression#getLanguage <em>Language</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the attribute '<em>Language</em>'.
    * @see org.storydriven.modeling.expressions.TextualExpression#getLanguage()
    * @see #getTextualExpression()
    * @generated
    */
   EAttribute getTextualExpression_Language ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.expressions.TextualExpression#getLanguageVersion <em>Language Version</em>}'.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Language Version</em>'.
    * @see org.storydriven.modeling.expressions.TextualExpression#getLanguageVersion()
    * @see #getTextualExpression()
    * @generated
    */
   EAttribute getTextualExpression_LanguageVersion ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.expressions.LiteralExpression <em>Literal Expression</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Literal Expression</em>'.
    * @see org.storydriven.modeling.expressions.LiteralExpression
    * @generated
    */
   EClass getLiteralExpression ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.expressions.LiteralExpression#getValue <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see org.storydriven.modeling.expressions.LiteralExpression#getValue()
    * @see #getLiteralExpression()
    * @generated
    */
   EAttribute getLiteralExpression_Value ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.expressions.LiteralExpression#getValueType <em>Value Type</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the reference '<em>Value Type</em>'.
    * @see org.storydriven.modeling.expressions.LiteralExpression#getValueType()
    * @see #getLiteralExpression()
    * @generated
    */
   EReference getLiteralExpression_ValueType ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.expressions.NotExpression <em>Not Expression</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Not Expression</em>'.
    * @see org.storydriven.modeling.expressions.NotExpression
    * @generated
    */
   EClass getNotExpression ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.expressions.NotExpression#getNegatedExpression <em>Negated Expression</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Negated Expression</em>'.
    * @see org.storydriven.modeling.expressions.NotExpression#getNegatedExpression()
    * @see #getNotExpression()
    * @generated
    */
   EReference getNotExpression_NegatedExpression ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.expressions.BinaryExpression <em>Binary Expression</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for class '<em>Binary Expression</em>'.
    * @see org.storydriven.modeling.expressions.BinaryExpression
    * @generated
    */
   EClass getBinaryExpression ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.expressions.BinaryExpression#getLeftExpression <em>Left Expression</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Left Expression</em>'.
    * @see org.storydriven.modeling.expressions.BinaryExpression#getLeftExpression()
    * @see #getBinaryExpression()
    * @generated
    */
   EReference getBinaryExpression_LeftExpression ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.expressions.BinaryExpression#getRightExpression <em>Right Expression</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Right Expression</em>'.
    * @see org.storydriven.modeling.expressions.BinaryExpression#getRightExpression()
    * @see #getBinaryExpression()
    * @generated
    */
   EReference getBinaryExpression_RightExpression ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.expressions.ComparisonExpression <em>Comparison Expression</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for class '<em>Comparison Expression</em>'.
    * @see org.storydriven.modeling.expressions.ComparisonExpression
    * @generated
    */
   EClass getComparisonExpression ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.expressions.ComparisonExpression#getOperator <em>Operator</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the attribute '<em>Operator</em>'.
    * @see org.storydriven.modeling.expressions.ComparisonExpression#getOperator()
    * @see #getComparisonExpression()
    * @generated
    */
   EAttribute getComparisonExpression_Operator ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.expressions.ArithmeticExpression <em>Arithmetic Expression</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for class '<em>Arithmetic Expression</em>'.
    * @see org.storydriven.modeling.expressions.ArithmeticExpression
    * @generated
    */
   EClass getArithmeticExpression ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.expressions.ArithmeticExpression#getOperator <em>Operator</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the attribute '<em>Operator</em>'.
    * @see org.storydriven.modeling.expressions.ArithmeticExpression#getOperator()
    * @see #getArithmeticExpression()
    * @generated
    */
   EAttribute getArithmeticExpression_Operator ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.expressions.BinaryLogicExpression <em>Binary Logic Expression</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for class '<em>Binary Logic Expression</em>'.
    * @see org.storydriven.modeling.expressions.BinaryLogicExpression
    * @generated
    */
   EClass getBinaryLogicExpression ();

   /**
    * Returns the meta object for the attribute '{@link org.storydriven.modeling.expressions.BinaryLogicExpression#getOperator <em>Operator</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for the attribute '<em>Operator</em>'.
    * @see org.storydriven.modeling.expressions.BinaryLogicExpression#getOperator()
    * @see #getBinaryLogicExpression()
    * @generated
    */
   EAttribute getBinaryLogicExpression_Operator ();

   /**
    * Returns the meta object for enum '{@link org.storydriven.modeling.expressions.LogicOperator <em>Logic Operator</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for enum '<em>Logic Operator</em>'.
    * @see org.storydriven.modeling.expressions.LogicOperator
    * @generated
    */
   EEnum getLogicOperator ();

   /**
    * Returns the meta object for enum '{@link org.storydriven.modeling.expressions.ComparingOperator <em>Comparing Operator</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for enum '<em>Comparing Operator</em>'.
    * @see org.storydriven.modeling.expressions.ComparingOperator
    * @generated
    */
   EEnum getComparingOperator ();

   /**
    * Returns the meta object for enum '{@link org.storydriven.modeling.expressions.ArithmeticOperator <em>Arithmetic Operator</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for enum '<em>Arithmetic Operator</em>'.
    * @see org.storydriven.modeling.expressions.ArithmeticOperator
    * @generated
    */
   EEnum getArithmeticOperator ();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   ExpressionsFactory getExpressionsFactory ();

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
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @see org.storydriven.modeling.expressions.impl.ExpressionImpl
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getExpression()
       * @generated
       */
      EClass EXPRESSION = eINSTANCE.getExpression();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.impl.TextualExpressionImpl <em>Textual Expression</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.expressions.impl.TextualExpressionImpl
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getTextualExpression()
       * @generated
       */
      EClass TEXTUAL_EXPRESSION = eINSTANCE.getTextualExpression();

      /**
       * The meta object literal for the '<em><b>Expression Text</b></em>' attribute feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EAttribute TEXTUAL_EXPRESSION__EXPRESSION_TEXT = eINSTANCE.getTextualExpression_ExpressionText();

      /**
       * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EAttribute TEXTUAL_EXPRESSION__LANGUAGE = eINSTANCE.getTextualExpression_Language();

      /**
       * The meta object literal for the '<em><b>Language Version</b></em>' attribute feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EAttribute TEXTUAL_EXPRESSION__LANGUAGE_VERSION = eINSTANCE.getTextualExpression_LanguageVersion();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.expressions.impl.LiteralExpressionImpl
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getLiteralExpression()
       * @generated
       */
      EClass LITERAL_EXPRESSION = eINSTANCE.getLiteralExpression();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EAttribute LITERAL_EXPRESSION__VALUE = eINSTANCE.getLiteralExpression_Value();

      /**
       * The meta object literal for the '<em><b>Value Type</b></em>' reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference LITERAL_EXPRESSION__VALUE_TYPE = eINSTANCE.getLiteralExpression_ValueType();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.impl.NotExpressionImpl <em>Not Expression</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.expressions.impl.NotExpressionImpl
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getNotExpression()
       * @generated
       */
      EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

      /**
       * The meta object literal for the '<em><b>Negated Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference NOT_EXPRESSION__NEGATED_EXPRESSION = eINSTANCE.getNotExpression_NegatedExpression();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.expressions.impl.BinaryExpressionImpl
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getBinaryExpression()
       * @generated
       */
      EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

      /**
       * The meta object literal for the '<em><b>Left Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference BINARY_EXPRESSION__LEFT_EXPRESSION = eINSTANCE.getBinaryExpression_LeftExpression();

      /**
       * The meta object literal for the '<em><b>Right Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference BINARY_EXPRESSION__RIGHT_EXPRESSION = eINSTANCE.getBinaryExpression_RightExpression();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.impl.ComparisonExpressionImpl <em>Comparison Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.expressions.impl.ComparisonExpressionImpl
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getComparisonExpression()
       * @generated
       */
      EClass COMPARISON_EXPRESSION = eINSTANCE.getComparisonExpression();

      /**
       * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EAttribute COMPARISON_EXPRESSION__OPERATOR = eINSTANCE.getComparisonExpression_Operator();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.expressions.impl.ArithmeticExpressionImpl
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getArithmeticExpression()
       * @generated
       */
      EClass ARITHMETIC_EXPRESSION = eINSTANCE.getArithmeticExpression();

      /**
       * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EAttribute ARITHMETIC_EXPRESSION__OPERATOR = eINSTANCE.getArithmeticExpression_Operator();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.impl.BinaryLogicExpressionImpl <em>Binary Logic Expression</em>}' class.
       * <!-- begin-user-doc
       * --> <!-- end-user-doc -->
       * @see org.storydriven.modeling.expressions.impl.BinaryLogicExpressionImpl
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getBinaryLogicExpression()
       * @generated
       */
      EClass BINARY_LOGIC_EXPRESSION = eINSTANCE.getBinaryLogicExpression();

      /**
       * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EAttribute BINARY_LOGIC_EXPRESSION__OPERATOR = eINSTANCE.getBinaryLogicExpression_Operator();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.LogicOperator <em>Logic Operator</em>}' enum.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @see org.storydriven.modeling.expressions.LogicOperator
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getLogicOperator()
       * @generated
       */
      EEnum LOGIC_OPERATOR = eINSTANCE.getLogicOperator();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.ComparingOperator <em>Comparing Operator</em>}' enum.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.expressions.ComparingOperator
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getComparingOperator()
       * @generated
       */
      EEnum COMPARING_OPERATOR = eINSTANCE.getComparingOperator();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
       * <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * @see org.storydriven.modeling.expressions.ArithmeticOperator
       * @see org.storydriven.modeling.expressions.impl.ExpressionsPackageImpl#getArithmeticOperator()
       * @generated
       */
      EEnum ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

   }

} // ExpressionsPackage
