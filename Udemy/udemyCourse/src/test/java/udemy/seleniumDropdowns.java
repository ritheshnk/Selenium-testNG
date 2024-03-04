package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class seleniumDropdowns {
	
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
	}
  @Test(priority=1)
  public void selectDropDown() {
	  try {
	  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	  WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	  
	  //if the tag name is select then it is a static drop down
	  Select dropDown=new Select(staticDropdown);
	  dropDown.selectByIndex(3);
	  
	  // getFirstSelectedOption is used to get the option which is been selected.
	  System.out.println(dropDown.getFirstSelectedOption().getText());
	  
	  dropDown.selectByVisibleText("AED");
	  
	  System.out.println(dropDown.getFirstSelectedOption().getText());
	 
	  
	  dropDown.selectByValue("INR");
	  
	  System.out.println(dropDown.getFirstSelectedOption().getText());
	  
	
	  
	  driver.findElement(By.id("divpaxinfo")).click();
	  Thread.sleep(2000);
	  int i=1;
	  
	  while(i<4) {
		  driver.findElement(By.id("hrefIncAdt")).click();
		  System.out.println(i);
		  i++;
	  }
	  driver.findElement(By.id("btnclosepaxoption")).click();
	  
	  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	  
	  //assertEquals has 2 arguments which will check what value selenium has returened and what
	  //value we are expecting if both are correct then it will execute  else will throw error
	  Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
	  
	  
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  
  }
  
  
  //DYNAMIC DROP DOWN
  @Test(priority=2)
  public void DynamicDropDowns() {
	  try {
		  
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[@value='IXE']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		 
		  //another way without using index
		  //it is really important cause u can select element with the help of the parent 
		  
		  //parentTagLocation(give space)Id ur selecting
		  
		  // //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'](give one space)//a[@value='IXE']
		  
		/*  
		  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='IXE']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
	
	  */
		  
		  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[2]/a")).click();
		 
		  //causing error 
		  
		 // driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		  
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  
  }
  
  
  //AutosuggestiveDropdown
  @Test(priority=3)
  void AutosuggestiveDropdown() {
	  try {
		  driver.findElement(By.id("autosuggest")).sendKeys("ind");
		  Thread.sleep(3000);
		  
		  List <WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		  
		  for(WebElement option:options) {
			  if(option.getText().equalsIgnoreCase("India")) {
				  option.click();
				  break;
			  }
		  }
		  
		  	  }catch(Exception e) {
		  e.printStackTrace();
	  }
  }
  
  @Test(priority=4)
  
  void checkBox() {
	  try {
		  driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		  
		  //isSelected is used to check if the check box is clicked or not
		  
		  System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		  
		  driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		  System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		  
		  driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		  System.out.println( "using assertion to check true or false");
		 
		  //assertFalse will check if it returns false or not else it will fail
		  //Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		  
		  
		  //assertTrue will check if it returns True or not else it will fail
		   Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		  
		  driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
		  System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  
	 
  }
  
 
  @Test(priority=5)
  void validatingUIElements() {
	  try {
		  System.out.println("validatingUIElements");
//		  System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		  
		  //get attribute is used to get attribute
		  System.out.println(driver.findElement(By.id("Div1")).getAttribute("id"));
		  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		  Thread.sleep(2000);
		  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		  
		  //if(driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity:1"))
		  
		  //we cannot do above if will not work contains only check one input
		  if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		  {
			  System.out.println("it is enable");
			  Assert.assertTrue(true);
		  }else {
			  System.out.println("it is disabled");
			 Assert.assertTrue(false);
		  }
		  
		  
//		  System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	 
  }
  
   
  
}
