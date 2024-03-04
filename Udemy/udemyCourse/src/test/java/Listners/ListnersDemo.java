package Listners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ITestListenersDemo.class)
public class ListnersDemo  {
  @Test
  public void test1() {
	  System.out.println("test1");
  }
  @Test
  public void test2() {
	  System.out.println("test2");
	  Assert.assertTrue(false);

	  
  }
  @Test(timeOut =1000)
  public void test3() throws Exception {
	  Thread.sleep(2000);
	  System.out.println("test3");

  }
  @Test
  public void test4() {
	  System.out.println("test4");

  }
  
}
