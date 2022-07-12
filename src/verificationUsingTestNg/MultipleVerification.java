package verificationUsingTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification {
  @Test
  public void Method() 
  {
	  
	  String A= "Nagpur";
	  String B= "Nagpur";
	  
	  // In this we are going to check multiple methods (Hard assert)
	  
	  Assert.assertEquals(A, B,"A and B is NotEqual so the TestCase is failed");
	  
	  
	 
	  Assert.assertNotEquals(B, A,"A and B is Equal So the TestCase is failed");
	  
	  
	  
	
  }
}
