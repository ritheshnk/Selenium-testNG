package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class resizeTextAreaDemo {
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
	}
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://jqueryui.com/resizable/");
	  driver.switchTo().frame(0);
	  WebElement resize=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));  //resize button
	  Actions act=new Actions(driver);
	  Thread.sleep(2000);
	  act.moveToElement(resize).dragAndDropBy(resize, 200, 200).build().perform();
  }
}
