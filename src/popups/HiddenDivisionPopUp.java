package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
        WD.get("https://www.flipkart.com/");
        
		Thread.sleep(1000);
		
		WD.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(1000);
		WD.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone 13 pro");
		
		Thread.sleep(1000);
		WD.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

	}

}
