package Excel;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Multiset.Entry;

public class excelToHasMap {
	
	public static Map<String,String> getExcelData(){
		Map<String,String> values= new HashMap<String,String>();
		try {
			String filePath="C:\\Users\\nkrit\\OneDrive\\Desktop\\excelToHashMap.xlsx";
			
			FileInputStream fileInputStream=new FileInputStream(filePath);
			
			XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet=workbook.getSheetAt(0);
			
			int rowCount=sheet.getLastRowNum();
			int colCount=sheet.getRow(0).getLastCellNum();
			
			
			
			for(int i=0;i<=rowCount;i++) {
				Row row=sheet.getRow(i+1);
				//in every row retrieve every first col
				Cell firstCell=row.getCell(0);
				String col1Value=firstCell.getStringCellValue();
				
				//in every row retieve second cell values
				Cell secondCell=row.getCell(1);
				String col2Values=secondCell.getStringCellValue();
				
				//values.put(key, value);
				values.put(col1Value, col2Values);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		
		return values;
	}
	
	@Test
	public void data() {
		try {
			Map<String,String> excelData=excelToHasMap.getExcelData();
			
			for(java.util.Map.Entry<String, String> map:excelData.entrySet()) {
				System.out.println("key="+map.getKey()+"values="+map.getValue());;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
