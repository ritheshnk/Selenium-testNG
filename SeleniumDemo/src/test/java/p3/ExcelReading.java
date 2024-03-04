package p3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell; 

public class ExcelReading {
	
	public static void main(String[] args) throws IOException {
		
		//create object for workbook
		FileInputStream fis= new FileInputStream("https://cigniti-my.sharepoint.com/:x:/r/personal/e010302_cigniti_com/_layouts/15/Doc.aspx?sourcedoc=%7B4A398E7B-9FF0-4F97-9473-4B13161A7B5D%7D&file=Book.xlsx&action=default&mobileredirect=true&DefaultItemOpen=1&login_hint=E010302%40cigniti.com&ct=1702969323424&wdOrigin=OFFICECOM-WEB.START.REC&cid=33ba3477-286f-4512-87d8-11f80c6e894d&wdPreviousSessionSrc=HarmonyWeb&wdPreviousSession=4ca7f34b-d1b5-4174-a878-49545606be50");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		//create object for sheet and allocate sheet
		
		int numSheet=workbook.getNumberOfSheets();
		
		XSSFSheet sheets = null;
		
		for(int i=0;i<numSheet;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("LoginData"));
			sheets=workbook.getSheetAt(i);//particular sheet will be assigned 
		}
		
		
		//fetch data from the sheet using 2 iterator
		
		 Iterator<Row> irow=sheets.iterator();
		 
		 while(irow.hasNext()) {
			 Row row=irow.next();
			 
			 Iterator jcell=row.cellIterator();
			 
			 while(jcell.hasNext()) {
				 Cell c=(Cell) jcell.next();
				 System.out.println(c.getStringCellValue());
			 }
;		 }
	}

}
