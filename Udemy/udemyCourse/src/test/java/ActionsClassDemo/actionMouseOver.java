package ActionsClassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actionMouseOver {
	static WebDriver driver;
	 static {
		 driver = new ChromeDriver();
	 }
	 
  @Test
  public void mouseOver() throws InterruptedException {
	  driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
	  
	  WebElement IAF=driver.findElement(By.xpath("//label[contains(text(),'Indian Armed Forces')]\n"
	  		+ ""));
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  Actions act=new Actions(driver);
	  act.moveToElement(IAF).build().perform();  //will hover over 
	  
	  Thread.sleep(2000);
	  WebElement student=driver.findElement(By.xpath("//label[contains(text(),'Student')]"));
	  act.moveToElement(student).build().perform();
	  
	  Thread.sleep(2000);
	  WebElement check=driver.findElement(By.xpath("//span[contains(text(),'Check-In')]"));
	  act.moveToElement(check).click().build().perform(); //to click after you hover
  }
}
