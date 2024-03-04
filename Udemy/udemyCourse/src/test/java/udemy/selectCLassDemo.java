package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selectCLassDemo {
	static WebDriver driver;
	static {
		driver = new ChromeDriver();
	}
  @Test
  public void selectDemo() {
	  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	  
	  //we need location of select tag to use select class
	  WebElement ele=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	  
	  //implementation of select class
	  
	  Select s=new Select(ele);
	  
	 s.selectByIndex(0);
	 System.out.println(s.getFirstSelectedOption().getText());
	 
	 s.selectByValue("INR");
	 System.out.println(s.getFirstSelectedOption().getText());
	 
	 s.selectByVisibleText("USD");
	 System.out.println(s.getFirstSelectedOption().getText());
	 
	 List <WebElement> options=s.getOptions();
	 System.out.println(options.size());
	 for(WebElement option : options) {
		 System.out.println(option.getText());
	 }
	 int  i=1;
	 //selecting all options using loops
	 for(WebElement option : options)
	 {
		 option.click();
		 System.out.println(i);
		 i++;
		 
		
	 }
	 
	 //to select particular options
	 for(WebElement option:options)
	 {
		 if(option.getText().equalsIgnoreCase("INR"))
		 {
			 option.click();
			 break;
		 }
	 }
	 ////to deselect the code is 
	 
	 //s.deselectAll();
	 
	 //will throw error here cause we cannot select multiple options
	 
	 
	 
	
	 
	 
	 
	 
  }
}
