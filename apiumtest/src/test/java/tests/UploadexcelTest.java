package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.UploadexcelPage;

public class UploadexcelTest extends BaseClass{
	
	UploadexcelPage ep;
	LoginPage lp;
	
	
	@BeforeClass
	public void addFile()
	{
		lp=new LoginPage(driver);
		ep =new UploadexcelPage(driver);
	}

	@Test
	public void Uploadexcel() throws InterruptedException
	{
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
//		lp.clickNext1();
//		lp.clickNext2();
//		lp.clickStart();
//		lp.enterDigiSpace();
//		lp.enterEmail();
//		lp.enterPassword();
//		lp.clickLogin();
//		lp.loginDetail();
		Thread.sleep(4000);
//		ep.addButton();
//		ep.upFile();
//		ep.excel();
		ep.upexcel();
	}
}
