package Generic_lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_class {
	
	public static WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void Browser_Setup() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void Browser_TearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
