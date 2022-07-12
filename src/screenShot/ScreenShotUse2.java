package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotUse2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
        WD.get("https://www.facebook.com/");
        
		Thread.sleep(1000);
		
		File Source = ((TakesScreenshot)WD).getScreenshotAs(OutputType.FILE);
		
		String ST= RandomString.make(3); // For multiple screen shot we use this method
		
		File Destination= new File("D:\\Vibhzzyy\\Testing stuff\\Screenshot in selenium\\ScreenShot"+ST+".png");
		
		FileHandler.copy(Source, Destination);
		

	}

}
