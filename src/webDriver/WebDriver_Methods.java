package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\91774\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// get keyword is use to enter URL in browser or to open an application 
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		// close keyword is use to close current tab of the browser opened by selenium tool
		
		driver.close();
		
		// quit keyword is use to close all the tab present in browser opened by selenium
		
		driver.quit();
		
		// maximize/minimize()- use to 

	}

}
