package handlingPopUps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hiddenDivisionPopUPs {
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
	}
  @Test
  public void hiddenDivisionPop() {
	  try {
		  driver.get("https://www.busonlineticket.com/");
		  driver.findElement(By.xpath("//*[@id=\"booking-search-wrapper-id\"]/div/ul/li[1]/a")).click();
		  
		  // //div[@class='select2-result-label']
		  driver.findElement(By.id("txtOrigin")).sendKeys("kua");
		  
		  List<WebElement> options=driver.findElements(By.xpath("//div[@class='select2-result-label']"));
		  System.out.println(options.size());
		  
		  for(WebElement option:options)
		  {
			  if(option.getText().equalsIgnoreCase("Kuala Lumpur")) {
				  option.click();
				  break;
			  }
		  }
		  
		  Thread.sleep(2000);
		  driver.findElement(By.id("txtDestination")).sendKeys("c");
		  
		  List<WebElement> distinationOptions=driver.findElements(By.xpath("//div[@class='select2-result-label']"));
		  
		  for(WebElement destinationOption:distinationOptions)
		  {
			  if(destinationOption.getText().equalsIgnoreCase("Chai Leng Park")) {
				  destinationOption.click();
				  break;
			  }
		  }
		  
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[contains(@class,'ui-state-active')]")).click();
		  
		  Thread.sleep(1000);
		  driver.findElement(By.id("txtReturnDate")).click();
		  
		  driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
		  
		  
		  
	  }catch(Exception e) {
		  e.printStackTrace();
	  }finally {
		  
		 
	  }
  }
}
