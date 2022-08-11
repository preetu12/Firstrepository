package tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;

public class Tc_004_Test {
	WebDriver driver;
	// @Parameters("Browser")

	@BeforeClass

	public void Browser_Setup(@Optional("chrome") String browserName) {
		System.out.println(browserName);
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\eclipse-workspace\\ELF35\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\eclipse-workspace\\ELF35\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		String appurl = "http://demowebshop.tricentis.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(appurl);
	}

	@AfterClass
	public void Browser_TearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}
