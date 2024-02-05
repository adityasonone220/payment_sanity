package package_Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import package_POM.OneTime_Card_page__POM_Class;
import package_POM.OneTime_Donate_page_POM_Class;


public class OneTime_Card_payment extends Test_Base_Class
{
	@Test
	public void cardTest() throws InterruptedException 
	{
		OneTime_Donate_page_POM_Class pay = new OneTime_Donate_page_POM_Class(driver);
		OneTime_Card_page__POM_Class pay2 = new OneTime_Card_page__POM_Class(driver);
		
		pay.DonateNow();
		pay.EnterAmount();
		pay.EnterName();
		pay.EnterEmail();
		pay.EnterMobile();
		pay.ClickRadioButton();
		pay.DonoteNow();
		log.info("Clicked on DonateNow button");
		pay2.EnterCardNo();
		pay2.EnterExpiryDate();
		pay2.EnterCVV();
		pay2.ClickContributeCard();
		log.info("Clicked on Contribute button");
		Thread.sleep(5000);
        //	 https://secure.payu.in/52bbc9d509a39cc7f1971c138351fc1f/threeDSecure/method
		//	 https://acs.fssnet.co.in/acsauthserveremv/emvOtpRefresh.htm;jsessionid=PzHtMOQl35HGW-qjE8NILDE-0lStX7oswJczQoUqk2VsL721cXsz!515706670
		String StaticURL1= "https://secure.payu.in/";
		String StaticURL2= "https://acs.fssnet.co.in/";
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL;
		if(ActualURL.contains(StaticURL1) || ActualURL.contains(StaticURL2)){
			ExpectedURL= "PASS";
		}
		else {
			ExpectedURL= "FAIL";
		}
		SoftAssert Assertion = new SoftAssert();
		Assertion.assertEquals(ExpectedURL,"PASS");
		Assertion.assertAll();
		log.info("Validation Applied");
	}

}
