package de.upb.examples.reengineering.store.ui;


public class ProductsListViewEntry
{
   String currentProduct;

   double price;

   String producer;


   public ProductsListViewEntry(String currentProduct, double price, String producer)
   {
      this.currentProduct = currentProduct;
      this.price = price;
      this.producer = producer;
   }


   public String printEntry()
   {
      return currentProduct + " : " + price + "(" + producer + ")";
   }

}
