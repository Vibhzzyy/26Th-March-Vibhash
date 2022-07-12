package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseNew 
{    static public WebDriver WD;

public void openBrowser()
{

	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WD=new ChromeDriver();
		WD.manage().window().maximize();
        WD.get("https://kite.zerodha.com");
        Reporter.log("Browser is launch", true);
        WD.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      
}
}
