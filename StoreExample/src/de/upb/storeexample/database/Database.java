package de.upb.storeexample.database;

import java.util.HashMap;

public class Database implements IDatabase {

	private HashMap<String,String> database = new HashMap<String,String>();
	
	@Override
	public String retrieveData(String key) {
		return database.get(key);
	}

	@Override
	public void storedata(String key, String data) {
		database.put(key, data);
	}

}
