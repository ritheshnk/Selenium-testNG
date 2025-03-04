package practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class dependOnDemo {
	
  @Test
  public void first() {
	  System.out.println("first test");
  }
  
  @Test(dependsOnMethods="first")
  public void second() {
	  System.out.println("second");
  }
  
  @Test(dependsOnMethods= {"first","forth"})
  public void third() {
	  System.out.println("third test");
  }
  
  @Test(dependsOnMethods="first")
  public void forth() {
	  System.out.println("forth test");
  }
  
  @Test
  public void hardAssert() {
	  String x="Sky";
	  String y="Sky";
	  Assert.assertEquals(x, y);
	  
  }
  
  @Test
  public void softAssert() {
	  String a="sky";
	  String b="Sky";
	  SoftAssert softassert=new SoftAssert();
	  softassert.assertEquals(a, b);
	  softassert.assertFalse(true);
	  //if we uncomment then this test will fail because the conditions for both equals and false 
	  //donnot match
	 // softassert.assertAll();
  }
  
  
  @Test(invocationCount=5,enabled=false)
  public void test() {
	  System.out.println("hello");
  }
  
  
  @Test(enabled=true)
  public void test2() {
	  System.out.println("hello 6");
  }
  
  
  @Test(invocationCount=3)
  public void test3() {
	  System.out.println("hello");
  }
  
  //will not execute 
  @Test(invocationTimeOut=2000,enabled=false)
  public void test4() {
	 int i=1;
	 while(i>0)
	 {
		 System.out.println(i);
		 i++;
	 }
	 
  } 
  /*
 //infinite loop
  
	  @Test(invocationTimeOut=2000)
  public void test4() {
	 int i=1;
	 while(i>0)
	 {
		 System.out.println(i);
		 i++;
	 }
  }
  }*/
  
}
