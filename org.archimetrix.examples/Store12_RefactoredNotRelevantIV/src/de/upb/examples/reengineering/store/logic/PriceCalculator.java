package de.upb.examples.reengineering.store.logic;


public class PriceCalculator implements ICalculator
{

   @Override
   public double calculate(String productName)
   {
      ISearch search = new ProductSearch();
      double price = search.searchPrice(productName);

      double discount = search.searchDiscount(productName);

      return price - discount;
   }

}
