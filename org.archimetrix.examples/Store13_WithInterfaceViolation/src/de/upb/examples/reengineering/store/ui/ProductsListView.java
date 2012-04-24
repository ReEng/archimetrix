package de.upb.examples.reengineering.store.ui;


import java.util.ArrayList;
import java.util.List;

import de.upb.examples.reengineering.store.logic.ISearch;
import de.upb.examples.reengineering.store.logic.ProductSearch;



public class ProductsListView implements IListView
{

   List<String> products = new ArrayList<String>();


   public ProductsListView()
   {
      products.add("Product 1");
      products.add("Product 2");
   }


   @Override
   public ProductsListViewEntry createListEntry()
   {
      String currentProduct = products.get(0);

      ISearch search = new ProductSearch();
      double price = search.searchPrice(currentProduct);

      // interface violation!
      ProductSearch pSearch = (ProductSearch) search;
      String producer = pSearch.searchProducer(currentProduct);

      return new ProductsListViewEntry(currentProduct, price, producer);
   }

}
