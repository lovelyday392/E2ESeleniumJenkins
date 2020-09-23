package org.abc.automation.testcases;

import java.io.IOException;

import org.abc.automation.base.DriverInstance;
import org.abc.automation.datagenerators.DataGenerator;
import org.abc.automation.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_ValidateLoginFunctionality extends DriverInstance {

	//the test below will be running in a loop of size of the data object
	//it will provide each row of the array as test data to the @Test
	@Test(dataProvider="Static", dataProviderClass=DataGenerator.class)
	public void tc_001_login_functionality(String uname, String pass) throws IOException{
			
		LoginPage login = new LoginPage(driver);
		login.enterUserName(uname);
		login.enterPassword(pass);
		login.clickSignIn();
		
	}
	
	
			
			
			
}
