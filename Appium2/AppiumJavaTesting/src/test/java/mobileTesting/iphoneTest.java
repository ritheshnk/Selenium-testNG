package mobileTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
//import io.appium.java_client.*;
public class iphoneTest {
	
	 public static String username = "ritheshnk_IHZnK2";
	 public static String accessKey = "wWpV5hpsvr9TyNNpXyfS";
	 public static String URL = "http://ritheshnk_IHZnK2:wWpV5hpsvr9TyNNpXyfS@hub-cloud.browserstack.com/wd/hub";
     
	 IOSDriver<IOSElement> driver;
	
	
  @Test
  public void textTesting()  {
	  
	  
  try {
	  DesiredCapabilities cap = new DesiredCapabilities();
	  cap.setCapability("deviceName", "iPhone 13");
	  cap.setCapability("platform", "iOS");
	  cap.setCapability("project", "appTesting");
	  cap.setCapability("build", "final build");
	  cap.setCapability("app", "bs://8fdec5c32d7d807d1f9445e819aa5a965bd3b0b1");
	  
	  driver=new IOSDriver<IOSElement>(new URL(URL),cap);
	  //Text Button
	  
	 // driver.findElement(AppiumBy.accessibilityId("Text Button")).click(); //NOT WORKING DUE TO DEPENDENCY
	  driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Text Button\"]")).click();
	  driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Text Input\"]")).click();
	  driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Text Input\"]")).sendKeys("hello world");
	  //driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Text Input\"]")).submit();
	  ////XCUIElementTypeButton[@name="Return"]
	  driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Return\"]")).click();
	  //Thread.sleep(2000);
	  
	  MobileElement ele=(MobileElement) driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"UI Elements\"`][1]"));
	  ele.click();
	  
	  //or
	  
	  //driver.findElement(By.name("UI Elements")).click();
	  
	  }catch(Exception e) {
		  e.printStackTrace();
	  }finally {
//		  
	  }
	 
	  
  }
  
  
  @Test(priority=2)
  public void alertTesting2() {
	  try {
		  //**/XCUIElementTypeButton[`name == "Alert"`]
		  
		  Thread.sleep(2000);
		  MobileElement alertPress=(MobileElement) driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Alert\"`]"));
		  alertPress.click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]")).click();
		  
		  
	  }catch(Exception e) {
		  e.printStackTrace();
	  }finally {
		  if(driver != null) {
			  driver.quit();
		  }
	  }
  }
}
