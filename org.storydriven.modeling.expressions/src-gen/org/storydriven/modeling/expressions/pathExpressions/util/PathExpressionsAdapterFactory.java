/**
 * <copyright>
 * </copyright>
 *

 */
package org.storydriven.modeling.expressions.pathExpressions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.storydriven.modeling.expressions.pathExpressions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.storydriven.modeling.expressions.pathExpressions.PathExpressionsPackage
 * @generated
 */
public class PathExpressionsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PathExpressionsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpressionsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PathExpressionsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathExpressionsSwitch<Adapter> modelSwitch =
    new PathExpressionsSwitch<Adapter>()
    {
      @Override
      public Adapter casePathExpression(PathExpression object)
      {
        return createPathExpressionAdapter();
      }
      @Override
      public Adapter casePath(Path object)
      {
        return createPathAdapter();
      }
      @Override
      public Adapter casePathSegment(PathSegment object)
      {
        return createPathSegmentAdapter();
      }
      @Override
      public Adapter casePathSegmentDescription(PathSegmentDescription object)
      {
        return createPathSegmentDescriptionAdapter();
      }
      @Override
      public Adapter caseRestrictionList(RestrictionList object)
      {
        return createRestrictionListAdapter();
      }
      @Override
      public Adapter caseImplicitPathDescription(ImplicitPathDescription object)
      {
        return createImplicitPathDescriptionAdapter();
      }
      @Override
      public Adapter caseExplicitPathDescription(ExplicitPathDescription object)
      {
        return createExplicitPathDescriptionAdapter();
      }
      @Override
      public Adapter caseTypeRestriction(TypeRestriction object)
      {
        return createTypeRestrictionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.pathExpressions.PathExpression <em>Path Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.storydriven.modeling.expressions.pathExpressions.PathExpression
   * @generated
   */
  public Adapter createPathExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.pathExpressions.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.storydriven.modeling.expressions.pathExpressions.Path
   * @generated
   */
  public Adapter createPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.pathExpressions.PathSegment <em>Path Segment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.storydriven.modeling.expressions.pathExpressions.PathSegment
   * @generated
   */
  public Adapter createPathSegmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.pathExpressions.PathSegmentDescription <em>Path Segment Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.storydriven.modeling.expressions.pathExpressions.PathSegmentDescription
   * @generated
   */
  public Adapter createPathSegmentDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.pathExpressions.RestrictionList <em>Restriction List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.storydriven.modeling.expressions.pathExpressions.RestrictionList
   * @generated
   */
  public Adapter createRestrictionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.pathExpressions.ImplicitPathDescription <em>Implicit Path Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.storydriven.modeling.expressions.pathExpressions.ImplicitPathDescription
   * @generated
   */
  public Adapter createImplicitPathDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.pathExpressions.ExplicitPathDescription <em>Explicit Path Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.storydriven.modeling.expressions.pathExpressions.ExplicitPathDescription
   * @generated
   */
  public Adapter createExplicitPathDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.storydriven.modeling.expressions.pathExpressions.TypeRestriction <em>Type Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.storydriven.modeling.expressions.pathExpressions.TypeRestriction
   * @generated
   */
  public Adapter createTypeRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PathExpressionsAdapterFactory
