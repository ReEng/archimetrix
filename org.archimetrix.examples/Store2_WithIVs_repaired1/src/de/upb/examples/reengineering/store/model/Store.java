/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.examples.reengineering.store.model;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.Store#getCustomers <em>Customers</em>}</li>
 *   <li>{@link store.Store#getProducts <em>Products</em>}</li>
 *   <li>{@link store.Store#getProducers <em>Producers</em>}</li>
 *   <li>{@link store.Store#getSellers <em>Sellers</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getStore()
 * @model kind="class"
 * @generated
 */
public class Store extends EObjectImpl implements EObject
{
   /**
    * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCustomers()
    * @generated
    * @ordered
    */
   protected EList<Customer> customers;

   /**
    * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProducts()
    * @generated
    * @ordered
    */
   protected EList<Product> products;

   /**
    * The cached value of the '{@link #getProducers() <em>Producers</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProducers()
    * @generated
    * @ordered
    */
   protected EList<Producer> producers;

   /**
    * The cached value of the '{@link #getSellers() <em>Sellers</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSellers()
    * @generated
    * @ordered
    */
   protected EList<Seller> sellers;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Store()
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
      return StorePackage.Literals.STORE;
   }

   /**
    * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
    * The list contents are of type {@link store.Customer}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Customers</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Customers</em>' containment reference list.
    * @see store.StorePackage#getStore_Customers()
    * @model containment="true"
    * @generated
    */
   public EList<Customer> getCustomers()
   {
      if (customers == null)
      {
         customers = new EObjectContainmentEList<Customer>(Customer.class, this, StorePackage.STORE__CUSTOMERS);
      }
      return customers;
   }

   /**
    * Returns the value of the '<em><b>Products</b></em>' containment reference list.
    * The list contents are of type {@link store.Product}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Products</em>' containment reference list.
    * @see store.StorePackage#getStore_Products()
    * @model containment="true"
    * @generated
    */
   public EList<Product> getProducts()
   {
      if (products == null)
      {
         products = new EObjectContainmentEList<Product>(Product.class, this, StorePackage.STORE__PRODUCTS);
      }
      return products;
   }

   /**
    * Returns the value of the '<em><b>Producers</b></em>' containment reference list.
    * The list contents are of type {@link store.Producer}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Producers</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Producers</em>' containment reference list.
    * @see store.StorePackage#getStore_Producers()
    * @model containment="true"
    * @generated
    */
   public EList<Producer> getProducers()
   {
      if (producers == null)
      {
         producers = new EObjectContainmentEList<Producer>(Producer.class, this, StorePackage.STORE__PRODUCERS);
      }
      return producers;
   }

   /**
    * Returns the value of the '<em><b>Sellers</b></em>' containment reference list.
    * The list contents are of type {@link store.Seller}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Sellers</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Sellers</em>' containment reference list.
    * @see store.StorePackage#getStore_Sellers()
    * @model containment="true"
    * @generated
    */
   public EList<Seller> getSellers()
   {
      if (sellers == null)
      {
         sellers = new EObjectContainmentEList<Seller>(Seller.class, this, StorePackage.STORE__SELLERS);
      }
      return sellers;
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
         case StorePackage.STORE__CUSTOMERS:
            return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
         case StorePackage.STORE__PRODUCTS:
            return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
         case StorePackage.STORE__PRODUCERS:
            return ((InternalEList<?>)getProducers()).basicRemove(otherEnd, msgs);
         case StorePackage.STORE__SELLERS:
            return ((InternalEList<?>)getSellers()).basicRemove(otherEnd, msgs);
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
         case StorePackage.STORE__CUSTOMERS:
            return getCustomers();
         case StorePackage.STORE__PRODUCTS:
            return getProducts();
         case StorePackage.STORE__PRODUCERS:
            return getProducers();
         case StorePackage.STORE__SELLERS:
            return getSellers();
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
         case StorePackage.STORE__CUSTOMERS:
            getCustomers().clear();
            getCustomers().addAll((Collection<? extends Customer>)newValue);
            return;
         case StorePackage.STORE__PRODUCTS:
            getProducts().clear();
            getProducts().addAll((Collection<? extends Product>)newValue);
            return;
         case StorePackage.STORE__PRODUCERS:
            getProducers().clear();
            getProducers().addAll((Collection<? extends Producer>)newValue);
            return;
         case StorePackage.STORE__SELLERS:
            getSellers().clear();
            getSellers().addAll((Collection<? extends Seller>)newValue);
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
         case StorePackage.STORE__CUSTOMERS:
            getCustomers().clear();
            return;
         case StorePackage.STORE__PRODUCTS:
            getProducts().clear();
            return;
         case StorePackage.STORE__PRODUCERS:
            getProducers().clear();
            return;
         case StorePackage.STORE__SELLERS:
            getSellers().clear();
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
         case StorePackage.STORE__CUSTOMERS:
            return customers != null && !customers.isEmpty();
         case StorePackage.STORE__PRODUCTS:
            return products != null && !products.isEmpty();
         case StorePackage.STORE__PRODUCERS:
            return producers != null && !producers.isEmpty();
         case StorePackage.STORE__SELLERS:
            return sellers != null && !sellers.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // Store
