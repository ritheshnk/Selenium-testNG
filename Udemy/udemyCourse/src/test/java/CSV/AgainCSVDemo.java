package CSV;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class AgainCSVDemo {
  @Test
  public void f()throws Exception {
	  CSVReader read=new CSVReader(new FileReader(System.getProperty("user.dir")+"//data//example.csv"));
	  List<String[]> reader=read.readAll();
	  
	  List<String> individualDatas=new  ArrayList<String>();
	  
	  System.out.println("reading individual values");
	  for(String[] row:reader){
		  for(String values:row) {
			  System.out.print(values+",");
		  }
	  }
	  
	  System.out.println();
	  System.out.println("reading row  values");
  
	  for(String[] row:reader) {
		  System.out.print(java.util.Arrays.toString(row)+" ");
		  System.out.println(row[0]);
		  System.out.println();
	  }
	  
	  
	  System.out.println();
	  System.out.println("bvc");
  
	  for(String[] row:reader) {
	
		  System.out.println(row[0]);
		  System.out.println();
	  }
  
  }
}