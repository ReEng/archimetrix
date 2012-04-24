package de.upb.examples.reengineering.store.ui;


import java.util.Scanner;

import org.eclipse.emf.common.util.EList;

import de.upb.examples.reengineering.store.model.IAccountOwner;
import de.upb.examples.reengineering.store.model.Customer;
import de.upb.examples.reengineering.store.model.Seller;
import de.upb.examples.reengineering.store.model.Store;
import de.upb.examples.reengineering.store.model.StoreFactory;
import de.upb.examples.reengineering.store.ui.customer.CustomerListView;
import de.upb.examples.reengineering.store.ui.customer.CustomerMenu;
import de.upb.examples.reengineering.store.ui.seller.SellerListView;
import de.upb.examples.reengineering.store.ui.seller.SellerMenu;


public class MainMenu implements IMenu
{

   static int accountOwnerID = 0;

   private Store store;


   public MainMenu(Store store)
   {
      this.store = store;
   }


   public void start()
   {
      System.out.println("----------------- Store - Main Menu ------------------------");
      System.out.println("What do you want to do?");
      System.out.println("Login as Customer [1]");
      System.out.println("Create new Customer [2]");
      System.out.println("Delete Customer [3]");
      System.out.println("Login as Seller [4]");
      System.out.println("Create new Seller [5]");
      System.out.println("Delete Seller [6]");
      System.out.println("View all Customers [7]");
      System.out.println("View all Sellers [8]");

      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      switch (Integer.parseInt(input))
      {
         case 1:
            IMenu m1 = null;
            System.out.println("Type in your username: ");
            String username = sc.nextLine();
            for (Customer customer : this.store.getCustomers())
            {
               if (username.equals(customer.getUsername()))
               {
                  m1 = new CustomerMenu(this.store, customer);
               }
            }
            // Interface Violation!
            CustomerMenu cm = (CustomerMenu) m1;
            cm.start();
            break;
         case 2:
            createCustomer();
            break;
         case 3:
            deleteCustomer();
            break;
         case 4:
            IMenu m2 = null;
            System.out.println("Type in your username: ");
            String username2 = sc.nextLine();
            for (Seller seller : this.store.getSellers())
            {
               if (username2.equals(seller.getUsername()))
               {
                  m2 = new SellerMenu(store, seller);
               }
            }
            // Interface Violation!
            SellerMenu sm = (SellerMenu) m2;
            sm.start();
            break;
         case 5:
            createSeller();
            break;
         case 6:
            deleteSeller();
            break;
         case 7:
            IListView view = new CustomerListView();

            // Interface Violation!
            CustomerListView cView = (CustomerListView) view;
            cView.setCustomers(this.store.getCustomers());
            cView.printList();
            break;
         case 8:

            IListView view2 = new SellerListView();

            // Interface Violation!
            SellerListView sView = (SellerListView) view2;
            sView.setSellers(this.store.getSellers());
            sView.printList();
            break;
         default:
            break;
      }
   }


   private void deleteSeller()
   {
      System.out.println("Username of the seller to be deleted: ");
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      EList<Seller> sellers = this.store.getSellers();
      for (Seller seller : sellers)
      {
         if (seller.getUsername().equals(input))
         {
            sellers.remove(seller);
            printDeleteNotification(seller);
         }
      }
      start();
   }


   private void printDeleteNotification(IAccountOwner accountOwner)
   {
      if (accountOwner instanceof Seller)
      {
         // InterfaceViolation!
         Seller seller = (Seller) accountOwner;
         System.out.println("Deleted " + seller.getUsername() + ".");
      }
      else if (accountOwner instanceof Customer)
      {
         // InterfaceViolation!
         Customer customer = (Customer) accountOwner;
         System.out.println("Deleted " + customer.getUsername() + ".");
      }
   }


   private void printCreateNotification(IAccountOwner accountOwner)
   {
      if (accountOwner instanceof Seller)
      {
         // InterfaceViolation!
         Seller seller = (Seller) accountOwner;
         System.out.println("Created " + seller.getUsername() + ".");
      }
      else if (accountOwner instanceof Customer)
      {
         // InterfaceViolation!
         Customer customer = (Customer) accountOwner;
         System.out.println("Created " + customer.getUsername() + ".");
      }
   }


   private void createSeller()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Username of the seller to be created: ");
      String username = sc.nextLine();
      System.out.println("Name of the seller to be created: ");
      String name = sc.nextLine();
      Seller seller = StoreFactory.eINSTANCE.createSeller();
      seller.setUsername(username);
      seller.setName(name);
      seller.setId("c" + accountOwnerID++);
      this.store.getSellers().add(seller);
      printCreateNotification(seller);
      start();
   }


   private void deleteCustomer()
   {
      System.out.println("Username of the customer to be deleted: ");
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      EList<Customer> customers = this.store.getCustomers();
      for (Customer customer : customers)
      {
         if (customer.getUsername().equals(input))
         {
            customers.remove(customer);
            printDeleteNotification(customer);
         }
      }
      start();
   }


   private void createCustomer()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Username of the customer to be created: ");
      String username = sc.nextLine();
      System.out.println("Name of the customer to be created: ");
      String name = sc.nextLine();
      System.out.println("Age of the customer to be created: ");
      String age = sc.nextLine();
      Customer customer = StoreFactory.eINSTANCE.createCustomer();
      customer.setUsername(username);
      customer.setName(name);
      customer.setAge(Integer.parseInt(age));
      customer.setId("c" + accountOwnerID++);
      this.store.getCustomers().add(customer);
      printCreateNotification(customer);
      start();
   }

}
