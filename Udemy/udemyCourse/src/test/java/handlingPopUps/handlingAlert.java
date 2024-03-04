package handlingPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handlingAlert {
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
	}
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  String name="Narayan";
	  
	  //alert box implementation
	  driver.findElement(By.id("name")).sendKeys(name);
	  driver.findElement(By.id("alertbtn")).click();
	  System.out.println(driver.switchTo().alert().getText());
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept(); //used to press accept button
	  Thread.sleep(2000);
	  
	  //Confirm box implementation
	  driver.findElement(By.id("confirmbtn")).click();
	  System.out.println(driver.switchTo().alert().getText());
	  Thread.sleep(2000);
	  driver.switchTo().alert().dismiss(); // is used to dismiss or press cancel button 
	  
	  
  }
}
