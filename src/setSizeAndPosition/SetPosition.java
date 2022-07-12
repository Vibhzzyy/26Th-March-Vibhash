package setSizeAndPosition;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		//WD.manage().window().maximize();
        WD.get("https://www.facebook.com/");
        
		Thread.sleep(1000);
		
		// This will give position of your window in the form of X & Y coordinate
		System.out.println(WD.manage().window().getPosition()); 
		
		//To handle the position we need to create object of point class and pass X & Y coordinate
		
	    org.openqa.selenium.Point P= new org.openqa.selenium.Point(400, 50);
		
		// By using SetPosition we can get browse position
		
		WD.manage().window().setPosition(P);

	}

}
