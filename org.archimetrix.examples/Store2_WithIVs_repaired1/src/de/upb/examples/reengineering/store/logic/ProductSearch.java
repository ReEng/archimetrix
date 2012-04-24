package de.upb.examples.reengineering.store.logic;


import de.upb.examples.reengineering.store.model.Product;


public class ProductSearch implements ISearch
{


   public double searchDiscount(Product product)
   {
      return 1;
   }


   public String searchProducer(Product product)
   {
      return product.getProducer().getName();
   }


   @Override
   public double searchPrice(Product product)
   {
      return product.getPrice();
   }


}
