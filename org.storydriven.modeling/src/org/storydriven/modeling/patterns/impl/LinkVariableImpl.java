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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.LinkVariable;
import org.storydriven.modeling.patterns.PatternsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.impl.LinkVariableImpl#getSourceEnd <em>Source End</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.LinkVariableImpl#getTargetEnd <em>Target End</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.LinkVariableImpl#getQualifierExpression <em>Qualifier Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkVariableImpl extends AbstractLinkVariableImpl implements LinkVariable
{

   /**
    * The cached value of the '{@link #getTargetEnd() <em>Target End</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getTargetEnd()
    * @generated
    * @ordered
    */
   protected EReference targetEnd;
   /**
    * The cached value of the '{@link #getQualifierExpression() <em>Qualifier Expression</em>}' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getQualifierExpression()
    * @generated
    * @ordered
    */
   protected Expression qualifierExpression;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected LinkVariableImpl ()
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
      return PatternsPackage.Literals.LINK_VARIABLE;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getSourceEnd ()
   {
      EReference sourceEnd = basicGetSourceEnd();
      return sourceEnd != null && sourceEnd.eIsProxy() ? (EReference) eResolveProxy((InternalEObject) sourceEnd)
         : sourceEnd;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EReference basicGetSourceEnd ()
   {
      EReference targetEnd = getTargetEnd();
      return targetEnd == null ? null : targetEnd.getEOpposite();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setSourceEnd (EReference newSourceEnd)
   {
      EReference newTargetEnd = newSourceEnd == null ? null : newSourceEnd.getEOpposite();
      if (newTargetEnd == null && newSourceEnd != null)
      {
         throw new IllegalArgumentException();
      }
      NotificationChain notification = basicSetSourceEnd(newSourceEnd, null);
      notification = basicSetTargetEnd(newTargetEnd, notification);
      if (notification != null)
      {
         notification.dispatch();
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getTargetEnd ()
   {
      if (targetEnd != null && targetEnd.eIsProxy())
      {
         InternalEObject oldTargetEnd = (InternalEObject) targetEnd;
         targetEnd = (EReference) eResolveProxy(oldTargetEnd);
         if (targetEnd != oldTargetEnd)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.LINK_VARIABLE__TARGET_END,
                  oldTargetEnd, targetEnd));
         }
      }
      return targetEnd;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference basicGetTargetEnd ()
   {
      return targetEnd;
   }

   protected NotificationChain basicSetSourceEnd (EReference newSourceEnd, NotificationChain msgs)
   {
      EReference oldSourceEnd = getSourceEnd();
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternsPackage.LINK_VARIABLE__SOURCE_END, oldSourceEnd, newSourceEnd);
         if (msgs == null)
         {
            msgs = notification;
         }
         else
         {
            msgs.add(notification);
         }
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setTargetEnd (EReference newTargetEnd)
   {
      NotificationChain notification = basicSetTargetEnd(newTargetEnd, null);
      EReference newSourceEnd = newTargetEnd == null ? null : newTargetEnd.getEOpposite();
      notification = basicSetSourceEnd(newSourceEnd, notification);
      if (notification != null)
      {
         notification.dispatch();
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression getQualifierExpression ()
   {
      if (qualifierExpression != null && qualifierExpression.eIsProxy())
      {
         InternalEObject oldQualifierExpression = (InternalEObject) qualifierExpression;
         qualifierExpression = (Expression) eResolveProxy(oldQualifierExpression);
         if (qualifierExpression != oldQualifierExpression)
         {
            InternalEObject newQualifierExpression = (InternalEObject) qualifierExpression;
            NotificationChain msgs = oldQualifierExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - PatternsPackage.LINK_VARIABLE__QUALIFIER_EXPRESSION, null, null);
            if (newQualifierExpression.eInternalContainer() == null)
            {
               msgs = newQualifierExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - PatternsPackage.LINK_VARIABLE__QUALIFIER_EXPRESSION, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  PatternsPackage.LINK_VARIABLE__QUALIFIER_EXPRESSION, oldQualifierExpression, qualifierExpression));
         }
      }
      return qualifierExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetQualifierExpression ()
   {
      return qualifierExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetQualifierExpression (Expression newQualifierExpression, NotificationChain msgs)
   {
      Expression oldQualifierExpression = qualifierExpression;
      qualifierExpression = newQualifierExpression;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternsPackage.LINK_VARIABLE__QUALIFIER_EXPRESSION, oldQualifierExpression, newQualifierExpression);
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
   public void setQualifierExpression (Expression newQualifierExpression)
   {
      if (newQualifierExpression != qualifierExpression)
      {
         NotificationChain msgs = null;
         if (qualifierExpression != null)
            msgs = ((InternalEObject) qualifierExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - PatternsPackage.LINK_VARIABLE__QUALIFIER_EXPRESSION, null, msgs);
         if (newQualifierExpression != null)
            msgs = ((InternalEObject) newQualifierExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - PatternsPackage.LINK_VARIABLE__QUALIFIER_EXPRESSION, null, msgs);
         msgs = basicSetQualifierExpression(newQualifierExpression, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.LINK_VARIABLE__QUALIFIER_EXPRESSION,
            newQualifierExpression, newQualifierExpression));
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
         case PatternsPackage.LINK_VARIABLE__QUALIFIER_EXPRESSION:
            return basicSetQualifierExpression(null, msgs);
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
         case PatternsPackage.LINK_VARIABLE__SOURCE_END:
            if (resolve)
               return getSourceEnd();
            return basicGetSourceEnd();
         case PatternsPackage.LINK_VARIABLE__TARGET_END:
            if (resolve)
               return getTargetEnd();
            return basicGetTargetEnd();
         case PatternsPackage.LINK_VARIABLE__QUALIFIER_EXPRESSION:
            if (resolve)
               return getQualifierExpression();
            return basicGetQualifierExpression();
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
         case PatternsPackage.LINK_VARIABLE__SOURCE_END:
            setSourceEnd((EReference) newValue);
            return;
         case PatternsPackage.LINK_VARIABLE__TARGET_END:
            setTargetEnd((EReference) newValue);
            return;
         case PatternsPackage.LINK_VARIABLE__QUALIFIER_EXPRESSION:
            setQualifierExpression((Expression) newValue);
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
         case PatternsPackage.LINK_VARIABLE__SOURCE_END:
            setSourceEnd((EReference) null);
            return;
         case PatternsPackage.LINK_VARIABLE__TARGET_END:
            setTargetEnd((EReference) null);
            return;
         case PatternsPackage.LINK_VARIABLE__QUALIFIER_EXPRESSION:
            setQualifierExpression((Expression) null);
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
         case PatternsPackage.LINK_VARIABLE__SOURCE_END:
            return basicGetSourceEnd() != null;
         case PatternsPackage.LINK_VARIABLE__TARGET_END:
            return targetEnd != null;
         case PatternsPackage.LINK_VARIABLE__QUALIFIER_EXPRESSION:
            return qualifierExpression != null;
      }
      return super.eIsSet(featureID);
   }

   protected NotificationChain basicSetTargetEnd (EReference newTargetEnd, NotificationChain msgs)
   {
      EReference oldTargetEnd = this.targetEnd;
      this.targetEnd = newTargetEnd;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternsPackage.LINK_VARIABLE__TARGET_END, oldTargetEnd, this.targetEnd);
         if (msgs == null)
         {
            msgs = notification;
         }
         else
         {
            msgs.add(notification);
         }
      }
      return msgs;
   }

} // LinkVariableImpl
