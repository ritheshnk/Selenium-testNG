package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IosTestChrome {
	
	 static String username="ritheshnk_9orU0g";
	 static String accssKey="jWWkyVgQ7CVK9xsWd5AH";
  @Test
  public void f() throws Exception {
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("device", "iPhone 15");
	  cap.setCapability("platformName", "iOS");
	  cap.setCapability("project", "Second project");
	  cap.setCapability("build", "Second build");
	  cap.setCapability("name", "ios sample testing");
	  cap.setCapability("app","bs://a579b99cac6b3dcfe18a61e6df5f078dba94cd18");
	  
	  IOSDriver<IOSElement> driver=new IOSDriver<IOSElement>(
			  new URL("https://"+username+":"+accssKey+"@hub-cloud.browserStack.com/wd/hub"),cap);
	  
	  driver.get("www.google.com");
	  
	  driver.quit();
  }
}
