package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicFlipkartReview {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		
		WD.get("https://www.flipkart.com/");
		WD.manage().window().maximize();
		Thread.sleep(1000);
		
		WD.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WD.findElement(By.name("q")).sendKeys("Asus ROG 5s");
		Thread.sleep(500);
		
		WD.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(500);
		
		WebElement Review = WD.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
		
		System.out.println(Review.getText());
		
		WD.close();

	}

}
