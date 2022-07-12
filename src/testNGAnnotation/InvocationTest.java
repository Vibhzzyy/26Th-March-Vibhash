package testNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationTest {
	 @Test (invocationCount = 2)  // By using Invocation we can run Test multiple times
	  public void FB() 
	  {
		  Reporter.log("FB home page",true);
	  }
	  @BeforeClass
	  public void URL()
	  {
		  Reporter.log("URL is launch",true);
	  }
	  @BeforeMethod
	  public void LogIn()
	  {
		  Reporter.log("Entering Uusername and password",true);
	  }
	  @AfterClass
	  public void ShutDown()
	  {
		  Reporter.log("User has closs the tab",true);
	  }
	  @AfterMethod
	  public void LogOut()
	  {
		  Reporter.log("User has logout from the FB",true);
	  }
	
}
