package ActionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragAndDropDemo {
	static WebDriver driver;
	static {
		driver=new ChromeDriver();
	}
  @Test
  public void dragndrop() throws InterruptedException {
	  driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	  WebElement source=driver.findElement(By.id("box1"));
	  WebElement target=driver.findElement(By.id("box101"));
	  Thread.sleep(1000);
	  Actions act=new Actions(driver);
	  act.dragAndDrop(source, target).build().perform();
	 // act.clickAndHold(source).moveToElement(target).release().build().perform();
	  

	  WebElement source2=driver.findElement(By.id("box2"));
	  WebElement target2=driver.findElement(By.id("box102"));
	  
	  act.dragAndDrop(source2,target2).build().perform();
	  
	  WebElement source3=driver.findElement(By.id("box3"));
	  WebElement target3=driver.findElement(By.id("box103"));
	  act.dragAndDrop(source3, target3).build().perform();
	  
	  WebElement source4=driver.findElement(By.id("box4"));
	  WebElement target4=driver.findElement(By.id("box104"));
	  act.dragAndDrop(source4, target4).build().perform();
	  
	  
	  WebElement source5=driver.findElement(By.id("box5"));
	  WebElement target5=driver.findElement(By.id("box105"));
	  act.dragAndDrop(source5, target5).build().perform();
	  
	  
	  WebElement source6=driver.findElement(By.id("box6"));
	  WebElement target6=driver.findElement(By.id("box106"));
	  act.dragAndDrop(source6, target6).build().perform();
	  
	  WebElement source7=driver.findElement(By.id("box7"));
	  WebElement target7=driver.findElement(By.id("box107"));
	  act.dragAndDrop(source7, target7).build().perform();
  }
}
