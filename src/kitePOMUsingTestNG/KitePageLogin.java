package kitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePageLogin 
{
	//Data Member
	
	@FindBy(id = "userid") private WebElement UserName;
	@FindBy(id ="password") private WebElement PassWord;
	@FindBy(xpath ="//button[@type='submit']") private WebElement LoginButton;
	
	// Constructor
	
	public KitePageLogin(WebDriver WD)
	{
		PageFactory.initElements(WD, this);
	}
	
	// Method
	
	public void SendUserName(String userName)
	{
		UserName.sendKeys(userName);
	}
	
	public void SendPassword(String password)
	{
		PassWord.sendKeys(password);
	}
	
	public void ClickLoginButton()
	{
		LoginButton.click();
	}
	
	

}
