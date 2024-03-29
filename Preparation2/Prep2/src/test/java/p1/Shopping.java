package p1;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import org.testng.annotations.BeforeClass;

import java.io.FileReader;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;



public class Shopping {
	
	static WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
 
  @BeforeClass
  public void beforeClass() {
  }
  
  
  @Test(priority=1)
  public void test1() throws Exception {
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  
	  Thread.sleep(1500);
	  
	  CSVReader reader=new CSVReader(new FileReader("C:\\Selenium\\practice.csv"));
	  List<String[]> li=reader.readAll();
	  
	  for(String[] s:li) {
		  String username=s[0];
		  String password=s[1];
		  
		  WebElement Username=driver.findElement(By.id("user-name"));
		  WebElement Password=driver.findElement(By.id("password"));
		  
		  Username.sendKeys(username);
		  Password.sendKeys(password);
		  
		  Thread.sleep(1500);
		  driver.findElement(By.id("login-button")).click();
		  
	  }
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
