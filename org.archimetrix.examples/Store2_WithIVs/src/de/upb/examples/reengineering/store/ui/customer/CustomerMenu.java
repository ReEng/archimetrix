package de.upb.examples.reengineering.store.ui.customer;


import java.util.Scanner;

import org.eclipse.emf.common.util.EList;

import de.upb.examples.reengineering.store.model.Customer;
import de.upb.examples.reengineering.store.model.Product;
import de.upb.examples.reengineering.store.model.Store;
import de.upb.examples.reengineering.store.ui.IListView;
import de.upb.examples.reengineering.store.ui.IMenu;
import de.upb.examples.reengineering.store.ui.MainMenu;
import de.upb.examples.reengineering.store.ui.ProductsListView;


public class CustomerMenu implements IMenu
{


   private Store store;

   private Customer customer;


   public CustomerMenu(Store store, Customer customer)
   {
      this.store = store;
      this.customer = customer;
   }


   public void start()
   {
      System.out.println("----------------- Store - Customer Menu ------------------------");
      System.out.println("What do you want to do?");
      System.out.println("Go back to Main Menu [1]");
      System.out.println("Change Customer Data [2]");
      System.out.println("Buy Product [3]");
      System.out.println("View bought Products [4]");
      System.out.println("Add Product to Wishlist [5]");
      System.out.println("View Wishlist [6]");

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
            changeCustomerData();
            break;
         case 3:
            buyProduct();
            break;
         case 4:
            viewProducts(this.customer.getAllBoughtProducts());
            break;
         case 5:
            addProductsToWishlist();
            break;
         case 6:
            viewWishlist();
            break;
         default:
            break;
      }
      start();
   }


   private void viewWishlist()
   {
      System.out.println("Not implemented yet.");
   }


   private void addProductsToWishlist()
   {
      System.out.println("Not implemented yet.");
   }


   private void viewProducts(EList<Product> products)
   {
      IListView view = new ProductsListView();

      // InterfaceViolation
      ProductsListView pView = (ProductsListView) view;
      pView.setProducts(products);
      view.printList();
   }


   private void buyProduct()
   {
      viewProducts(this.store.getProducts());
      System.out.println("Which product do you want to buy? Input name.");

      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();

      for (Product product : this.store.getProducts())
      {
         if (product.getName().equals(input))
         {
            this.customer.getAllBoughtProducts().add(product);
            product.getOfferedBy().getSoldProducts().add(product);
            System.out.println("Bought " + product + " for " + product.getPrice());
         }
      }
   }


   private void changeCustomerData()
   {
      System.out.println("Cannot change user data yet.");
   }

}
