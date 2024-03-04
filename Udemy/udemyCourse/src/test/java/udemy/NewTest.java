package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	static WebDriver driver;
	
	static {
		driver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver");
	}
  @Test
  public void f() {
	  driver.get("https://www.google.com");
	  
	  List<WebElement> li=driver.findElements(By.xpath("//a | //img"));
	  System.out.println(li.size());
	  for(WebElement l:li)
	  {
		  System.out.println(l.getText());
	  }

		 
  }
}
