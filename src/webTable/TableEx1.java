package webTable;

import java.util.Iterator;
import java.util.List;

import org.apache.poi.hslf.blip.Metafile.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEx1 {

	

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91774\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
        WD.get("https://vctcpune.com/selenium/practice.html");
        
		Thread.sleep(1000);
		
		// How to handle ROWS in table
		
		List<WebElement> rows = WD.findElements(By.xpath("//table//tr"));
		
		int TotalNoOfRows = rows.size();	
		
		System.out.println("Total No. of ROWS in the table is "+TotalNoOfRows);
		
		// How to find total no. of columns
		
		List<WebElement> columns = WD.findElements(By.xpath("//table//th"));
		
		int TotalNoOfColumns = columns.size();
		
		System.out.println("Total No. of columns in the table is "+TotalNoOfColumns);
		
		// How to read header
		
		for (WebElement Header:columns)
		{
			System.out.println(Header.getText());
		}
		
		// How to read rows from the table
		
//		for (WebElement RW:rows)
//		{
//			System.out.println(RW.getText());
//		}
		
		List<WebElement> AllTheROWS = WD.findElements(By.xpath("//table//tr"));
		
		Iterator<WebElement> RO = AllTheROWS.iterator();
		
		while (RO.hasNext())
		{
			System.out.println(RO.next().getText()+"");
			System.out.println();
		}
		
		
		

	}

}
