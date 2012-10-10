/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.Path;
import org.storydriven.modeling.patterns.PatternsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Path</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.impl.PathImpl#getPathExpression <em>Path Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathImpl extends AbstractLinkVariableImpl implements Path
{
   /**
    * The cached value of the '{@link #getPathExpression() <em>Path Expression</em>}' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getPathExpression()
    * @generated
    * @ordered
    */
   protected Expression pathExpression;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected PathImpl ()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass ()
   {
      return PatternsPackage.Literals.PATH;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression getPathExpression ()
   {
      if (pathExpression != null && pathExpression.eIsProxy())
      {
         InternalEObject oldPathExpression = (InternalEObject) pathExpression;
         pathExpression = (Expression) eResolveProxy(oldPathExpression);
         if (pathExpression != oldPathExpression)
         {
            InternalEObject newPathExpression = (InternalEObject) pathExpression;
            NotificationChain msgs = oldPathExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - PatternsPackage.PATH__PATH_EXPRESSION, null, null);
            if (newPathExpression.eInternalContainer() == null)
            {
               msgs = newPathExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - PatternsPackage.PATH__PATH_EXPRESSION, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.PATH__PATH_EXPRESSION,
                  oldPathExpression, pathExpression));
         }
      }
      return pathExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetPathExpression ()
   {
      return pathExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetPathExpression (Expression newPathExpression, NotificationChain msgs)
   {
      Expression oldPathExpression = pathExpression;
      pathExpression = newPathExpression;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternsPackage.PATH__PATH_EXPRESSION, oldPathExpression, newPathExpression);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setPathExpression (Expression newPathExpression)
   {
      if (newPathExpression != pathExpression)
      {
         NotificationChain msgs = null;
         if (pathExpression != null)
            msgs = ((InternalEObject) pathExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - PatternsPackage.PATH__PATH_EXPRESSION, null, msgs);
         if (newPathExpression != null)
            msgs = ((InternalEObject) newPathExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - PatternsPackage.PATH__PATH_EXPRESSION, null, msgs);
         msgs = basicSetPathExpression(newPathExpression, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.PATH__PATH_EXPRESSION,
            newPathExpression, newPathExpression));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case PatternsPackage.PATH__PATH_EXPRESSION:
            return basicSetPathExpression(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet (int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case PatternsPackage.PATH__PATH_EXPRESSION:
            if (resolve)
               return getPathExpression();
            return basicGetPathExpression();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet (int featureID, Object newValue)
   {
      switch (featureID)
      {
         case PatternsPackage.PATH__PATH_EXPRESSION:
            setPathExpression((Expression) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset (int featureID)
   {
      switch (featureID)
      {
         case PatternsPackage.PATH__PATH_EXPRESSION:
            setPathExpression((Expression) null);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet (int featureID)
   {
      switch (featureID)
      {
         case PatternsPackage.PATH__PATH_EXPRESSION:
            return pathExpression != null;
      }
      return super.eIsSet(featureID);
   }

} // PathImpl
