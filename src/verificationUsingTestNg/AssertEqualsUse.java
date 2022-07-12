package verificationUsingTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void Method() 
  {
	  
	  String A="Vibhash";
	  String B="Vibhass";
	  
	  // This is for Equal Use
	  
	//  Assert.assertEquals(A, B, "A and B is not matching TestCase failed");
	//  Reporter.log("A and B is matching TestCase is passed", true);
	  
	  // This is for Not Equal use
	  
	  Assert.assertNotEquals(A, B,"A and B is Equal TestCase is failed");
	  Reporter.log("A and B is not Equal TestCase is passed", true);
  }
}
