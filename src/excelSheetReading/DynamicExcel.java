package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DynamicExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File Thefile= new File("D:\\Vibhzzyy\\Testing stuff\\ExcelTest\\ExcelTest26ThM.xlsx");
		
		Sheet NewSheet = WorkbookFactory.create(Thefile).getSheet("Sheet3");
		
		int TotalNoOfRows = NewSheet.getLastRowNum(); // This will give total number of rows
		int RowCount = TotalNoOfRows;
		
		System.out.println("Total number of rows are "+RowCount); // Then we have to print this
		
		short TotalNoOfCells = NewSheet.getRow(TotalNoOfRows).getLastCellNum();// If we print this then it will give exact number of colums
		int CellCounts = TotalNoOfCells-1;// So for total number of cells we have to give (-1) for count
		System.out.println("Total number of cells are "+CellCounts);
		
		for (int I=0; I<=RowCount; I++)
		{
			for (int D=0; D<=CellCounts; D++)
			{
				 Cell CellValue = NewSheet.getRow(I).getCell(D);
				 CellType DataType = CellValue.getCellType();
				 if (DataType==CellType.STRING)
				 {
					 String Value = CellValue.getStringCellValue();
					 System.out.println(Value+"");
				 }
				 else if (DataType==CellType.NUMERIC)
				 {
					 double Value = CellValue.getNumericCellValue();
					 System.out.println(Value+"");
				 }
				 else if (DataType==CellType.BOOLEAN)
				 {
					 boolean Value = CellValue.getBooleanCellValue();
					 System.out.println(Value+"");
				 }
				 else if (DataType==CellType.BLANK)
				 {
				     System.out.print(" ");
				 }
				
			}
			System.out.println();
		}
		
		

		

	}

}
