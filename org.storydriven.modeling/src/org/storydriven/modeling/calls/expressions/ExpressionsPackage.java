/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.calls.expressions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.storydriven.modeling.calls.expressions.ExpressionsFactory
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
   String eNS_URI = "http://ns.storydriven.org/sdm/calls/expressions/0.1.0";

   /**
    * The package namespace name.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "sdmce";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   ExpressionsPackage eINSTANCE = org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl.init();

   /**
    * The meta object id for the '{@link org.storydriven.modeling.calls.expressions.impl.MethodCallExpressionImpl <em>Method Call Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.calls.expressions.impl.MethodCallExpressionImpl
    * @see org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl#getMethodCallExpression()
    * @generated
    */
   int METHOD_CALL_EXPRESSION = 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION__ANNOTATION = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION__EXTENSION = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION__TYPE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION__GENERIC_TYPE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION__COMMENT = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION__COMMENT;

   /**
    * The feature id for the '<em><b>Owned Parameter Bindings</b></em>' containment reference list.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Callee</b></em>' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION__CALLEE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Target</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION__TARGET = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Opaque Callable</b></em>' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Method Call Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION_FEATURE_COUNT = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 4;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___ECLASS = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___EIS_PROXY = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___ERESOURCE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___ECONTAINER = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___ECONTAINING_FEATURE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___ECONTAINMENT_FEATURE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___ECONTENTS = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___EALL_CONTENTS = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___ECROSS_REFERENCES = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___EGET__ESTRUCTURALFEATURE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___EUNSET__ESTRUCTURALFEATURE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___EINVOKE__EOPERATION_ELIST = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___GET_EXTENSION__ECLASS = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___PROVIDE_EXTENSION__ECLASS = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___GET_ANNOTATION__STRING = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION___PROVIDE_ANNOTATION__STRING = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Method Call Expression</em>' class.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int METHOD_CALL_EXPRESSION_OPERATION_COUNT = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.storydriven.modeling.calls.expressions.impl.ParameterExpressionImpl <em>Parameter Expression</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.calls.expressions.impl.ParameterExpressionImpl
    * @see org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl#getParameterExpression()
    * @generated
    */
   int PARAMETER_EXPRESSION = 1;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION__ANNOTATION = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION__EXTENSION = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION__TYPE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION__GENERIC_TYPE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION__COMMENT = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION__COMMENT;

   /**
    * The feature id for the '<em><b>Parameter</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION__PARAMETER = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Parameter Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION_FEATURE_COUNT = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>EClass</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___ECLASS = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ECLASS;

   /**
    * The operation id for the '<em>EIs Proxy</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___EIS_PROXY = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___EIS_PROXY;

   /**
    * The operation id for the '<em>EResource</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___ERESOURCE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ERESOURCE;

   /**
    * The operation id for the '<em>EContainer</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___ECONTAINER = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ECONTAINER;

   /**
    * The operation id for the '<em>EContaining Feature</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___ECONTAINING_FEATURE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ECONTAINING_FEATURE;

   /**
    * The operation id for the '<em>EContainment Feature</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___ECONTAINMENT_FEATURE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ECONTAINMENT_FEATURE;

   /**
    * The operation id for the '<em>EContents</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___ECONTENTS = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ECONTENTS;

   /**
    * The operation id for the '<em>EAll Contents</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___EALL_CONTENTS = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___EALL_CONTENTS;

   /**
    * The operation id for the '<em>ECross References</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___ECROSS_REFERENCES = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ECROSS_REFERENCES;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___EGET__ESTRUCTURALFEATURE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EGet</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

   /**
    * The operation id for the '<em>ESet</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___ESET__ESTRUCTURALFEATURE_OBJECT;

   /**
    * The operation id for the '<em>EIs Set</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___EIS_SET__ESTRUCTURALFEATURE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___EIS_SET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EUnset</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___EUNSET__ESTRUCTURALFEATURE = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___EUNSET__ESTRUCTURALFEATURE;

   /**
    * The operation id for the '<em>EInvoke</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___EINVOKE__EOPERATION_ELIST = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___EINVOKE__EOPERATION_ELIST;

   /**
    * The operation id for the '<em>Get Extension</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___GET_EXTENSION__ECLASS = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___GET_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Provide Extension</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___PROVIDE_EXTENSION__ECLASS = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___PROVIDE_EXTENSION__ECLASS;

   /**
    * The operation id for the '<em>Get Annotation</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___GET_ANNOTATION__STRING = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___GET_ANNOTATION__STRING;

   /**
    * The operation id for the '<em>Provide Annotation</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION___PROVIDE_ANNOTATION__STRING = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION___PROVIDE_ANNOTATION__STRING;

   /**
    * The number of operations of the '<em>Parameter Expression</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PARAMETER_EXPRESSION_OPERATION_COUNT = org.storydriven.modeling.expressions.ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.calls.expressions.MethodCallExpression <em>Method Call Expression</em>}'.
    * <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * @return the meta object for class '<em>Method Call Expression</em>'.
    * @see org.storydriven.modeling.calls.expressions.MethodCallExpression
    * @generated
    */
   EClass getMethodCallExpression ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.calls.expressions.MethodCallExpression#getTarget <em>Target</em>}'.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Target</em>'.
    * @see org.storydriven.modeling.calls.expressions.MethodCallExpression#getTarget()
    * @see #getMethodCallExpression()
    * @generated
    */
   EReference getMethodCallExpression_Target ();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.calls.expressions.MethodCallExpression#getOpaqueCallable <em>Opaque Callable</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Opaque Callable</em>'.
    * @see org.storydriven.modeling.calls.expressions.MethodCallExpression#getOpaqueCallable()
    * @see #getMethodCallExpression()
    * @generated
    */
   EReference getMethodCallExpression_OpaqueCallable ();

   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.calls.expressions.ParameterExpression <em>Parameter Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Parameter Expression</em>'.
    * @see org.storydriven.modeling.calls.expressions.ParameterExpression
    * @generated
    */
   EClass getParameterExpression ();

   /**
    * Returns the meta object for the reference '{@link org.storydriven.modeling.calls.expressions.ParameterExpression#getParameter <em>Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Parameter</em>'.
    * @see org.storydriven.modeling.calls.expressions.ParameterExpression#getParameter()
    * @see #getParameterExpression()
    * @generated
    */
   EReference getParameterExpression_Parameter ();

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
       * The meta object literal for the '{@link org.storydriven.modeling.calls.expressions.impl.MethodCallExpressionImpl <em>Method Call Expression</em>}' class. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.storydriven.modeling.calls.expressions.impl.MethodCallExpressionImpl
       * @see org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl#getMethodCallExpression()
       * @generated
       */
      EClass METHOD_CALL_EXPRESSION = eINSTANCE.getMethodCallExpression();

      /**
       * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference METHOD_CALL_EXPRESSION__TARGET = eINSTANCE.getMethodCallExpression_Target();

      /**
       * The meta object literal for the '<em><b>Opaque Callable</b></em>' containment reference feature.
       * <!-- begin-user-doc --> <!-- end-user-doc -->
       * @generated
       */
      EReference METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE = eINSTANCE.getMethodCallExpression_OpaqueCallable();

      /**
       * The meta object literal for the '{@link org.storydriven.modeling.calls.expressions.impl.ParameterExpressionImpl <em>Parameter Expression</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.calls.expressions.impl.ParameterExpressionImpl
       * @see org.storydriven.modeling.calls.expressions.impl.ExpressionsPackageImpl#getParameterExpression()
       * @generated
       */
      EClass PARAMETER_EXPRESSION = eINSTANCE.getParameterExpression();

      /**
       * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PARAMETER_EXPRESSION__PARAMETER = eINSTANCE.getParameterExpression_Parameter();

   }

} // ExpressionsPackage
