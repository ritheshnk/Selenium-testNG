package exam;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class androidPresentation {
	
	public static String username="ritheshnk_9orU0g";
	public static String accessKey="jWWkyVgQ7CVK9xsWd5AH";
	public static String URL="http://ritheshnk_IHZnK2:wWpV5hpsvr9TyNNpXyfS@hub-cloud.browserstack.com/wd/hub";
	
	AndroidDriver<AndroidElement> driver;
  @Test(priority=1)
  public void Test1() {
	  try {
		  DesiredCapabilities cap = new DesiredCapabilities();
		  
		  cap.setCapability("deviceName", "Samsung Galaxy S22 Ultra");
		  cap.setCapability("os_version", "12");
		  cap.setCapability("project", "androind testprojet");
		  cap.setCapability("build", "android test build");
		  cap.setCapability("app", "bs://5cd7a103aba9a27477480af6d606bc90094bb22d");
		  
		  driver=new AndroidDriver<AndroidElement>(new URL(URL),cap);
		  
		  driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"org.wikipedia.alpha:id/view_featured_article_card_image\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"org.wikipedia.alpha:id/view_wiki_error_button\"]")).click();
		  //driver.close();
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	
  }
  
  @Test(priority=2)
  public void test2() {
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Bernardo Arévalo is inaugurated as President of Guatemala after multiple attempts to obstruct the event.']")).click();
	  driver.close();
  }
}
