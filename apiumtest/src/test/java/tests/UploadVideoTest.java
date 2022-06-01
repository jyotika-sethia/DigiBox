package tests;

import org.junit.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.UploadVideoPage;

public class UploadVideoTest extends BaseClass{
	

	LoginPage lp;
	UploadVideoPage video;
	
	@BeforeClass
	public void call()
	{
		lp=new LoginPage(driver);
		video=new UploadVideoPage(driver);
	}

	@Test
	public void uploadVideo() throws InterruptedException
	{
		lp.clickNext1();
		lp.clickNext2();
		lp.clickStart();
		lp.enterDigiSpace();
		lp.enterEmail();
		lp.enterPassword();
		lp.clickLogin();
		Thread.sleep(4000);
		video.addButton();
		Thread.sleep(2000);
		video.uploadFile();
		Thread.sleep(2000);
		video.uploadVideo();

		}
}
