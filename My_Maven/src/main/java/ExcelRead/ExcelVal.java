package ExcelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelVal {
	XSSFSheet sh;
	public ExcelVal() throws IOException
	{
		FileInputStream I = new FileInputStream("C:\\Users\\Abdul Hameed\\Desktop\\SheetNew.xlsx");
		XSSFWorkbook w = new  XSSFWorkbook(I);
		sh = w.getSheet("Sheet1");	
	}
	public String readdata(int i, int j)
	{
	 Row r = sh.getRow(i);
	 Cell c = r.getCell(j);
	 int celltype = c.getCellType();
	 switch(celltype)
	 {
	 case Cell.CELL_TYPE_NUMERIC:
		   {
			 double d = c.getNumericCellValue();
			 return String.valueOf(d);
		   } 
	 case Cell.CELL_TYPE_STRING:
			 {
				return c.getStringCellValue(); 
			 }
	 		 
		 
	 }
	 return null;
	 
	}

}
