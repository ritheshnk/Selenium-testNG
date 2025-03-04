package p1;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import org.testng.annotations.BeforeClass;

import java.io.FileReader;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	static WebDriver driver;
	
//	static {
//		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
//		 driver=new ChromeDriver();
//	}

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
  }
  
  
  
  @Test(priority=1)
  public void test1() {
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  
  }
  
  @Test(priority=2)
  
  public void test2() throws Exception {
	  CSVReader reader=new CSVReader(new FileReader("C:\\Selenium\\practice.csv"));
	  List<String[]> s=reader.readAll();
	  for(String[] str:s) {
		  
		  String username=str[0];
		  String password=str[1];
		  
		  WebElement usernameFEild=driver.findElement(By.id("user-name"));
		  usernameFEild.sendKeys(username);
		  WebElement passwordFeild=driver.findElement(By.id("password"));
		  passwordFeild.sendKeys(password);
		  driver.findElement(By.id("login-button")).click();
	  }
  }
  
  @Test(priority=3)
  public void test3() {
	  driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).click();
	  driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
  }
  
  
  @Test(priority=4)
  public void test4() throws Exception{
	  Thread.sleep(3000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
  }
  
  
@Test(priority=5)
public void test5() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.id("checkout")).click();
	driver.findElement(By.id("first-name")).sendKeys("aabb");
	driver.findElement(By.id("last-name")).sendKeys("aabb");
	driver.findElement(By.id("postal-code")).sendKeys("2344");
	Thread.sleep(1000);
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("finish")).click();
	
}



  @AfterClass
  public void afterClass() {
  }

}
