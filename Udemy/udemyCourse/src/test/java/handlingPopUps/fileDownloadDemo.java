package handlingPopUps;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class fileDownloadDemo {
	static WebDriver driver;
	static {
		
	}
  @Test
  public void fileDownload() throws InterruptedException {
	 
	  //code to download the file to default location
	  //driver.findElement(By.linkText("ZIP file")).click();
	  
	  //downlaod to specified folder
	  ChromeOptions options=new ChromeOptions();
		
		HashMap<String,Object> chromePrefs=new HashMap<String,Object>();
		
		chromePrefs.put("profile.default_content_settings.popups", 0); //for getting no popups during download
		
		String downloadFilePath=System.getProperty("user.dir");
		
		chromePrefs.put("download.default_directory", downloadFilePath);
		
		options.setExperimentalOption("prefs", chromePrefs);
		
		 driver=new ChromeDriver(options);
		 driver.get("https://omayo.blogspot.com/p/page7.html");
		 driver.findElement(By.linkText("ZIP file")).click();
		 
		 Thread.sleep(5000);
		 File file =new File(downloadFilePath+"\\DownloadDemo-master.zip");
		 
		 if(file.exists()) {
			 System.out.println("file downloaded in current directory");
		 }else {
			 System.out.println("file not downlaoded ");
		 }
	

  }
}
