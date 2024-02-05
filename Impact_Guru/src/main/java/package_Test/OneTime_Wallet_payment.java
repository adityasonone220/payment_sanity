package package_Test;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import package_POM.OneTime_Donate_page_POM_Class;
import package_POM.OneTime_Wallet_page_POM_Class;

public class OneTime_Wallet_payment extends Test_Base_Class
{
	@Test
	public void walletTest() throws InterruptedException, IOException 
	{
		OneTime_Donate_page_POM_Class pay = new OneTime_Donate_page_POM_Class(driver);
		OneTime_Wallet_page_POM_Class pay3 = new OneTime_Wallet_page_POM_Class(driver);
		
		
//		 for multiple URLs
//		(dataProvider = "sitesData")
//		String siteName, String siteURL
//		driver.get(siteURL);
		pay.DonateNow();
		pay.EnterAmount();
		pay.EnterName();
		pay.EnterEmail();
		pay.EnterMobile();
		pay.ClickRadioButton();
		pay.DonoteNow();
		log.info("Clicked on DonateNow button");
		pay3.Clickwallet();
		pay3.ClickContributewallet();
		log.info("Clicked on Contribute button");
		Thread.sleep(5000);
//	                      	https://securegw.paytm.in/theia/processTransaction
		String ExpectedURL= "https://securegw.paytm.in/theia/processTransaction";
		String ActualURL = driver.getCurrentUrl();
	
		SoftAssert Assertion = new SoftAssert();
		Assertion.assertEquals(ExpectedURL, ActualURL);
		Assertion.assertAll();
		log.info("Validation Applied");
		
	}

}
