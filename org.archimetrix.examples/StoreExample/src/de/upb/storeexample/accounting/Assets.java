package de.upb.storeexample.accounting;

import de.upb.storeexample.controlling.IReporting;
import de.upb.storeexample.controlling.Reporting;
import de.upb.storeexample.logistics.ILogistics;
import de.upb.storeexample.logistics.Logistics;
import de.upb.storeexample.payment.IPayment;
import de.upb.storeexample.payment.PaymentManager;
import de.upb.storeexample.store.IStoreQuery;
import de.upb.storeexample.store.Inventory;
import de.upb.storeexample.store.StoreQuery;

public class Assets {

	private IStoreQuery storeQuery = new StoreQuery();
	private ILogistics logistics = new Logistics();
	private IPayment payment = new PaymentManager();
	private IReporting reporting = new Reporting();
	
	private int price;
	
	private void calculateDeliveryTime() {
		logistics.calculateDaysToDelivery();
	}

	public int calculateValue()
	{
		Inventory inventory = storeQuery.getInventory();
		return inventory.getItems().length * getPrice();
	}

	private void checkStock() {
		StoreQuery sq = (StoreQuery) storeQuery;
		sq.checkStock();
	}
	
	private void fileReport() {
		Report r = new Report();
		r.setText("Item sold.");
		reporting.sendReport(r);
	}

	public int getPrice() {
		return price;
	}

	public void handleOrder()
	{
		checkStock();
		calculateDeliveryTime();
		sendInvoice();
		fileReport();
	}

	private void sendInvoice() {
		
		payment.sendInvoice("customerAddress", calculateValue());
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
