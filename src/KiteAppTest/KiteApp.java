package KiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteApp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
        WD.get("https://kite.zerodha.com");
        
		Thread.sleep(1000);
		
		WebElement UserID = WD.findElement(By.id("userid"));
		WebElement UserPassword = WD.findElement(By.id("password"));
		WebElement LoginButton = WD.findElement(By.xpath("//button[@type='submit']"));
		
		Thread.sleep(500);
		UserID.sendKeys("ELR321");
		UserPassword.sendKeys("Dhana1111");
		LoginButton.click();
		Thread.sleep(1000);
		
	    WebElement Pin = WD.findElement(By.id("pin"));
		WebElement SubmitButton = WD.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(500);
		Pin.sendKeys("982278");
		SubmitButton.click();
		
		Thread.sleep(2000);
		
		WebElement UserName = WD.findElement(By.xpath("//span[text()='ELR321']"));
		
		String ActualID = UserName.getText();
		String ExpectedUserID="ELR321";
		
		if (ActualID.equals(ExpectedUserID))
		{
			System.out.println("User ID is correct");
		}
		else
		{
			System.out.println("User ID is Incorrect");
		}
		
		UserName.click();
		Thread.sleep(500);
		
		WD.findElement(By.xpath("//a[@target='_self']")).click();
		
		
		WD.close();
		

	}

}
