package Excel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class readExcel {
	
	@Test(dataProvider="excelData")
	public  void test(String data1,String data2) throws Exception {
		WebDriver driver=new ChromeDriver();
		Login l=new Login(driver);
		driver.get("https://www.saucedemo.com/");
		l.userName(data1);
		l.password(data2);
		l.login();
	}
	
	
	@DataProvider(name="excelData")
	public Object[][] readExcel() throws Exception{
		//get excel path
		
				String excelPath=System.getProperty("user.dir")+"\\data\\Book1.xlsx";
				System.out.println(excelPath);
				FileInputStream input=new FileInputStream(excelPath);
				XSSFWorkbook wb=new XSSFWorkbook(input);
				XSSFSheet sheet=wb.getSheetAt(0);
				
				int rowCount=sheet.getLastRowNum();
				int colCount=sheet.getRow(1).getLastCellNum();
				
				System.out.println(rowCount);
				System.out.println(colCount);
				
				Object[][] data=new Object[rowCount][colCount];
				
				for(int i=0;i<rowCount;i++)
				{
					XSSFRow row=sheet.getRow(i+1);
					for(int j=0;j<colCount;j++)
					{
						XSSFCell cell=row.getCell(j);
						System.out.println(cell);
						data[i][j]=row.getCell(j).toString();

						/*
      example hwo it will be stored is {{a,b},{c,d}}
      */
					}
				}
				input.close();
				return data;
	}

}
