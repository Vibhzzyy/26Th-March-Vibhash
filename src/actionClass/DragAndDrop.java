package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver WD=new ChromeDriver();
			WD.manage().window().maximize();
	        WD.get("https://demo.guru99.com/test/drag_drop.html");
	        
			Thread.sleep(1000);
			// This is how we find source & destination
			
			WebElement Source = WD.findElement(By.xpath("//a[text()=' 5000']"));
			
			WebElement Destination = WD.findElement(By.id("amt8"));
			
			// How to drag & drop using action
			// First we need to create the class of action
			
			Actions ACT= new Actions(WD);
			
			// By using action class method perform desired action
			
			// 1.
			//ACT.moveToElement(Source).clickAndHold().moveToElement(Destination).release().build().perform();
			
			//2.
			ACT.dragAndDrop(Source, Destination).perform();
			
		
			
	}

}
