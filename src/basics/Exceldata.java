package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Exceldata {
	
	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelSheet;
	private static XSSFCell Cell;
	
	public static void main(String[] args) throws IOException{
		    FileInputStream Excelfile = new FileInputStream("C:\\Users\\pmallela2\\Desktop\\Sample.xlsx");
		    ExcelWBook = new XSSFWorkbook(Excelfile);
		    ExcelSheet = ExcelWBook.getSheet("Sheet1");
		    Cell = ExcelSheet.getRow(1).getCell(1);
  			String CellData = Cell.getStringCellValue();
  			System.out.println(CellData);
	}

}
