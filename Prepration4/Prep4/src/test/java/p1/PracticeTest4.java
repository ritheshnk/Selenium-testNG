package p1;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import org.testng.annotations.BeforeClass;

import java.io.FileReader;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class PracticeTest4 {
	
	
	static WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	    driver=new ChromeDriver();
	    //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

  @BeforeClass
  public void beforeClass() {
  }
  
  
  
  @Test(priority=1)
  public void test1() {
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
  }
  
  @Test(priority=2)
  public void test2() throws Exception {
	 CSVReader reader=new CSVReader(new FileReader("C:\\Selenium\\practice.csv"));
	 List<String[]> li=reader.readAll();
	 
	 for(String[] s:li) {
		 String username = s[0];
		 String password =s[1];
		 
		 WebElement usernameFeild=driver.findElement(By.id("user-name"));
		 WebElement passwordFeild=driver.findElement(By.id("password"));
		 
		 usernameFeild.sendKeys(username);
		 passwordFeild.sendKeys(password);
		 
		 driver.findElement(By.id("login-button")).click();
		 
		 
	 }
  }
  
  
  
  @Test(priority=3)
  
  public void test3() throws InterruptedException {
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	  Thread.sleep(1500);
	  driver.navigate().back();
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	  
	  
	  
  }
  
  
  @Test(priority=4)
  
  public void test4() throws Exception {
	  Thread.sleep(1400);
	  driver.findElement(By.id("checkout")).click();
	  driver.findElement(By.id("first-name")).sendKeys("Vishnu");
	  driver.findElement(By.id("last-name")).sendKeys("Rithesh");
	  driver.findElement(By.id("postal-code")).sendKeys("121-333");
	  Thread.sleep(1500);
	  driver.findElement(By.id("continue")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.id("finish")).click();
	  
	  
  }
  
  
  

  @AfterClass
  public void afterClass() {
  }

}
