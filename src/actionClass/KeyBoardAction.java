package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException 
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver WD=new ChromeDriver();
			WD.manage().window().maximize();
	        WD.get("https://vctcpune.com/selenium/practice.html");
	        
			Thread.sleep(2000);
			
			WebElement TextBox = WD.findElement(By.id("autocomplete"));
			//TextBox.sendKeys("Whaazupp");
			
			// How to send keys by using action class
			
			Actions ACT= new Actions(WD);
			
			ACT.sendKeys(TextBox,"Hello Everyone").perform();
			
			// How to handle dropDown using action class
			
			WebElement DropDown = WD.findElement(By.id("dropdown-class-example"));
			Thread.sleep(1000);
			
			// Using action class method handle dropdown
			
			ACT.click(DropDown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			

			ACT.click(DropDown).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).build().perform();
			
	}

}
