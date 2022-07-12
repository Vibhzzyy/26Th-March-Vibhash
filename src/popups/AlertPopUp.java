package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver WD=new ChromeDriver();
			WD.manage().window().maximize();
	        WD.get("https://demoqa.com/alerts");
	        
			Thread.sleep(1000);
			//WD.findElement(By.id("alertButton")).click();
			
			//Alert ALTA = WD.switchTo().alert();
			
			//System.out.println(ALTA.getText());
			
			//Thread.sleep(1000);
			//ALTA.accept(); // For accepting the Alert popup we need to use this command.
			
			WD.findElement(By.id("confirmButton")).click();
			
			Alert ALTD = WD.switchTo().alert();
			Thread.sleep(2000);
			ALTD.dismiss(); // For canceling the Alert Popup we need to use this command.
			
			
			

	}

}
