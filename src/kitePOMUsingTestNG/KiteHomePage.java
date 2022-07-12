package kitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	
	// Data Member
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userName;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogoutButton;
	
	
	// Constructor
	
	public KiteHomePage(WebDriver WD)
	{
		PageFactory.initElements(WD, this);
	}
	
	// Method
	
	public void validateUserName(String ExpectedUsernameID)
	{
		String expectedUserName = ExpectedUsernameID;
		
		String actualUserName = userName.getText();
		
		if(expectedUserName.equals(actualUserName))
		{
			System.out.println("Actual and Expected UserName is Matched TestCase is passed");
		}
		
		else
		{
			System.out.println("Actual and Expected UserName is not Matched TestCase is failed");
		}
		
	}
	
	// To get actual UserName
	
	public String getActualUsername()
	{
		String actualUserName = userName.getText();
		return actualUserName;
	}
	
	public void LogOut() throws InterruptedException
	{
	  userName.click();
	  Thread.sleep(300);
	  LogoutButton.click();
		
		
	}

}
