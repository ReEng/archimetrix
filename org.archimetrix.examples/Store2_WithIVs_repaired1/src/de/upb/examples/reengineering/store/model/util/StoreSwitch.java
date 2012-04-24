/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.examples.reengineering.store.model.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.upb.examples.reengineering.store.model.*;


/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.upb.examples.reengineering.store.model.StorePackage
 * @generated
 */
public class StoreSwitch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static StorePackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public StoreSwitch()
   {
      if (modelPackage == null)
      {
         modelPackage = StorePackage.eINSTANCE;
      }
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   public T doSwitch(EObject theEObject)
   {
      return doSwitch(theEObject.eClass(), theEObject);
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   protected T doSwitch(EClass theEClass, EObject theEObject)
   {
      if (theEClass.eContainer() == modelPackage)
      {
         return doSwitch(theEClass.getClassifierID(), theEObject);
      }
      else
      {
         List<EClass> eSuperTypes = theEClass.getESuperTypes();
         return
            eSuperTypes.isEmpty() ?
               defaultCase(theEObject) :
               doSwitch(eSuperTypes.get(0), theEObject);
      }
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   protected T doSwitch(int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
         case StorePackage.PRODUCT:
         {
            Product product = (Product)theEObject;
            T result = caseProduct(product);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case StorePackage.CUSTOMER:
         {
            Customer customer = (Customer)theEObject;
            T result = caseCustomer(customer);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case StorePackage.PRODUCER:
         {
            Producer producer = (Producer)theEObject;
            T result = caseProducer(producer);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case StorePackage.STORE:
         {
            Store store = (Store)theEObject;
            T result = caseStore(store);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case StorePackage.BOOK:
         {
            Book book = (Book)theEObject;
            T result = caseBook(book);
            if (result == null) result = caseProduct(book);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case StorePackage.DVD:
         {
            DVD dvd = (DVD)theEObject;
            T result = caseDVD(dvd);
            if (result == null) result = caseProduct(dvd);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case StorePackage.WISHLIST:
         {
            Wishlist wishlist = (Wishlist)theEObject;
            T result = caseWishlist(wishlist);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case StorePackage.SELLER:
         {
            Seller seller = (Seller)theEObject;
            T result = caseSeller(seller);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Product</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseProduct(Product object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCustomer(Customer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Producer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Producer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseProducer(Producer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Store</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStore(Store object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Book</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Book</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBook(Book object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>DVD</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>DVD</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDVD(DVD object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Wishlist</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Wishlist</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseWishlist(Wishlist object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Seller</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Seller</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSeller(Seller object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   public T defaultCase(EObject object)
   {
      return null;
   }

} //StoreSwitch
