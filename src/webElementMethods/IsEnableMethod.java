package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1000);
		
		WebElement GetOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		System.out.println(GetOTPButton.isEnabled());
		
		driver.findElement(By.id("mobileNumber")).sendKeys("7777777777");
		
		Thread.sleep(2000);
		System.out.println(GetOTPButton.isEnabled());
		GetOTPButton.click();

	}

}
