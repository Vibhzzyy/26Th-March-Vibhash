package kiteUseingBaseAndUtility;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.Base;
import BaseClass.Utility;

public class ValidateKiteUID extends Base
{
	KitePageLogin Login;
	KitePinPage PIN;
	KiteHomePage Home;
	
  @BeforeClass
  public void Launch() 
  {
	  OpenBrowser();
	  Login= new KitePageLogin(WD);
	  PIN= new KitePinPage(WD);
	  Home= new KiteHomePage(WD);
  }
  
  @BeforeMethod
  public void LogkitApp() throws EncryptedDocumentException, IOException
  {
	  Login.SendUserName(Utility.ReadDataFromExcel(3, 0));
	  Login.SendPassword(Utility.ReadDataFromExcel(3, 1));
	  Login.ClickLoginButton();
	  
	  WD.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  PIN.sendPin(Utility.ReadDataFromExcel(4, 0));
	  PIN.clickOnContinueButton();
	  WD.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
  }
	
  @Test
  public void validateUSID() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(Home.getActualUsername(), Utility.ReadDataFromExcel(3, 0),"Actual and Expected are not matched testcase is failed");
	  Reporter.log("Actual and Expected is matching testcase is passed", true);
  }
  
  @AfterMethod
  public void LogoutKiteApp() throws InterruptedException
  {
	  Home.LogOut();
  }
  
  @AfterClass
  public void CloseApp()
  {
	  WD.close();
  }
}
