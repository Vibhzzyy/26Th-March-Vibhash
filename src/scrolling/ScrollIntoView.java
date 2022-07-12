package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException 
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver WD=new ChromeDriver();
			WD.manage().window().maximize();
	        WD.get("https://vctcpune.com/courses/");
	        
			Thread.sleep(1000);
			WD.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			
			
			WebElement Text = WD.findElement(By.xpath("(//div[@class='et_pb_text_inner'])[6]"));
			
			JavascriptExecutor J = (JavascriptExecutor)WD;
			
			J.executeScript("arguments[0].scrollIntoView(true)",Text);
			


	}

}
