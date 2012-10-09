package de.upb.storeexample.store;

public class StoreQuery implements IStoreQuery {

	private Inventory inventory = new Inventory();
	
	@Override
	public Inventory getInventory() {
		return inventory;
	}
	
	public int checkStock() {
		return this.getInventory().checkStock();
	}

}
