package takeScreenShot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class setUp {
	public static WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	   driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  
  public void captureScreenShot(String FileName) {
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  File srcFile=ts.getScreenshotAs(OutputType.FILE);
	  File destiFile=new File("./failedTestsSS/"+FileName);
	  try{
		 FileUtils.copyFile(srcFile, destiFile); 
	  }catch(Exception e) {
		  e.printStackTrace();
	  }finally {
		  System.out.println("Screen Shot saved ");
	  }
  }

}
