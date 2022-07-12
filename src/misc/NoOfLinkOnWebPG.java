package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinkOnWebPG {

	

	public static void main(String[] args) throws InterruptedException 
	{
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		
		WD.get("https://vctcpune.com/selenium/practice.html");
		WD.manage().window().maximize();
		Thread.sleep(1000);
		
		List<WebElement> Links = WD.findElements(By.tagName("a"));
		
		System.out.println(Links.size());
		
		Iterator<WebElement> LS = Links.iterator();
		while(LS.hasNext())
		{
			System.out.println(LS.next());
		}
		
		
		
		

	}

}
