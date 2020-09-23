package org.abc.automation.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	
	
	public static Object fetchConfig(String key) throws IOException{
		
		FileInputStream file = new FileInputStream("./ConfigFiles/config.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key);
	
	}
	
	
	public static Object fetchElementLocator(String key) throws IOException{
		
		FileInputStream file = new FileInputStream("./ConfigFiles/elements.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key);
	
	}
}
