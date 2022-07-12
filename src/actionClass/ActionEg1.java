package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver WD=new ChromeDriver();
			WD.manage().window().maximize();
	        WD.get("https://demo.guru99.com/test/simple_context_menu.html");
	        
			Thread.sleep(1000);
			
			WebElement SelectButton = WD.findElement(By.linkText("Selenium"));
            
			//SelectButton.click();
			
			// How to click using Action class
			
			Actions ACT= new Actions(WD);
			
			// Using on the required action complete the process
			// 1.
			//
			ACT.moveToElement(SelectButton).perform();
			//ACT.click().perform();
			
			//2.
			ACT.moveToElement(SelectButton).click().build().perform();
			
			//3.
			
			ACT.click().moveToElement(SelectButton);
			
			// How to right click (Contextclick) using action class
			
			WebElement RightClick = WD.findElement(By.xpath("//span[text()='right click me']"));
			
			//1.
			ACT.moveToElement(RightClick).contextClick().build().perform();
			
			//2.
			//ACT.contextClick(RightClick).perform();
			
			
			// How to double click using action class
			
			WebElement DoubleClick = WD.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			
			//1.
			//ACT.moveToElement(DoubleClick).doubleClick().build().perform();
			
			//2.
			ACT.doubleClick(DoubleClick).perform();
			
			

	}

}
