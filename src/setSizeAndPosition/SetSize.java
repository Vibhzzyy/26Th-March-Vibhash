package setSizeAndPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException 
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver WD=new ChromeDriver();
		  //WD.manage().window().maximize();
	        WD.get("https://www.facebook.com/");
	        
			Thread.sleep(1000);
			
			System.out.println(WD.manage().window().getSize());
			
			// To set size we need to create Dimension class and pass width and height
			
			Dimension D= new Dimension(1000, 500);
			
			WD.manage().window().setSize(D);

	}

}
