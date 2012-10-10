/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.pathExpressions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.storydriven.modeling.expressions.pathExpressions.ExplicitPathDescription;
import org.storydriven.modeling.expressions.pathExpressions.ImplicitPathDescription;
import org.storydriven.modeling.expressions.pathExpressions.ImplicitPathKind;
import org.storydriven.modeling.expressions.pathExpressions.Path;
import org.storydriven.modeling.expressions.pathExpressions.PathExpression;
import org.storydriven.modeling.expressions.pathExpressions.PathExpressionsFactory;
import org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage;
import org.storydriven.modeling.expressions.pathExpressions.PathSegment;
import org.storydriven.modeling.expressions.pathExpressions.PathSegmentDescription;
import org.storydriven.modeling.expressions.pathExpressions.RepeatOperator;
import org.storydriven.modeling.expressions.pathExpressions.RestrictionList;
import org.storydriven.modeling.expressions.pathExpressions.TypeRestriction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathExpressionsPackageImpl extends EPackageImpl implements PathExpressionsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathSegmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathSegmentDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restrictionListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implicitPathDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass explicitPathDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeRestrictionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum repeatOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum implicitPathKindEEnum = null;

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
   * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PathExpressionsPackageImpl()
  {
    super(eNS_URI, PathExpressionsFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link PathExpressionsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PathExpressionsPackage init()
  {
    if (isInited) return (PathExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(PathExpressionsPackage.eNS_URI);

    // Obtain or create and register package
    PathExpressionsPackageImpl thePathExpressionsPackage = (PathExpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PathExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PathExpressionsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePathExpressionsPackage.createPackageContents();

    // Initialize created meta-data
    thePathExpressionsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePathExpressionsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PathExpressionsPackage.eNS_URI, thePathExpressionsPackage);
    return thePathExpressionsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathExpression()
  {
    return pathExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathExpression_PathAlternatives()
  {
    return (EReference)pathExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPath()
  {
    return pathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPath_Segments()
  {
    return (EReference)pathEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathSegment()
  {
    return pathSegmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathSegment_Alternatives()
  {
    return (EReference)pathSegmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathSegment_RepeatOperator()
  {
    return (EAttribute)pathSegmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathSegmentDescription()
  {
    return pathSegmentDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathSegmentDescription_RestrictionList()
  {
    return (EReference)pathSegmentDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRestrictionList()
  {
    return restrictionListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRestrictionList_Restrictions()
  {
    return (EReference)restrictionListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplicitPathDescription()
  {
    return implicitPathDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImplicitPathDescription_Kind()
  {
    return (EAttribute)implicitPathDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExplicitPathDescription()
  {
    return explicitPathDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExplicitPathDescription_AssociationName()
  {
    return (EAttribute)explicitPathDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeRestriction()
  {
    return typeRestrictionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeRestriction_Forbidden()
  {
    return (EAttribute)typeRestrictionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeRestriction_TypeName()
  {
    return (EAttribute)typeRestrictionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRepeatOperator()
  {
    return repeatOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getImplicitPathKind()
  {
    return implicitPathKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpressionsFactory getPathExpressionsFactory()
  {
    return (PathExpressionsFactory)getEFactoryInstance();
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
    pathExpressionEClass = createEClass(PATH_EXPRESSION);
    createEReference(pathExpressionEClass, PATH_EXPRESSION__PATH_ALTERNATIVES);

    pathEClass = createEClass(PATH);
    createEReference(pathEClass, PATH__SEGMENTS);

    pathSegmentEClass = createEClass(PATH_SEGMENT);
    createEReference(pathSegmentEClass, PATH_SEGMENT__ALTERNATIVES);
    createEAttribute(pathSegmentEClass, PATH_SEGMENT__REPEAT_OPERATOR);

    pathSegmentDescriptionEClass = createEClass(PATH_SEGMENT_DESCRIPTION);
    createEReference(pathSegmentDescriptionEClass, PATH_SEGMENT_DESCRIPTION__RESTRICTION_LIST);

    restrictionListEClass = createEClass(RESTRICTION_LIST);
    createEReference(restrictionListEClass, RESTRICTION_LIST__RESTRICTIONS);

    implicitPathDescriptionEClass = createEClass(IMPLICIT_PATH_DESCRIPTION);
    createEAttribute(implicitPathDescriptionEClass, IMPLICIT_PATH_DESCRIPTION__KIND);

    explicitPathDescriptionEClass = createEClass(EXPLICIT_PATH_DESCRIPTION);
    createEAttribute(explicitPathDescriptionEClass, EXPLICIT_PATH_DESCRIPTION__ASSOCIATION_NAME);

    typeRestrictionEClass = createEClass(TYPE_RESTRICTION);
    createEAttribute(typeRestrictionEClass, TYPE_RESTRICTION__FORBIDDEN);
    createEAttribute(typeRestrictionEClass, TYPE_RESTRICTION__TYPE_NAME);

    // Create enums
    repeatOperatorEEnum = createEEnum(REPEAT_OPERATOR);
    implicitPathKindEEnum = createEEnum(IMPLICIT_PATH_KIND);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    implicitPathDescriptionEClass.getESuperTypes().add(this.getPathSegmentDescription());
    explicitPathDescriptionEClass.getESuperTypes().add(this.getPathSegmentDescription());

    // Initialize classes and features; add operations and parameters
    initEClass(pathExpressionEClass, PathExpression.class, "PathExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPathExpression_PathAlternatives(), this.getPath(), null, "pathAlternatives", null, 0, -1, PathExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPath_Segments(), this.getPathSegment(), null, "segments", null, 0, -1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathSegmentEClass, PathSegment.class, "PathSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPathSegment_Alternatives(), this.getPathSegmentDescription(), null, "alternatives", null, 0, -1, PathSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPathSegment_RepeatOperator(), this.getRepeatOperator(), "repeatOperator", null, 0, 1, PathSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathSegmentDescriptionEClass, PathSegmentDescription.class, "PathSegmentDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPathSegmentDescription_RestrictionList(), this.getRestrictionList(), null, "restrictionList", null, 0, 1, PathSegmentDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(restrictionListEClass, RestrictionList.class, "RestrictionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRestrictionList_Restrictions(), this.getTypeRestriction(), null, "restrictions", null, 0, -1, RestrictionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(implicitPathDescriptionEClass, ImplicitPathDescription.class, "ImplicitPathDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImplicitPathDescription_Kind(), this.getImplicitPathKind(), "kind", null, 0, 1, ImplicitPathDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(explicitPathDescriptionEClass, ExplicitPathDescription.class, "ExplicitPathDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExplicitPathDescription_AssociationName(), ecorePackage.getEString(), "associationName", null, 0, 1, ExplicitPathDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeRestrictionEClass, TypeRestriction.class, "TypeRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeRestriction_Forbidden(), ecorePackage.getEBoolean(), "forbidden", null, 0, 1, TypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeRestriction_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, TypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(repeatOperatorEEnum, RepeatOperator.class, "RepeatOperator");
    addEEnumLiteral(repeatOperatorEEnum, RepeatOperator.NO_REPEAT);
    addEEnumLiteral(repeatOperatorEEnum, RepeatOperator.AT_LEAST_ONCE);
    addEEnumLiteral(repeatOperatorEEnum, RepeatOperator.ARBITRARY);

    initEEnum(implicitPathKindEEnum, ImplicitPathKind.class, "ImplicitPathKind");
    addEEnumLiteral(implicitPathKindEEnum, ImplicitPathKind.ANY);
    addEEnumLiteral(implicitPathKindEEnum, ImplicitPathKind.CONTAINMENT_SOURCE);
    addEEnumLiteral(implicitPathKindEEnum, ImplicitPathKind.CONTAINMENT_TARGET);

    // Create resource
    createResource(eNS_URI);
  }

} //PathExpressionsPackageImpl
