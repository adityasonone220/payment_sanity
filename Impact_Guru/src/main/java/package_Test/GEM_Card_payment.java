package package_Test;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import package_POM.GEM_Card_page_POM_Class;
import package_POM.GEM_Donate_page_POM_Class;


public class GEM_Card_payment extends Test_Base_Class
{
	@Test
	public void cardPayment() throws InterruptedException, IOException 
	{
		GEM_Donate_page_POM_Class pay = new GEM_Donate_page_POM_Class(driver);
		GEM_Card_page_POM_Class pay5 = new GEM_Card_page_POM_Class(driver);
		
//		  for multiple URLs
//		(dataProvider = "sitesData")
//		String siteName, String siteURL
//		driver.get(siteURL);
		pay.DonateNow();
		pay.ClickGiveMonthly();
		pay.EnterAmount();
		pay.EnterName();
		pay.EnterEmail();
		pay.EnterMobile();
		pay.EnterCity();
		pay.ClickRadioButton();
		pay.ClickDonateButton();
		log.info("Clicked on DonateNow button");
		pay5.ClickOnCard();
		pay5.EnterCardNo();
		pay5.EnterExpiryDate();
		pay5.EnterCVV();
		pay5.ClickContributeCard();
		log.info("Clicked on Contribute button");
		
//		https://api.razorpay.com/v1/payments/create/checkout
		String ExpectedURL = "https://api.razorpay.com/";
		String ActualURL = driver.getCurrentUrl();
		if(ActualURL.contains(ExpectedURL)){
			ExpectedURL= "PASS";
		}
		else {
			ExpectedURL= "FAIL";
		}
		SoftAssert Assertion = new SoftAssert();
		Assertion.assertEquals(ExpectedURL,"PASS");
		Assertion.assertAll(); 
		
		pay5.TearDown();
	}	
	
}
