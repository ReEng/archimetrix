/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.expressions.pathbridge.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.modeling.SDMPackage;

import org.storydriven.modeling.expressions.ExpressionsPackage;

import org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage;

import org.storydriven.modeling.expressions.pathbridge.PathExpressionBridge;
import org.storydriven.modeling.expressions.pathbridge.PathbridgeFactory;
import org.storydriven.modeling.expressions.pathbridge.PathbridgePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathbridgePackageImpl extends EPackageImpl implements PathbridgePackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass pathExpressionBridgeEClass = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.storydriven.modeling.expressions.pathbridge.PathbridgePackage#eNS_URI
    * @see #init()
    * @generated
    */
   private PathbridgePackageImpl()
   {
      super(eNS_URI, PathbridgeFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link PathbridgePackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static PathbridgePackage init()
   {
      if (isInited) return (PathbridgePackage)EPackage.Registry.INSTANCE.getEPackage(PathbridgePackage.eNS_URI);

      // Obtain or create and register package
      PathbridgePackageImpl thePathbridgePackage = (PathbridgePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PathbridgePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PathbridgePackageImpl());

      isInited = true;

      // Initialize simple dependencies
      PathExpressionsPackage.eINSTANCE.eClass();
      SDMPackage.eINSTANCE.eClass();

      // Create package meta-data objects
      thePathbridgePackage.createPackageContents();

      // Initialize created meta-data
      thePathbridgePackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      thePathbridgePackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(PathbridgePackage.eNS_URI, thePathbridgePackage);
      return thePathbridgePackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPathExpressionBridge()
   {
      return pathExpressionBridgeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPathExpressionBridge_PathExpression()
   {
      return (EReference)pathExpressionBridgeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PathbridgeFactory getPathbridgeFactory()
   {
      return (PathbridgeFactory)getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents()
   {
      if (isCreated) return;
      isCreated = true;

      // Create classes and their features
      pathExpressionBridgeEClass = createEClass(PATH_EXPRESSION_BRIDGE);
      createEReference(pathExpressionBridgeEClass, PATH_EXPRESSION_BRIDGE__PATH_EXPRESSION);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void initializePackageContents()
   {
      if (isInitialized) return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
      PathExpressionsPackage thePathExpressionsPackage = (PathExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(PathExpressionsPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      pathExpressionBridgeEClass.getESuperTypes().add(theExpressionsPackage.getExpression());

      // Initialize classes and features; add operations and parameters
      initEClass(pathExpressionBridgeEClass, PathExpressionBridge.class, "PathExpressionBridge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPathExpressionBridge_PathExpression(), thePathExpressionsPackage.getPathExpression(), null, "pathExpression", null, 0, 1, PathExpressionBridge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} //PathbridgePackageImpl
