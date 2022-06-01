package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class CreateFolderPage {
	AppiumDriver driver;
	
	public CreateFolderPage(AppiumDriver driver)
	{
		this.driver=driver;
	}
	
	public void addButton()
	{
	WebElement add = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]"));
	add.click();
	}
	
	public void selectFolder()
	{
		WebElement select = driver.findElement(By.id("com.liqvd.digibox.test:id/llCreateNewFolder"));
		select.click();
	}
	
	public void folderName()
	{
		WebElement name = driver.findElement(By.id("com.liqvd.digibox.test:id/edtCreateFolderName"));
		name.sendKeys("Images");
	}
	
	public void createFolder()
	{
		WebElement select = driver.findElement(By.id("com.liqvd.digibox.test:id/btnCreateFolder"));
		select.click();
	}

}
