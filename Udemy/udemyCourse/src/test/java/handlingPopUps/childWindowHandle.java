package handlingPopUps;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class childWindowHandle {
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
	}
  @Test
  public void childWindow() throws InterruptedException {
	  driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	  String currentWindowID=driver.getWindowHandle();
	  System.out.println("parent windowID:"+currentWindowID);
	  System.out.println(driver.getTitle());
	  
	  driver.findElement(By.id("newWindowBtn")).click();
	  Set<String> windows=driver.getWindowHandles();
	  
	  //one method
//	  ArrayList<String> mywindow=new ArrayList<String>(windows);
//	  
//	  String workingWindow=mywindow.get(1);
//	  
//	  driver.switchTo().window(workingWindow);
//	  System.out.println("swithced to child widnow:"+driver.getWindowHandle());
//	  System.out.println(driver.getTitle());
	  
	  
	  //second method
	  for(String window:windows) {
		  if(!(window.equalsIgnoreCase(currentWindowID))) {
			  driver.switchTo().window(window);
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  //driver.findElement(By.id("firstName")).sendKeys("Narayan");
			  System.out.println("swithced to child widnow:"+driver.getWindowHandle());
 			  System.out.println(driver.getTitle());
 			 driver.manage().window().maximize();
 			  break;
		  }
	  }
	  
	  driver.findElement(By.id("firstName")).sendKeys("Narayan");
	  Thread.sleep(5000);
	  driver.close();
	  driver.switchTo().window(currentWindowID);
	  driver.findElement(By.id("name")).sendKeys("successfully switched ");
	  Thread.sleep(3000);
	  driver.close();
	  
  }
}
