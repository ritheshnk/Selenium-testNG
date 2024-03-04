package p1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	static WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver =new ChromeDriver();
	}
  
  @BeforeClass
  public void beforeMethod() {
	  //System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	  
  }
  
  
  @Test(priority=1)
  public void test1() {
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
  }
  
  @AfterClass
  public void afterClass() {
  }

}
