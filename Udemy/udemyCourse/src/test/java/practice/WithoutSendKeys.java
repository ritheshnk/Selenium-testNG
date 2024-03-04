package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithoutSendKeys {

  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com");
	  //send values without sendKeys
	  
	  //use js for this 
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("document.getElementById('user-name').value='standard_user'");
	  js.executeScript("document.getElementById('password').value='secret_sauce'");
	  js.executeScript("document.getElementById('login-button').click()");
	  
	  WebElement ele=driver.findElement(By.id("user-name"));
	  Point p=ele.getLocation();
	  System.out.println(p);
	  
	  Dimension d=ele.getSize();
	  System.out.println(d.width);
	  System.out.println(d.height);
	  System.out.println(d);
	  
  }
}
