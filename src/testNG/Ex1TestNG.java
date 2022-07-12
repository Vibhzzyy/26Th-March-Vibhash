package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex1TestNG {
  @Test
  public void Test1() throws InterruptedException 
  {
	  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
        WD.get("https://www.facebook.com/");
      
		Thread.sleep(1000);
		
		Reporter.log("YOLO (You only live once)",true);
		System.out.println("Die till i try");
  }
}
