package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderDemo3 {
  @Test(dataProvider="listDemo1",priority=1)
  public void demo(String s) {
	  System.out.println(s);
	  
  }
  
  @Test(dataProvider="setDemo",priority=2)
  public void demo2(String s) {
	  System.out.println(s);
	  
  }
  
  @Test(dataProvider="setObjectDemo",priority=3)
  public void demo3(String[] s) {
	  for(String str:s) {
		  System.out.println(str);
	  }
	  
  }
  
  
  
  
  @DataProvider(name="listDemo1")
  public Iterator<String> listdemo() {
	  List<String> s=new ArrayList<String>();
	  s.add("narayan");
	  s.add("rithu");
	  
	  return  s.iterator();
	  
  }
  
  @DataProvider(name="setDemo")
  public Iterator<String> setdemo() {
	  Set<String> s=new HashSet<String>();
	  s.add("roman");
	  s.add("seth");
	  s.add("dean");
	  
	  return s.iterator();
  }
  
  //demo for iterator<Object[]>
  //output can be random
  @DataProvider(name="setObjectDemo")
  public Iterator<String[]> setdemoObject() {
	  Set<String[]> s=new HashSet<String[]>();
	  s.add(new String[] {"a","b","c"});
	  s.add(new String[] {"d","f","g"});
	 
	  
	  return s.iterator();
  }
}
