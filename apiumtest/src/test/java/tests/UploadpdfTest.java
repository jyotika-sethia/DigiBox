package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.UploadpdfPage;

public class UploadpdfTest extends BaseClass{
	LoginPage lp;
	UploadpdfPage pd;
	
	
	@BeforeClass
	public void call()
	{
		lp= new LoginPage(driver);
		pd=new UploadpdfPage(driver);
	}

	@Test
	public void pdfUpload() throws InterruptedException
	{
		lp.clickNext1();
		lp.clickNext2();
		lp.clickStart();
		lp.enterDigiSpace();
		lp.enterEmail();
		lp.enterPassword();
		lp.clickLogin();
		Thread.sleep(2000);
		pd.addButton();
		pd.uploadFile();
		pd.selectpdf();
	}
}
