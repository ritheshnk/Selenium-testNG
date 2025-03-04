package timeOutsParameterDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class timeOutDemo2 {
	static WebDriver driver;
	static WebDriver driver2;
	static {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("start-maximed");
		driver=new FirefoxDriver();
		driver2=new ChromeDriver(options);
	}
  @Test()
  public void test1() {
	  driver.get("https://www.saucedemo.com");
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
	  driver.quit();
  }
  
  //this will fail cause test takes minimum 1400 sec 
  //if u give 1300 it will fails saying timeout
 
  @Test()
  public void test2() {
	  driver2.get("https://www.saucedemo.com");
	  driver2.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver2.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver2.findElement(By.id("login-button")).click();
	  driver2.quit();
  }
  
  
}
