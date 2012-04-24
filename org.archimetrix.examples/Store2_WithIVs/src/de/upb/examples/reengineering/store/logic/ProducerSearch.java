package de.upb.examples.reengineering.store.logic;

import de.upb.examples.reengineering.store.model.Product;

public class ProducerSearch implements ISearch
{

   @Override
   public double searchPrice(Product product)
   {
      return product.getPrice();
   }


}
