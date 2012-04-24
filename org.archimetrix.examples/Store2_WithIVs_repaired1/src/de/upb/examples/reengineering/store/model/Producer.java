/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.examples.reengineering.store.model;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.examples.reengineering.store.model.Producer#getId <em>Id</em>}</li>
 *   <li>{@link de.upb.examples.reengineering.store.model.Producer#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.examples.reengineering.store.model.Producer#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.examples.reengineering.store.model.StorePackage#getProducer()
 * @model kind="class"
 * @generated
 */
public class Producer extends EObjectImpl implements EObject
{
   /**
    * The default value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getId()
    * @generated
    * @ordered
    */
   protected static final String ID_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getId()
    * @generated
    * @ordered
    */
   protected String id = ID_EDEFAULT;

   /**
    * The default value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected static final String NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
   protected String name = NAME_EDEFAULT;

   /**
    * The cached value of the '{@link #getProducts() <em>Products</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProducts()
    * @generated
    * @ordered
    */
   protected EList<Product> products;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Producer()
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
      return StorePackage.Literals.PRODUCER;
   }

   /**
    * Returns the value of the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Id</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Id</em>' attribute.
    * @see #setId(String)
    * @see de.upb.examples.reengineering.store.model.StorePackage#getProducer_Id()
    * @model
    * @generated
    */
   public String getId()
   {
      return id;
   }

   /**
    * Sets the value of the '{@link de.upb.examples.reengineering.store.model.Producer#getId <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Id</em>' attribute.
    * @see #getId()
    * @generated
    */
   public void setId(String newId)
   {
      String oldId = id;
      id = newId;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCER__ID, oldId, id));
   }

   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Name</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see de.upb.examples.reengineering.store.model.StorePackage#getProducer_Name()
    * @model
    * @generated
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the '{@link de.upb.examples.reengineering.store.model.Producer#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   public void setName(String newName)
   {
      String oldName = name;
      name = newName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCER__NAME, oldName, name));
   }

   /**
    * Returns the value of the '<em><b>Products</b></em>' reference list.
    * The list contents are of type {@link de.upb.examples.reengineering.store.model.Product}.
    * It is bidirectional and its opposite is '{@link de.upb.examples.reengineering.store.model.Product#getProducer <em>Producer</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Products</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Products</em>' reference list.
    * @see de.upb.examples.reengineering.store.model.StorePackage#getProducer_Products()
    * @see de.upb.examples.reengineering.store.model.Product#getProducer
    * @model opposite="producer"
    * @generated
    */
   public EList<Product> getProducts()
   {
      if (products == null)
      {
         products = new EObjectWithInverseResolvingEList<Product>(Product.class, this, StorePackage.PRODUCER__PRODUCTS, StorePackage.PRODUCT__PRODUCER);
      }
      return products;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case StorePackage.PRODUCER__PRODUCTS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducts()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case StorePackage.PRODUCER__PRODUCTS:
            return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
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
         case StorePackage.PRODUCER__ID:
            return getId();
         case StorePackage.PRODUCER__NAME:
            return getName();
         case StorePackage.PRODUCER__PRODUCTS:
            return getProducts();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case StorePackage.PRODUCER__ID:
            setId((String)newValue);
            return;
         case StorePackage.PRODUCER__NAME:
            setName((String)newValue);
            return;
         case StorePackage.PRODUCER__PRODUCTS:
            getProducts().clear();
            getProducts().addAll((Collection<? extends Product>)newValue);
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
         case StorePackage.PRODUCER__ID:
            setId(ID_EDEFAULT);
            return;
         case StorePackage.PRODUCER__NAME:
            setName(NAME_EDEFAULT);
            return;
         case StorePackage.PRODUCER__PRODUCTS:
            getProducts().clear();
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
         case StorePackage.PRODUCER__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
         case StorePackage.PRODUCER__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case StorePackage.PRODUCER__PRODUCTS:
            return products != null && !products.isEmpty();
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
      result.append(" (id: ");
      result.append(id);
      result.append(", name: ");
      result.append(name);
      result.append(')');
      return result.toString();
   }

} // Producer
