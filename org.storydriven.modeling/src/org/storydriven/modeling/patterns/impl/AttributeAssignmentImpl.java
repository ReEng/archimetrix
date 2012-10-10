/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.patterns.AttributeAssignment;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.PatternsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Attribute Assignment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.impl.AttributeAssignmentImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.AttributeAssignmentImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.impl.AttributeAssignmentImpl#getObjectVariable <em>Object Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeAssignmentImpl extends EObjectImpl implements AttributeAssignment
{
   /**
    * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getAttribute()
    * @generated
    * @ordered
    */
   protected EAttribute attribute;

   /**
    * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getValueExpression()
    * @generated
    * @ordered
    */
   protected Expression valueExpression;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected AttributeAssignmentImpl ()
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
      return PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ObjectVariable getObjectVariable ()
   {
      if (eContainerFeatureID() != PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE)
         return null;
      return (ObjectVariable) eContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ObjectVariable basicGetObjectVariable ()
   {
      if (eContainerFeatureID() != PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE)
         return null;
      return (ObjectVariable) eInternalContainer();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetObjectVariable (ObjectVariable newObjectVariable, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newObjectVariable,
         PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setObjectVariable (ObjectVariable newObjectVariable)
   {
      if (newObjectVariable != eInternalContainer()
         || (eContainerFeatureID() != PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE && newObjectVariable != null))
      {
         if (EcoreUtil.isAncestor(this, newObjectVariable))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newObjectVariable != null)
            msgs = ((InternalEObject) newObjectVariable).eInverseAdd(this,
               PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT, ObjectVariable.class, msgs);
         msgs = basicSetObjectVariable(newObjectVariable, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE,
            newObjectVariable, newObjectVariable));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAttribute ()
   {
      if (attribute != null && attribute.eIsProxy())
      {
         InternalEObject oldAttribute = (InternalEObject) attribute;
         attribute = (EAttribute) eResolveProxy(oldAttribute);
         if (attribute != oldAttribute)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  PatternsPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE, oldAttribute, attribute));
         }
      }
      return attribute;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute basicGetAttribute ()
   {
      return attribute;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setAttribute (EAttribute newAttribute)
   {
      EAttribute oldAttribute = attribute;
      attribute = newAttribute;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE,
            oldAttribute, attribute));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression getValueExpression ()
   {
      if (valueExpression != null && valueExpression.eIsProxy())
      {
         InternalEObject oldValueExpression = (InternalEObject) valueExpression;
         valueExpression = (Expression) eResolveProxy(oldValueExpression);
         if (valueExpression != oldValueExpression)
         {
            InternalEObject newValueExpression = (InternalEObject) valueExpression;
            NotificationChain msgs = oldValueExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - PatternsPackage.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION, null, null);
            if (newValueExpression.eInternalContainer() == null)
            {
               msgs = newValueExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                  - PatternsPackage.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION, null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  PatternsPackage.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION, oldValueExpression, valueExpression));
         }
      }
      return valueExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public Expression basicGetValueExpression ()
   {
      return valueExpression;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetValueExpression (Expression newValueExpression, NotificationChain msgs)
   {
      Expression oldValueExpression = valueExpression;
      valueExpression = newValueExpression;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            PatternsPackage.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION, oldValueExpression, newValueExpression);
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
   public void setValueExpression (Expression newValueExpression)
   {
      if (newValueExpression != valueExpression)
      {
         NotificationChain msgs = null;
         if (valueExpression != null)
            msgs = ((InternalEObject) valueExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - PatternsPackage.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION, null, msgs);
         if (newValueExpression != null)
            msgs = ((InternalEObject) newValueExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - PatternsPackage.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION, null, msgs);
         msgs = basicSetValueExpression(newValueExpression, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION,
            newValueExpression, newValueExpression));
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd (InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetObjectVariable((ObjectVariable) otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
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
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION:
            return basicSetValueExpression(null, msgs);
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE:
            return basicSetObjectVariable(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature (NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE:
            return eInternalContainer().eInverseRemove(this, PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT,
               ObjectVariable.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
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
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
            if (resolve)
               return getAttribute();
            return basicGetAttribute();
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION:
            if (resolve)
               return getValueExpression();
            return basicGetValueExpression();
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE:
            if (resolve)
               return getObjectVariable();
            return basicGetObjectVariable();
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
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
            setAttribute((EAttribute) newValue);
            return;
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION:
            setValueExpression((Expression) newValue);
            return;
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE:
            setObjectVariable((ObjectVariable) newValue);
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
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
            setAttribute((EAttribute) null);
            return;
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION:
            setValueExpression((Expression) null);
            return;
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE:
            setObjectVariable((ObjectVariable) null);
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
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
            return attribute != null;
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION:
            return valueExpression != null;
         case PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE:
            return basicGetObjectVariable() != null;
      }
      return super.eIsSet(featureID);
   }

} // AttributeAssignmentImpl
