package groupings;

import org.testng.annotations.Test;

public class NewTest {
	
  
  @Test(groups= {"smoke"})
  public void test1() {
	  System.out.println("test1");
  }
  
  @Test(groups= {"smoke","snaity"})
  public void test2() {
	  System.out.println("test2");
  }
  
  @Test(groups= {"funtional"})
  public void test3() {
	  System.out.println("test3");
  }
}
