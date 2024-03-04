package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class autoSuggestiveDemo2 {
	static WebDriver driver;
	 static {
		 driver = new ChromeDriver();
	 }
	 
	 
	 //Mouse actions using Action Keywoard
  @Test
  public void mousetest() {
	  driver.get("https://www.w3schools.com/howto/howto_css_dropdown.asp");
	  WebElement ele=driver.findElement(By.xpath("//button[@class='dropbtn']"));
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  Actions act= new Actions(driver);
	  act.moveToElement(ele).perform();
	  try {
		    driver.findElement(By.xpath("//a[contains(text(),'Link 2')]")).click();
		    System.out.println("passed ");
		} catch(Exception e) {
		    System.out.println("failed ");
		}

	 
	  
  }
}
