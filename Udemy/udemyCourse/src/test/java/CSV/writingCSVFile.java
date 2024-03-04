package CSV;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class writingCSVFile {
  @Test
  public void createCSV() throws IOException {
	  
	  String csvFile=System.getProperty("user.dir")+"//data//example.csv";
	  
	  FileWriter write=new FileWriter(csvFile);
	  
	  write.append("standard_user,secret_sauce \n");
	  write.append("locked_out_user,secret_sauce \n");
	  write.append("visual_user,secret_sauce \n");
	  
	  write.close();
	  
	  System.out.println("file created ");
  }
}
