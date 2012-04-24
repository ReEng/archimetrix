package de.upb.examples.reengineering.store.logic;

import de.upb.examples.reengineering.store.model.Product;


public class PriceCalculator implements ICalculator
{

   @Override
   public double calculate(Product product)
   {
      ISearch search = new ProductSearch();
      double price = search.searchPrice(product);

      // interface violation!
      ProductSearch pSearch = (ProductSearch) search;
      double discount = pSearch.searchDiscount(product);

      return price - discount;
   }

}
