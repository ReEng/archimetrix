package de.upb.examples.reengineering.store.logic;

import de.upb.examples.reengineering.store.model.Product;


public class PriceCalculator implements ICalculator
{

   @Override
   public double calculate(Product product)
   {
      ISearch search = new ProductSearch();
      double price = search.searchPrice(product);

      double discount = search.searchDiscount(product);

      return price - discount;
   }

}
