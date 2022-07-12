package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	private static final String Break = null;

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		
		WD.get("https://www.google.co.in/");
		WD.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement Text = WD.findElement(By.xpath("//input[@type='text']"));
		
		Thread.sleep(500);
		Text.sendKeys("BMW 8 series");
		Thread.sleep(1000);
		
		List<WebElement> List = WD.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		Thread.sleep(1000);
		System.out.println(List.size());
		
		
		for(WebElement B:List)
		{
			System.out.println(B.getText());
			String ActualText = B.getText();
			String ExpectedText = "bmw 8 series";
			
			if(ActualText.equals(ExpectedText))
			{
				B.click();
				break;
			}

		}
		
		WD.findElement(By.linkText("Images")).click();
		
		java.util.List<WebElement> TagNum = WD.findElements(By.tagName("img"));
		
		System.out.println(TagNum.size());
		
		
		

	}

}
