package verificationUsingTestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
  @Test
  public void Soft() 
  {
	  String A="Velocity";
	  String B="Velociti";
	  
	  SoftAssert Soft= new SoftAssert();
	  
	  Soft.assertNotEquals(A, B,"A and B is equal so thestcase is failed");
	  Soft.assertNull(B,"This Notnull value");
	  
	  Soft.assertAll();
	  
	  
  }
}
