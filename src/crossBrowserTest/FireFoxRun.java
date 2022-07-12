package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxRun {
  @Test
  public void Run() 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\geckodriver.exe");
        WebDriver WD=new FirefoxDriver();
      
		WD.manage().window().maximize();
        WD.get("https://www.facebook.com/");
       
     
     
  }
}
