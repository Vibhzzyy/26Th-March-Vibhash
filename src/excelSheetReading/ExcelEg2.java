package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File Thefile= new File("D:\\Vibhzzyy\\Testing stuff\\ExcelTest\\ExcelTest26ThM.xlsx");
		
		// We are checking all the type of method (String,Boolean,Numerical).
		Workbook Create = WorkbookFactory.create(Thefile);
		Sheet MySheet = Create.getSheet("Sheet1");
		Row MyRows = MySheet.getRow(3);
		Cell MyCells = MyRows.getCell(0);
	    System.out.println(MyCells.getCellType());
	    System.out.println("=============================");
	    
	    //Code for reading whole data from excel sheet
	    
	    Sheet MySheet2 = Create.getSheet("Sheet2");
	    
	    for (int I=0; I<=1; I++) // This is for outer loop (Row)
	    {
	    	for (int D=0; D<=2; D++) // This is for inner loop (Cell)
	    	{
	    		String Result = MySheet2.getRow(I).getCell(D).getStringCellValue();
	    		System.out.print(Result+" ");
	    	}
	    	
	    	System.out.println();
	    }
	    
	    

	}

}
