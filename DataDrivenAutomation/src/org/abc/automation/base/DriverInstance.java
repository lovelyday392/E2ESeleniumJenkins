package org.abc.automation.base;

import java.io.IOException;

import org.abc.automation.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverInstance {
	
	
	
	public WebDriver driver;
	
	@BeforeMethod
	public void InitiateDriverInstance(){
		
		
		try {
			//Chrome
			if(Utility.fetchConfig("browserName").toString().equalsIgnoreCase("Chrome")){
				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				driver = new ChromeDriver(); 	
			}
			
			//Firefox
			else if (Utility.fetchConfig("browserName").toString().equalsIgnoreCase("Firefox")){
				System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
				driver = new FirefoxDriver(); 	
				
			}
			//default to chrome
			else { 
				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				driver = new ChromeDriver(); 	
			}
			
		driver.navigate().to(Utility.fetchConfig("applicationURL").toString());	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	
	@AfterMethod
	public void CloseDriverInstance(){
		
		driver.quit();
		
		
	}

}
