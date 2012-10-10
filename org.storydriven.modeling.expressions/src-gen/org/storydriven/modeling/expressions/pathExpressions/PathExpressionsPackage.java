/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.pathExpressions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface PathExpressionsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pathExpressions";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.storydriven.org/modeling/expressions/PathExpressions";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pathExpressions";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PathExpressionsPackage eINSTANCE = org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionImpl <em>Path Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionImpl
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getPathExpression()
   * @generated
   */
  int PATH_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Path Alternatives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPRESSION__PATH_ALTERNATIVES = 0;

  /**
   * The number of structural features of the '<em>Path Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.PathImpl <em>Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathImpl
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getPath()
   * @generated
   */
  int PATH = 1;

  /**
   * The feature id for the '<em><b>Segments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH__SEGMENTS = 0;

  /**
   * The number of structural features of the '<em>Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.PathSegmentImpl <em>Path Segment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathSegmentImpl
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getPathSegment()
   * @generated
   */
  int PATH_SEGMENT = 2;

  /**
   * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_SEGMENT__ALTERNATIVES = 0;

  /**
   * The feature id for the '<em><b>Repeat Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_SEGMENT__REPEAT_OPERATOR = 1;

  /**
   * The number of structural features of the '<em>Path Segment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_SEGMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.PathSegmentDescriptionImpl <em>Path Segment Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathSegmentDescriptionImpl
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getPathSegmentDescription()
   * @generated
   */
  int PATH_SEGMENT_DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Restriction List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_SEGMENT_DESCRIPTION__RESTRICTION_LIST = 0;

  /**
   * The number of structural features of the '<em>Path Segment Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_SEGMENT_DESCRIPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.RestrictionListImpl <em>Restriction List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.RestrictionListImpl
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getRestrictionList()
   * @generated
   */
  int RESTRICTION_LIST = 4;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION_LIST__RESTRICTIONS = 0;

  /**
   * The number of structural features of the '<em>Restriction List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.ImplicitPathDescriptionImpl <em>Implicit Path Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.ImplicitPathDescriptionImpl
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getImplicitPathDescription()
   * @generated
   */
  int IMPLICIT_PATH_DESCRIPTION = 5;

  /**
   * The feature id for the '<em><b>Restriction List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLICIT_PATH_DESCRIPTION__RESTRICTION_LIST = PATH_SEGMENT_DESCRIPTION__RESTRICTION_LIST;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLICIT_PATH_DESCRIPTION__KIND = PATH_SEGMENT_DESCRIPTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Implicit Path Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLICIT_PATH_DESCRIPTION_FEATURE_COUNT = PATH_SEGMENT_DESCRIPTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.ExplicitPathDescriptionImpl <em>Explicit Path Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.ExplicitPathDescriptionImpl
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getExplicitPathDescription()
   * @generated
   */
  int EXPLICIT_PATH_DESCRIPTION = 6;

  /**
   * The feature id for the '<em><b>Restriction List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_PATH_DESCRIPTION__RESTRICTION_LIST = PATH_SEGMENT_DESCRIPTION__RESTRICTION_LIST;

  /**
   * The feature id for the '<em><b>Association Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_PATH_DESCRIPTION__ASSOCIATION_NAME = PATH_SEGMENT_DESCRIPTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Explicit Path Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_PATH_DESCRIPTION_FEATURE_COUNT = PATH_SEGMENT_DESCRIPTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.TypeRestrictionImpl <em>Type Restriction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.TypeRestrictionImpl
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getTypeRestriction()
   * @generated
   */
  int TYPE_RESTRICTION = 7;

  /**
   * The feature id for the '<em><b>Forbidden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RESTRICTION__FORBIDDEN = 0;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RESTRICTION__TYPE_NAME = 1;

  /**
   * The number of structural features of the '<em>Type Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_RESTRICTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.storydriven.modeling.expressions.pathExpressions.RepeatOperator <em>Repeat Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.storydriven.modeling.expressions.pathExpressions.RepeatOperator
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getRepeatOperator()
   * @generated
   */
  int REPEAT_OPERATOR = 8;

  /**
   * The meta object id for the '{@link org.storydriven.modeling.expressions.pathExpressions.ImplicitPathKind <em>Implicit Path Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.storydriven.modeling.expressions.pathExpressions.ImplicitPathKind
   * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getImplicitPathKind()
   * @generated
   */
  int IMPLICIT_PATH_KIND = 9;


  /**
   * Returns the meta object for class '{@link org.storydriven.modeling.expressions.pathExpressions.PathExpression <em>Path Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Expression</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.PathExpression
   * @generated
   */
  EClass getPathExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.expressions.pathExpressions.PathExpression#getPathAlternatives <em>Path Alternatives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Path Alternatives</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.PathExpression#getPathAlternatives()
   * @see #getPathExpression()
   * @generated
   */
  EReference getPathExpression_PathAlternatives();

  /**
   * Returns the meta object for class '{@link org.storydriven.modeling.expressions.pathExpressions.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.Path
   * @generated
   */
  EClass getPath();

  /**
   * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.expressions.pathExpressions.Path#getSegments <em>Segments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Segments</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.Path#getSegments()
   * @see #getPath()
   * @generated
   */
  EReference getPath_Segments();

  /**
   * Returns the meta object for class '{@link org.storydriven.modeling.expressions.pathExpressions.PathSegment <em>Path Segment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Segment</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.PathSegment
   * @generated
   */
  EClass getPathSegment();

  /**
   * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.expressions.pathExpressions.PathSegment#getAlternatives <em>Alternatives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alternatives</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.PathSegment#getAlternatives()
   * @see #getPathSegment()
   * @generated
   */
  EReference getPathSegment_Alternatives();

  /**
   * Returns the meta object for the attribute '{@link org.storydriven.modeling.expressions.pathExpressions.PathSegment#getRepeatOperator <em>Repeat Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repeat Operator</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.PathSegment#getRepeatOperator()
   * @see #getPathSegment()
   * @generated
   */
  EAttribute getPathSegment_RepeatOperator();

  /**
   * Returns the meta object for class '{@link org.storydriven.modeling.expressions.pathExpressions.PathSegmentDescription <em>Path Segment Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Segment Description</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.PathSegmentDescription
   * @generated
   */
  EClass getPathSegmentDescription();

  /**
   * Returns the meta object for the containment reference '{@link org.storydriven.modeling.expressions.pathExpressions.PathSegmentDescription#getRestrictionList <em>Restriction List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Restriction List</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.PathSegmentDescription#getRestrictionList()
   * @see #getPathSegmentDescription()
   * @generated
   */
  EReference getPathSegmentDescription_RestrictionList();

  /**
   * Returns the meta object for class '{@link org.storydriven.modeling.expressions.pathExpressions.RestrictionList <em>Restriction List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Restriction List</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.RestrictionList
   * @generated
   */
  EClass getRestrictionList();

  /**
   * Returns the meta object for the containment reference list '{@link org.storydriven.modeling.expressions.pathExpressions.RestrictionList#getRestrictions <em>Restrictions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Restrictions</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.RestrictionList#getRestrictions()
   * @see #getRestrictionList()
   * @generated
   */
  EReference getRestrictionList_Restrictions();

  /**
   * Returns the meta object for class '{@link org.storydriven.modeling.expressions.pathExpressions.ImplicitPathDescription <em>Implicit Path Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implicit Path Description</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.ImplicitPathDescription
   * @generated
   */
  EClass getImplicitPathDescription();

  /**
   * Returns the meta object for the attribute '{@link org.storydriven.modeling.expressions.pathExpressions.ImplicitPathDescription#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.ImplicitPathDescription#getKind()
   * @see #getImplicitPathDescription()
   * @generated
   */
  EAttribute getImplicitPathDescription_Kind();

  /**
   * Returns the meta object for class '{@link org.storydriven.modeling.expressions.pathExpressions.ExplicitPathDescription <em>Explicit Path Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Explicit Path Description</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.ExplicitPathDescription
   * @generated
   */
  EClass getExplicitPathDescription();

  /**
   * Returns the meta object for the attribute '{@link org.storydriven.modeling.expressions.pathExpressions.ExplicitPathDescription#getAssociationName <em>Association Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Association Name</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.ExplicitPathDescription#getAssociationName()
   * @see #getExplicitPathDescription()
   * @generated
   */
  EAttribute getExplicitPathDescription_AssociationName();

  /**
   * Returns the meta object for class '{@link org.storydriven.modeling.expressions.pathExpressions.TypeRestriction <em>Type Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Restriction</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.TypeRestriction
   * @generated
   */
  EClass getTypeRestriction();

  /**
   * Returns the meta object for the attribute '{@link org.storydriven.modeling.expressions.pathExpressions.TypeRestriction#isForbidden <em>Forbidden</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Forbidden</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.TypeRestriction#isForbidden()
   * @see #getTypeRestriction()
   * @generated
   */
  EAttribute getTypeRestriction_Forbidden();

  /**
   * Returns the meta object for the attribute '{@link org.storydriven.modeling.expressions.pathExpressions.TypeRestriction#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.TypeRestriction#getTypeName()
   * @see #getTypeRestriction()
   * @generated
   */
  EAttribute getTypeRestriction_TypeName();

  /**
   * Returns the meta object for enum '{@link org.storydriven.modeling.expressions.pathExpressions.RepeatOperator <em>Repeat Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Repeat Operator</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.RepeatOperator
   * @generated
   */
  EEnum getRepeatOperator();

  /**
   * Returns the meta object for enum '{@link org.storydriven.modeling.expressions.pathExpressions.ImplicitPathKind <em>Implicit Path Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Implicit Path Kind</em>'.
   * @see org.storydriven.modeling.expressions.pathExpressions.ImplicitPathKind
   * @generated
   */
  EEnum getImplicitPathKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PathExpressionsFactory getPathExpressionsFactory();

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
     * The meta object literal for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionImpl <em>Path Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionImpl
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getPathExpression()
     * @generated
     */
    EClass PATH_EXPRESSION = eINSTANCE.getPathExpression();

    /**
     * The meta object literal for the '<em><b>Path Alternatives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_EXPRESSION__PATH_ALTERNATIVES = eINSTANCE.getPathExpression_PathAlternatives();

    /**
     * The meta object literal for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.PathImpl <em>Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathImpl
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getPath()
     * @generated
     */
    EClass PATH = eINSTANCE.getPath();

    /**
     * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH__SEGMENTS = eINSTANCE.getPath_Segments();

    /**
     * The meta object literal for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.PathSegmentImpl <em>Path Segment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathSegmentImpl
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getPathSegment()
     * @generated
     */
    EClass PATH_SEGMENT = eINSTANCE.getPathSegment();

    /**
     * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_SEGMENT__ALTERNATIVES = eINSTANCE.getPathSegment_Alternatives();

    /**
     * The meta object literal for the '<em><b>Repeat Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATH_SEGMENT__REPEAT_OPERATOR = eINSTANCE.getPathSegment_RepeatOperator();

    /**
     * The meta object literal for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.PathSegmentDescriptionImpl <em>Path Segment Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathSegmentDescriptionImpl
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getPathSegmentDescription()
     * @generated
     */
    EClass PATH_SEGMENT_DESCRIPTION = eINSTANCE.getPathSegmentDescription();

    /**
     * The meta object literal for the '<em><b>Restriction List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_SEGMENT_DESCRIPTION__RESTRICTION_LIST = eINSTANCE.getPathSegmentDescription_RestrictionList();

    /**
     * The meta object literal for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.RestrictionListImpl <em>Restriction List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.RestrictionListImpl
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getRestrictionList()
     * @generated
     */
    EClass RESTRICTION_LIST = eINSTANCE.getRestrictionList();

    /**
     * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESTRICTION_LIST__RESTRICTIONS = eINSTANCE.getRestrictionList_Restrictions();

    /**
     * The meta object literal for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.ImplicitPathDescriptionImpl <em>Implicit Path Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.ImplicitPathDescriptionImpl
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getImplicitPathDescription()
     * @generated
     */
    EClass IMPLICIT_PATH_DESCRIPTION = eINSTANCE.getImplicitPathDescription();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPLICIT_PATH_DESCRIPTION__KIND = eINSTANCE.getImplicitPathDescription_Kind();

    /**
     * The meta object literal for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.ExplicitPathDescriptionImpl <em>Explicit Path Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.ExplicitPathDescriptionImpl
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getExplicitPathDescription()
     * @generated
     */
    EClass EXPLICIT_PATH_DESCRIPTION = eINSTANCE.getExplicitPathDescription();

    /**
     * The meta object literal for the '<em><b>Association Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPLICIT_PATH_DESCRIPTION__ASSOCIATION_NAME = eINSTANCE.getExplicitPathDescription_AssociationName();

    /**
     * The meta object literal for the '{@link org.storydriven.modeling.expressions.pathExpressions.impl.TypeRestrictionImpl <em>Type Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.TypeRestrictionImpl
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getTypeRestriction()
     * @generated
     */
    EClass TYPE_RESTRICTION = eINSTANCE.getTypeRestriction();

    /**
     * The meta object literal for the '<em><b>Forbidden</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_RESTRICTION__FORBIDDEN = eINSTANCE.getTypeRestriction_Forbidden();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_RESTRICTION__TYPE_NAME = eINSTANCE.getTypeRestriction_TypeName();

    /**
     * The meta object literal for the '{@link org.storydriven.modeling.expressions.pathExpressions.RepeatOperator <em>Repeat Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.storydriven.modeling.expressions.pathExpressions.RepeatOperator
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getRepeatOperator()
     * @generated
     */
    EEnum REPEAT_OPERATOR = eINSTANCE.getRepeatOperator();

    /**
     * The meta object literal for the '{@link org.storydriven.modeling.expressions.pathExpressions.ImplicitPathKind <em>Implicit Path Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.storydriven.modeling.expressions.pathExpressions.ImplicitPathKind
     * @see org.storydriven.modeling.expressions.pathExpressions.impl.PathExpressionsPackageImpl#getImplicitPathKind()
     * @generated
     */
    EEnum IMPLICIT_PATH_KIND = eINSTANCE.getImplicitPathKind();

  }

} //PathExpressionsPackage
