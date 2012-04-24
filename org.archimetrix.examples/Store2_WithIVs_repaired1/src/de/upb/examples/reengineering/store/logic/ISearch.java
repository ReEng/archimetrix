package de.upb.examples.reengineering.store.logic;

import de.upb.examples.reengineering.store.model.Product;


public interface ISearch
{
   public double searchPrice(Product product);

   public double searchDiscount(Product product);
}
