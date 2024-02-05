package package_POM;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import package_Utility.UtilityClass;

public class GEM_Card_page_POM_Class {

	private WebDriver driver;

	@FindBy(xpath = "//a[@id='sub-payment-card-nav']")
	WebElement Card;
	public void ClickOnCard() {
		Card.click();
	}

	@FindBy(xpath = "//input[@id='cardNumberSub']")
	WebElement CardNo;
	public void EnterCardNo() throws IOException {
		CardNo.sendKeys("4346584915009383");
	}

	@FindBy(xpath = "//input[@id='expiryDateSub']")
	WebElement ExpiryDate;
	public void EnterExpiryDate() {
		ExpiryDate.sendKeys("624");
	}

	@FindBy(xpath = "//input[@id='cvvNumberSub']")
	WebElement CVV;
	public void EnterCVV() throws InterruptedException {
		CVV.sendKeys("111");
		Thread.sleep(4000);
	}
	                 
	@FindBy(xpath = "//button[@id='donate-card-contribute-sub']")
	WebElement Contribute;   
	@FindBy(xpath = "//button[@id='submit-action']")
	WebElement SecureAndContinue;
	public void ClickContributeCard() throws InterruptedException {
//		Method 2
		String parentHandle = driver.getWindowHandle();
		System.out.println("parent handle- "+parentHandle);
		Contribute.click();
		Thread.sleep(5000);
		List<String> Handles = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("handle saved- "+ Handles.size());
		Thread.sleep(5000);
		driver.switchTo().window(Handles.get(1));
		driver.manage().window().maximize();
	}


	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();;
	}

	
	
	public GEM_Card_page_POM_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
