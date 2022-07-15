package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
        WD.get("https://www.facebook.com/");
        
		Thread.sleep(1000);
		
		WD.findElement(By.xpath("(//a[@role='button'])[3]")).click();
		
		
		Thread.sleep(3000);
		
		WebElement Day = WD.findElement(By.id("day"));
		Select D=new Select(Day);
		D.selectByValue("20");
		//D.selectByIndex(19);
		//D.selectByVisibleText("20");
		
		WebElement Month = WD.findElement(By.id("month"));
		Select M=new Select(Month);
		//M.selectByValue("4");
		
		M.selectByIndex(3);
		//M.selectByVisibleText("Apr");
		
		
		WebElement Year = WD.findElement(By.id("year"));
		Select Y=new Select(Year);
		//Y.selectByValue("1995");
		Y.selectByVisibleText("1995");
		
		System.out.println("Loud is not strong");
		

	}

}
