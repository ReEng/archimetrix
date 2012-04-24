package de.upb.examples.reengineering.store.ui;


import de.upb.examples.reengineering.store.logic.ICalculator;
import de.upb.examples.reengineering.store.logic.PriceCalculator;
import de.upb.examples.reengineering.store.model.Product;


public class ProductsListViewEntry
{
   Product currentProduct;

   String producer;

   Double price;


   public ProductsListViewEntry(Product product, Double price, String producer)
   {
      this.currentProduct = product;
      this.producer = producer;
   }


   public String printEntry()
   {
      ICalculator calc = new PriceCalculator();
      Double price = this.price * calc.calculate(this.currentProduct);
      return this.currentProduct.getName() + " : " + price + "(" + this.producer + ")";
   }
}
