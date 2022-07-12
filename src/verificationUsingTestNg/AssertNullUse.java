package verificationUsingTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUse {
  @Test
  public void Method() 
  {
	  
	  String A="HHH";
	  String B= null;
	  
	//  Assert.assertNull(A,"A is Not null so the TestCase is failed");
	//  Reporter.log("A is null value so the TestCase is passed", true);
	  
	 
	  
	  Assert.assertNotNull(B, "B is null value so the TestCase is failed");
	  Reporter.log("B is NotNull so the TestCase is passed", true);
  }
}
