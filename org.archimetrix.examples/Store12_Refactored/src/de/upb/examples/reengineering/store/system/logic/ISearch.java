package de.upb.examples.reengineering.store.system.logic;


public interface ISearch
{
   public double searchPrice(String productName);
   

   public double searchDiscount(String productName);


   public String searchProducer(String currentProduct);
}
