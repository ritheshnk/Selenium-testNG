package practice1;

import java.io.FileReader;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class ReadinCSV {
  @Test
  public void f() {
	  try {
		  CSVReader reader=new CSVReader(new FileReader("C:\\Users\\E010302\\Desktop\\acc.csv"));
		  
		  List<String[]> read=reader.readAll();
		  
		  for(String[] row:read) {
			  String accountNumber=row[0];
			  String balance=row[1];
			  
			  if("303_303".equalsIgnoreCase(balance)) {
				  System.out.println(balance);
			  }else {
				  continue;
			  }
		  }
		  
	  }catch(Exception e) {
		  
	  }
  }
}
