package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowserUse {
	
  @Parameters("BrowserName")
  @Test
  public void CrossB(String Name) throws InterruptedException 
  {
	  WebDriver WD= null;
	  
	  
	  
	  
	  if(Name.equals("firefox"))
	  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\geckodriver.exe");
      
	     WD=new FirefoxDriver();
       
	  }
	  
	  else if(Name.equals("chrome"))
	  {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		 WD=new ChromeDriver();
		
	  }  
	  
	  
	      WD.manage().window().maximize();
          WD.get("https://www.facebook.com/");
          Thread.sleep(2000);
     
  }
}
