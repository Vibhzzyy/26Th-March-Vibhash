package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameEr2 {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
        WD.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        
		Thread.sleep(1000);
		
		// First we check the text in main frame

		String Text = WD.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		
		System.out.println(Text);
		Thread.sleep(1000);
		
		// Then we enter in first frame and write some text
		
		WD.switchTo().frame("frame1");
		WD.findElement(By.xpath("//input[1]")).sendKeys("Azkaban");
		
		// then we entered 2nd frame and click the checkbox.
		
		WD.switchTo().frame("frame3");
		WD.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		// By using default Frame we jump back to main frame
		
		WD.switchTo().defaultContent();
		
		// Then again we entered in the 2nd frame of main frame
		WD.switchTo().frame("frame2");
		 WebElement DropD = WD.findElement(By.className("col-lg-3"));
		 
		 // Here we are trying dropdown method
		 Thread.sleep(200);
		Select OP= new Select(DropD);
		OP.selectByValue("big baby cat");
		
		
	}

}
