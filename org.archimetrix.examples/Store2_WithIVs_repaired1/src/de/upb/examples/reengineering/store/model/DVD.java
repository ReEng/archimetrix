/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.examples.reengineering.store.model;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DVD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.examples.reengineering.store.model.DVD#getInterpret <em>Interpret</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.examples.reengineering.store.model.StorePackage#getDVD()
 * @model kind="class"
 * @generated
 */
public class DVD extends Product
{
   /**
    * The default value of the '{@link #getInterpret() <em>Interpret</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInterpret()
    * @generated
    * @ordered
    */
   protected static final String INTERPRET_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getInterpret() <em>Interpret</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getInterpret()
    * @generated
    * @ordered
    */
   protected String interpret = INTERPRET_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected DVD()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return StorePackage.Literals.DVD;
   }

   /**
    * Returns the value of the '<em><b>Interpret</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Interpret</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Interpret</em>' attribute.
    * @see #setInterpret(String)
    * @see de.upb.examples.reengineering.store.model.StorePackage#getDVD_Interpret()
    * @model
    * @generated
    */
   public String getInterpret()
   {
      return interpret;
   }

   /**
    * Sets the value of the '{@link de.upb.examples.reengineering.store.model.DVD#getInterpret <em>Interpret</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Interpret</em>' attribute.
    * @see #getInterpret()
    * @generated
    */
   public void setInterpret(String newInterpret)
   {
      String oldInterpret = interpret;
      interpret = newInterpret;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.DVD__INTERPRET, oldInterpret, interpret));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case StorePackage.DVD__INTERPRET:
            return getInterpret();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case StorePackage.DVD__INTERPRET:
            setInterpret((String)newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
         case StorePackage.DVD__INTERPRET:
            setInterpret(INTERPRET_EDEFAULT);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
         case StorePackage.DVD__INTERPRET:
            return INTERPRET_EDEFAULT == null ? interpret != null : !INTERPRET_EDEFAULT.equals(interpret);
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString()
   {
      if (eIsProxy()) return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (interpret: ");
      result.append(interpret);
      result.append(')');
      return result.toString();
   }

} // DVD
