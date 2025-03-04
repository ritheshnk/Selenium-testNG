package practice1;

import com.opencsv.CSVReader;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileReader;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class LoginCSV {
	
	static WebDriver driver;
	
	static 
	{
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		driver =new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");

	}
  
  @BeforeMethod
  public void beforeMethod() {
	  //System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	  
  }
  
  
  @Test(priority=1)
  public void test1() {
	  driver.get("https://www.saucedemo.com/");
	  
	  driver.manage().window().maximize();
  }
  
  @Test(priority=2)
  
  public void test2()throws Exception {
	  CSVReader reader=new CSVReader(new FileReader("C:\\Selenium\\practice.csv"));
	  List<String[]> li=reader.readAll();
	  
	  for(String[] s:li)
	  {
		  String username=s[0];
		  String password=s[1];
		  System.out.println(s[0]);
		  System.out.println(s[1]);
		  WebElement usernameFeild=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		  usernameFeild.clear();
		  usernameFeild.sendKeys(username);
		  
		  Thread.sleep(1500);
		  WebElement passwordFeild=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  passwordFeild.clear();
		  passwordFeild.sendKeys(password);
		  
		  Thread.sleep(1500);
		  
		  driver.findElement(By.id("login-button")).click();
		  
		  
	  }
	  
	  
	  
	   //read properties file
	    
	    
//	    Properties prop=new Properties();
//	    
//	    //load properties file
//	    
//	    prop.load(LoginCSV.class.getClassLoader().getResourceAsStream("Myproject.properties"));
//	    
//	    String Uname=prop.getProperty("uName");
//	    String pwd=prop.getProperty("Pwd");
//	    
	  
  }
  
  
  @Test(priority=3)
  public void test3() throws Exception {
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
	  Thread.sleep(1500);
	  driver.navigate().back();
	  
  }
  
  @Test(priority=4)
  public void test4() throws Exception{
	  Thread.sleep(1500);
	  scroller(driver,0,1000);
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
	  Thread.sleep(1500);
	  scroller(driver,0,-1000);
	  Thread.sleep(1500);
	  driver.findElement(By.id("shopping_cart_container")).click();
	  
  }
  
  @Test(priority=5)
  public void test5() throws Exception {
	  Thread.sleep(1500);
	  scroller(driver,0,1000);
	  Thread.sleep(1500);
	  driver.findElement(By.id("checkout")).click();
	  scroller(driver,0,-1000);
  }
  
  
  @Test(priority=6)
  public void test6() throws Exception {
	  Thread.sleep(1500);
	  driver.findElement(By.id("first-name")).sendKeys("Abc");
	  driver.findElement(By.id("last-name")).sendKeys("helo");
	  driver.findElement(By.id("postal-code")).sendKeys("12-453");
	  Thread.sleep(1500);
	  driver.findElement(By.id("continue")).click();
  }
  
  @Test(priority=7)
  public void test7() throws Exception {
	  Thread.sleep(1500);
	  scroller(driver,0,1000);
	  Thread.sleep(1500);
	  driver.findElement(By.id("finish")).click();
	  Thread.sleep(1500);
	  driver.close();
  }
  
  private void scroller(WebDriver driver2,int i,int j) {
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  js.executeScript("window.scrollTo({top:arguments[0],behaviour:'smooth'})",j);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
