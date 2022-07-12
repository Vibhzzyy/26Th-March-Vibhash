package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse 
{

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(2000);
			
			// Method 1st.
			
			driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
			
			// Method 2nd.
			
			String text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
			
			System.out.println(text);
			
			// Method 3rd.
			
			WebElement elements = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
			
			System.out.println(elements);
			
			
			

	}

}
