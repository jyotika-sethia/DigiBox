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
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		Thread.sleep(4000);
		image.addButton();
		Thread.sleep(2000);
		image.uploadFile();
		Thread.sleep(2000);
//		image.selectImage();
		
	}

}
