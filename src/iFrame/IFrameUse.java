package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameUse {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
        WD.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
        
		Thread.sleep(1000);
		
		// If there is a displaying webpage as a part of another webpage then we gonna use this method
		
		WD.switchTo().frame("iframeResult");
		
		WD.findElement(By.xpath("//button[@type='button']")).click();

	}

}
