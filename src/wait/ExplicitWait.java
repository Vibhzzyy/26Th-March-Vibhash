package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException 
	{
		            System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
					WebDriver WD=new ChromeDriver();
					WD.manage().window().maximize();
			        WD.get("https://vctcpune.com/");
			        
					//Thread.sleep(1000);
			        
			        WebDriverWait Wait= new WebDriverWait(WD, Duration.ofMillis(3000));
					
					WebElement Courses = WD.findElement(By.xpath("(//a[text()='Courses'])[1]"));
					
					Wait.until(ExpectedConditions.visibilityOf(Courses)); // This we use when the parameters are visible then it gonna perform the givin command
					                                                      // Without taking whole duration time
					Courses.click();
					

	}

}
