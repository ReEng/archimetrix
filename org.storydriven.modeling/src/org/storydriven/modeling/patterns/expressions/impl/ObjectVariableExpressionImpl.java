/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.patterns.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.expressions.impl.ExpressionImpl;
import org.storydriven.modeling.patterns.ObjectVariable;
import org.storydriven.modeling.patterns.expressions.ExpressionsPackage;
import org.storydriven.modeling.patterns.expressions.ObjectVariableExpression;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Object Variable Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.patterns.expressions.impl.ObjectVariableExpressionImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectVariableExpressionImpl extends ExpressionImpl implements ObjectVariableExpression
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
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected ObjectVariableExpressionImpl ()
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
      return ExpressionsPackage.Literals.OBJECT_VARIABLE_EXPRESSION;
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
                  ExpressionsPackage.OBJECT_VARIABLE_EXPRESSION__OBJECT, oldObject, object));
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
         eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.OBJECT_VARIABLE_EXPRESSION__OBJECT,
            oldObject, object));
   }

   @Override
   public EClassifier basicGetType ()
   {
      ObjectVariable object = getObject();
      return object == null ? null : object.getType();
   }

   @Override
   public EGenericType basicGetGenericType ()
   {
      ObjectVariable object = getObject();
      return object == null ? null : object.getGenericType();
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
         case ExpressionsPackage.OBJECT_VARIABLE_EXPRESSION__OBJECT:
            if (resolve)
               return getObject();
            return basicGetObject();
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
         case ExpressionsPackage.OBJECT_VARIABLE_EXPRESSION__OBJECT:
            setObject((ObjectVariable) newValue);
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
         case ExpressionsPackage.OBJECT_VARIABLE_EXPRESSION__OBJECT:
            setObject((ObjectVariable) null);
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
         case ExpressionsPackage.OBJECT_VARIABLE_EXPRESSION__OBJECT:
            return object != null;
      }
      return super.eIsSet(featureID);
   }

} // ObjectVariableExpressionImpl
