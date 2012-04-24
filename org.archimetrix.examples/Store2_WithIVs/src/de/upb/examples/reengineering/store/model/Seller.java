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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.Seller#getName <em>Name</em>}</li>
 *   <li>{@link store.Seller#getId <em>Id</em>}</li>
 *   <li>{@link store.Seller#getUsername <em>Username</em>}</li>
 *   <li>{@link store.Seller#getAllProductsToSell <em>All Products To Sell</em>}</li>
 *   <li>{@link store.Seller#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link store.Seller#getSoldProducts <em>Sold Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getSeller()
 * @model kind="class"
 * @generated
 */
public class Seller extends EObjectImpl implements EObject, IAccountOwner
{
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
    * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUsername()
    * @generated
    * @ordered
    */
   protected static final String USERNAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUsername()
    * @generated
    * @ordered
    */
   protected String username = USERNAME_EDEFAULT;

   /**
    * The cached value of the '{@link #getAllProductsToSell() <em>All Products To Sell</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAllProductsToSell()
    * @generated
    * @ordered
    */
   protected EList<Product> allProductsToSell;

   /**
    * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEReference0()
    * @generated
    * @ordered
    */
   protected Seller eReference0;

   /**
    * The cached value of the '{@link #getSoldProducts() <em>Sold Products</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSoldProducts()
    * @generated
    * @ordered
    */
   protected EList<Product> soldProducts;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Seller()
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
      return StorePackage.Literals.SELLER;
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
    * @see store.StorePackage#getSeller_Name()
    * @model
    * @generated
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the '{@link store.Seller#getName <em>Name</em>}' attribute.
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
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SELLER__NAME, oldName, name));
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
    * @see store.StorePackage#getSeller_Id()
    * @model
    * @generated
    */
   public String getId()
   {
      return id;
   }

   /**
    * Sets the value of the '{@link store.Seller#getId <em>Id</em>}' attribute.
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
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SELLER__ID, oldId, id));
   }

   /**
    * Returns the value of the '<em><b>Username</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Username</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Username</em>' attribute.
    * @see #setUsername(String)
    * @see store.StorePackage#getSeller_Username()
    * @model
    * @generated
    */
   public String getUsername()
   {
      return username;
   }

   /**
    * Sets the value of the '{@link store.Seller#getUsername <em>Username</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Username</em>' attribute.
    * @see #getUsername()
    * @generated
    */
   public void setUsername(String newUsername)
   {
      String oldUsername = username;
      username = newUsername;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SELLER__USERNAME, oldUsername, username));
   }

   /**
    * Returns the value of the '<em><b>All Products To Sell</b></em>' reference list.
    * The list contents are of type {@link store.Product}.
    * It is bidirectional and its opposite is '{@link store.Product#getOfferedBy <em>Offered By</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>All Products To Sell</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>All Products To Sell</em>' reference list.
    * @see store.StorePackage#getSeller_AllProductsToSell()
    * @see store.Product#getOfferedBy
    * @model opposite="offeredBy"
    * @generated
    */
   public EList<Product> getAllProductsToSell()
   {
      if (allProductsToSell == null)
      {
         allProductsToSell = new EObjectWithInverseResolvingEList<Product>(Product.class, this, StorePackage.SELLER__ALL_PRODUCTS_TO_SELL, StorePackage.PRODUCT__OFFERED_BY);
      }
      return allProductsToSell;
   }

   /**
    * Returns the value of the '<em><b>EReference0</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>EReference0</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>EReference0</em>' reference.
    * @see #setEReference0(Seller)
    * @see store.StorePackage#getSeller_EReference0()
    * @model
    * @generated
    */
   public Seller getEReference0()
   {
      if (eReference0 != null && eReference0.eIsProxy())
      {
         InternalEObject oldEReference0 = (InternalEObject)eReference0;
         eReference0 = (Seller)eResolveProxy(oldEReference0);
         if (eReference0 != oldEReference0)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.SELLER__EREFERENCE0, oldEReference0, eReference0));
         }
      }
      return eReference0;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seller basicGetEReference0()
   {
      return eReference0;
   }

   /**
    * Sets the value of the '{@link store.Seller#getEReference0 <em>EReference0</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>EReference0</em>' reference.
    * @see #getEReference0()
    * @generated
    */
   public void setEReference0(Seller newEReference0)
   {
      Seller oldEReference0 = eReference0;
      eReference0 = newEReference0;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SELLER__EREFERENCE0, oldEReference0, eReference0));
   }

   /**
    * Returns the value of the '<em><b>Sold Products</b></em>' reference list.
    * The list contents are of type {@link store.Product}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Sold Products</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Sold Products</em>' reference list.
    * @see store.StorePackage#getSeller_SoldProducts()
    * @model
    * @generated
    */
   public EList<Product> getSoldProducts()
   {
      if (soldProducts == null)
      {
         soldProducts = new EObjectResolvingEList<Product>(Product.class, this, StorePackage.SELLER__SOLD_PRODUCTS);
      }
      return soldProducts;
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
         case StorePackage.SELLER__ALL_PRODUCTS_TO_SELL:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllProductsToSell()).basicAdd(otherEnd, msgs);
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
         case StorePackage.SELLER__ALL_PRODUCTS_TO_SELL:
            return ((InternalEList<?>)getAllProductsToSell()).basicRemove(otherEnd, msgs);
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
         case StorePackage.SELLER__NAME:
            return getName();
         case StorePackage.SELLER__ID:
            return getId();
         case StorePackage.SELLER__USERNAME:
            return getUsername();
         case StorePackage.SELLER__ALL_PRODUCTS_TO_SELL:
            return getAllProductsToSell();
         case StorePackage.SELLER__EREFERENCE0:
            if (resolve) return getEReference0();
            return basicGetEReference0();
         case StorePackage.SELLER__SOLD_PRODUCTS:
            return getSoldProducts();
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
         case StorePackage.SELLER__NAME:
            setName((String)newValue);
            return;
         case StorePackage.SELLER__ID:
            setId((String)newValue);
            return;
         case StorePackage.SELLER__USERNAME:
            setUsername((String)newValue);
            return;
         case StorePackage.SELLER__ALL_PRODUCTS_TO_SELL:
            getAllProductsToSell().clear();
            getAllProductsToSell().addAll((Collection<? extends Product>)newValue);
            return;
         case StorePackage.SELLER__EREFERENCE0:
            setEReference0((Seller)newValue);
            return;
         case StorePackage.SELLER__SOLD_PRODUCTS:
            getSoldProducts().clear();
            getSoldProducts().addAll((Collection<? extends Product>)newValue);
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
         case StorePackage.SELLER__NAME:
            setName(NAME_EDEFAULT);
            return;
         case StorePackage.SELLER__ID:
            setId(ID_EDEFAULT);
            return;
         case StorePackage.SELLER__USERNAME:
            setUsername(USERNAME_EDEFAULT);
            return;
         case StorePackage.SELLER__ALL_PRODUCTS_TO_SELL:
            getAllProductsToSell().clear();
            return;
         case StorePackage.SELLER__EREFERENCE0:
            setEReference0((Seller)null);
            return;
         case StorePackage.SELLER__SOLD_PRODUCTS:
            getSoldProducts().clear();
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
         case StorePackage.SELLER__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case StorePackage.SELLER__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
         case StorePackage.SELLER__USERNAME:
            return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
         case StorePackage.SELLER__ALL_PRODUCTS_TO_SELL:
            return allProductsToSell != null && !allProductsToSell.isEmpty();
         case StorePackage.SELLER__EREFERENCE0:
            return eReference0 != null;
         case StorePackage.SELLER__SOLD_PRODUCTS:
            return soldProducts != null && !soldProducts.isEmpty();
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
      result.append(" (name: ");
      result.append(name);
      result.append(", id: ");
      result.append(id);
      result.append(", username: ");
      result.append(username);
      result.append(')');
      return result.toString();
   }

} // Seller
