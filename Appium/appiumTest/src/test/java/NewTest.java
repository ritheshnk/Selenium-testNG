import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class NewTest {

	public static String userName = "ritheshnk_9orU0g";
	public static String accessKey = "jWWkyVgQ7CVK9xsWd5AH";
	AndroidDriver<AndroidElement> driver;

	@Test
	public void FirstApplicationTest() throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("device", "Google Pixel 3");
		caps.setCapability("os_version", "9.0");
		caps.setCapability("project", "My First Android Project");
		caps.setCapability("build", "My First Android Build");
		caps.setCapability("name", "Sample Test");
		caps.setCapability("app", "bs://0a5078a6ab3354b199b75e2d49830a5f629c142f");
		

		driver = new AndroidDriver<>(
				new URL("https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), caps);
		//Thread.sleep(5000);
		caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		driver.get("https://google.com");
		driver.findElementById("APjFqb").click();
		
	}

	
	@AfterTest
	public void tearDown() {
	    // Teardown logic
		driver.quit();
	}

}
