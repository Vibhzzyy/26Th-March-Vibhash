package ListenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ListenerMethods implements ITestListener {
	
	// this is incomplete
	
  @Override
  public void onTestFailure(ITestResult result) 
  {
	  Reporter.log("Take screenshot", true);
  }
  
  @Override
  public void onTestSkipped(ITestResult result) 
  {
	  Reporter.log("This test is skipped", true);
  }
  
  @Override
  public void onTestSuccess(ITestResult result) 
  {
	  Reporter.log("This passed success", true);
  }
  
}
