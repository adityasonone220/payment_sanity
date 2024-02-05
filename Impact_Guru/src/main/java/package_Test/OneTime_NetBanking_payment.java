package package_Test;


import static org.testng.Assert.*;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import package_POM.OneTime_Donate_page_POM_Class;
import package_POM.OneTime_Net_Banking_POM_Class;


public class OneTime_NetBanking_payment extends Test_Base_Class
{
	@Test
	public void Netbanking() throws InterruptedException
	{
		OneTime_Donate_page_POM_Class pay = new OneTime_Donate_page_POM_Class(driver);
		OneTime_Net_Banking_POM_Class pay5 = new OneTime_Net_Banking_POM_Class(driver);
	
	
		pay.DonateNow();
		pay.EnterAmount();
		pay.EnterName();
		pay.EnterEmail();
		pay.EnterMobile();
		pay.ClickRadioButton();
		pay.DonoteNow();
		log.info("Clicked on DonateNow button");
		pay5.ClickNetBanking();
		pay5.Clickcontribute();
		log.info("Clicked on Contribute button");
		Thread.sleep(5000);
//	                       	https://netbanking.hdfcbank.com/netbanking/merchant?ClientCode=130674&MerchantCode=PAYUIMPACTG1&TxnCurrency=INR&TxnAmount=290.00&TxnScAmount=0&MerchantRefNo=kquxi5epaz62jporcm&SuccessStaticFlag=N&FailureStaticFlag=N&Date=09/01/2024%2019:15:12&Ref1=S2VWWlNXOXQ2aTQ9&Ref2=&Ref3=&Ref4=&Ref5=&DynamicUrl=https://secure.payu.in/47a434d558986122ce0e3d0bd7217415/CommonPgResponseHandler.php&CheckSum=59566732
		String StaticURL1 = "https://netbanking.hdfcbank.com/netbanking/merchant";
//		                     https://api.payu.in/public/#/6298c1e485c94360e2414310da6e6ba9/netbanking
		String StaticURL2 = "https://api.payu.in/public";
		String ActualURL = driver.getCurrentUrl(); 
	    String ExpectedURL;
		if(ActualURL.contains(StaticURL1)||ActualURL.contains(StaticURL2)){
			ExpectedURL= "PASS";
		}
		else {
			ExpectedURL="FAIL";
		}
		SoftAssert Assertion = new SoftAssert();
		Assertion.assertEquals(ExpectedURL, "PASS");
		Assertion.assertAll();
		log.info("Validation Applied");
	}
}
