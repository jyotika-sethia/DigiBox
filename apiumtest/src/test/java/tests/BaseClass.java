package tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class BaseClass {

	
	 public AppiumDriver driver;

	 
	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException
	{
//		DesiredCapabilities cap = new DesiredCapabilities();
		
//		cap.setCapability("platformName","Android");
//		cap.setCapability(CapabilityType.PLATFORM_NAME,"Android");
//		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		//Both does the same.These are interface
//		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "");
//		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
//		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
//		cap.setCapability(MobileCapabilityType.APP,"");
//		cap.setCapability(, null);
//		
		File path=new File("C:\\Users\\sethi\\eclipse-workspace\\apiumtest\\src\\test\\resources\\digiboxx.apk");
		
		String path1 = System.getProperty("user.dir");
		System.out.println(path1);//from where the project will start
		System.out.println(path);//where u want to start
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.APP,path.getAbsolutePath());
		cap.setCapability(CapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		
		cap.setCapability("appPackage", "com.liqvd.digibox.test");
		cap.setCapability("appActivity","com.liqvd.digibox.ui.MainActivityNew");
		
		cap.setCapability("autoGrantPermissions",true);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url,cap);
		Thread.sleep(4000);
		
		
	
	}
	
//	@Test
//	public void sampleTest() throws InterruptedException
	{
	 
		
	
//		WebElement allow = driver.findElement(By.xpath("//div[text()='ALLOW']"));
//		WebElement allow = driver.findElement(By.xpath("//div[@class='_highlighter-box_619e8']"));
//		WebElement allow = driver.findElement(By.xpath("com.android.packageinstaller:id/permission_allow_button"));
//		
//		allow.click();
//		Thread.sleep(4000);
//		login.allowEntry();
		
//		WebElement click1 = driver.findElement(By.id("com.liqvd.digibox.test:id/btnNextIntroOne"));
//		click1.click();
//		Thread.sleep(4000);
//	
//		WebElement click2 = driver.findElement(By.id("com.liqvd.digibox.test:id/btnNextIntroOne"));
//		click2.click();
//		Thread.sleep(4000);
//	
//		WebElement getStart = driver.findElement(By.id("com.liqvd.digibox.test:id/btnNextIntroOne"));
//		getStart.click();
//		Thread.sleep(4000);
//	
//		WebElement digispace = driver.findElement(By.id("edtDigiSpaceName"));
//		digispace.sendKeys("intern6");
//		Thread.sleep(4000);
//		
//		WebElement userid = driver.findElement(By.id("edtEmail"));
//		userid.sendKeys("testing2510935@gmail.com");
//		Thread.sleep(4000);
//		
//		WebElement password = driver.findElement(By.id("edtPassword"));
//		password.sendKeys("Gaurav@123");
//		Thread.sleep(4000);
//		
//		WebElement login = driver.findElement(By.id("btnSignIn"));
//		login.click();
	}
	
	
	@AfterTest
	public void teardown()
	{
		
	}
}
