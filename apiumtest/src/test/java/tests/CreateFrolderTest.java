package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import pages.CreateFolderPage;
import pages.LoginPage;

public class CreateFrolderTest extends BaseClass {
	
	
	LoginPage lp;
	CreateFolderPage cp;
	
	@BeforeClass
	public void call()
	{
		lp=new LoginPage(driver);
		cp = new CreateFolderPage(driver);	}
	
	@Test
	public void folder() throws InterruptedException
	{
		lp.clickNext1();
		lp.clickNext2();
		lp.clickStart();
		lp.enterDigiSpace();
		lp.enterEmail();
		lp.enterPassword();
		lp.clickLogin();
		Thread.sleep(4000);
		cp.addButton();
		cp.selectFolder();
		Thread.sleep(2000);
		cp.folderName();
		Thread.sleep(2000);
		cp.createFolder();
	}
	
}
