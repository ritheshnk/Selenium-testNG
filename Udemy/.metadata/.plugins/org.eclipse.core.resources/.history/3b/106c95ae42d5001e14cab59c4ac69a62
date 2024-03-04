package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginFormUsingTwoParameter {
    WebDriver driver;

    // Passing single value
    @Parameters("browserName")
    @BeforeTest
    public void setup(String value) {
        switch (value) {
            case "chrome":
                ChromeOptions option = new ChromeOptions();
                option.addArguments("--disable-popup-blocking");
                driver = new ChromeDriver(option);
                break;  // Add this break statement
            default:
                System.err.println("Only chrome is allowed");
                break;  // Add a default case and break
        }
    }

    // Passing double value
    @Parameters({ "username", "password" })
    @Test
    public void login(String username, String password) {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }
}
