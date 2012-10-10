/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.pathExpressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.storydriven.modeling.expressions.pathExpressions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathExpressionsFactoryImpl extends EFactoryImpl implements PathExpressionsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PathExpressionsFactory init()
  {
    try
    {
      PathExpressionsFactory thePathExpressionsFactory = (PathExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.storydriven.org/modeling/expressions/PathExpressions"); 
      if (thePathExpressionsFactory != null)
      {
        return thePathExpressionsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PathExpressionsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpressionsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PathExpressionsPackage.PATH_EXPRESSION: return createPathExpression();
      case PathExpressionsPackage.PATH: return createPath();
      case PathExpressionsPackage.PATH_SEGMENT: return createPathSegment();
      case PathExpressionsPackage.PATH_SEGMENT_DESCRIPTION: return createPathSegmentDescription();
      case PathExpressionsPackage.RESTRICTION_LIST: return createRestrictionList();
      case PathExpressionsPackage.IMPLICIT_PATH_DESCRIPTION: return createImplicitPathDescription();
      case PathExpressionsPackage.EXPLICIT_PATH_DESCRIPTION: return createExplicitPathDescription();
      case PathExpressionsPackage.TYPE_RESTRICTION: return createTypeRestriction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PathExpressionsPackage.REPEAT_OPERATOR:
        return createRepeatOperatorFromString(eDataType, initialValue);
      case PathExpressionsPackage.IMPLICIT_PATH_KIND:
        return createImplicitPathKindFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PathExpressionsPackage.REPEAT_OPERATOR:
        return convertRepeatOperatorToString(eDataType, instanceValue);
      case PathExpressionsPackage.IMPLICIT_PATH_KIND:
        return convertImplicitPathKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpression createPathExpression()
  {
    PathExpressionImpl pathExpression = new PathExpressionImpl();
    return pathExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Path createPath()
  {
    PathImpl path = new PathImpl();
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathSegment createPathSegment()
  {
    PathSegmentImpl pathSegment = new PathSegmentImpl();
    return pathSegment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathSegmentDescription createPathSegmentDescription()
  {
    PathSegmentDescriptionImpl pathSegmentDescription = new PathSegmentDescriptionImpl();
    return pathSegmentDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestrictionList createRestrictionList()
  {
    RestrictionListImpl restrictionList = new RestrictionListImpl();
    return restrictionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplicitPathDescription createImplicitPathDescription()
  {
    ImplicitPathDescriptionImpl implicitPathDescription = new ImplicitPathDescriptionImpl();
    return implicitPathDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitPathDescription createExplicitPathDescription()
  {
    ExplicitPathDescriptionImpl explicitPathDescription = new ExplicitPathDescriptionImpl();
    return explicitPathDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRestriction createTypeRestriction()
  {
    TypeRestrictionImpl typeRestriction = new TypeRestrictionImpl();
    return typeRestriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepeatOperator createRepeatOperatorFromString(EDataType eDataType, String initialValue)
  {
    RepeatOperator result = RepeatOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRepeatOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplicitPathKind createImplicitPathKindFromString(EDataType eDataType, String initialValue)
  {
    ImplicitPathKind result = ImplicitPathKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertImplicitPathKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpressionsPackage getPathExpressionsPackage()
  {
    return (PathExpressionsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PathExpressionsPackage getPackage()
  {
    return PathExpressionsPackage.eINSTANCE;
  }

} //PathExpressionsFactoryImpl
