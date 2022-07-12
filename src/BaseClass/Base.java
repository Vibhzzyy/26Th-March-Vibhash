package BaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Base 
{   protected WebDriver WD;
	public void OpenBrowser()
	{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WD=new ChromeDriver();
			WD.manage().window().maximize();
	        WD.get("https://kite.zerodha.com");
	        Reporter.log("Browser is launch", true);
	        WD.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	       
	}
	
	public static void CaptureSreenshot(WebDriver WD,String TCID) throws IOException
	{
        File Source = ((TakesScreenshot)WD).getScreenshotAs(OutputType.FILE);
		
		File destination= new File("D:\\Vibhzzyy\\Testing stuff\\Screenshot in selenium\\Screenshot"+TCID+".png");

		FileHandler.copy(Source, destination);
		
	}

}
