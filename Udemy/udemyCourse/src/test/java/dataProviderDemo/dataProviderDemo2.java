package dataProviderDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderDemo2 {
	static WebDriver driver;

	static {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		option.addArguments("--disable-popup-blocking");
		driver = new ChromeDriver(option);
		System.setProperty("webdriver.chorme.driver", "C:\\Selenium\\chromedriver.exe");
	}

	@Test(dataProvider = "loginInfo")
	public void dataTest(String username, String password) {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);

	}

	@Test(dataProvider = "integer")
	public void dataTest2(Integer i) {
		System.out.println(i);
	}

	@Test(dataProvider = "string")
	public void str(String s) {
		System.out.println(s);
	}

	@Test(dataProvider = "twoDarray")
	public void dataTest4(String name, String pass) {
		System.out.print(name + ">>" + pass);
		System.out.println();
	}

	
	@Test(dataProvider = "jaggedDarray")
	public void dataTest5(String[] str) {

		for (String s : str) {
			System.out.print(s + " ");

		}
		System.out.println(">>>");
	}

	//using one d array we can use 2d array

	@Test(dataProvider = "twoDarray")
	public void dataTest6(String[] str) {

		for (String s : str) {
			System.out.print(s + " ");

		}
		System.out.println(">>>");
	}

	@DataProvider(name = "loginInfo")
	public Object[][] data() {
		Object[][] datas = { { "standard_user", "secret_sauce" }, { "locked_out_user", "secret_sauce" },
				{ "problem_user", "secret_sauce" } };

		return datas;
	}

	@DataProvider(name = "integer")
	public Object[] val() {
		Object[] values = { 1, 2, 3, 4 };
		return values;
	}

	@DataProvider(name = "string")
	public Object[] val2() {
		Object[] s = { "rithesh", "roman", "seth", "dean" };
		return s;
	}

	@DataProvider(name = "twoDarray")
	public Object[][] val3() {
		Object[][] val = { { "hello", "1" }, { "rithu", "3" }, { "artemi", "4" } };

		return val;
	}

	@DataProvider(name = "jaggedDarray")
	public Object[][] val4() {
		Object[][] val = { { "carbon", "6", "methane", "11" }, { "nitrogen", "7", "UnionCarbide" },
				{ "hydrogen", "1", } };

		return val;
	}
}
