package practice;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dataProviderDemo {
  

	//automaticall will read both the inputs
@Test(dataProvider="login")
public void test(String name,String password) {
	System.out.println(name);
	System.out.println(password);
}

 @DataProvider(name="login")
 public Object[][] getLoginData(){
	 
	 return new Object[][] {
		 {"username","password"},
		 {"username2","password2"}
	 };
 }
}
