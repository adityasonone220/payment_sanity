package package_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OneTime_Net_Banking_POM_Class
{
	 private WebDriver driver;
	 
	 @FindBy(xpath="//a[@id='payment-netbanking-nav']")
	 WebElement Netbanking;
	 public void ClickNetBanking() {
		 Netbanking.click();
	 }
	 
	 
	 @FindBy(xpath="//button[@id='donate-netbanking-contribute']")
	 WebElement ContributeNetbanking;
	 public void Clickcontribute() {
		 ContributeNetbanking.click();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 public OneTime_Net_Banking_POM_Class(WebDriver driver) {
		 this.driver= driver;
		 PageFactory.initElements(driver, this);
	 }

}
