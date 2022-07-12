package BaseClass;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility 
{
	public static String ReadDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		File Thefile= new File("D:\\Vibhzzyy\\Testing stuff\\ExcelTest\\ExcelTest26ThM.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(Thefile).getSheet("Sheet2");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}

}
