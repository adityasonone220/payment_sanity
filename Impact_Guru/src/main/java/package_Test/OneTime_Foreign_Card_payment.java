package package_Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import package_POM.OneTime_Card_page__POM_Class;
import package_POM.OneTime_Donate_page_POM_Class;


public class OneTime_Foreign_Card_payment extends Test_Base_Class
{
	
	@Test
	public void ForeignCardTest()
	{	
	OneTime_Donate_page_POM_Class pay = new OneTime_Donate_page_POM_Class(driver);
	OneTime_Card_page__POM_Class pay6 = new OneTime_Card_page__POM_Class(driver);
	
	pay.DonateNow();
	pay.selectCurrency();
	pay.EnterAmount();
	pay.EnterName();
	pay.EnterEmail();
	pay.EnterMobile();
	pay.ClickRadioButton();
	pay.DonoteNow();
	
	
	pay6.EnterCardNo();
	pay6.EnterExpiryDate();
	pay6.EnterCVV();
	pay6.ClickContributeCard();
	
	String ExpectedURL= "";
	String ActualURL = driver.getCurrentUrl();
	
	
	SoftAssert Assertion = new SoftAssert();
	Assertion.assertEquals(ActualURL, ExpectedURL);
	Assertion.assertAll();
	
	
	}
}

