package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class demo {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("http://www.fatcow.com");
	  WebElement menu = driver.findElement(By.xpath("//select[@id='countrySelect']"));
	  		
	  Actions act = new Actions(driver);
	  		
	  act.moveToElement(menu).perform();
	  		
	  driver.findElement(By.xpath("//option[@value='CAD']")).click();
	  		
	  Thread.sleep(2000);
	  		
	  driver.close();

  }
}
