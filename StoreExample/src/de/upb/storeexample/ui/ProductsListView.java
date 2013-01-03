package de.upb.storeexample.ui;


import java.util.ArrayList;
import java.util.List;

import de.upb.storeexample.network.INetwork;
import de.upb.storeexample.network.NetworkManager;
import de.upb.storeexample.store.search.ISearch;
import de.upb.storeexample.store.search.ProductSearch;



public class ProductsListView implements IListView
{

   List<String> products = new ArrayList<String>();
   
//   INetwork net = new NetworkManager();


   public ProductsListView()
   {
      products.add("Product 1");
      products.add("Product 2");
   }


   @Override
   public String createListEntry()
   {
      String currentProduct = products.get(0);

      ISearch search = new ProductSearch();
      double price = search.searchPrice(currentProduct);

      // interface violation!
      ProductSearch pSearch = (ProductSearch) search;
      String producer = pSearch.searchProducer(currentProduct);

      return currentProduct + ": " + price + " (" + producer + ")";
   }
//   
//   public void connectToRemoteClient(int address)
//   {
//	   net.sendData(address, "connect");
//   }
   

}
