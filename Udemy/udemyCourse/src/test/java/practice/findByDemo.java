package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class findByDemo {
	static WebDriver driver;
	
	@FindBy(id="user-name")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	static {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-popup-blocking");
		driver=new ChromeDriver(option);
		
	}
	
	@BeforeClass
	public void setUp() {
		PageFactory.initElements(driver, this);
	}

	
	
  @Test
  public void f() {
	  driver.get("https://www.saucedemo.com/");
	  username.sendKeys("standard_user");
	  password.sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//input[@id='login-button']")).click();
	  
  }
  
  
  
}
