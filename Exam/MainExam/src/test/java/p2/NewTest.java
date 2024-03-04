package p2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
static WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe" );
		driver=new ChromeDriver();
	}
  @BeforeClass
  public void beforeClass() {
  }
  
  
  @Test
  public void amazon() throws Exception{
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[12]")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java 8 in action");
	  Thread.sleep(1500);
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	  
  }
  
  
  
  
  
  

  @AfterClass
  public void afterClass() {
  }

}
