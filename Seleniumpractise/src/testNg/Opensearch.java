package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Opensearch {

	WebDriver driver;
	long starttime;
	long endtime;

	@BeforeSuite
	public void launchEngines() {

		starttime = System.currentTimeMillis();

		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	@Test(priority = 0)
	public void launchGoogle() {
		driver.get("https://www.google.com/");
	}
	@Test(priority=2)
	public void launchbing() {
		driver.get("https://www.bing.com/");
	}
	@Test(priority = 1)
	public void launchYahoo() {
		driver.get("https://in.yahoo.com/");
	}
	@AfterSuite
	public void quitTheBrowser() {
		driver.quit();
		endtime = System.currentTimeMillis();
		long totaltime = endtime-starttime;
		System.out.println("The total time taken is "+ totaltime);
	}

}
