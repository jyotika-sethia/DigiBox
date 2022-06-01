package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import tests.BaseClass;

public class LoginPage  {
	
	AppiumDriver driver;
	
	
	public LoginPage(AppiumDriver driver) 
	{
		this.driver=driver;
	}


	
	




//	public void allowEntry()
//	{
//		
//		WebElement allow = driver.findElement(By.xpath("	\r\n"
//				+ "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]"));
//		allow.click();
//	}
	
	
	public void clickNext1()
	{
		
//		WebElement next1 = driver.findElement(By.id("btnNextIntroOne"));
		WebElement next1 = driver.findElement(By.id("com.liqvd.digibox.test:id/btnNextIntroOne"));
		next1.click();
		
	}
	
	public void clickNext2()
	{
		
//		WebElement next2 = driver.findElement(By.id("btnNextIntroOne"));
		WebElement next2 = driver.findElement(By.id("com.liqvd.digibox.test:id/btnNextIntroOne"));
		next2.click();
	}

	public void clickStart()
	{
		
//		WebElement getStart = driver.findElement(By.id("btnNextIntroOne"));
		WebElement start = driver.findElement(By.id("com.liqvd.digibox.test:id/btnNextIntroOne"));
		start.click();
	}
	
	public void enterDigiSpace()
	{
		
//		WebElement digispace = driver.findElement(By.id("edtDigiSpaceName"));
		WebElement digispace = driver.findElement(By.id("com.liqvd.digibox.test:id/edtDigiSpaceName"));
		digispace.sendKeys("intern6");
	}
	
	public void enterEmail()
	{
		
		WebElement userid = driver.findElement(By.id("edtEmail"));
		userid.sendKeys("testing2510935@gmail.com");
	}
	
	public void enterPassword()
	{
		WebElement password = driver.findElement(By.id("edtPassword"));
		password.sendKeys("Gaurav@123");
	}
	
	public void clickLogin()
	{
		
		WebElement login = driver.findElement(By.id("btnSignIn"));
		login.click();
	}
	
	public void loginDetail()
	{
		clickNext1();
		clickNext2();
		clickStart();
		
	}
	
	
	
	}
