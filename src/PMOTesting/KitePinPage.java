package PMOTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{
	@FindBy (id = "pin") private WebElement PinNumber;
	@FindBy (xpath = "//button[@type='submit']") private WebElement Continue;
	
	public KitePinPage(WebDriver WD)
	{
		PageFactory.initElements(WD,this);
	}
	
	public void SendPinNumber(String pIN)
	{
		PinNumber.sendKeys(pIN);
	}
	
	public void ClickContinueButton()
	{
		Continue.click();
	}

	 

}
