package de.upb.storeexample.database;

public interface IDatabase {

	public String retrieveData(String key);
	
	public void storedata(String key, String data);
	
}
