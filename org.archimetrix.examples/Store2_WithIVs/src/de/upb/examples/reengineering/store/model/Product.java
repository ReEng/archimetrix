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
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.Product#getPrice <em>Price</em>}</li>
 *   <li>{@link store.Product#getName <em>Name</em>}</li>
 *   <li>{@link store.Product#getId <em>Id</em>}</li>
 *   <li>{@link store.Product#getProducer <em>Producer</em>}</li>
 *   <li>{@link store.Product#getWishlists <em>Wishlists</em>}</li>
 *   <li>{@link store.Product#getOfferedBy <em>Offered By</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getProduct()
 * @model kind="class"
 * @generated
 */
public class Product extends EObjectImpl implements EObject
{
   /**
    * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPrice()
    * @generated
    * @ordered
    */
   protected static final double PRICE_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPrice()
    * @generated
    * @ordered
    */
   protected double price = PRICE_EDEFAULT;

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
    * The cached value of the '{@link #getProducer() <em>Producer</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getProducer()
    * @generated
    * @ordered
    */
   protected Producer producer;

   /**
    * The cached value of the '{@link #getWishlists() <em>Wishlists</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getWishlists()
    * @generated
    * @ordered
    */
   protected EList<Wishlist> wishlists;

   /**
    * The cached value of the '{@link #getOfferedBy() <em>Offered By</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOfferedBy()
    * @generated
    * @ordered
    */
   protected Seller offeredBy;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Product()
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
      return StorePackage.Literals.PRODUCT;
   }

   /**
    * Returns the value of the '<em><b>Price</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Price</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Price</em>' attribute.
    * @see #setPrice(double)
    * @see store.StorePackage#getProduct_Price()
    * @model
    * @generated
    */
   public double getPrice()
   {
      return price;
   }

   /**
    * Sets the value of the '{@link store.Product#getPrice <em>Price</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Price</em>' attribute.
    * @see #getPrice()
    * @generated
    */
   public void setPrice(double newPrice)
   {
      double oldPrice = price;
      price = newPrice;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT__PRICE, oldPrice, price));
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
    * @see store.StorePackage#getProduct_Name()
    * @model
    * @generated
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the '{@link store.Product#getName <em>Name</em>}' attribute.
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
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT__NAME, oldName, name));
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
    * @see store.StorePackage#getProduct_Id()
    * @model
    * @generated
    */
   public String getId()
   {
      return id;
   }

   /**
    * Sets the value of the '{@link store.Product#getId <em>Id</em>}' attribute.
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
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT__ID, oldId, id));
   }

   /**
    * Returns the value of the '<em><b>Producer</b></em>' reference.
    * It is bidirectional and its opposite is '{@link store.Producer#getProducts <em>Products</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Producer</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Producer</em>' reference.
    * @see #setProducer(Producer)
    * @see store.StorePackage#getProduct_Producer()
    * @see store.Producer#getProducts
    * @model opposite="products" required="true"
    * @generated
    */
   public Producer getProducer()
   {
      if (producer != null && producer.eIsProxy())
      {
         InternalEObject oldProducer = (InternalEObject)producer;
         producer = (Producer)eResolveProxy(oldProducer);
         if (producer != oldProducer)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT__PRODUCER, oldProducer, producer));
         }
      }
      return producer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Producer basicGetProducer()
   {
      return producer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetProducer(Producer newProducer, NotificationChain msgs)
   {
      Producer oldProducer = producer;
      producer = newProducer;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT__PRODUCER, oldProducer, newProducer);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * Sets the value of the '{@link store.Product#getProducer <em>Producer</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Producer</em>' reference.
    * @see #getProducer()
    * @generated
    */
   public void setProducer(Producer newProducer)
   {
      if (newProducer != producer)
      {
         NotificationChain msgs = null;
         if (producer != null)
            msgs = ((InternalEObject)producer).eInverseRemove(this, StorePackage.PRODUCER__PRODUCTS, Producer.class, msgs);
         if (newProducer != null)
            msgs = ((InternalEObject)newProducer).eInverseAdd(this, StorePackage.PRODUCER__PRODUCTS, Producer.class, msgs);
         msgs = basicSetProducer(newProducer, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT__PRODUCER, newProducer, newProducer));
   }

   /**
    * Returns the value of the '<em><b>Wishlists</b></em>' reference list.
    * The list contents are of type {@link store.Wishlist}.
    * It is bidirectional and its opposite is '{@link store.Wishlist#getProducts <em>Products</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Wishlists</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Wishlists</em>' reference list.
    * @see store.StorePackage#getProduct_Wishlists()
    * @see store.Wishlist#getProducts
    * @model opposite="products"
    * @generated
    */
   public EList<Wishlist> getWishlists()
   {
      if (wishlists == null)
      {
         wishlists = new EObjectWithInverseResolvingEList.ManyInverse<Wishlist>(Wishlist.class, this, StorePackage.PRODUCT__WISHLISTS, StorePackage.WISHLIST__PRODUCTS);
      }
      return wishlists;
   }

   /**
    * Returns the value of the '<em><b>Offered By</b></em>' reference.
    * It is bidirectional and its opposite is '{@link store.Seller#getAllProductsToSell <em>All Products To Sell</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Offered By</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Offered By</em>' reference.
    * @see #setOfferedBy(Seller)
    * @see store.StorePackage#getProduct_OfferedBy()
    * @see store.Seller#getAllProductsToSell
    * @model opposite="allProductsToSell" required="true"
    * @generated
    */
   public Seller getOfferedBy()
   {
      if (offeredBy != null && offeredBy.eIsProxy())
      {
         InternalEObject oldOfferedBy = (InternalEObject)offeredBy;
         offeredBy = (Seller)eResolveProxy(oldOfferedBy);
         if (offeredBy != oldOfferedBy)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT__OFFERED_BY, oldOfferedBy, offeredBy));
         }
      }
      return offeredBy;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seller basicGetOfferedBy()
   {
      return offeredBy;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetOfferedBy(Seller newOfferedBy, NotificationChain msgs)
   {
      Seller oldOfferedBy = offeredBy;
      offeredBy = newOfferedBy;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT__OFFERED_BY, oldOfferedBy, newOfferedBy);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * Sets the value of the '{@link store.Product#getOfferedBy <em>Offered By</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Offered By</em>' reference.
    * @see #getOfferedBy()
    * @generated
    */
   public void setOfferedBy(Seller newOfferedBy)
   {
      if (newOfferedBy != offeredBy)
      {
         NotificationChain msgs = null;
         if (offeredBy != null)
            msgs = ((InternalEObject)offeredBy).eInverseRemove(this, StorePackage.SELLER__ALL_PRODUCTS_TO_SELL, Seller.class, msgs);
         if (newOfferedBy != null)
            msgs = ((InternalEObject)newOfferedBy).eInverseAdd(this, StorePackage.SELLER__ALL_PRODUCTS_TO_SELL, Seller.class, msgs);
         msgs = basicSetOfferedBy(newOfferedBy, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT__OFFERED_BY, newOfferedBy, newOfferedBy));
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
         case StorePackage.PRODUCT__PRODUCER:
            if (producer != null)
               msgs = ((InternalEObject)producer).eInverseRemove(this, StorePackage.PRODUCER__PRODUCTS, Producer.class, msgs);
            return basicSetProducer((Producer)otherEnd, msgs);
         case StorePackage.PRODUCT__WISHLISTS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getWishlists()).basicAdd(otherEnd, msgs);
         case StorePackage.PRODUCT__OFFERED_BY:
            if (offeredBy != null)
               msgs = ((InternalEObject)offeredBy).eInverseRemove(this, StorePackage.SELLER__ALL_PRODUCTS_TO_SELL, Seller.class, msgs);
            return basicSetOfferedBy((Seller)otherEnd, msgs);
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
         case StorePackage.PRODUCT__PRODUCER:
            return basicSetProducer(null, msgs);
         case StorePackage.PRODUCT__WISHLISTS:
            return ((InternalEList<?>)getWishlists()).basicRemove(otherEnd, msgs);
         case StorePackage.PRODUCT__OFFERED_BY:
            return basicSetOfferedBy(null, msgs);
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
         case StorePackage.PRODUCT__PRICE:
            return getPrice();
         case StorePackage.PRODUCT__NAME:
            return getName();
         case StorePackage.PRODUCT__ID:
            return getId();
         case StorePackage.PRODUCT__PRODUCER:
            if (resolve) return getProducer();
            return basicGetProducer();
         case StorePackage.PRODUCT__WISHLISTS:
            return getWishlists();
         case StorePackage.PRODUCT__OFFERED_BY:
            if (resolve) return getOfferedBy();
            return basicGetOfferedBy();
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
         case StorePackage.PRODUCT__PRICE:
            setPrice((Double)newValue);
            return;
         case StorePackage.PRODUCT__NAME:
            setName((String)newValue);
            return;
         case StorePackage.PRODUCT__ID:
            setId((String)newValue);
            return;
         case StorePackage.PRODUCT__PRODUCER:
            setProducer((Producer)newValue);
            return;
         case StorePackage.PRODUCT__WISHLISTS:
            getWishlists().clear();
            getWishlists().addAll((Collection<? extends Wishlist>)newValue);
            return;
         case StorePackage.PRODUCT__OFFERED_BY:
            setOfferedBy((Seller)newValue);
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
         case StorePackage.PRODUCT__PRICE:
            setPrice(PRICE_EDEFAULT);
            return;
         case StorePackage.PRODUCT__NAME:
            setName(NAME_EDEFAULT);
            return;
         case StorePackage.PRODUCT__ID:
            setId(ID_EDEFAULT);
            return;
         case StorePackage.PRODUCT__PRODUCER:
            setProducer((Producer)null);
            return;
         case StorePackage.PRODUCT__WISHLISTS:
            getWishlists().clear();
            return;
         case StorePackage.PRODUCT__OFFERED_BY:
            setOfferedBy((Seller)null);
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
         case StorePackage.PRODUCT__PRICE:
            return price != PRICE_EDEFAULT;
         case StorePackage.PRODUCT__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case StorePackage.PRODUCT__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
         case StorePackage.PRODUCT__PRODUCER:
            return producer != null;
         case StorePackage.PRODUCT__WISHLISTS:
            return wishlists != null && !wishlists.isEmpty();
         case StorePackage.PRODUCT__OFFERED_BY:
            return offeredBy != null;
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
      result.append(" (price: ");
      result.append(price);
      result.append(", name: ");
      result.append(name);
      result.append(", id: ");
      result.append(id);
      result.append(')');
      return result.toString();
   }

} // Product
