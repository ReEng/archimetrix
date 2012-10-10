/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.storydriven.modeling.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EGenericTypeImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.TypedElement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Typed Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.storydriven.modeling.impl.TypedElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.storydriven.modeling.impl.TypedElementImpl#getGenericType <em>Generic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypedElementImpl extends ExtendableElementImpl implements TypedElement
{
   /**
    * The cached value of the '{@link #getGenericType() <em>Generic Type</em>}' containment reference.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @see #getGenericType()
    * @generated
    * @ordered
    */
   protected EGenericType genericType;

   /**
    * This is true if the Generic Type containment reference has been set.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   protected boolean genericTypeESet;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   protected TypedElementImpl ()
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
      return SDMPackage.Literals.TYPED_ELEMENT;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClassifier getType ()
   {
      EClassifier type = basicGetType();
      return type != null && type.eIsProxy() ? (EClassifier) eResolveProxy((InternalEObject) type) : type;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClassifier basicGetType ()
   {
      return null;
   }

   protected NotificationChain basicSetType (EClassifier newType, NotificationChain msgs)
   {
      throw new UnsupportedOperationException();
   }

   protected NotificationChain updateGenericType (EClassifier newType, NotificationChain msgs)
   {
      EGenericType newGenericType = null;
      if (newType != null)
      {
         newGenericType = EcoreFactory.eINSTANCE.createEGenericType();
         newGenericType.setEClassifier(newType);
      }
      msgs = internalSetGenericType(newGenericType, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EGenericType getGenericType ()
   {
      if (genericType != null && genericType.eIsProxy())
      {
         InternalEObject oldGenericType = (InternalEObject) genericType;
         genericType = (EGenericType) eResolveProxy(oldGenericType);
         if (genericType != oldGenericType)
         {
            InternalEObject newGenericType = (InternalEObject) genericType;
            NotificationChain msgs = oldGenericType.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - SDMPackage.TYPED_ELEMENT__GENERIC_TYPE, null, null);
            if (newGenericType.eInternalContainer() == null)
            {
               msgs = newGenericType.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SDMPackage.TYPED_ELEMENT__GENERIC_TYPE,
                  null, msgs);
            }
            if (msgs != null)
               msgs.dispatch();
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, SDMPackage.TYPED_ELEMENT__GENERIC_TYPE,
                  oldGenericType, genericType));
         }
      }
      return genericType;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EGenericType basicGetGenericType ()
   {
      return genericType;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   protected NotificationChain basicSetGenericType (EGenericType newGenericType, NotificationChain msgs)
   {
      if (newGenericType == null)
      {
         if (basicGetType() != null)
         {
            msgs = basicSetType(null, msgs);
         }
      }
      else
      {
         EClassifier newType = ((EGenericTypeImpl) newGenericType).basicGetERawType();
         if (newType != basicGetType())
         {
            msgs = basicSetType(newType, msgs);
         }
      }
      EGenericType oldGenericType = this.genericType;
      this.genericType = newGenericType;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            SDMPackage.TYPED_ELEMENT__GENERIC_TYPE, oldGenericType, newGenericType);
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

   protected NotificationChain internalSetGenericType (EGenericType newGenericType, NotificationChain msgs)
   {
      if (newGenericType != this.genericType)
      {
         msgs = basicSetGenericType(newGenericType, msgs);
         if (this.genericType != null)
         {
            msgs = ((InternalEObject) this.genericType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - SDMPackage.TYPED_ELEMENT__GENERIC_TYPE, null, msgs);
         }
         if (newGenericType != null)
         {
            msgs = ((InternalEObject) newGenericType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - SDMPackage.TYPED_ELEMENT__GENERIC_TYPE, null, msgs);
         }
      }
      else if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            SDMPackage.TYPED_ELEMENT__GENERIC_TYPE, newGenericType, newGenericType);
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
   public void setGenericType (EGenericType newGenericType)
   {
      NotificationChain msgs = internalSetGenericType(newGenericType, null);
      if (msgs != null)
      {
         msgs.dispatch();
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public NotificationChain basicUnsetGenericType (NotificationChain msgs)
   {
      msgs = updateGenericType(null, msgs);
      return basicSetGenericType(null, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void unsetGenericType ()
   {
      setGenericType(null);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean isSetGenericType ()
   {
      return genericTypeESet;
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
         case SDMPackage.TYPED_ELEMENT__GENERIC_TYPE:
            return basicUnsetGenericType(msgs);
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
         case SDMPackage.TYPED_ELEMENT__TYPE:
            if (resolve)
               return getType();
            return basicGetType();
         case SDMPackage.TYPED_ELEMENT__GENERIC_TYPE:
            if (resolve)
               return getGenericType();
            return basicGetGenericType();
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
         case SDMPackage.TYPED_ELEMENT__GENERIC_TYPE:
            setGenericType((EGenericType) newValue);
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
         case SDMPackage.TYPED_ELEMENT__GENERIC_TYPE:
            unsetGenericType();
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
         case SDMPackage.TYPED_ELEMENT__TYPE:
            return isSetType();
         case SDMPackage.TYPED_ELEMENT__GENERIC_TYPE:
            return isSetGenericType();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public boolean isSetType ()
   {
      return false;
   }

} // TypedElementImpl
