package PMOTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
	
	
	// 1. Data Members
	
	@FindBy (id = "userid") private WebElement UserName;
	@FindBy (id = "password") private WebElement Password;
	@FindBy (xpath = "//button[text()='Login ']") private WebElement Login;
	
	// 2. Constructor
	
	public KiteLoginPage(WebDriver WD)
	{
		PageFactory.initElements(WD,this);
	}
	
	// 3. Method
	
	public void SendUserName(String USID)
	{
		UserName.sendKeys(USID);
	}
	public void SendPassword(String PWD)
	{
		Password.sendKeys(PWD);
	}
	public void ClickLoginButton()
	{
		Login.click();
	}

}
