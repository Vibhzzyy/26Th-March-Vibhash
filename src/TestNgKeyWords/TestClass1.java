package TestNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {
  @Test
  public void A() 
  {
	  Reporter.log("Checking A", true);
  }
  
  @Test (groups = {"END"})
  public void B()
  {
	  Reporter.log("Checking B", true);
  }
  
  @Test (groups = {"START"})
  public void C()
  {
	  Reporter.log("Checking C", true);
  }
  
  @Test (groups = {"START"})
  public void D()
  {
	  Reporter.log("Checking D", true);
  }
}
