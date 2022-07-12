package kiteUseingBaseAndUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{
	// Data Member
	
	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']") private WebElement countinueButton;
	
	
	// Constructor
	
	public KitePinPage(WebDriver WD)
	{
		PageFactory.initElements(WD, this);
	}
	
	// Method
	
	public void sendPin(String pin)
	{
		PIN.sendKeys(pin);
	}
	
	public void clickOnContinueButton()
	{
		countinueButton.click();
	}
	
	

}
