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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wishlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.examples.reengineering.store.model.Wishlist#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.examples.reengineering.store.model.StorePackage#getWishlist()
 * @model kind="class"
 * @generated
 */
public class Wishlist extends EObjectImpl implements EObject
{
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
   protected Wishlist()
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
      return StorePackage.Literals.WISHLIST;
   }

   /**
    * Returns the value of the '<em><b>Products</b></em>' reference list.
    * The list contents are of type {@link de.upb.examples.reengineering.store.model.Product}.
    * It is bidirectional and its opposite is '{@link de.upb.examples.reengineering.store.model.Product#getWishlists <em>Wishlists</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Products</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Products</em>' reference list.
    * @see de.upb.examples.reengineering.store.model.StorePackage#getWishlist_Products()
    * @see de.upb.examples.reengineering.store.model.Product#getWishlists
    * @model opposite="wishlists"
    * @generated
    */
   public EList<Product> getProducts()
   {
      if (products == null)
      {
         products = new EObjectWithInverseResolvingEList.ManyInverse<Product>(Product.class, this, StorePackage.WISHLIST__PRODUCTS, StorePackage.PRODUCT__WISHLISTS);
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
         case StorePackage.WISHLIST__PRODUCTS:
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
         case StorePackage.WISHLIST__PRODUCTS:
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
         case StorePackage.WISHLIST__PRODUCTS:
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
         case StorePackage.WISHLIST__PRODUCTS:
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
         case StorePackage.WISHLIST__PRODUCTS:
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
         case StorePackage.WISHLIST__PRODUCTS:
            return products != null && !products.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // Wishlist
