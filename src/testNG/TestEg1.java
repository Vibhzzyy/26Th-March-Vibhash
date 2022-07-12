package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestEg1 {
	 @Test
	  public void A() 
	  {
		  Reporter.log("Launching A",true); 
	  }
	  @Test
	  public void E()
	  {
		  Reporter.log("Launching E",true);
	  }
	  @Test 
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
