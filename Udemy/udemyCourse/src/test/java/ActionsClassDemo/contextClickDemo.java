package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class contextClickDemo {
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
	}
  @Test
  public void rightClick() {
	  driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	  WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	  
	  Actions act=new Actions(driver);
	  act.contextClick(ele).build().perform();
	  driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
	  System.out.println(driver.switchTo().alert().getText());
	  driver.switchTo().alert().accept();
  }
}
