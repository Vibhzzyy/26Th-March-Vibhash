package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUse {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver WD=new ChromeDriver();
			WD.manage().window().maximize();
			WD.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(1000);
			
			WebElement CheckBox1 = WD.findElement(By.name("checkBoxOption2"));
			// CheckBox1.click();
			 
			 if(CheckBox1.isSelected())
			 {
				 System.out.println("Checkbox is already selected");
			 }
			 else
			 {
				 CheckBox1.click();
				 System.out.println("Checkbox is now selected");
			 }

	}

}
