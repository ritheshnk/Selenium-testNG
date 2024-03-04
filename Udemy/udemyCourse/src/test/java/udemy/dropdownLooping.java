package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dropdownLooping {
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
		
	}
  @Test
  public void loopingDropdown() throws InterruptedException {
	  
	  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	  
	  System.out.println("before loop");
	  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	  driver.findElement(By.id("divpaxinfo")).click();
	  
	  	  Thread.sleep(2000);
	  WebElement adult=driver.findElement(By.id("hrefIncAdt"));
	  
	  for(int i=0;i<3;i++)
	  {
		  adult.click();
	  }
	  
	  Thread.sleep(2000);
	  WebElement children=driver.findElement(By.id("hrefIncChd"));
	  
	  for(int i=0;i<3;i++)
	  {
		  children.click();
	  }
	  
	  Thread.sleep(2000);
	  
	  WebElement infant=driver.findElement(By.id("hrefIncInf"));
	  
	  for(int i=0;i<3;i++)
	  {
		  infant.click();
	  }
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("btnclosepaxoption")).click();
	  
	  Thread.sleep(2000);
	  System.out.println("after loop");
	  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	  
	  
	  /*assertEquals has many method of the common thing is u check if the 
	  expected answer and the actual answer is same or not */
	  Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult, 3 Child, 3 Infant");
	  
  
  }
}
