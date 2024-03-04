package udemy;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionDemo {
	static WebDriver driver;
	static{
		driver=new ChromeDriver();
	}
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
	  
	  List<WebElement> checkboxes=driver.findElements(By.cssSelector("input[type='checkbox'"));
	  
	  System.out.println(checkboxes.size());
	  
	  for (WebElement checkbox : checkboxes) {
		 
         if(checkbox.isEnabled() && checkbox.isDisplayed())
         {
        	 checkbox.click();
        	 System.out.println(checkbox.isSelected());
        	 
         }else {
        	 System.out.println(checkbox.getText());
        	 System.out.println("checkbox not enbale");
         }
      }
	  
	  Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	  driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	  Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	  
	  //one more demo is there on assertion which is done in dropdown looping file
  }
}

