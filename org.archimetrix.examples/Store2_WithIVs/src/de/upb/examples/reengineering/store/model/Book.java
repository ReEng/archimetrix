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
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.examples.reengineering.store.model.Book#getAuthor <em>Author</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.examples.reengineering.store.model.StorePackage#getBook()
 * @model kind="class"
 * @generated
 */
public class Book extends Product
{
   /**
    * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAuthor()
    * @generated
    * @ordered
    */
   protected static final String AUTHOR_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAuthor()
    * @generated
    * @ordered
    */
   protected String author = AUTHOR_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Book()
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
      return StorePackage.Literals.BOOK;
   }

   /**
    * Returns the value of the '<em><b>Author</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Author</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Author</em>' attribute.
    * @see #setAuthor(String)
    * @see de.upb.examples.reengineering.store.model.StorePackage#getBook_Author()
    * @model
    * @generated
    */
   public String getAuthor()
   {
      return author;
   }

   /**
    * Sets the value of the '{@link de.upb.examples.reengineering.store.model.Book#getAuthor <em>Author</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Author</em>' attribute.
    * @see #getAuthor()
    * @generated
    */
   public void setAuthor(String newAuthor)
   {
      String oldAuthor = author;
      author = newAuthor;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.BOOK__AUTHOR, oldAuthor, author));
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
         case StorePackage.BOOK__AUTHOR:
            return getAuthor();
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
         case StorePackage.BOOK__AUTHOR:
            setAuthor((String)newValue);
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
         case StorePackage.BOOK__AUTHOR:
            setAuthor(AUTHOR_EDEFAULT);
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
         case StorePackage.BOOK__AUTHOR:
            return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
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
      result.append(" (author: ");
      result.append(author);
      result.append(')');
      return result.toString();
   }

} // Book
