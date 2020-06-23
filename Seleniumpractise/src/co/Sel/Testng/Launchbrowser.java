package co.Sel.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Launchbrowser {
	WebDriver driver;
	long starttime;
	long endtime;
	
	@BeforeSuite
	public void beforeLaunchingBrowser() {
		
		starttime = System.currentTimeMillis();

		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
	    driver = new FirefoxDriver();
		
		
	}
	
	@Test
	public void openGoogle() {		
		
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	public void openYahoo() {
				
		
		driver.get("https://in.yahoo.com/?p=us");
		
		
	}
		
	@Test
	public void openBing() {
		
		

		driver.get("https://www.bing.com/?toWww=1&redig=96049AD7B5304F77928921C35327D5D9");
		
	
	}
	@AfterSuite
	public void closingTheBrowser() {
		
		driver.quit();
		endtime = System.currentTimeMillis();
		long totaltime = starttime-endtime;
		System.out.println(" Total time taken is " + totaltime);
		
		
	}
	
}
