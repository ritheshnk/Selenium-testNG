package takeScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenShotDemo2 extends setUp {
  @Test
  public void google() throws Exception {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("rithesh nk");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

  }
  
  @Test 
  public void SwagsLogin() {
	  driver.get("https://www.saucedemo.com");
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-buton")).click();

  }
}
