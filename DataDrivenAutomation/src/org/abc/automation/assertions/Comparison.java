package org.abc.automation.assertions;

import org.openqa.selenium.WebDriver;


public class Comparison {
	
	// validate URL
	public static boolean validatePageURL(WebDriver driver,  String expURL){
		
		boolean flag = false;
		
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL)){
			
			flag = true;
			
		}
		return flag;
	}
	
	//Validate title
	public static boolean validatePageTitle(WebDriver driver,  String expTitle){
		
		boolean flag = false;
		
		if(driver.getTitle().equalsIgnoreCase(expTitle)){
			
			flag = true;
			
		}
		return flag;
	}

}
