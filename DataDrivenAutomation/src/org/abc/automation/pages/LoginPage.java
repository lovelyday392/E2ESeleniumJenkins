package org.abc.automation.pages;

import java.io.IOException;

import org.abc.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	public void enterUserName(String uname) throws IOException{
	
		driver.findElement(By.id(Utility.fetchElementLocator("loginPage_tbx_username_id").toString())).sendKeys(uname);
		
	}
	
	public void enterPassword(String pass ) throws IOException{
		
		driver.findElement(By.id(Utility.fetchElementLocator("loginPage_tbx_password_id").toString())).sendKeys(pass);
		
	}

	public void clickSignIn() throws IOException{
	
		driver.findElement(By.xpath(Utility.fetchElementLocator("loginPage_btn_signin_xpath").toString())).click();
	
	}	

}
