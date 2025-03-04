package package1;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Ecommerce {
	
	static WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver =new ChromeDriver();
	}

  @Test(priority=1)
  public void test1() {
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
  }
  
  @Test(priority=2)
  public void csvTest() throws Exception {
	  CSVReader reader=new CSVReader(new FileReader("C:\\Selenium\\practice.csv"));
	  List<String[]> str=reader.readAll();
	  for(String[] s:str) {
		  String username=s[0];
		  String password=s[1];
		  
		  WebElement usernameFeild=driver.findElement(By.id("user-name"));
		  WebElement passwordFeild=driver.findElement(By.id("password"));
		  usernameFeild.sendKeys(username);
		  passwordFeild.sendKeys(password);
		  Thread.sleep(1500);
		  driver.findElement(By.id("login-button")).click();
		  Thread.sleep(1500);
		  scroller(driver,0,1000);
  }
	  
	 
  
}
  
  
 @Test(priority=3)
 public void addTOCart() throws Exception{
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).click();
	 Thread.sleep(1500);
	 driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	 Thread.sleep(1500);
	 driver.navigate().back();
	 Thread.sleep(1500);
	 scroller(driver,0,-1000);
	 Thread.sleep(1500);
	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
 }
 
 
 @Test(priority=4)
 public void checkOut() throws Exception{
	 Thread.sleep(1000);
	 driver.findElement(By.id("shopping_cart_container")).click();
	 Thread.sleep(1000);
	 scroller(driver,0,1000);
	 Thread.sleep(1500);
	 driver.findElement(By.id("checkout")).click();
 }
 

 @Test(priority=5)
 public void checkoutInformation() throws Exception {
	 Thread.sleep(1000);
	 scroller(driver,0,-1000);
	 Thread.sleep(1000);
	 driver.findElement(By.id("first-name")).sendKeys("ABC");
	 driver.findElement(By.id("last-name")).sendKeys("abc");
	 driver.findElement(By.id("postal-code")).sendKeys("12-23");
	 driver.findElement(By.id("continue")).click();
	 Thread.sleep(1000);
	 scroller(driver,0,1000);
	 Thread.sleep(1000);
	 scroller(driver,0,-1000);
	 Thread.sleep(1500);
	 scroller(driver,0,1000);
	 Thread.sleep(1500);
	 driver.findElement(By.id("finish")).click();
 }
 
// @Test(priority = 6)
// @Parameters({"browserType", "baseUrl"})  // Corrected parameter names
// public void param(String browserType, String baseUrl) {
//     System.out.println(baseUrl);
//     System.out.println(browserType);
// }

 
 
 
 
 

  public void scroller(WebDriver driver,int i,int j) {
	  JavascriptExecutor js=(JavascriptExecutor) driver; //typecasting driver to js executor
	  js.executeScript("window.scrollTo({top:arguments[0],behaviour:'smooth'})",j);
  }
  
}