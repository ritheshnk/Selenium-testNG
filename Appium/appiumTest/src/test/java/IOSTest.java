import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSTest {
	public static String userName = "ritheshnk_9orU0g";
	public static String accessKey = "jWWkyVgQ7CVK9xsWd5AH";
	//public static WebDriver driver2;

	@Test
	public void FirstApplicationTest() throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("device", "iPhone 15");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("project", "My First ios Project");
		caps.setCapability("build", "My First ios Build");
		caps.setCapability("name", "ios Sample Test");
		caps.setCapability("app", "bs://bfeed4861635cd512bf87c52a3b5d18a66b02d25");
		
		IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(
				new URL("http://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), caps);
		
		driver.get("https://google.com");
		driver.findElement(By.id("")).sendKeys("ghost");
		//driver.findElement(By.id("input")).sendKeys("phone");
		//driver.quit();
		
	}
}
