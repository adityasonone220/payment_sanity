package package_POM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GEM_Net_Banking_POM_Class {
	private WebDriver driver;

	@FindBy(xpath = "//select[@id='netbanking_payment_code']")
	WebElement BankSelecation;

	public void ClickBankSelection() {
		BankSelecation.click();
		Select Bank = new Select(BankSelecation);
		Bank.selectByValue("IG_RP_MAHB");
	}

	@FindBy(xpath = "//input[@id='sub_acc_number']")
	WebElement AccountNo;

	public void EnterAccountNo() {
		AccountNo.sendKeys("25003667416");
	}

	@FindBy(xpath = "//input[@id='sub_ifsc']")
	WebElement IFSCCode;

	public void EnterIFSCCode() {
		IFSCCode.sendKeys("MAHB0001170");
	}

	@FindBy(xpath = "//button[@id='sub-donate-netbanking-contribute']")
	WebElement Contribute;

	public void ClickContribute() {
		Contribute.click();
	}

	@FindBy(xpath = "//div[@class='redesign-v15-cta-wrapper svelte-1milfy7']")
	WebElement Authenticate;
	public void ClickAuthenticate() throws InterruptedException {
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
		driver.switchTo().frame(iframe);
		WebElement form = driver.findElement(By.id("form"));
		WebElement close = form.findElement(By.xpath("/html//form/div[4]/div/button"));
		System.out.println("focuse moved to iframe");
		WebElement form1 = driver.findElement(By.id("//div[@class='rtb-expanded-wrapper svelte-1ngfbr8 light-bg']"));
		form1.click();
		System.out.println("123");
//		JavascriptExecutor js = (JavascriptExecutor)driver;  
//		js.executeScript("arguments[0].click();", Authenticate);
//		Authenticate.click();
		System.out.println("clicked");
	}

	@FindBy(xpath = "//button[@id='submit-btn']")
	WebElement Proceed;

	public void ClickProceed() {
		Proceed.click();
	}

	public GEM_Net_Banking_POM_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
