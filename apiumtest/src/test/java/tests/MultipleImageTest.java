package tests;

import org.junit.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MultipleImagePage;

public class MultipleImageTest  extends BaseClass{
	MultipleImagePage image;
	LoginPage lp;
	
	@BeforeClass
	public void addFile()
	{
		lp=new LoginPage(driver);
		image=new MultipleImagePage(driver);
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
//		image.selectImage();
		
	}

}
