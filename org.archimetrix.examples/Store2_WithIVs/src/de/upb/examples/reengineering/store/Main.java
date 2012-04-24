package de.upb.examples.reengineering.store;

import de.upb.examples.reengineering.store.model.Store;
import de.upb.examples.reengineering.store.model.StoreFactory;
import de.upb.examples.reengineering.store.ui.MainMenu;

public class Main
{

   /**
    * @param args
    */
   public static void main(String[] args)
   {
      Store store = StoreFactory.eINSTANCE.createStore();
      
      MainMenu mainMenu = new MainMenu(store);
      mainMenu.start();
      
   }

}
