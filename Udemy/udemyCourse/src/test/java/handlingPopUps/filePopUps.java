package handlingPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class filePopUps {
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
	}
  @Test
  public void filePop() {
	  driver.get("https://omayo.blogspot.com/");
	  driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\E010302\\Downloads\\walpper.jpg");
  }
}
