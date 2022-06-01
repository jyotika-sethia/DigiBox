package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass{
	LoginPage login;
	
	@BeforeClass
	public void page()
	{
	 login = new LoginPage(driver);
	}
	
	@Test
	public void login() {
		
//		login.allowEntry();
		login.clickNext1();
		login.clickNext2();
		login.clickStart();
		login.enterDigiSpace();
		login.enterEmail();
		login.enterPassword();
		login.clickLogin();
		
	}
	
	
	

}
