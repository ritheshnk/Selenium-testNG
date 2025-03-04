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

public class csvRead2 {
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
	}
  @Test
  public void csvRead() throws Exception {
	  driver.get("https://www.saucedemo.com");
	  CSVReader read=new CSVReader(new FileReader("C:\\Selenium\\practice.csv"));
	  List<String[]> reader=read.readAll();
	  List<String> individualValues=new ArrayList<String>();
	  
	  //target each row 
	  for(String[] row:reader) {
		  //in that row target each value
		  for(String value:individualValues) {
			  individualValues.add(value);
		  }
	  }
	  
	  
	 for(int i=0;i<individualValues.size();i++) {
		 System.out.print(individualValues.get(i)+" ");
		 
		 String username=individualValues.get(i);
		 String password=individualValues.get(i+1);
		       
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
  

}
