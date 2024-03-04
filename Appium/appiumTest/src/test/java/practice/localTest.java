package practice;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class localTest {
	
	public static String username="ritheshnk_9orU0g";
	public static String accessKey="jWWkyVgQ7CVK9xsWd5AH";
	 AndroidDriver<AndroidElement> driver;
  @Test
  public void localSampleTest() throws Exception{
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("device", "Google Pixel 3");
	  cap.setCapability("os_version", "9.0");
	  cap.setCapability("project", "My second Android project");
	  cap.setCapability("build", "My second build project");
	  cap.setCapability("name", "Sample Test");
	  cap.setCapability("app", "bs://b8d1d6cc267a4fc9ba449f4aed6c13269835f4e4");
	  
	  
	  /*AndroidDriver<AndroidElement> driver = new AndroidDriver<>(
				new URL("https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), caps);
		driver.quit();*/
	  
	   driver=new AndroidDriver<>(
			  new URL("https://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"),cap);  
	  driver.get("https://google.com");
	  cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
	  driver.findElementByName("q").sendKeys("Appium");
	  
  }
  
  @AfterTest
	public void tearDown() {
	    // Teardown logic
		driver.quit();
	}

}
