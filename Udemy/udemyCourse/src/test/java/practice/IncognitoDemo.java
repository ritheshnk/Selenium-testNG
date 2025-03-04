package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class IncognitoDemo {
	static WebDriver driver;
	
	
	@Parameters("browserName")  //ur specify which paramtr with help of name
	@BeforeTest
	public void setup(String value) {
		switch(value)
		{
		case "chrome":ChromeOptions option=new ChromeOptions();
						option.addArguments("start-maximized"); //open in full screen same like 
						//driver.manage().windows().maximize();
						option.addArguments("incognito");
						driver=new ChromeDriver(option);
		default:System.err.println("invalid browser use chrome");
		}
	}
	
	
//	static {
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("start-maximized"); //open in full screen same like 
//		//driver.manage().windows().maximize();
//		option.addArguments("incognito");
//		driver=new ChromeDriver(option);
//	}

	
@Parameters("url")
  @Test
  public void Incognito(String url) throws InterruptedException {
	  driver.get(url);
	  driver.findElement(By.id("APjFqb")).sendKeys("rithesh nk");
	  driver.findElement(By.id("APjFqb")).sendKeys(Keys.CONTROL,"ac");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	  
	  Thread.sleep(3000);
	  driver.close();
  }
}
