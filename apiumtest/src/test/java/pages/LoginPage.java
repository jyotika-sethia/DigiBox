package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import tests.BaseClass;

public class LoginPage  {
	
	AppiumDriver driver;
	
	
	public LoginPage(AppiumDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnNextIntroOne")
	WebElement clicknext1;	 	

	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnNextIntroOne")
	WebElement clicknext2;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnNextIntroOne")
	WebElement start;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/edtDigiSpaceName")
	WebElement digi;
	
	@FindBy(how=How.ID,using="edtEmail")
	WebElement email;
	
	@FindBy(how=How.ID,using="edtPassword")
	WebElement password;
	
	@FindBy(how=How.ID,using="btnSignIn")
	WebElement login;


	public void loginDetail(String arg1,String arg2,String arg3) throws InterruptedException
	{
		System.out.println("1");
		clicknext1.click();
		System.out.println("2");
		Thread.sleep(3000);
		clicknext2.click();
		Thread.sleep(3000);
		start.click();
		Thread.sleep(3000);
		digi.sendKeys(arg1);
		email.sendKeys(arg2);
		password.sendKeys(arg3);
		login.click();

	}
	
	
	
	}
