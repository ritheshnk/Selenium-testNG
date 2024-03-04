package CalenderOperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class calendarPractice {
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
	}
  @Test
  public void calenderTest() {
	  try {
		  driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		  driver.findElement(By.id("datepicker")).click();
		  
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		  
		  String cMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		  String cYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		  
		  while(!(cMonth.equalsIgnoreCase("July") && cYear.equalsIgnoreCase("2024") )) {
			  driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			  cMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			  cYear=driver.findElement(By.className("ui-datepicker-year")).getText();
			  
		  }
		  
		  driver.findElement(By.xpath("(//a[contains(text(),'16')])[2]")).click();
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
