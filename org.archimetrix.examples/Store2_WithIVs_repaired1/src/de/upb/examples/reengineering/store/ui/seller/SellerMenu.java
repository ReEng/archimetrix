package de.upb.examples.reengineering.store.ui.seller;


import java.util.Scanner;

import org.eclipse.emf.common.util.EList;

import de.upb.examples.reengineering.store.IDMaker;
import de.upb.examples.reengineering.store.model.Book;
import de.upb.examples.reengineering.store.model.DVD;
import de.upb.examples.reengineering.store.model.Product;
import de.upb.examples.reengineering.store.model.Seller;
import de.upb.examples.reengineering.store.model.Store;
import de.upb.examples.reengineering.store.model.StoreFactory;
import de.upb.examples.reengineering.store.ui.IListView;
import de.upb.examples.reengineering.store.ui.IMenu;
import de.upb.examples.reengineering.store.ui.MainMenu;
import de.upb.examples.reengineering.store.ui.ProductsListView;


public class SellerMenu implements IMenu
{

   private Store store;

   private Seller seller;


   public SellerMenu(Store store, Seller seller)
   {
      this.store = store;
      this.seller = seller;
   }


   public void start()
   {
      System.out.println("----------------- Store - Seller Menu ------------------------");
      System.out.println("What do you want to do?");
      System.out.println("Go back to Main Menu [1]");
      System.out.println("Change Seller Data [2]");
      System.out.println("Add Product [3]");
      System.out.println("View sold Products [4]");
      System.out.println("View all Products to sell [5]");

      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      switch (Integer.parseInt(input))
      {
         case 1:
            IMenu m = new MainMenu(this.store);
            // Interface Violation!
            MainMenu mm = (MainMenu) m;
            mm.start();
            break;
         case 2:
            changeSellerData();
            break;
         case 3:
            addProduct();
            break;
         case 4:
            viewProducts(this.seller.getSoldProducts());
            break;
         case 5:
            viewProducts(this.seller.getAllProductsToSell());
            break;
         default:
            break;
      }
      start();
   }


   private void viewProducts(EList<Product> products)
   {
      IListView view = new ProductsListView();

      // InterfaceViolation
      ProductsListView pView = (ProductsListView) view;
      pView.setProducts(products);
      view.printList();
   }


   private void addProduct()
   {
      System.out.println("What kind of Product do you want to add?");
      System.out.println("Book [1]");
      System.out.println("DVD [2]");
      System.out.println("Other [3]");

      Scanner sc = new Scanner(System.in);
      String productKind = sc.nextLine();
      Product p = null;
      switch (Integer.parseInt(productKind))
      {
         case 1:
            p = StoreFactory.eINSTANCE.createBook();
            System.out.println("Author: ");
            String author = sc.nextLine();

            // Interface Violation!
            Book book = (Book) p;
            book.setAuthor(author);
            break;
         case 2:
            p = StoreFactory.eINSTANCE.createDVD();
            System.out.println("Interpret: ");
            String interpret = sc.nextLine();

            // Interface Violation!
            DVD dvd = (DVD) p;
            dvd.setInterpret(interpret);
            break;
         case 3:
            p = StoreFactory.eINSTANCE.createProduct();
            break;
         default:
            break;
      }

      p.setId("p" + IDMaker.id++);

      System.out.println("Name: ");
      String name = sc.nextLine();
      p.setName(name);

      System.out.println("Price: (\"x.xx\")");
      String price = sc.nextLine();
      p.setPrice(Double.parseDouble(price));

      this.seller.getAllProductsToSell().add(p);

      System.out.println("Added " + name + " to products.");

   }


   private void changeSellerData()
   {
      System.out.println("Cannot change user data yet.");
   }

}
