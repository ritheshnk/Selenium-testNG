package mobileTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;



public class androidTest {

	public static String username="ritheshnk_9orU0g";
	public static String accessKey="jWWkyVgQ7CVK9xsWd5AH";
	AndroidDriver<AndroidElement> driver;
	
  @Test
  public void beforeTest() throws MalformedURLException {
	  
	  DesiredCapabilities caps = new DesiredCapabilities();
	  
	  caps.setCapability("device", "Google Pixel 3");
	  caps.setCapability("os_version", "9.0");
	  caps.setCapability("project", "Android Second Project");
	  caps.setCapability("build", "Android Build");
	  caps.setCapability("name","Android Testing");
	  //caps.setCapability("browserName","android");
	  caps.setCapability("browserName", "Chrome");
		caps.setCapability("app", "bs://b8d1d6cc267a4fc9ba449f4aed6c13269835f4e4");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), caps);
		caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.quit();
	  
	/*  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("device", "Google Pixel 3");
	  cap.setCapability("os_version", "9.0");
	  cap.setCapability("project", "Android Second Project");
	  cap.setCapability("build", "Android Build");
	  cap.setCapability("name","Android Testing");
	  cap.setCapability("browserName","android");
	  cap.setCapability("app", "bs://0a5078a6ab3354b199b75e2d49830a5f629c142f");
	  
	  driver = new AndroidDriver<>(new URL("https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), cap);
	  cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
	  driver.get("https://google.com");
	  driver.quit();
	  
	  */
	  
	  
	  
  }
  
}
