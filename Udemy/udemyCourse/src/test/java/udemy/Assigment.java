package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assigment {
	
	static WebDriver driver;
	static {
		driver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
	}
	
	
  @Test
  public void f() {
	  
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  
	 List <WebElement> checkboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
	 System.out.println(checkboxes.size());
	 int i=0;
	 
	 for(WebElement checkbox:checkboxes) {
		 i++;
	 }
	 System.out.println(i);
	
	 
	 driver.findElement(By.xpath("//input[@value='option1']")).click();
	 Assert.assertTrue(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
  }
}
