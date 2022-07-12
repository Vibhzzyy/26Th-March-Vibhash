package KiteBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import KiteUtility.UtilityPropp;

public class BaseNeww 
{    

protected WebDriver WD;
public void OpenBrowser() throws IOException
{

	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WD=new ChromeDriver();
		WD.manage().window().maximize();
        WD.get(UtilityPropp.GetDataFromPropertyFile("URL"));
        Reporter.log("Browser is launch", true);
        WD.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      
}
}
