package CSV;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class csvRead {
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
	}
  @Test
  public void csvRead() throws Exception {
	  driver.get("https://www.saucedemo.com");
	  CSVReader read=new CSVReader(new FileReader("C:\\Selenium\\practice.csv"));
	  List<String[]> reader=read.readAll();
	  List<String> values=new ArrayList<String>();
	 
	  for(String[]row:reader) {
		  for(String value:row) {
			  values.add(value);
		  }
	  }
	  
	 for(int i=0;i<values.size();i++) {
		 System.out.print(values.get(i)+" ");
		 
		 String username=values.get(i);
		 String password=values.get(i+1);
		       
		 driver.findElement(By.id("user-name")).sendKeys(username);
		 driver.findElement(By.id("password")).sendKeys(password);
		 driver.findElement(By.id("login-button")).click();
		 Thread.sleep(5000);
		 driver.close();
	 }
	  
	    
  }
  
  @Test
  public void csvRead2() throws Exception {
	  //2nd method to read csv file
	  File file=new File(System.getProperty("user.dir")+"//data//example.csv");
	  
	  Scanner sc=new Scanner(file);
	  
	  //
	  sc.useDelimiter(",");
	  
	  while(sc.hasNext()) {
		  System.out.print(sc.next());
	  }
  }
  
  @Test
  public void csvRead3() throws Exception {
	  //3rd method to read csv file
	  File file=new File(System.getProperty("user.dir")+"//data//example.csv");
	  
	  Scanner sc=new Scanner(file);
	  
	  //
	  sc.useDelimiter(",");
	  
	  while(sc.hasNext()) {
		  System.out.print(sc.next());
	  }
  }
}
