package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class UploadVideoPage {
	AppiumDriver driver;
	
	public UploadVideoPage(AppiumDriver driver)
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
	
	public void uploadVideo()
	{
		WebElement upvideo = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
		upvideo.click();
	}
	
	
}
