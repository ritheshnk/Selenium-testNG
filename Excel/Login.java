package Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	Login(WebDriver d){
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")WebElement username;
	@FindBy(id="password")WebElement password;
	@FindBy(id="login-button")WebElement btn;
	
	public void userName(String name) {
		username.sendKeys(name);
	}
	
	public void password(String pass) {
		password.sendKeys(pass);
	}
	
	public void login() {
		btn.click();
	}
}