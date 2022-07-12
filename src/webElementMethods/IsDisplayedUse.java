package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
		WD.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		WebElement Hide = WD.findElement(By.id("hide-textbox"));
		WebElement Show = WD.findElement(By.id("show-textbox"));
		WebElement Textbox = WD.findElement(By.id("displayed-text"));
		
		//if(Textbox.isDisplayed())
		//{
			//System.out.println("SO textbox is displayed");
		//}
		//else
		//{
			//System.out.println("Can't find textbox");
		//}
		Hide.click();
		
		if(Textbox.isDisplayed())
		{
			System.out.println("I found textbox");
		}
		else
		{
			System.out.println("Still can't find textbox");
		}

	}

}
