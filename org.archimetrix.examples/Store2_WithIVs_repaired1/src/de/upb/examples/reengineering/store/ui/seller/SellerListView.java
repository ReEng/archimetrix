package de.upb.examples.reengineering.store.ui.seller;

import org.eclipse.emf.common.util.EList;

import de.upb.examples.reengineering.store.model.Seller;
import de.upb.examples.reengineering.store.ui.IListView;

public class SellerListView implements IListView
{

   private EList<Seller> sellers;

   @Override
   public void printList()
   {
      for (Seller seller : sellers)
      {
         System.out.println(seller.getName());
      }
   }

   public void setSellers(EList<Seller> sellers)
   {
      this.sellers = sellers;
   }

}
