package ListenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerStudy.ListenerMethods.class)
public class ListenerTest1 {
  @Test
  public void TC5() 
  {
	  Reporter.log("TC5 is Running", true);
  }
  
  @Test
  public void TC6()
  {
	  Assert.fail();
	  Reporter.log("TC6 is Runnng", true);
  }
  
  @Test
  public void TC7()
  {
	  Reporter.log("TC7 is Running", true);
  }
}
