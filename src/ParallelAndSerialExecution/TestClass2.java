package ParallelAndSerialExecution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestClass2 {
  @Test
  public void Method() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		RemoteWebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
        WD.get("https://www.asus.com/in/");
      
		
	  
  }
}
