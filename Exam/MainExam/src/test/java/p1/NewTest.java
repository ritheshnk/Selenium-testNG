package p1;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.List;


public class NewTest {
	
	static WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe" );
		driver=new ChromeDriver();
	}
 
  @BeforeClass
  public void beforeClass() {
  }
  
  @Test(priority=1)
  public void openBrowser() {
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
  }
  
  @Test(priority=2)
  public void Login() throws Exception{
	  CSVReader reader=new CSVReader(new FileReader("C:\\Selenium\\practice.csv"));
	  List<String[]> li=reader.readAll();
	  
	  for(String[] s:li) {
		  String username=s[0];
		  String password=s[1];
		  
		  WebElement usernameFeild=driver.findElement(By.id("user-name"));
		  WebElement passwordFeild=driver.findElement(By.id("password"));
		  
		  usernameFeild.clear();
		  usernameFeild.sendKeys(username);
		  Thread.sleep(1500);
		  passwordFeild.clear();
		  passwordFeild.sendKeys(password);
		  
		  driver.findElement(By.id("login-button")).click();
		  
	  }
  }
  
  @Test

  @AfterClass
  public void afterClass() {
  }

}
