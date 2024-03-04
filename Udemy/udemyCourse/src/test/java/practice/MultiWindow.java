package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiWindow {
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
	}
  @Test
  public void multiWindow() throws Exception {
	  driver.get("https://www.google.com");
	  String currentWindow=driver.getWindowHandle();
	  System.out.println("Mainn tab"+currentWindow);
	  driver.findElement(By.id("APjFqb")).sendKeys("rithesh nk");
	  driver.findElement(By.id("APjFqb")).sendKeys(Keys.CONTROL,"ac");
	  driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	  Thread.sleep(5000);
	  ((JavascriptExecutor)driver).executeScript("window.open()");
	  
	  Set<String>windows=driver.getWindowHandles();
	  
	  for(String window:windows) {
		  if(!(window.equalsIgnoreCase(currentWindow))) {
			  driver.switchTo().window(window);
			  break;
		  }
	  }
	  
	  System.out.println("new tab id"+driver.getWindowHandle());
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  driver.findElement(By.id("APjFqb")).sendKeys(Keys.CONTROL,"v");
	  driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	  
	  Thread.sleep(3000);
	  driver.quit();
  }
}
