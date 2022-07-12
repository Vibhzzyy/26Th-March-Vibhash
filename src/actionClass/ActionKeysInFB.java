package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeysInFB {

	public static void main(String[] args) throws InterruptedException 
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver WD=new ChromeDriver();
			WD.manage().window().maximize();
	        WD.get("https://www.facebook.com/");
	        
			Thread.sleep(1000);
			
			WD.findElement(By.linkText("Create New Account")).click();
			Thread.sleep(500);
			
			WebElement Day = WD.findElement(By.id("day"));
			WebElement Month = WD.findElement(By.id("month"));
			WebElement Year = WD.findElement(By.id("year"));
			
			Actions ACT= new Actions(WD);
			
			ACT.click(Day).perform();
			
			for (int I=1; I<=4; I++) // If you want to select any DOB (EX: if todays date is 16 & your DOB is 20 so you have to click arrow key 4 times)
			{
				ACT.sendKeys(Keys.ARROW_DOWN).perform();
				Thread.sleep(500);
			}
			ACT.sendKeys(Keys.ENTER).perform();
			
			ACT.click(Month).perform();
			
			for (int Y=1; Y<=2; Y++)
			{
				ACT.sendKeys(Keys.ARROW_UP).perform();
				Thread.sleep(500);
			}
			ACT.sendKeys(Keys.ENTER).perform();
			
			ACT.click(Year).perform();
			
			for (int Z=1; Z<=26; Z++)
			{
				ACT.sendKeys(Keys.ARROW_DOWN).perform();
				Thread.sleep(500);
			}
			ACT.sendKeys(Keys.ENTER).perform();
			
			

	}

}
