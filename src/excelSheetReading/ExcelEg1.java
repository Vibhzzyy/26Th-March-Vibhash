package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		File Thefile= new File("D:\\Vibhzzyy\\Testing stuff\\ExcelTest\\ExcelTest26ThM.xlsx");
		
		String Name = WorkbookFactory.create(Thefile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		System.out.println(Name);
		
		String Name1 = WorkbookFactory.create(Thefile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();

		System.out.println(Name1);
		
		
		double Num = WorkbookFactory.create(Thefile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		
		System.out.println(Num);
		
        double Num1 = WorkbookFactory.create(Thefile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		
		System.out.println(Num1);
		
		String OneWord = WorkbookFactory.create(Thefile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		
		System.out.println(OneWord);
		
		String OneWord1 = WorkbookFactory.create(Thefile).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
			
	    
		System.out.println(OneWord1);
		
        boolean IsOr = WorkbookFactory.create(Thefile).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
		
		System.out.println(IsOr);
		
		boolean IsOr1 = WorkbookFactory.create(Thefile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
			
		System.out.println(IsOr1);
	}

}
