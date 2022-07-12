package KiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityPropp 
{
//	
//	public static void CaptureSreenshot(WebDriver WD,String TCID) throws IOException
//	{
//        File Source = ((TakesScreenshot)WD).getScreenshotAs(OutputType.FILE);
//		
//		File destination= new File("D:\\Vibhzzyy\\Testing stuff\\Screenshot in selenium\\Screenshot"+TCID+".png");
//
//		FileHandler.copy(Source, destination);
//		
//	}
	
	public static String GetDataFromPropertyFile(String Key) throws IOException
	{
		Properties Prop= new Properties();
		FileInputStream Myfile= new FileInputStream("C:\\Users\\91774\\eclipse-workspace\\Selenium\\MyProperties");
		Prop.load(Myfile);
		String Value = Prop.getProperty(Key);
		return Value;
	}

}
