package package_POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OneTime_Donate_page_POM_Class {

	private WebDriver driver;

	@FindBy(xpath = "(//a[@id='donateLink'])[2]")
	WebElement Help;
	public void HelpClick() {
		Help.click();
	}

	@FindBy(xpath = "//a[@id='cmp-nfr-top-side-donate ']")
	WebElement DonateButton1;
	public void DonateNow() {
		DonateButton1.click();
	}

	
	@FindBy(xpath = "//input[@id='story_popup_donation_amount']")
	WebElement Amount;
	public void EnterAmount() {
		Amount.clear();
		Amount.sendKeys("250");
	}

	@FindBy(xpath = "//input[@id='full_name']")
	WebElement Name;
	public void EnterName() {
		Name.sendKeys("Donation Team");
	}

	@FindBy(xpath = "//input[@id='email_receipt']")
	WebElement Email;
	public void EnterEmail() {
		Email.sendKeys("donationteam101@gmail.com");
	}

	@FindBy(xpath = "//input[@id='mobile']")
	WebElement Mobile;
	public void EnterMobile() {
		Mobile.sendKeys("9999999999");
	}

	@FindBy(xpath = "(//label[@class='radio-label d-flex align-items-center'])[1]")
	WebElement RadioButton;
	public void ClickRadioButton() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RadioButton);
		RadioButton.click();
	}

	@FindBy(xpath = "//button[@id='story-popup-donate-button']")
	WebElement DonoteNow;
	public void DonoteNow() {
		DonoteNow.click();
		
	}

//	 Foreign Card Payment
	@FindBy(xpath = "//select[@id='donate_modal_currency_dropdown']")
	WebElement currency;
	public void selectCurrency() {
		currency.click();
		Select USD = new Select(currency);
		USD.selectByIndex(1);
	}

	@FindBy(xpath = "(//label[@class='radio-label d-flex align-items-center'])[2]")
	WebElement RadioButton1;
	public void ClickRadioButtonNO() {
		RadioButton.click();
	}

	@FindBy(xpath = "//input[@id='subscribe_popup_donation_amount']")
	WebElement AmountForUSD;
	public void EnterAmountForUSD(){
		Amount.clear();
		Amount.sendKeys("10");
	}
	
	
	
	
	public OneTime_Donate_page_POM_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
