package testNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledTest {
	 @Test
	  public void A() 
	  {
		  Reporter.log("Launching A",true); 
	  }
	  @Test(priority = -1, enabled = false) // By using Enabled we can ignore the method
	  public void E()
	  {
		  Reporter.log("Launching E",true);
	  }
	  @Test (priority = -2)
	  public void H()
	  {
		  Reporter.log("Launching H",true);
	  }
	  @Test
	  public void N()
	  {
		  Reporter.log("Launching N",true);
	  }
	
}
