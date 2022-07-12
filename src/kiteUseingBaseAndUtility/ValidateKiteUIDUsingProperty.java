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
import BaseClass.UtilityProp;

public class ValidateKiteUIDUsingProperty extends Base
{
	// This class is Using by Property
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
	  Login.SendUserName(UtilityProp.GetDataFromPropertyFile("UN"));
	  Login.SendPassword(UtilityProp.GetDataFromPropertyFile("PWD"));
	  Login.ClickLoginButton();
	  
	  WD.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  PIN.sendPin(UtilityProp.GetDataFromPropertyFile("PIN"));
	  PIN.clickOnContinueButton();
	  WD.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
  }
	
  @Test
  public void validateUSID() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(Home.getActualUsername(), UtilityProp.GetDataFromPropertyFile("UN"),"Actual and Expected are not matched testcase is failed");
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
