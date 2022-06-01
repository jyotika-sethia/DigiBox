package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

import pages.UploadgifPage;

public class UploadgifTest extends BaseClass {
	
	LoginPage lp;
	UploadgifPage ugp;
	
	@BeforeClass
	public void addFile()
	{
		lp=new LoginPage(driver);
		ugp=new UploadgifPage(driver);
	}

	@Test
	public void uploadgif() throws InterruptedException
	{
		lp.clickNext1();
		lp.clickNext2();
		lp.clickStart();
		lp.enterDigiSpace();
		lp.enterEmail();
		lp.enterPassword();
		lp.clickLogin();
		Thread.sleep(4000);
		ugp.addButton();
		Thread.sleep(2000);
		ugp.uploadFile();
		Thread.sleep(2000);
		ugp.gifimage();
		
	}

}
