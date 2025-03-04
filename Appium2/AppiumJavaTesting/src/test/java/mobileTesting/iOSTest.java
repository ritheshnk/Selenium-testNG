package mobileTesting;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class iOSTest {

    public static String username = "ritheshnk_IHZnK2";
    public static String password = "wWpV5hpsvr9TyNNpXyfS";
    public static String URL = "http://ritheshnk_IHZnK2:wWpV5hpsvr9TyNNpXyfS@hub-cloud.browserstack.com/wd/hub";

    WebDriver driver;
//error is there due to the version mismatch
    @Test
    public void openAmazon() throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "iPhone 13");
        cap.setCapability("platformName", "iOS");
        cap.setCapability("project", "amazon opening");
        cap.setCapability("build", "amazon build");

        driver = new RemoteWebDriver(new URL(URL), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://www.amazon.in/");

            // Wait for the search input field to be visible
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Search Amazon.in']")));
            
            //WebElement searchinput=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Search Amazon.in']")));
            searchInput.sendKeys("mobiles");

           
            driver.findElement(By.cssSelector("input[type='submit']")).click();

            //driver.findElement(By.xpath("//*[@id=\"CardInstances0hqRs78TRJwvgfo4zLrsA\"]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div[1]/a/div"))
            ;
            
            //how to open any product in amazon in web automation only two doubts
            
            //driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
            //js.executeScript("window.scrollTo(0, 1000)");
            
           // driver.findElement(By.xpath("//img[@class='_bGlmZ_img_1R5u3']")).click();
            driver.findElement(By.xpath("//a[@aria-label='Go to detail page for \"Apple iPhone 15 Pro (512 GB) - Natural Titanium.\" Eligible for Prime.']")).click();
             driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
             //driver.findElement(By.xpath("//input[@placeholder='Email or phone number']")).sendKeys("9353121508");
             driver.findElement(By.id("ap_email"));
             Thread.sleep(2000);
             driver.findElement(By.xpath("//input[@id='continue']")).click();
            Thread.sleep(2000);
            
            

           
            driver.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Quit the driver
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
