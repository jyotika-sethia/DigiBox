package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.UploadImagePage;

public class UploadImageTest extends BaseClass{
	
	
	UploadImagePage image;
	LoginPage lp;
	
	@BeforeClass
	public void addFile()
	{
		lp=new LoginPage(driver);
		image=new UploadImagePage(driver);
	}

	@Test
	public void uploadImages() throws InterruptedException
	{
		lp.clickNext1();
		lp.clickNext2();
		lp.clickStart();
		lp.enterDigiSpace();
		lp.enterEmail();
		lp.enterPassword();
		lp.clickLogin();
		Thread.sleep(4000);
		image.addButton();
		Thread.sleep(2000);
		image.uploadFile();
		Thread.sleep(2000);
		image.selectImage();
		
	}
}
