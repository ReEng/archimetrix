package de.upb.examples.reengineering.store.ui;


import org.eclipse.emf.common.util.EList;

import de.upb.examples.reengineering.store.logic.ISearch;
import de.upb.examples.reengineering.store.logic.ProductSearch;
import de.upb.examples.reengineering.store.model.Product;


public class ProductsListView implements IListView
{

   EList<Product> products;


   public ProductsListView()
   {
   }


   @Override
   public void printList()
   {
      for (Product product : this.products)
      {
         createListEntry(product);
      }
   }


   private ProductsListViewEntry createListEntry(Product currentProduct)
   {

      ISearch search = new ProductSearch();
      double price = search.searchPrice(currentProduct);

      // interface violation!
      ProductSearch pSearch = (ProductSearch) search;
      String producer = pSearch.searchProducer(currentProduct);

      return new ProductsListViewEntry(currentProduct, price, producer);
   }


   public void setProducts(EList<Product> products)
   {
      this.products = products;
   }

}
