package p5;

import org.testng.annotations.Test;
import com.opencsv.CSVReader;
import org.testng.annotations.BeforeMethod;
import java.io.FileReader;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CSVProject {
	
	static WebDriver driver;

  @BeforeMethod
  public void beforeMethod() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
  }
  
  
  @Test(priority=1)
  public void test1() throws Exception  {
	 
	  driver.get("https://practicetestautomation.com/practice-test-login/");
	  CSVReader reader=new CSVReader(new FileReader("C:\\Selenium\\loginPractice.csv"));
	  List<String[]> li=reader.readAll();//will read entire file and dump it 
	  //we are using list cause it will read each column as a row 
/*	  
	  Iterator i=li.listIterator();
	  int num=1;
	  
	  while(i.hasNext())
	  {
		  String[] s=(String[]) i.next();
		  for(int j=0;j<s.length;j++)
		  {
			  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(s[j]);
		  }
		  
		  
	  }
*/	  
	  for(String[] s:li) {
		  String username=s[0];
		  String password=s[1];
		  
		  WebElement usernameFeild= driver.findElement(By.xpath("//*[@id=\"username\"]"));
		  usernameFeild.clear();
		  usernameFeild.sendKeys(username);
		  
		  WebElement passwordFeild= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  passwordFeild.clear();
		  passwordFeild.sendKeys(password);
	  }
	  
	  driver.findElement(By.id("submit")).click();
	  
  }
 
  
 

 
  @AfterMethod
  public void afterMethod() {
  }

}
