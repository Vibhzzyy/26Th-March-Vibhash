package kitePOMUsingTestNG;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAppUserName 
{
	WebDriver WD;
	Sheet MySheet;
	KitePageLogin Login;
	KitePinPage Pin;
	KiteHomePage Home;
	
	@BeforeClass
	public void LaunchBrowser() throws EncryptedDocumentException, IOException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WD=new ChromeDriver();
			WD.manage().window().maximize();
	        WD.get("https://kite.zerodha.com");
	        
			Reporter.log("LaunchBrowser",true);
			WD.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			File Thefile= new File("D:\\Vibhzzyy\\Testing stuff\\ExcelTest\\ExcelTest26ThM.xlsx");
			MySheet = WorkbookFactory.create(Thefile).getSheet("Sheet2");
			
			Login= new KitePageLogin(WD);
			Pin= new KitePinPage(WD);
			Home= new KiteHomePage(WD);

	}
	
	@BeforeMethod
	public void LoginToKite() 
	{
		String UN = MySheet.getRow(3).getCell(0).getStringCellValue();
		String PWD = MySheet.getRow(3).getCell(1).getStringCellValue();
		String PIN = MySheet.getRow(4).getCell(0).getStringCellValue();
		
		Login.SendUserName(UN);
		Reporter.log("Sending Username",true);
		Login.SendPassword(PWD);
		Reporter.log("Sending Password",true);
		Login.ClickLoginButton();
		Reporter.log("Click On Login Button",true);
		
		Pin.sendPin(PIN);
		Reporter.log("Sending Pin",true);
		Pin.clickOnContinueButton();
		Reporter.log("Clicking on countinue button");
	}
	
	
  @Test
  public void  validateUserName() 
  {
    	String expectedUN = MySheet.getRow(3).getCell(0).getStringCellValue();
	    String actualUN = Home.getActualUsername();
	    Reporter.log("Validating Username",true);
	    Assert.assertEquals(actualUN, expectedUN,"Actual and Expected username is not matching tasecase is failed");
	    Reporter.log("Actual and Expected username is matching tasecase is passed");
	    
  }
  
  @AfterMethod
  public void LogoutFromKiteApp() throws InterruptedException
  {
	  Home.LogOut();
	  Reporter.log("Logging out..",true);
  }
  
  @AfterClass
  public void CloseBrowser() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Reporter.log("Closing Browser");
	  WD.close();
	  
  }
}
