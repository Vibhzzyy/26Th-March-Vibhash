package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		
		WD.get("https://vctcpune.com/selenium/practice.html");
	
		WD.findElement(By.xpath("//input[@type='radio']")).click();
		
		WD.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hello its vibhash");
		
		// Xpath by text()
		
		//WD.findElement(By.xpath("//h1[text()=' header1 font-weight-bold text-white text-center']")); // Xpath Text
		
		// Xpath by contains()
		
		//WD.findElement(By.xpath("//h1[contains(text(),'Welcome To ')]")); //Contains by text method
		
		//WD.findElement(By.xpath("//div[contains(@class,' extradiv col-lg-4 col-md-4')]")); // Contains Attribute 
		
		// Xpath by index
		
		//WD.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		

	}

}
