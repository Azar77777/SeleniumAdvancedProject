package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReader {
	
	String sWorkBookName ="C:\\Excel\\Sample.xlsx";
	String sWorkSheetName = "Sheet1";
	
	
	@DataProvider(name="Sam")
	public Object[][] getDataValues()throws Exception
	{
		Object[][] data;
		FileInputStream fis = new FileInputStream(new File(sWorkBookName));
		
		XSSFWorkbook xssfwork = new XSSFWorkbook(fis);
		XSSFSheet xssfsheet = xssfwork.getSheet(sWorkSheetName);
		int firstRow = xssfsheet.getFirstRowNum();
		int lastRow = xssfsheet.getLastRowNum();
		
		XSSFRow row = xssfsheet.getRow(0);
		int maxcell = row.getLastCellNum();
		data = new Object[lastRow+1][maxcell];
		System.out.println(" last Value is"+lastRow+" "+maxcell);
		
		for (int i=0;i<=lastRow;i++)
		{		
			XSSFRow rows = xssfsheet.getRow(i);
			for (int j=0;j<maxcell;j++)
			{
				if(rows.getCell(j).getCellType()==Cell.CELL_TYPE_STRING)
				{
					data[i][j] = rows.getCell(j).getStringCellValue().toString();	
				}
				else if (rows.getCell(j).getCellType()==Cell.CELL_TYPE_NUMERIC)
					data[i][j] = rows.getCell(j).getNumericCellValue();
				
				else if(rows.getCell(j).getCellType()==Cell.CELL_TYPE_BLANK)
					data[i][j] = "";
			}		
		}
		return data;
		
	}

}
