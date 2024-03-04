package handlingPopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class authenticationPopUps {
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
	}
  @Test
  public void authenticationPop() {
	  //if we login with normal page link we will get that popups ie
	  
	 // driver.get("https://the-internet.herokuapp.com/basic_auth");
	  
	  //but if we insert the username and password within the link 
	  //it will automatically detect the username and password and send pass the value 
	  
	  //username:admin password:admin
	  
	  //syntax of link should be 
	  //https://username:password@link.com
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).getText();
	  System.out.println(text);
	  
	  
	  
  }
}
