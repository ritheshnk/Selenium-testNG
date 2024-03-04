package practice;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest {
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
	}
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.saucedemo.com/"); 
	  
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  
	  driver.findElement(By.id("login-button")).click();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"item_4_title_link\"]/div")));
		  driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
	 
	  }
}
