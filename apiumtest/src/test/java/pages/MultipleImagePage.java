package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class MultipleImagePage {
	AppiumDriver driver;
	
	public MultipleImagePage(AppiumDriver driver)
	{
		this.driver=driver;
	}


	public void addButton()
	{
	WebElement add = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]"));
	add.click();
	}
	
	
	public void uploadFile()
	{

	WebElement upFile = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView"));
		upFile.click();
	}
	
	
	public void choseImage()
	{
		WebElement chose =driver.findElement(By.xpath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/com.google.android.material.chip.Chip[1]"));
		chose.click();
	}
	
	public void selectChoice()
	{
		WebElement select = driver.findElement(By.id("com.google.android.documentsui:id/dir_list"));
		select.click(); ,m
	}
	
	
	public void selectImage1()
	{
		WebElement image1 = driver.findElement(By.id("com.android.documentsui:id/icon_thumb"));
		image1.click();
	}

}
