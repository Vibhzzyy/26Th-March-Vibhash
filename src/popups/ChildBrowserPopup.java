package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver WD=new ChromeDriver();
			WD.manage().window().maximize();
	        WD.get("https://skpatro.github.io/demo/links/");
	        
			Thread.sleep(1000);
			
			String MainPageID = WD.getWindowHandle(); // This method is for get main page ID
			System.out.println(MainPageID);
			System.out.println("=================================");
			
			// To open child window
			WD.findElement(By.name("NewWindow")).click();
			
			Thread.sleep(500);
			
			Set<String> AllPageID = WD.getWindowHandles();  // This method is for get multiple windows ID
			
			
			Iterator<String> IT = AllPageID.iterator();
			
			//while(IT.hasNext())
			//{
			//	System.out.println(IT.next());
			//}
			
			String MainPageID1=IT.next();    // This will return main page ID
			String ChildPageID = IT.next();  // This will return child page ID
			
			// Now to focus on child page ID
		    
			WD.switchTo().window(ChildPageID); // Now the focus is in child page ID
			
			WD.manage().window().maximize();
			Thread.sleep(1000);
			
			//WD.findElement(By.id("the7-search")).sendKeys("Selenium");
			WD.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
			
			WD.close();  // Will close only current window
			
			WD.switchTo().window(MainPageID1);
			
			WebElement MyElmt = WD.findElement(By.xpath("//p[text()='Click below to open link in new browser window']"));
			
			System.out.println(MyElmt.getText());

	}

}
