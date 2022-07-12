package verificationUsingTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void TC7() 
  {
	  // For fail the project
	  
	  {
		  Assert.fail();
		  Reporter.log("Assert fail check", true);
		  Assert.fail();
		  Reporter.log("TC7 is running", true);
		   }

  }
}
