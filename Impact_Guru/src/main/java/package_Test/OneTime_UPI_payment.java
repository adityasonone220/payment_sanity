package package_Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import package_POM.OneTime_Donate_page_POM_Class;
import package_POM.OneTime_UPI_page_POM_Class;

public class OneTime_UPI_payment extends Test_Base_Class {
	@Test
	public void UPITest() throws InterruptedException, IOException {
		OneTime_Donate_page_POM_Class pay = new OneTime_Donate_page_POM_Class(driver);
		OneTime_UPI_page_POM_Class pay4 = new OneTime_UPI_page_POM_Class(driver);

//		   for multiple URLs
//		(dataProvider = "sitesData")
//		String siteName, String siteURL
//		driver.get(siteURL);
		log.info("test class");
		pay.DonateNow();
		pay.EnterAmount();
		pay.EnterName();
		pay.EnterEmail();
		pay.EnterMobile();
		pay.ClickRadioButton();
		pay.DonoteNow();
		log.info("Clicked on DonateNow button");
		pay4.clickUPI();
		pay4.EnterUPIid();
		pay4.ClickContributeUPI();
		log.info("Clicked on Contribute button");
		Thread.sleep(5000);
		String ExpectedText = "Cancel Payment";
		WebElement Actual = driver.findElement(By.xpath("//a[@id='otUpiCallbackCancelBtn']"));
		String ActualText = Actual.getText();
		Thread.sleep(4000);
		SoftAssert Assertion = new SoftAssert();
		Assertion.assertEquals(ExpectedText, ActualText);
		Assertion.assertAll();
		Thread.sleep(4000);
		log.info("Validation Applied");
		pay4.ClickCancelUPI();
	}

}
