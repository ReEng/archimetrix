/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.expressions.impl.ExpressionImpl;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.expressions.AttributeValueExpression;
import org.storydriven.modeling.patterns.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Attribute Value Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.expressions.impl.AttributeValueExpressionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.storydriven.modeling.patterns.expressions.impl.AttributeValueExpressionImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueExpressionImpl extends ExpressionImpl implements AttributeValueExpression
{
   /**
    * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getObject()
    * @generated
    * @ordered
    */
   protected ObjectVariable object;

   /**
    * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getAttribute()
    * @generated
    * @ordered
    */
   protected EAttribute attribute;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected AttributeValueExpressionImpl ()
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
      return ExpressionsPackage.Literals.ATTRIBUTE_VALUE_EXPRESSION;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ObjectVariable getObject ()
   {
      if (object != null && object.eIsProxy())
      {
         InternalEObject oldObject = (InternalEObject) object;
         object = (ObjectVariable) eResolveProxy(oldObject);
         if (object != oldObject)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  ExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION__OBJECT, oldObject, object));
         }
      }
      return object;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ObjectVariable basicGetObject ()
   {
      return object;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void setObject (ObjectVariable newObject)
   {
      ObjectVariable oldObject = object;
      object = newObject;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION__OBJECT,
            oldObject, object));
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
                  ExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE, oldAttribute, attribute));
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
         eNotify(new ENotificationImpl(this, Notification.SET,
            ExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE, oldAttribute, attribute));
   }

   @Override
   public EClassifier basicGetType ()
   {
      EAttribute attribute = getAttribute();
      return attribute == null ? null : attribute.getEType();
   }

   @Override
   public EGenericType basicGetGenericType ()
   {
      EAttribute attribute = getAttribute();
      return attribute == null ? null : attribute.getEGenericType();
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
         case ExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION__OBJECT:
            if (resolve)
               return getObject();
            return basicGetObject();
         case ExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE:
            if (resolve)
               return getAttribute();
            return basicGetAttribute();
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
         case ExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION__OBJECT:
            setObject((ObjectVariable) newValue);
            return;
         case ExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE:
            setAttribute((EAttribute) newValue);
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
         case ExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION__OBJECT:
            setObject((ObjectVariable) null);
            return;
         case ExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE:
            setAttribute((EAttribute) null);
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
         case ExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION__OBJECT:
            return object != null;
         case ExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE:
            return attribute != null;
      }
      return super.eIsSet(featureID);
   }

} // AttributeValueExpressionImpl
