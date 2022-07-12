package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameEr1 {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
        WD.get("https://skpatro.github.io/demo/iframes/");
        
		Thread.sleep(1000);
		
		WebElement Text = WD.findElement(By.xpath("//a[text()='Pavilion']"));
		System.out.println(Text.getText());
		
		// To switch from main page to frame 1 we use switch method
		WD.switchTo().frame("Frame1");
		
		Thread.sleep(1000);
		
		WebElement FText = WD.findElement(By.xpath("//p[@id='frametext']"));
		//WD.findElement(By.id("frametext")); // You can also write this by id
		System.out.println(FText.getText());
		
		Thread.sleep(1000);
		
		// To focus on main page from frame1 we going to use parent frame
		WD.switchTo().parentFrame();
		
		WebElement BText = WD.findElement(By.xpath("//a[text()='Blogger']"));
		System.out.println(BText.getText());
		
		WD.switchTo().frame("Frame2"); // Switching from main page to frame 2
		
		Thread.sleep(1000);
		
		WebElement CText = WD.findElement(By.xpath("//a[text()='Category3']"));
		System.out.println(CText.getText());
		
		// By using defaultContent we going to switch to main page
		WD.switchTo().defaultContent();

	}

}
