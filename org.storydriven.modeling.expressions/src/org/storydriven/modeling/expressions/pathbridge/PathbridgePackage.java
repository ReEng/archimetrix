/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.pathbridge;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.storydriven.modeling.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.storydriven.modeling.expressions.pathbridge.PathbridgeFactory
 * @model kind="package"
 * @generated
 */
public interface PathbridgePackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "pathbridge";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://www.storydriven.org/modeling/expressions/pathbridge";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "pathbridge";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   PathbridgePackage eINSTANCE = org.storydriven.modeling.expressions.pathbridge.impl.PathbridgePackageImpl.init();

   /**
    * The meta object id for the '{@link org.storydriven.modeling.expressions.pathbridge.impl.PathExpressionBridgeImpl <em>Path Expression Bridge</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.storydriven.modeling.expressions.pathbridge.impl.PathExpressionBridgeImpl
    * @see org.storydriven.modeling.expressions.pathbridge.impl.PathbridgePackageImpl#getPathExpressionBridge()
    * @generated
    */
   int PATH_EXPRESSION_BRIDGE = 0;

   /**
    * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH_EXPRESSION_BRIDGE__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

   /**
    * The feature id for the '<em><b>Extension</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH_EXPRESSION_BRIDGE__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH_EXPRESSION_BRIDGE__TYPE = ExpressionsPackage.EXPRESSION__TYPE;

   /**
    * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH_EXPRESSION_BRIDGE__GENERIC_TYPE = ExpressionsPackage.EXPRESSION__GENERIC_TYPE;

   /**
    * The feature id for the '<em><b>Comment</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH_EXPRESSION_BRIDGE__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

   /**
    * The feature id for the '<em><b>Path Expression</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH_EXPRESSION_BRIDGE__PATH_EXPRESSION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Path Expression Bridge</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATH_EXPRESSION_BRIDGE_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;


   /**
    * Returns the meta object for class '{@link org.storydriven.modeling.expressions.pathbridge.PathExpressionBridge <em>Path Expression Bridge</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Path Expression Bridge</em>'.
    * @see org.storydriven.modeling.expressions.pathbridge.PathExpressionBridge
    * @generated
    */
   EClass getPathExpressionBridge();

   /**
    * Returns the meta object for the containment reference '{@link org.storydriven.modeling.expressions.pathbridge.PathExpressionBridge#getPathExpression <em>Path Expression</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Path Expression</em>'.
    * @see org.storydriven.modeling.expressions.pathbridge.PathExpressionBridge#getPathExpression()
    * @see #getPathExpressionBridge()
    * @generated
    */
   EReference getPathExpressionBridge_PathExpression();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   PathbridgeFactory getPathbridgeFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    *   <li>each class,</li>
    *   <li>each feature of each class,</li>
    *   <li>each enum,</li>
    *   <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.storydriven.modeling.expressions.pathbridge.impl.PathExpressionBridgeImpl <em>Path Expression Bridge</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.storydriven.modeling.expressions.pathbridge.impl.PathExpressionBridgeImpl
       * @see org.storydriven.modeling.expressions.pathbridge.impl.PathbridgePackageImpl#getPathExpressionBridge()
       * @generated
       */
      EClass PATH_EXPRESSION_BRIDGE = eINSTANCE.getPathExpressionBridge();

      /**
       * The meta object literal for the '<em><b>Path Expression</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PATH_EXPRESSION_BRIDGE__PATH_EXPRESSION = eINSTANCE.getPathExpressionBridge_PathExpression();

   }

} //PathbridgePackage
