package org.abc.automation.datagenerators;

import org.testng.annotations.DataProvider;

public class DataGenerator {
	
	@DataProvider(name="Static")
	public static Object[][] testDataGenerator(){
		
		Object[][] data = {{"UserName","Password"},{"UserName1","Password1"},{"UserName2","Password2"}};
		
		return data;
	}


}
