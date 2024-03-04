package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class seleniumBasics {
 
	
	

	static WebDriver driver;
	
	
	static {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		driver= new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
  @Test (priority = 1) 
  public void WebTesting() throws Exception{
	  
	  driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	  driver.findElement(By.id("username")).sendKeys("rithesh");
	  driver.findElement(By.id("password")).sendKeys("helo");
	  driver.findElement(By.cssSelector("div.form-group")).findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/select/option[2]")).click();
	  driver.findElement(By.id("terms")).click();
	  //driver.findElement(By.id("signInBtn")).click();
	  System.out.println("rfw");
	  //Thread.sleep(5000);
	  System.out.println(driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/strong")).getText());
	  System.out.println(driver.findElement(By.linkText("terms and conditions")).getText());
  
  }
  
  
  @Test(priority = 2) 
  public void LogingTesting() throws Exception{
	  driver.findElement(By.cssSelector("input#username")).clear();
	  driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy ");
	  driver.findElement(By.cssSelector("#password")).clear();
	  driver.findElement(By.cssSelector("#password")).sendKeys("learning");
	  driver.findElement(By.cssSelector("input[type*='sub']")).click();;
  }
}
