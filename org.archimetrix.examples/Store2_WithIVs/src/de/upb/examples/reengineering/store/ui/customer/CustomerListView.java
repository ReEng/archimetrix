package de.upb.examples.reengineering.store.ui.customer;


import org.eclipse.emf.common.util.EList;

import de.upb.examples.reengineering.store.model.Customer;
import de.upb.examples.reengineering.store.ui.IListView;


public class CustomerListView implements IListView
{

   private EList<Customer> customers;


   @Override
   public void printList()
   {
      for (Customer customer : customers)
      {
         System.out.println(customer.getName() + ", " + customer.getAge() + " Years old.");
      }
   }


   public void setCustomers(EList<Customer> customers)
   {
      this.customers = customers;
   }

}
