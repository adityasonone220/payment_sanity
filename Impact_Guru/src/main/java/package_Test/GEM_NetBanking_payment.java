package package_Test;

import org.testng.annotations.Test;

import package_POM.GEM_Donate_page_POM_Class;
import package_POM.GEM_Net_Banking_POM_Class;


public class GEM_NetBanking_payment extends Test_Base_Class
{
	@Test
	public void Netbanking() throws InterruptedException
	{
		GEM_Donate_page_POM_Class pay = new GEM_Donate_page_POM_Class(driver);
		GEM_Net_Banking_POM_Class pay5 = new GEM_Net_Banking_POM_Class(driver);
		

		pay.DonateNow();
		pay.ClickGiveMonthly();
		pay.EnterAmount();
		pay.EnterName();
		pay.EnterEmail();
		pay.EnterMobile();
		pay.EnterCity();
		pay.ClickRadioButton();
		pay.ClickDonateButton();
		
		pay5.ClickBankSelection();
		pay5.EnterAccountNo();
		pay5.EnterIFSCCode();
		pay5.ClickContribute();
		pay5.ClickAuthenticate();
//		pay5.ClickProceed();
		
	
	}

}
