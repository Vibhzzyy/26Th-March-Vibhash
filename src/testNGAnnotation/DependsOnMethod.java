package testNGAnnotation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
	 @Test
	  public void A() 
	  {
		  Reporter.log("Launching A",true); 
	  }
	  @Test(priority = -1,dependsOnMethods = "A")
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
		  Assert.fail();
	  }
	}
