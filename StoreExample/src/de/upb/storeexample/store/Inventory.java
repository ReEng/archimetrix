package de.upb.storeexample.store;

import de.upb.storeexample.database.Database;
import de.upb.storeexample.database.IDatabase;
import de.upb.storeexample.network.INetwork;
import de.upb.storeexample.network.NetworkManager;

public class Inventory {

//	private INetwork net = new NetworkManager();
//	
//	private IDatabase database = new Database();
	
	private Item[] items;

	public void setItems(Item[] items) {
		this.items = items;
	}

	public Item[] getItems() {
		return items;
	}
	
	public int checkStock()
	{
		int stock = getItems().length;
//		database.storedata("Last known stock",	String.valueOf(stock));
		
		return stock;
	}

//	public Inventory(Item[] items) {
//		super();
//		this.items = items;
//	}
//	
//	public void orderNewItems()
//	{
//		net.sendData(4711,	"Send more items.");
//	}
	
}
