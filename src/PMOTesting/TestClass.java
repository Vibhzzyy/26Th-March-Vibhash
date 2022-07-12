package PMOTesting;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {



	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		
		// By using Excel
		
				File Thefile= new File("D:\\Vibhzzyy\\Testing stuff\\ExcelTest\\ExcelTest26ThM.xlsx");
				
				 Sheet Mysheet = WorkbookFactory.create(Thefile).getSheet("Sheet2");
				
				 String USID = Mysheet.getRow(3).getCell(0).getStringCellValue();
				 
			     String PWD = Mysheet.getRow(3).getCell(1).getStringCellValue();
			     
			       String PIN = Mysheet.getRow(4).getCell(0).getStringCellValue();
				
				
			      
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
        WD.get("https://kite.zerodha.com");
        
		Thread.sleep(1000);

		//This object is created for login page
		KiteLoginPage Call= new KiteLoginPage(WD);
		
		Call.SendUserName(USID);
		Call.SendPassword(PWD);
		Call.ClickLoginButton();
		
		Thread.sleep(5000);

		//This object is created for pin number
		
		KitePinPage TK= new KitePinPage(WD);
		
		TK.SendPinNumber(PIN);
		TK.ClickContinueButton();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
