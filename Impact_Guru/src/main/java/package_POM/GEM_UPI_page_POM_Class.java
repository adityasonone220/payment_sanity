package package_POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import package_Utility.UtilityClass;

public class GEM_UPI_page_POM_Class
{
	
	private WebDriver driver;
	
	@FindBy(xpath="//a[@id='sub-payment-upi-nav']")
	WebElement UPI;
	public void ClickOnUPI(){
		UPI.click();
	}
	
	@FindBy(xpath="//input[@id='upiSub']")
	WebElement UPIId;
	public void EnterUPIId() throws IOException{
		UPIId.sendKeys(UtilityClass.UPIid());
	}

	@FindBy(xpath="//button[@id='sub-donate-upi-contribute']")
	WebElement Contribute;
	public void ClickContribute() throws InterruptedException{
		Contribute.click();
		Thread.sleep(4000);
	}
		
	
	public GEM_UPI_page_POM_Class(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}	