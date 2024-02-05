package package_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OneTime_Wallet_page_POM_Class
{
	 private WebDriver driver;

	 
//	 wallet
	 @FindBy(xpath="//a[@id='payment-wallet-nav']")
	 WebElement wallet;
	 
	 public void Clickwallet()
	 {
		 wallet.click();
	 } 
	 
	 @FindBy(xpath="//button[@id='donate-wallet-contribute']")
	 WebElement Contributewallet;
	 
	 public void ClickContributewallet()
	 {
		 Contributewallet.click();
	 } 
	 

	 
	 
	 
	 
	 
	 
	 public OneTime_Wallet_page_POM_Class(WebDriver driver)
	 {
		 this.driver= driver;
		 PageFactory.initElements(driver, this);
	 }


}
