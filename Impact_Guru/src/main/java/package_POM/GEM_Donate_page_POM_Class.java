package package_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GEM_Donate_page_POM_Class {

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

	@FindBy(xpath = "(//div[@class='so-tab'])[1]")
	WebElement GiveMonthly;
	public void ClickGiveMonthly() {
		GiveMonthly.click();
	}

	@FindBy(xpath = "//input[@id='subscribe_popup_donation_amount']")
	WebElement Amount;
	public void EnterAmount(){
		Amount.clear();
		Amount.sendKeys("100");
	}

	@FindBy(xpath = "//input[@id='sub_full_name']")
	WebElement Name;
	public void EnterName() {
		Name.sendKeys("Donation Team");
	}

	@FindBy(xpath = "//input[@id='sub_email_receipt']")
	WebElement Email;
	public void EnterEmail() throws InterruptedException {
		Email.sendKeys("donationteam101@gmail.com");
	}

	@FindBy(xpath = "//input[@id='sub_mobile']")
	WebElement Mobile;
	public void EnterMobile() {
		Mobile.sendKeys("9999999999");
	}

	@FindBy(xpath = "//input[@id='sub_city_text']")
	WebElement BillingCity;
	public void EnterCity() {
		BillingCity.sendKeys("Mumbai");
	}

	@FindBy(xpath = "(//label[@class='radio-label d-flex align-items-center'])[3]")
	WebElement RadioButton;
	public void ClickRadioButton(){
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RadioButton);
		RadioButton.click();
	}

	@FindBy(xpath = "//button[@id='subscribe-popup-donate-button']")
	WebElement DonateButton;
	public void ClickDonateButton() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", DonateButton);
		DonateButton.click();
	}

	
//	 Foreign Card Payment
	@FindBy(xpath = "//select[@id='sub_donate_modal_currency_dropdown']")
	WebElement currency;
	public void selectCurrency() {
		currency.click();
		Select USD = new Select(currency);
		USD.selectByIndex(1);
	}

	@FindBy(xpath = "(//label[@class='radio-label d-flex align-items-center'])[4]")
	WebElement RadioButton1;
	public void ClickRadioButtonNO() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RadioButton1);
		RadioButton1.click();
	}
	
	@FindBy(xpath = "//input[@id='subscribe_popup_donation_amount']")
	WebElement AmountForUSD;
	public void EnterAmountForUSD(){
		Amount.clear();
		Amount.sendKeys("10");
	}

	
	public GEM_Donate_page_POM_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
