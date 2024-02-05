package package_Test;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import package_POM.GEM_Donate_page_POM_Class;
import package_POM.GEM_UPI_page_POM_Class;

public class GEM_UPI_payment  extends Test_Base_Class {
	
	@Test
	public void UPIPayment() throws InterruptedException, IOException {
    	GEM_Donate_page_POM_Class pay = new GEM_Donate_page_POM_Class(driver);
    	GEM_UPI_page_POM_Class pay5 = new GEM_UPI_page_POM_Class(driver);
    	
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
		pay5.ClickOnUPI();
		pay5.EnterUPIId();
		pay5.ClickContribute();
		log.info("Clicked on Contribute button");
		
//		https://securegw.paytm.in/order/pay?mid=Impact66269200630913&orderId=SytkZlNXOXE
		String StaticURL1 ="https://securegw.paytm.in/order/";
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL;
		if(ActualURL.contains(StaticURL1)) {
			ExpectedURL="PASS";
		}
		else {
			ExpectedURL="FAIL";
		}
		SoftAssert Assertion = new SoftAssert();
		Assertion.assertEquals(ExpectedURL, "PASS");
		Assertion.assertAll();
    	
    }
}
