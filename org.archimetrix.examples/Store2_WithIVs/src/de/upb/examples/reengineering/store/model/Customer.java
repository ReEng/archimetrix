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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.examples.reengineering.store.model.Customer#getAllBoughtProducts <em>All Bought Products</em>}</li>
 *   <li>{@link de.upb.examples.reengineering.store.model.Customer#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.examples.reengineering.store.model.Customer#getAge <em>Age</em>}</li>
 *   <li>{@link de.upb.examples.reengineering.store.model.Customer#getId <em>Id</em>}</li>
 *   <li>{@link de.upb.examples.reengineering.store.model.Customer#getWishlists <em>Wishlists</em>}</li>
 *   <li>{@link de.upb.examples.reengineering.store.model.Customer#getUsername <em>Username</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.examples.reengineering.store.model.StorePackage#getCustomer()
 * @model kind="class"
 * @generated
 */
public class Customer extends EObjectImpl implements EObject, IAccountOwner
{
   /**
    * The cached value of the '{@link #getAllBoughtProducts() <em>All Bought Products</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAllBoughtProducts()
    * @generated
    * @ordered
    */
   protected EList<Product> allBoughtProducts;

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
    * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAge()
    * @generated
    * @ordered
    */
   protected static final int AGE_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAge()
    * @generated
    * @ordered
    */
   protected int age = AGE_EDEFAULT;

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
    * The cached value of the '{@link #getWishlists() <em>Wishlists</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getWishlists()
    * @generated
    * @ordered
    */
   protected EList<Wishlist> wishlists;

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
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Customer()
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
      return StorePackage.Literals.CUSTOMER;
   }

   /**
    * Returns the value of the '<em><b>All Bought Products</b></em>' reference list.
    * The list contents are of type {@link de.upb.examples.reengineering.store.model.Product}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>All Bought Products</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>All Bought Products</em>' reference list.
    * @see de.upb.examples.reengineering.store.model.StorePackage#getCustomer_AllBoughtProducts()
    * @model
    * @generated
    */
   public EList<Product> getAllBoughtProducts()
   {
      if (allBoughtProducts == null)
      {
         allBoughtProducts = new EObjectResolvingEList<Product>(Product.class, this, StorePackage.CUSTOMER__ALL_BOUGHT_PRODUCTS);
      }
      return allBoughtProducts;
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
    * @see de.upb.examples.reengineering.store.model.StorePackage#getCustomer_Name()
    * @model
    * @generated
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the '{@link de.upb.examples.reengineering.store.model.Customer#getName <em>Name</em>}' attribute.
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
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CUSTOMER__NAME, oldName, name));
   }

   /**
    * Returns the value of the '<em><b>Age</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Age</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Age</em>' attribute.
    * @see #setAge(int)
    * @see de.upb.examples.reengineering.store.model.StorePackage#getCustomer_Age()
    * @model
    * @generated
    */
   public int getAge()
   {
      return age;
   }

   /**
    * Sets the value of the '{@link de.upb.examples.reengineering.store.model.Customer#getAge <em>Age</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Age</em>' attribute.
    * @see #getAge()
    * @generated
    */
   public void setAge(int newAge)
   {
      int oldAge = age;
      age = newAge;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CUSTOMER__AGE, oldAge, age));
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
    * @see de.upb.examples.reengineering.store.model.StorePackage#getCustomer_Id()
    * @model
    * @generated
    */
   public String getId()
   {
      return id;
   }

   /**
    * Sets the value of the '{@link de.upb.examples.reengineering.store.model.Customer#getId <em>Id</em>}' attribute.
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
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CUSTOMER__ID, oldId, id));
   }

   /**
    * Returns the value of the '<em><b>Wishlists</b></em>' containment reference list.
    * The list contents are of type {@link de.upb.examples.reengineering.store.model.Wishlist}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Wishlists</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Wishlists</em>' containment reference list.
    * @see de.upb.examples.reengineering.store.model.StorePackage#getCustomer_Wishlists()
    * @model containment="true"
    * @generated
    */
   public EList<Wishlist> getWishlists()
   {
      if (wishlists == null)
      {
         wishlists = new EObjectContainmentEList<Wishlist>(Wishlist.class, this, StorePackage.CUSTOMER__WISHLISTS);
      }
      return wishlists;
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
    * @see de.upb.examples.reengineering.store.model.StorePackage#getCustomer_Username()
    * @model
    * @generated
    */
   public String getUsername()
   {
      return username;
   }

   /**
    * Sets the value of the '{@link de.upb.examples.reengineering.store.model.Customer#getUsername <em>Username</em>}' attribute.
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
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CUSTOMER__USERNAME, oldUsername, username));
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
         case StorePackage.CUSTOMER__WISHLISTS:
            return ((InternalEList<?>)getWishlists()).basicRemove(otherEnd, msgs);
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
         case StorePackage.CUSTOMER__ALL_BOUGHT_PRODUCTS:
            return getAllBoughtProducts();
         case StorePackage.CUSTOMER__NAME:
            return getName();
         case StorePackage.CUSTOMER__AGE:
            return getAge();
         case StorePackage.CUSTOMER__ID:
            return getId();
         case StorePackage.CUSTOMER__WISHLISTS:
            return getWishlists();
         case StorePackage.CUSTOMER__USERNAME:
            return getUsername();
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
         case StorePackage.CUSTOMER__ALL_BOUGHT_PRODUCTS:
            getAllBoughtProducts().clear();
            getAllBoughtProducts().addAll((Collection<? extends Product>)newValue);
            return;
         case StorePackage.CUSTOMER__NAME:
            setName((String)newValue);
            return;
         case StorePackage.CUSTOMER__AGE:
            setAge((Integer)newValue);
            return;
         case StorePackage.CUSTOMER__ID:
            setId((String)newValue);
            return;
         case StorePackage.CUSTOMER__WISHLISTS:
            getWishlists().clear();
            getWishlists().addAll((Collection<? extends Wishlist>)newValue);
            return;
         case StorePackage.CUSTOMER__USERNAME:
            setUsername((String)newValue);
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
         case StorePackage.CUSTOMER__ALL_BOUGHT_PRODUCTS:
            getAllBoughtProducts().clear();
            return;
         case StorePackage.CUSTOMER__NAME:
            setName(NAME_EDEFAULT);
            return;
         case StorePackage.CUSTOMER__AGE:
            setAge(AGE_EDEFAULT);
            return;
         case StorePackage.CUSTOMER__ID:
            setId(ID_EDEFAULT);
            return;
         case StorePackage.CUSTOMER__WISHLISTS:
            getWishlists().clear();
            return;
         case StorePackage.CUSTOMER__USERNAME:
            setUsername(USERNAME_EDEFAULT);
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
         case StorePackage.CUSTOMER__ALL_BOUGHT_PRODUCTS:
            return allBoughtProducts != null && !allBoughtProducts.isEmpty();
         case StorePackage.CUSTOMER__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case StorePackage.CUSTOMER__AGE:
            return age != AGE_EDEFAULT;
         case StorePackage.CUSTOMER__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
         case StorePackage.CUSTOMER__WISHLISTS:
            return wishlists != null && !wishlists.isEmpty();
         case StorePackage.CUSTOMER__USERNAME:
            return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
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
      result.append(", age: ");
      result.append(age);
      result.append(", id: ");
      result.append(id);
      result.append(", username: ");
      result.append(username);
      result.append(')');
      return result.toString();
   }

} // Customer
