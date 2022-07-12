package TestNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {
  @Test (groups = {"END"})
  public void W() 
  {
	  Reporter.log("Checking W", true);
  }
  
  @Test (groups = {"START"})
  public void X()
  {
	  Reporter.log("Checking X", true);
  }
  
  @Test (groups = {"END"})
  public void Y()
  {
	  Reporter.log("Checking Y", true);
  }
  
  @Test (groups = {"START"})
  public void Z()
  {
	  Reporter.log("Checking Z", true);
  }
}
