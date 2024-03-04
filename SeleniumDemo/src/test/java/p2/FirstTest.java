package p2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

 static WebDriver driver;	
 
  @BeforeMethod
  public void beforeMethod(){
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	  
	 
  }
	
  @Test(priority=1)
  public void test1() throws InterruptedException {
	   driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  Thread.sleep(2000);
	  
	 
  }
  
  @Test(priority=2)
  public void test2() throws InterruptedException{
	  Thread.sleep(1000);
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  Thread.sleep(3000);
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  Thread.sleep(3000);
	  driver.findElement(By.id("login-button")).click();
  }
  
  @Test(priority=3)
  public void test3() throws InterruptedException{
	  Thread.sleep(1000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[contains(text(), 'Sauce Labs Bolt T-Shirt')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	  /*
	   //div: means select all div in the document
	   [contains(text(),'Sauce Labs Bolt T-shirts'] : [] will be used to check like conditions 
	   it checks if the text specified is present or not 
	   
	   contains() is a function in XPath that is used to select elements whose attribute value contains a specific substring
	   has 2 parameters text() and the text to find
	   
	   */
  }
  
  
  @Test(priority=4)
  public void test4() throws InterruptedException{
	
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.navigate().refresh();
	  Thread.sleep(2000);
	  scrollWithAnimation(driver,0,1000);
	  
  }
  
  
  @Test(priority=5)
  public void test5() throws InterruptedException{
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
	  /*
	   
	   *: Selects any element.
	   [@id="add-to-cart-test.allthethings()-t-shirt-(red)"]: This part is a conditional statement that filters elements based on their ID attribute.*/
  
  }
  
  @Test(priority=6)
  public void test6() throws InterruptedException{
	  Thread.sleep(3000);
	  scrollWithAnimation(driver,0,-1000);
	  Thread.sleep(4000);
	  driver.findElement(By.id("shopping_cart_container")).click();
	  Thread.sleep(2000);
	  scrollWithAnimation(driver,0,1000);
	  Thread.sleep(2000);
	  driver.findElement(By.id("checkout")).click();
	  Thread.sleep(2000);
	  scrollWithAnimation(driver,0,-1000);
  }
  
  @Test(priority=7)
  public void test7() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.id("first-name")).sendKeys("Lorem");
	  Thread.sleep(2000);
	  driver.findElement(By.id("last-name")).sendKeys("Ipsum");
	  Thread.sleep(2000);
	  driver.findElement(By.id("postal-code")).sendKeys("123-456");
	  Thread.sleep(2000);
	  scrollWithAnimation(driver,0,1000);
	  Thread.sleep(2000);
	  driver.findElement(By.id("continue")).click();;
  }
  
  @Test(priority=7)
  
  public void test8() throws InterruptedException {
	  Thread.sleep(2000);
	  scrollWithAnimation(driver,0,1000);
	  Thread.sleep(2000);
	  driver.findElement(By.id("finish")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("back-to-products")).click();
	  Thread.sleep(2000);
	  scrollWithAnimation(driver,0,-1000);
  }
  
  
  
  
  
  
  private void scrollWithAnimation(WebDriver driver2, int i, int j) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	js.executeScript("window.scrollTo({top:arguments[0],behaviour: 'smooth'});", j);
	
}

@AfterMethod
  public void afterMethod() {
	 
	    
  }
  
  
}
