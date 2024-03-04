package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class sliderActionDemo {
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
	}
  @Test
  public void f() {
	  driver.get("https://jqueryui.com/slider/");
	  driver.switchTo().frame(0);
	  WebElement ele=driver.findElement(By.xpath("//*[@id='slider']/span"));
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).dragAndDropBy(ele, 300, 0).build().perform();
  }
}
