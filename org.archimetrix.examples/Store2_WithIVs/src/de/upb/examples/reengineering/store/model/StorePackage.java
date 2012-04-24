/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.upb.examples.reengineering.store.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.upb.examples.reengineering.store.model.StoreFactory
 * @model kind="package"
 * @generated
 */
public class StorePackage extends EPackageImpl
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final String eNAME = "store";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final String eNS_URI = "examples";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final String eNS_PREFIX = "examples";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final StorePackage eINSTANCE = de.upb.examples.reengineering.store.model.StorePackage.init();

   /**
    * The meta object id for the '{@link de.upb.examples.reengineering.store.model.Product <em>Product</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de.upb.examples.reengineering.store.model.Product
    * @see de.upb.examples.reengineering.store.model.StorePackage#getProduct()
    * @generated
    */
   public static final int PRODUCT = 0;

   /**
    * The feature id for the '<em><b>Price</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int PRODUCT__PRICE = 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int PRODUCT__NAME = 1;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int PRODUCT__ID = 2;

   /**
    * The feature id for the '<em><b>Producer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int PRODUCT__PRODUCER = 3;

   /**
    * The feature id for the '<em><b>Wishlists</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int PRODUCT__WISHLISTS = 4;

   /**
    * The feature id for the '<em><b>Offered By</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int PRODUCT__OFFERED_BY = 5;

   /**
    * The number of structural features of the '<em>Product</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int PRODUCT_FEATURE_COUNT = 6;

   /**
    * The meta object id for the '{@link de.upb.examples.reengineering.store.model.Customer <em>Customer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de.upb.examples.reengineering.store.model.Customer
    * @see de.upb.examples.reengineering.store.model.StorePackage#getCustomer()
    * @generated
    */
   public static final int CUSTOMER = 1;

   /**
    * The feature id for the '<em><b>All Bought Products</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int CUSTOMER__ALL_BOUGHT_PRODUCTS = 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int CUSTOMER__NAME = 1;

   /**
    * The feature id for the '<em><b>Age</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int CUSTOMER__AGE = 2;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int CUSTOMER__ID = 3;

   /**
    * The feature id for the '<em><b>Wishlists</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int CUSTOMER__WISHLISTS = 4;

   /**
    * The feature id for the '<em><b>Username</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int CUSTOMER__USERNAME = 5;

   /**
    * The number of structural features of the '<em>Customer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int CUSTOMER_FEATURE_COUNT = 6;

   /**
    * The meta object id for the '{@link de.upb.examples.reengineering.store.model.Producer <em>Producer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de.upb.examples.reengineering.store.model.Producer
    * @see de.upb.examples.reengineering.store.model.StorePackage#getProducer()
    * @generated
    */
   public static final int PRODUCER = 2;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int PRODUCER__ID = 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int PRODUCER__NAME = 1;

   /**
    * The feature id for the '<em><b>Products</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int PRODUCER__PRODUCTS = 2;

   /**
    * The number of structural features of the '<em>Producer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int PRODUCER_FEATURE_COUNT = 3;

   /**
    * The meta object id for the '{@link de.upb.examples.reengineering.store.model.Store <em>Store</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de.upb.examples.reengineering.store.model.Store
    * @see de.upb.examples.reengineering.store.model.StorePackage#getStore()
    * @generated
    */
   public static final int STORE = 3;

   /**
    * The feature id for the '<em><b>Customers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int STORE__CUSTOMERS = 0;

   /**
    * The feature id for the '<em><b>Products</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int STORE__PRODUCTS = 1;

   /**
    * The feature id for the '<em><b>Producers</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int STORE__PRODUCERS = 2;

   /**
    * The feature id for the '<em><b>Sellers</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int STORE__SELLERS = 3;

   /**
    * The number of structural features of the '<em>Store</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int STORE_FEATURE_COUNT = 4;

   /**
    * The meta object id for the '{@link de.upb.examples.reengineering.store.model.Book <em>Book</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de.upb.examples.reengineering.store.model.Book
    * @see de.upb.examples.reengineering.store.model.StorePackage#getBook()
    * @generated
    */
   public static final int BOOK = 4;

   /**
    * The feature id for the '<em><b>Price</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int BOOK__PRICE = PRODUCT__PRICE;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int BOOK__NAME = PRODUCT__NAME;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int BOOK__ID = PRODUCT__ID;

   /**
    * The feature id for the '<em><b>Producer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int BOOK__PRODUCER = PRODUCT__PRODUCER;

   /**
    * The feature id for the '<em><b>Wishlists</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int BOOK__WISHLISTS = PRODUCT__WISHLISTS;

   /**
    * The feature id for the '<em><b>Offered By</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int BOOK__OFFERED_BY = PRODUCT__OFFERED_BY;

   /**
    * The feature id for the '<em><b>Author</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int BOOK__AUTHOR = PRODUCT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Book</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int BOOK_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de.upb.examples.reengineering.store.model.DVD <em>DVD</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de.upb.examples.reengineering.store.model.DVD
    * @see de.upb.examples.reengineering.store.model.StorePackage#getDVD()
    * @generated
    */
   public static final int DVD = 5;

   /**
    * The feature id for the '<em><b>Price</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int DVD__PRICE = PRODUCT__PRICE;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int DVD__NAME = PRODUCT__NAME;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int DVD__ID = PRODUCT__ID;

   /**
    * The feature id for the '<em><b>Producer</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int DVD__PRODUCER = PRODUCT__PRODUCER;

   /**
    * The feature id for the '<em><b>Wishlists</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int DVD__WISHLISTS = PRODUCT__WISHLISTS;

   /**
    * The feature id for the '<em><b>Offered By</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int DVD__OFFERED_BY = PRODUCT__OFFERED_BY;

   /**
    * The feature id for the '<em><b>Interpret</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int DVD__INTERPRET = PRODUCT_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>DVD</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int DVD_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link de.upb.examples.reengineering.store.model.Wishlist <em>Wishlist</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de.upb.examples.reengineering.store.model.Wishlist
    * @see de.upb.examples.reengineering.store.model.StorePackage#getWishlist()
    * @generated
    */
   public static final int WISHLIST = 6;

   /**
    * The feature id for the '<em><b>Products</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int WISHLIST__PRODUCTS = 0;

   /**
    * The number of structural features of the '<em>Wishlist</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int WISHLIST_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link de.upb.examples.reengineering.store.model.Seller <em>Seller</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see de.upb.examples.reengineering.store.model.Seller
    * @see de.upb.examples.reengineering.store.model.StorePackage#getSeller()
    * @generated
    */
   public static final int SELLER = 7;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int SELLER__NAME = 0;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int SELLER__ID = 1;

   /**
    * The feature id for the '<em><b>Username</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int SELLER__USERNAME = 2;

   /**
    * The feature id for the '<em><b>All Products To Sell</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int SELLER__ALL_PRODUCTS_TO_SELL = 3;

   /**
    * The feature id for the '<em><b>EReference0</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int SELLER__EREFERENCE0 = 4;

   /**
    * The feature id for the '<em><b>Sold Products</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int SELLER__SOLD_PRODUCTS = 5;

   /**
    * The number of structural features of the '<em>Seller</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   public static final int SELLER_FEATURE_COUNT = 6;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass productEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass customerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass producerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass storeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass bookEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass dvdEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass wishlistEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass sellerEClass = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see de.upb.examples.reengineering.store.model.StorePackage#eNS_URI
    * @see #init()
    * @generated
    */
   private StorePackage()
   {
      super(eNS_URI, StoreFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link StorePackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static StorePackage init()
   {
      if (isInited) return (StorePackage)EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);

      // Obtain or create and register package
      StorePackage theStorePackage = (StorePackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StorePackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StorePackage());

      isInited = true;

      // Create package meta-data objects
      theStorePackage.createPackageContents();

      // Initialize created meta-data
      theStorePackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theStorePackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(StorePackage.eNS_URI, theStorePackage);
      return theStorePackage;
   }


   /**
    * Returns the meta object for class '{@link de.upb.examples.reengineering.store.model.Product <em>Product</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Product</em>'.
    * @see de.upb.examples.reengineering.store.model.Product
    * @generated
    */
   public EClass getProduct()
   {
      return productEClass;
   }

   /**
    * Returns the meta object for the attribute '{@link de.upb.examples.reengineering.store.model.Product#getPrice <em>Price</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Price</em>'.
    * @see de.upb.examples.reengineering.store.model.Product#getPrice()
    * @see #getProduct()
    * @generated
    */
   public EAttribute getProduct_Price()
   {
      return (EAttribute)productEClass.getEStructuralFeatures().get(0);
   }

   /**
    * Returns the meta object for the attribute '{@link de.upb.examples.reengineering.store.model.Product#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see de.upb.examples.reengineering.store.model.Product#getName()
    * @see #getProduct()
    * @generated
    */
   public EAttribute getProduct_Name()
   {
      return (EAttribute)productEClass.getEStructuralFeatures().get(1);
   }

   /**
    * Returns the meta object for the attribute '{@link de.upb.examples.reengineering.store.model.Product#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see de.upb.examples.reengineering.store.model.Product#getId()
    * @see #getProduct()
    * @generated
    */
   public EAttribute getProduct_Id()
   {
      return (EAttribute)productEClass.getEStructuralFeatures().get(2);
   }

   /**
    * Returns the meta object for the reference '{@link de.upb.examples.reengineering.store.model.Product#getProducer <em>Producer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Producer</em>'.
    * @see de.upb.examples.reengineering.store.model.Product#getProducer()
    * @see #getProduct()
    * @generated
    */
   public EReference getProduct_Producer()
   {
      return (EReference)productEClass.getEStructuralFeatures().get(3);
   }

   /**
    * Returns the meta object for the reference list '{@link de.upb.examples.reengineering.store.model.Product#getWishlists <em>Wishlists</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Wishlists</em>'.
    * @see de.upb.examples.reengineering.store.model.Product#getWishlists()
    * @see #getProduct()
    * @generated
    */
   public EReference getProduct_Wishlists()
   {
      return (EReference)productEClass.getEStructuralFeatures().get(4);
   }

   /**
    * Returns the meta object for the reference list '{@link de.upb.examples.reengineering.store.model.Product#getOfferedBy <em>Offered By</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Offered By</em>'.
    * @see de.upb.examples.reengineering.store.model.Product#getOfferedBy()
    * @see #getProduct()
    * @generated
    */
   public EReference getProduct_OfferedBy()
   {
      return (EReference)productEClass.getEStructuralFeatures().get(5);
   }

   /**
    * Returns the meta object for class '{@link de.upb.examples.reengineering.store.model.Customer <em>Customer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Customer</em>'.
    * @see de.upb.examples.reengineering.store.model.Customer
    * @generated
    */
   public EClass getCustomer()
   {
      return customerEClass;
   }

   /**
    * Returns the meta object for the reference list '{@link de.upb.examples.reengineering.store.model.Customer#getAllBoughtProducts <em>All Bought Products</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>All Bought Products</em>'.
    * @see de.upb.examples.reengineering.store.model.Customer#getAllBoughtProducts()
    * @see #getCustomer()
    * @generated
    */
   public EReference getCustomer_AllBoughtProducts()
   {
      return (EReference)customerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * Returns the meta object for the attribute '{@link de.upb.examples.reengineering.store.model.Customer#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see de.upb.examples.reengineering.store.model.Customer#getName()
    * @see #getCustomer()
    * @generated
    */
   public EAttribute getCustomer_Name()
   {
      return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
   }

   /**
    * Returns the meta object for the attribute '{@link de.upb.examples.reengineering.store.model.Customer#getAge <em>Age</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Age</em>'.
    * @see de.upb.examples.reengineering.store.model.Customer#getAge()
    * @see #getCustomer()
    * @generated
    */
   public EAttribute getCustomer_Age()
   {
      return (EAttribute)customerEClass.getEStructuralFeatures().get(2);
   }

   /**
    * Returns the meta object for the attribute '{@link de.upb.examples.reengineering.store.model.Customer#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see de.upb.examples.reengineering.store.model.Customer#getId()
    * @see #getCustomer()
    * @generated
    */
   public EAttribute getCustomer_Id()
   {
      return (EAttribute)customerEClass.getEStructuralFeatures().get(3);
   }

   /**
    * Returns the meta object for the containment reference list '{@link de.upb.examples.reengineering.store.model.Customer#getWishlists <em>Wishlists</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Wishlists</em>'.
    * @see de.upb.examples.reengineering.store.model.Customer#getWishlists()
    * @see #getCustomer()
    * @generated
    */
   public EReference getCustomer_Wishlists()
   {
      return (EReference)customerEClass.getEStructuralFeatures().get(4);
   }

   /**
    * Returns the meta object for the attribute '{@link de.upb.examples.reengineering.store.model.Customer#getUsername <em>Username</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Username</em>'.
    * @see de.upb.examples.reengineering.store.model.Customer#getUsername()
    * @see #getCustomer()
    * @generated
    */
   public EAttribute getCustomer_Username()
   {
      return (EAttribute)customerEClass.getEStructuralFeatures().get(5);
   }

   /**
    * Returns the meta object for class '{@link de.upb.examples.reengineering.store.model.Producer <em>Producer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Producer</em>'.
    * @see de.upb.examples.reengineering.store.model.Producer
    * @generated
    */
   public EClass getProducer()
   {
      return producerEClass;
   }

   /**
    * Returns the meta object for the attribute '{@link de.upb.examples.reengineering.store.model.Producer#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see de.upb.examples.reengineering.store.model.Producer#getId()
    * @see #getProducer()
    * @generated
    */
   public EAttribute getProducer_Id()
   {
      return (EAttribute)producerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * Returns the meta object for the attribute '{@link de.upb.examples.reengineering.store.model.Producer#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see de.upb.examples.reengineering.store.model.Producer#getName()
    * @see #getProducer()
    * @generated
    */
   public EAttribute getProducer_Name()
   {
      return (EAttribute)producerEClass.getEStructuralFeatures().get(1);
   }

   /**
    * Returns the meta object for the reference list '{@link de.upb.examples.reengineering.store.model.Producer#getProducts <em>Products</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Products</em>'.
    * @see de.upb.examples.reengineering.store.model.Producer#getProducts()
    * @see #getProducer()
    * @generated
    */
   public EReference getProducer_Products()
   {
      return (EReference)producerEClass.getEStructuralFeatures().get(2);
   }

   /**
    * Returns the meta object for class '{@link de.upb.examples.reengineering.store.model.Store <em>Store</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Store</em>'.
    * @see de.upb.examples.reengineering.store.model.Store
    * @generated
    */
   public EClass getStore()
   {
      return storeEClass;
   }

   /**
    * Returns the meta object for the containment reference list '{@link de.upb.examples.reengineering.store.model.Store#getCustomers <em>Customers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Customers</em>'.
    * @see de.upb.examples.reengineering.store.model.Store#getCustomers()
    * @see #getStore()
    * @generated
    */
   public EReference getStore_Customers()
   {
      return (EReference)storeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * Returns the meta object for the containment reference list '{@link de.upb.examples.reengineering.store.model.Store#getProducts <em>Products</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Products</em>'.
    * @see de.upb.examples.reengineering.store.model.Store#getProducts()
    * @see #getStore()
    * @generated
    */
   public EReference getStore_Products()
   {
      return (EReference)storeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * Returns the meta object for the containment reference list '{@link de.upb.examples.reengineering.store.model.Store#getProducers <em>Producers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Producers</em>'.
    * @see de.upb.examples.reengineering.store.model.Store#getProducers()
    * @see #getStore()
    * @generated
    */
   public EReference getStore_Producers()
   {
      return (EReference)storeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * Returns the meta object for the containment reference '{@link de.upb.examples.reengineering.store.model.Store#getSellers <em>Sellers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Sellers</em>'.
    * @see de.upb.examples.reengineering.store.model.Store#getSellers()
    * @see #getStore()
    * @generated
    */
   public EReference getStore_Sellers()
   {
      return (EReference)storeEClass.getEStructuralFeatures().get(3);
   }

   /**
    * Returns the meta object for class '{@link de.upb.examples.reengineering.store.model.Book <em>Book</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Book</em>'.
    * @see de.upb.examples.reengineering.store.model.Book
    * @generated
    */
   public EClass getBook()
   {
      return bookEClass;
   }

   /**
    * Returns the meta object for the attribute '{@link de.upb.examples.reengineering.store.model.Book#getAuthor <em>Author</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Author</em>'.
    * @see de.upb.examples.reengineering.store.model.Book#getAuthor()
    * @see #getBook()
    * @generated
    */
   public EAttribute getBook_Author()
   {
      return (EAttribute)bookEClass.getEStructuralFeatures().get(0);
   }

   /**
    * Returns the meta object for class '{@link de.upb.examples.reengineering.store.model.DVD <em>DVD</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>DVD</em>'.
    * @see de.upb.examples.reengineering.store.model.DVD
    * @generated
    */
   public EClass getDVD()
   {
      return dvdEClass;
   }

   /**
    * Returns the meta object for the attribute '{@link de.upb.examples.reengineering.store.model.DVD#getInterpret <em>Interpret</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Interpret</em>'.
    * @see de.upb.examples.reengineering.store.model.DVD#getInterpret()
    * @see #getDVD()
    * @generated
    */
   public EAttribute getDVD_Interpret()
   {
      return (EAttribute)dvdEClass.getEStructuralFeatures().get(0);
   }

   /**
    * Returns the meta object for class '{@link de.upb.examples.reengineering.store.model.Wishlist <em>Wishlist</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Wishlist</em>'.
    * @see de.upb.examples.reengineering.store.model.Wishlist
    * @generated
    */
   public EClass getWishlist()
   {
      return wishlistEClass;
   }

   /**
    * Returns the meta object for the reference list '{@link de.upb.examples.reengineering.store.model.Wishlist#getProducts <em>Products</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Products</em>'.
    * @see de.upb.examples.reengineering.store.model.Wishlist#getProducts()
    * @see #getWishlist()
    * @generated
    */
   public EReference getWishlist_Products()
   {
      return (EReference)wishlistEClass.getEStructuralFeatures().get(0);
   }

   /**
    * Returns the meta object for class '{@link de.upb.examples.reengineering.store.model.Seller <em>Seller</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Seller</em>'.
    * @see de.upb.examples.reengineering.store.model.Seller
    * @generated
    */
   public EClass getSeller()
   {
      return sellerEClass;
   }

   /**
    * Returns the meta object for the attribute '{@link de.upb.examples.reengineering.store.model.Seller#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see de.upb.examples.reengineering.store.model.Seller#getName()
    * @see #getSeller()
    * @generated
    */
   public EAttribute getSeller_Name()
   {
      return (EAttribute)sellerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * Returns the meta object for the attribute '{@link de.upb.examples.reengineering.store.model.Seller#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see de.upb.examples.reengineering.store.model.Seller#getId()
    * @see #getSeller()
    * @generated
    */
   public EAttribute getSeller_Id()
   {
      return (EAttribute)sellerEClass.getEStructuralFeatures().get(1);
   }

   /**
    * Returns the meta object for the attribute '{@link de.upb.examples.reengineering.store.model.Seller#getUsername <em>Username</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Username</em>'.
    * @see de.upb.examples.reengineering.store.model.Seller#getUsername()
    * @see #getSeller()
    * @generated
    */
   public EAttribute getSeller_Username()
   {
      return (EAttribute)sellerEClass.getEStructuralFeatures().get(2);
   }

   /**
    * Returns the meta object for the reference list '{@link de.upb.examples.reengineering.store.model.Seller#getAllProductsToSell <em>All Products To Sell</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>All Products To Sell</em>'.
    * @see de.upb.examples.reengineering.store.model.Seller#getAllProductsToSell()
    * @see #getSeller()
    * @generated
    */
   public EReference getSeller_AllProductsToSell()
   {
      return (EReference)sellerEClass.getEStructuralFeatures().get(3);
   }

   /**
    * Returns the meta object for the reference '{@link de.upb.examples.reengineering.store.model.Seller#getEReference0 <em>EReference0</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>EReference0</em>'.
    * @see de.upb.examples.reengineering.store.model.Seller#getEReference0()
    * @see #getSeller()
    * @generated
    */
   public EReference getSeller_EReference0()
   {
      return (EReference)sellerEClass.getEStructuralFeatures().get(4);
   }

   /**
    * Returns the meta object for the reference list '{@link de.upb.examples.reengineering.store.model.Seller#getSoldProducts <em>Sold Products</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Sold Products</em>'.
    * @see de.upb.examples.reengineering.store.model.Seller#getSoldProducts()
    * @see #getSeller()
    * @generated
    */
   public EReference getSeller_SoldProducts()
   {
      return (EReference)sellerEClass.getEStructuralFeatures().get(5);
   }

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   public StoreFactory getStoreFactory()
   {
      return (StoreFactory)getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents()
   {
      if (isCreated) return;
      isCreated = true;

      // Create classes and their features
      productEClass = createEClass(PRODUCT);
      createEAttribute(productEClass, PRODUCT__PRICE);
      createEAttribute(productEClass, PRODUCT__NAME);
      createEAttribute(productEClass, PRODUCT__ID);
      createEReference(productEClass, PRODUCT__PRODUCER);
      createEReference(productEClass, PRODUCT__WISHLISTS);
      createEReference(productEClass, PRODUCT__OFFERED_BY);

      customerEClass = createEClass(CUSTOMER);
      createEReference(customerEClass, CUSTOMER__ALL_BOUGHT_PRODUCTS);
      createEAttribute(customerEClass, CUSTOMER__NAME);
      createEAttribute(customerEClass, CUSTOMER__AGE);
      createEAttribute(customerEClass, CUSTOMER__ID);
      createEReference(customerEClass, CUSTOMER__WISHLISTS);
      createEAttribute(customerEClass, CUSTOMER__USERNAME);

      producerEClass = createEClass(PRODUCER);
      createEAttribute(producerEClass, PRODUCER__ID);
      createEAttribute(producerEClass, PRODUCER__NAME);
      createEReference(producerEClass, PRODUCER__PRODUCTS);

      storeEClass = createEClass(STORE);
      createEReference(storeEClass, STORE__CUSTOMERS);
      createEReference(storeEClass, STORE__PRODUCTS);
      createEReference(storeEClass, STORE__PRODUCERS);
      createEReference(storeEClass, STORE__SELLERS);

      bookEClass = createEClass(BOOK);
      createEAttribute(bookEClass, BOOK__AUTHOR);

      dvdEClass = createEClass(DVD);
      createEAttribute(dvdEClass, DVD__INTERPRET);

      wishlistEClass = createEClass(WISHLIST);
      createEReference(wishlistEClass, WISHLIST__PRODUCTS);

      sellerEClass = createEClass(SELLER);
      createEAttribute(sellerEClass, SELLER__NAME);
      createEAttribute(sellerEClass, SELLER__ID);
      createEAttribute(sellerEClass, SELLER__USERNAME);
      createEReference(sellerEClass, SELLER__ALL_PRODUCTS_TO_SELL);
      createEReference(sellerEClass, SELLER__EREFERENCE0);
      createEReference(sellerEClass, SELLER__SOLD_PRODUCTS);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void initializePackageContents()
   {
      if (isInitialized) return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      bookEClass.getESuperTypes().add(this.getProduct());
      dvdEClass.getESuperTypes().add(this.getProduct());

      // Initialize classes and features; add operations and parameters
      initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getProduct_Price(), ecorePackage.getEDouble(), "price", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getProduct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getProduct_Id(), ecorePackage.getEString(), "id", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getProduct_Producer(), this.getProducer(), this.getProducer_Products(), "producer", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getProduct_Wishlists(), this.getWishlist(), this.getWishlist_Products(), "wishlists", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getProduct_OfferedBy(), this.getSeller(), this.getSeller_AllProductsToSell(), "offeredBy", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCustomer_AllBoughtProducts(), this.getProduct(), null, "allBoughtProducts", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getCustomer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getCustomer_Age(), ecorePackage.getEInt(), "age", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getCustomer_Id(), ecorePackage.getEString(), "id", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCustomer_Wishlists(), this.getWishlist(), null, "wishlists", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getCustomer_Username(), ecorePackage.getEString(), "username", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(producerEClass, Producer.class, "Producer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getProducer_Id(), ecorePackage.getEString(), "id", null, 0, 1, Producer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getProducer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Producer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getProducer_Products(), this.getProduct(), this.getProduct_Producer(), "products", null, 0, -1, Producer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getStore_Customers(), this.getCustomer(), null, "customers", null, 0, -1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getStore_Products(), this.getProduct(), null, "products", null, 0, -1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getStore_Producers(), this.getProducer(), null, "producers", null, 0, -1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getStore_Sellers(), this.getSeller(), null, "sellers", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(bookEClass, Book.class, "Book", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getBook_Author(), ecorePackage.getEString(), "author", null, 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(dvdEClass, de.upb.examples.reengineering.store.model.DVD.class, "DVD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getDVD_Interpret(), ecorePackage.getEString(), "interpret", null, 0, 1, de.upb.examples.reengineering.store.model.DVD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(wishlistEClass, Wishlist.class, "Wishlist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getWishlist_Products(), this.getProduct(), this.getProduct_Wishlists(), "products", null, 0, -1, Wishlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(sellerEClass, Seller.class, "Seller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getSeller_Name(), ecorePackage.getEString(), "name", null, 0, 1, Seller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getSeller_Id(), ecorePackage.getEString(), "id", null, 0, 1, Seller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getSeller_Username(), ecorePackage.getEString(), "username", null, 0, 1, Seller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getSeller_AllProductsToSell(), this.getProduct(), this.getProduct_OfferedBy(), "allProductsToSell", null, 0, -1, Seller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getSeller_EReference0(), this.getSeller(), null, "EReference0", null, 0, 1, Seller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getSeller_SoldProducts(), this.getProduct(), null, "soldProducts", null, 0, -1, Seller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    *   <li>each class,</li>
    *   <li>each feature of each class,</li>
    *   <li>each enum,</li>
    *   <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   public interface Literals
   {
      /**
       * The meta object literal for the '{@link de.upb.examples.reengineering.store.model.Product <em>Product</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de.upb.examples.reengineering.store.model.Product
       * @see de.upb.examples.reengineering.store.model.StorePackage#getProduct()
       * @generated
       */
      public static final EClass PRODUCT = eINSTANCE.getProduct();

      /**
       * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EAttribute PRODUCT__PRICE = eINSTANCE.getProduct_Price();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EAttribute PRODUCT__ID = eINSTANCE.getProduct_Id();

      /**
       * The meta object literal for the '<em><b>Producer</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EReference PRODUCT__PRODUCER = eINSTANCE.getProduct_Producer();

      /**
       * The meta object literal for the '<em><b>Wishlists</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EReference PRODUCT__WISHLISTS = eINSTANCE.getProduct_Wishlists();

      /**
       * The meta object literal for the '<em><b>Offered By</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EReference PRODUCT__OFFERED_BY = eINSTANCE.getProduct_OfferedBy();

      /**
       * The meta object literal for the '{@link de.upb.examples.reengineering.store.model.Customer <em>Customer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de.upb.examples.reengineering.store.model.Customer
       * @see de.upb.examples.reengineering.store.model.StorePackage#getCustomer()
       * @generated
       */
      public static final EClass CUSTOMER = eINSTANCE.getCustomer();

      /**
       * The meta object literal for the '<em><b>All Bought Products</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EReference CUSTOMER__ALL_BOUGHT_PRODUCTS = eINSTANCE.getCustomer_AllBoughtProducts();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

      /**
       * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EAttribute CUSTOMER__AGE = eINSTANCE.getCustomer_Age();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EAttribute CUSTOMER__ID = eINSTANCE.getCustomer_Id();

      /**
       * The meta object literal for the '<em><b>Wishlists</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EReference CUSTOMER__WISHLISTS = eINSTANCE.getCustomer_Wishlists();

      /**
       * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EAttribute CUSTOMER__USERNAME = eINSTANCE.getCustomer_Username();

      /**
       * The meta object literal for the '{@link de.upb.examples.reengineering.store.model.Producer <em>Producer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de.upb.examples.reengineering.store.model.Producer
       * @see de.upb.examples.reengineering.store.model.StorePackage#getProducer()
       * @generated
       */
      public static final EClass PRODUCER = eINSTANCE.getProducer();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EAttribute PRODUCER__ID = eINSTANCE.getProducer_Id();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EAttribute PRODUCER__NAME = eINSTANCE.getProducer_Name();

      /**
       * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EReference PRODUCER__PRODUCTS = eINSTANCE.getProducer_Products();

      /**
       * The meta object literal for the '{@link de.upb.examples.reengineering.store.model.Store <em>Store</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de.upb.examples.reengineering.store.model.Store
       * @see de.upb.examples.reengineering.store.model.StorePackage#getStore()
       * @generated
       */
      public static final EClass STORE = eINSTANCE.getStore();

      /**
       * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EReference STORE__CUSTOMERS = eINSTANCE.getStore_Customers();

      /**
       * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EReference STORE__PRODUCTS = eINSTANCE.getStore_Products();

      /**
       * The meta object literal for the '<em><b>Producers</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EReference STORE__PRODUCERS = eINSTANCE.getStore_Producers();

      /**
       * The meta object literal for the '<em><b>Sellers</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EReference STORE__SELLERS = eINSTANCE.getStore_Sellers();

      /**
       * The meta object literal for the '{@link de.upb.examples.reengineering.store.model.Book <em>Book</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de.upb.examples.reengineering.store.model.Book
       * @see de.upb.examples.reengineering.store.model.StorePackage#getBook()
       * @generated
       */
      public static final EClass BOOK = eINSTANCE.getBook();

      /**
       * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EAttribute BOOK__AUTHOR = eINSTANCE.getBook_Author();

      /**
       * The meta object literal for the '{@link de.upb.examples.reengineering.store.model.DVD <em>DVD</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de.upb.examples.reengineering.store.model.DVD
       * @see de.upb.examples.reengineering.store.model.StorePackage#getDVD()
       * @generated
       */
      public static final EClass DVD = eINSTANCE.getDVD();

      /**
       * The meta object literal for the '<em><b>Interpret</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EAttribute DVD__INTERPRET = eINSTANCE.getDVD_Interpret();

      /**
       * The meta object literal for the '{@link de.upb.examples.reengineering.store.model.Wishlist <em>Wishlist</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de.upb.examples.reengineering.store.model.Wishlist
       * @see de.upb.examples.reengineering.store.model.StorePackage#getWishlist()
       * @generated
       */
      public static final EClass WISHLIST = eINSTANCE.getWishlist();

      /**
       * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EReference WISHLIST__PRODUCTS = eINSTANCE.getWishlist_Products();

      /**
       * The meta object literal for the '{@link de.upb.examples.reengineering.store.model.Seller <em>Seller</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see de.upb.examples.reengineering.store.model.Seller
       * @see de.upb.examples.reengineering.store.model.StorePackage#getSeller()
       * @generated
       */
      public static final EClass SELLER = eINSTANCE.getSeller();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EAttribute SELLER__NAME = eINSTANCE.getSeller_Name();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EAttribute SELLER__ID = eINSTANCE.getSeller_Id();

      /**
       * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EAttribute SELLER__USERNAME = eINSTANCE.getSeller_Username();

      /**
       * The meta object literal for the '<em><b>All Products To Sell</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EReference SELLER__ALL_PRODUCTS_TO_SELL = eINSTANCE.getSeller_AllProductsToSell();

      /**
       * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EReference SELLER__EREFERENCE0 = eINSTANCE.getSeller_EReference0();

      /**
       * The meta object literal for the '<em><b>Sold Products</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      public static final EReference SELLER__SOLD_PRODUCTS = eINSTANCE.getSeller_SoldProducts();

   }

} //StorePackage
