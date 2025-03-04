package dataProviderDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderPRactice {
	
  @Test(dataProvider="loginParallel")
  public void parallel(String username,String password)throws Exception {
	   WebDriver driver;
	   driver=new ChromeDriver();
		
	  driver.get("https://www.saucedemo.com");
	  driver.findElement(By.id("user-name")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  driver.findElement(By.id("login-button")).click();
	  
	 Thread.sleep(5000);
	  driver.quit();
	  
  }
  
  
  @DataProvider(name="loginParallel",parallel=true)
  public Object[][] details(){
	  Object[][] data= {
			  {"standard_user","secret_sauce"},
			  {"locked_out_user","secret_sauce"},
			  {"problem_user","secret_sauce"},
			  {"performance_glitch_user","secret_sauce"},
			  {"error_user","secret_sauce"},
			  {"visual_user","secret_sauce"},
	  };
	  
	  return data;
  }
}
