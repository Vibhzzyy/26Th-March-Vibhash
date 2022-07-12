package testNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
	 @Test
	  public void A() 
	  {
		  Reporter.log("Launching A",true); 
	  }
	  @Test(priority = -1,timeOut = 500)
	  public void E() throws InterruptedException
	  {
		  Reporter.log("Launching E",true);
		  Thread.sleep(1000);
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
