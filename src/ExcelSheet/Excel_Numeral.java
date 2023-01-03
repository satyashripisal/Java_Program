package ExcelSheet;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Numeral {

	public static void main(String[] args) throws IOException {
	
		//open workbook
		FileInputStream excel = new FileInputStream("C://Users//dell//DNYANESHWAR//Desktop//pqr.xlsx/");
		
		Sheet a = WorkbookFactory.create(excel).getSheet("Sheet1");
		
		double b = a.getRow(0).getCell(1).getNumericCellValue();
		double c = a.getRow(1).getCell(1).getNumericCellValue();
		double d = a.getRow(2).getCell(1).getNumericCellValue();
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		

	}

}
