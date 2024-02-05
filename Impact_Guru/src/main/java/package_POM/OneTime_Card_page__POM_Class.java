package package_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OneTime_Card_page__POM_Class
{
	private WebDriver driver;
	
//	Card_Payment    
	 @FindBy(xpath="//input[@id='cardNumber']")
	 WebElement cardNo;
	 public void EnterCardNo()
	 {
		 cardNo.sendKeys("4346584915009383");
	 }
	 
	 @FindBy(xpath="//input[@id='expiryDate']")
	 WebElement Expiry;
	 public void EnterExpiryDate()
	 {
		 Expiry.sendKeys("624");
	 }
	 
	 @FindBy(xpath="//input[@id='cvvNumber']")
	 WebElement CVV;
	 
		public void EnterCVV()
	 {
		 CVV.sendKeys("111");
	 }
	 
	 
	 @FindBy(xpath="//button[@id='donate-card-contribute']")
	 WebElement Contribute;
	 
	 public void ClickContributeCard()
	 {
		 Contribute.click();
	 } 

	 
	 
	 
	 
	 
	 
	 
	 public OneTime_Card_page__POM_Class(WebDriver driver)
	 {
		 this.driver= driver;
		 PageFactory.initElements(driver, this);
	 }

}
