/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.examples.reengineering.store.model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.examples.reengineering.store.model.StorePackage
 * @generated
 */
public class StoreFactory extends EFactoryImpl
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final StoreFactory eINSTANCE = init();

   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static StoreFactory init()
   {
      try
      {
         StoreFactory theStoreFactory = (StoreFactory)EPackage.Registry.INSTANCE.getEFactory("examples"); 
         if (theStoreFactory != null)
         {
            return theStoreFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new StoreFactory();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public StoreFactory()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
         case StorePackage.PRODUCT: return createProduct();
         case StorePackage.CUSTOMER: return createCustomer();
         case StorePackage.PRODUCER: return createProducer();
         case StorePackage.STORE: return createStore();
         case StorePackage.BOOK: return createBook();
         case StorePackage.DVD: return createDVD();
         case StorePackage.WISHLIST: return createWishlist();
         case StorePackage.SELLER: return createSeller();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Product createProduct()
   {
      Product product = new Product();
      return product;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Customer createCustomer()
   {
      Customer customer = new Customer();
      return customer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Producer createProducer()
   {
      Producer producer = new Producer();
      return producer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Store createStore()
   {
      Store store = new Store();
      return store;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Book createBook()
   {
      Book book = new Book();
      return book;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DVD createDVD()
   {
      DVD dvd = new DVD();
      return dvd;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Wishlist createWishlist()
   {
      Wishlist wishlist = new Wishlist();
      return wishlist;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Seller createSeller()
   {
      Seller seller = new Seller();
      return seller;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public StorePackage getStorePackage()
   {
      return (StorePackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static StorePackage getPackage()
   {
      return StorePackage.eINSTANCE;
   }

} //StoreFactory
