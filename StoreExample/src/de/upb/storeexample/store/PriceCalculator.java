package de.upb.storeexample.store;

import de.upb.storeexample.store.search.ISearch;
import de.upb.storeexample.store.search.ProductSearch;


public class PriceCalculator implements ICalculator
{

   @Override
   public double calculate(String productName)
   {
      ISearch search = new ProductSearch();
      double price = search.searchPrice(productName);

      // interface violation!
      ProductSearch pSearch = (ProductSearch) search;
      double discount = pSearch.searchDiscount(productName);

      return price - discount;
   }

}
