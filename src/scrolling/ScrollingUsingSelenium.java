package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUsingSelenium {

	public static void main(String[] args) throws InterruptedException 
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver WD=new ChromeDriver();
			WD.manage().window().maximize();
	        WD.get("https://vctcpune.com/courses/");
	        
			Thread.sleep(1000);
			
			// Implicit Wait
			
			WD.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			
			JavascriptExecutor J = (JavascriptExecutor)WD;
			
			
			J.executeScript("window.scrollBy(100,3000)");
			
			

	}

}
