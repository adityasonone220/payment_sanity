package package_Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import package_POM.OneTime_Donate_page_POM_Class;
import package_Utility.UtilityClass;

public class Test_Base_Class extends UtilityClass {
	UtilityClass Var = new UtilityClass();

	WebDriver driver;
	Logger log = Logger.getLogger("Payment_Module");

	@BeforeMethod
	public void Method() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ImpactGuru\\chromedriver_win32\\chromedriver.exe");

		
//	Method 1
		driver = new ChromeDriver();	
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless"); // Run in headless mode
//		// Initialize WebDriver with ChromeOptions
//		driver = new ChromeDriver(options);
		PropertyConfigurator.configure("log4j.properties");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(UtilityClass.URL());
		log.info("URL is opened");
//		POM_Class_Donate_page_OneTime help = new POM_Class_Donate_page_OneTime(driver);
//		help.HelpClick();

		
//	Method 2	
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless"); // Run in headless mode
//		// Initialize WebDriver with ChromeOptions
//		driver = new ChromeDriver(options);
//		try {
//			driver.get(UtilityClass.URL());
//			WebElement element = driver.findElement(By.xpath("//a[@id='cmp-nfr-top-side-donate ']"));
//			element.click();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			driver.quit();
//		}
	}

	@AfterMethod
	public void Method1() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		log.info("Browser closed");
	}
}
