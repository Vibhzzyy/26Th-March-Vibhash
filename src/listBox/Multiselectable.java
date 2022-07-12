package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectable {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
        WD.get("https://demoqa.com/select-menu");
        
		Thread.sleep(1000);
		
		WebElement MultiSelectElement = WD.findElement(By.name("cars"));
		
		Select S= new Select(MultiSelectElement);
		
		// These command is use for select of Multi Select Element
		S.selectByValue("volvo");
		Thread.sleep(200);
		S.selectByVisibleText("Saab");
		Thread.sleep(200);
		S.selectByIndex(2);
		Thread.sleep(200);
		S.selectByValue("audi");
		
		// These command is use for Deselect of the element
		S.deselectAll();
	//  S.deselectByValue("audi");
	//	Thread.sleep(200);
	//  S.deselectByVisibleText(null);
	//	Thread.sleep(200);
	//  S.deselectByIndex(0);
		Thread.sleep(1000);
		//WebElement SelectOption = WD.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[2]"));
		WebElement SelectOption = WD.findElement(By.xpath("(//div[@class='mt-2 row'])[2]']"));
		
		Select SO= new Select(SelectOption);
		
		SO.selectByIndex(1);
		
		
		//WebElement Colours = WD.findElement(By.id("oldSelectMenu"));
		
	//	Select C= new Select(Colours);
		
		//C.selectByIndex(2);
		//C.selectByValue("4");
		// This command is use to select only the first option that you selected
	//	Thread.sleep(500);
		//System.out.println(SO.getFirstSelectedOption());
		
		// This command is use for select all option
		
		//S.getAllSelectedOptions();		
		
		

	}

}
