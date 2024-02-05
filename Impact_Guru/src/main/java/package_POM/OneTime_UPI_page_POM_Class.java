package package_POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import package_Utility.UtilityClass;

public class OneTime_UPI_page_POM_Class
{
	private WebDriver driver;
	
	@FindBy(xpath="//a[@id='payment-upi-nav']")
	WebElement UPI;
	public void clickUPI()
	{
		UPI.click();
	}
	
	@FindBy(xpath="//input[@id='upi']")
	WebElement UPIid;
	public void EnterUPIid() throws IOException
	{
		UPIid.sendKeys(UtilityClass.UPIid());
	}
	
	@FindBy(xpath="//button[@id='donate-upi-contribute']")
	WebElement contributeUPI;
	public void ClickContributeUPI()
	{
		contributeUPI.click();
	}
	
	@FindBy(xpath="//a[@id='otUpiCallbackCancelBtn']")
	WebElement CancelUPI;
	public void ClickCancelUPI()
	{
		CancelUPI.click();
	}
	
	
	
	




	public OneTime_UPI_page_POM_Class(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
}
