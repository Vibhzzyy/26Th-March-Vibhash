package wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
         public static void main(String[] args) throws InterruptedException 
         {
        	 
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver WD=new ChromeDriver();
			WD.manage().window().maximize();
	        WD.get("https://www.facebook.com/");
	        
			Thread.sleep(1000); // Thus is the normal way that we used before to slow down selenium
			
			// In Implicit wait we are gonna use this method
			
			WD.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			WD.close();

	}

}
