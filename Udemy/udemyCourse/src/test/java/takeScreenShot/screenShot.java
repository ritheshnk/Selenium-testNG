package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenShot {
	 WebDriver driver;
  @Test
  public void screenShot() throws IOException  {
	  try {
	  driver =new ChromeDriver();
	  
	  driver.get("https://www.saucedemo.com/");
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
	  Thread.sleep(2000);
	  
	 driver.quit();
	  }catch(Exception e) {
		  TakesScreenshot ts=(TakesScreenshot) driver;
		  //take ss and store it in a file 
		 File file= ts.getScreenshotAs(OutputType.FILE);
		 //to store file to local we use file utils 
		 
		 FileUtils.copyFile(file, new File("./screenShots/image2.png"));
	  }
  }
}
