package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class UploadImagePage {
	AppiumDriver driver;
	
	public UploadImagePage(AppiumDriver driver)
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

//	WebElement upFile= driver.findElement(By.xpath("[{\"key\":\"elementId\",\"value\":\"31a98a13-3f4e-4e62-84b6-e977960763fc\",\"name\":\"elementId\"},{\"key\":\"index\",\"value\":\"1\",\"name\":\"index\"},{\"key\":\"package\",\"value\":\"com.liqvd.digibox.test\",\"name\":\"package\"},{\"key\":\"class\",\"value\":\"android.widget.TextView\",\"name\":\"class\"},{\"key\":\"text\",\"value\":\"Upload File(s)\",\"name\":\"text\"},{\"key\":\"checkable\",\"value\":\"false\",\"name\":\"checkable\"},{\"key\":\"checked\",\"value\":\"false\",\"name\":\"checked\"},{\"key\":\"clickable\",\"value\":\"false\",\"name\":\"clickable\"},{\"key\":\"enabled\",\"value\":\"true\",\"name\":\"enabled\"},{\"key\":\"focusable\",\"value\":\"false\",\"name\":\"focusable\"},{\"key\":\"focused\",\"value\":\"false\",\"name\":\"focused\"},{\"key\":\"long-clickable\",\"value\":\"false\",\"name\":\"long-clickable\"},{\"key\":\"password\",\"value\":\"false\",\"name\":\"password\"},{\"key\":\"scrollable\",\"value\":\"false\",\"name\":\"scrollable\"},{\"key\":\"selected\",\"value\":\"false\",\"name\":\"selected\"},{\"key\":\"bounds\",\"value\":\"[198,1902][467,1967]\",\"name\":\"bounds\"},{\"key\":\"displayed\",\"value\":\"true\",\"name\":\"displayed\"}]"));
//	WebElement upFile = driver.findElement(By.partialLinkText("Upload File(s)"));
//	WebElement upFile = driver.findElement(By.xpath("//div[@class='_highlighter-box_619e8']"));
//	WebElement upFile = driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.ImageView"));
//	WebElement upFile = driver.findElement(By.id("com.liqvd.digibox.test:id/llUploadFileFolders"));
//	WebElement upFile = driver.findElement(By.className("android.widget.TextView"));
	WebElement upFile = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView"));
		upFile.click();

	}
	
	public void selectImage()
	{
		WebElement select = driver.findElement(By.id("com.android.documentsui:id/icon_thumb"));
		select.click();
	}
	
	
}
