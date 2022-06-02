package tests;

import org.junit.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.UploadVideoPage;
import pages.VideoInsideFolderPage;

public class VideoInsideFolderTest extends BaseClass {
	LoginPage lp;
	VideoInsideFolderPage vp;
	UploadVideoPage video;
	
	
	@BeforeClass
	public void call()
	{
		lp=new LoginPage(driver);
		vp=new VideoInsideFolderPage(driver);
		video=new UploadVideoPage(driver);
	}

	@Test
	public void uploadV() throws InterruptedException
	{
		
		System.out.println("1");
		Thread.sleep(2000);
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(4000);
		System.out.println("4");
		vp.folder();
		video.uploadVideo();

		}

}
