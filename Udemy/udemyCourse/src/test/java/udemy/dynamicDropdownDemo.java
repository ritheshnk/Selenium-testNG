package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dynamicDropdownDemo {
	static WebDriver driver;
	static{
		driver=new ChromeDriver();
	}
  @Test
  public void dynamicDropdown()  {
	  driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  
	  
	  //One method using index
	 
	/*  
	  driver.findElement(By.xpath("//a[text()=' Mangaluru (IXE)']")).click();
	 // driver.findElement(By.xpath("//a[text()=' Bengaluru (BLR)']")).click(); //it will overide above destination 
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("(//a[text()=' Mangaluru (IXE)'])[2]")).click();
	  
	*/
	  
	  //second method using parent child 
	  //in xpath for parent child relationship syntax: //parentLocation (one space) //childLocation 
	  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[text()=' Bengaluru (BLR)']")).click();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXE']")).click();
  }
  

}
