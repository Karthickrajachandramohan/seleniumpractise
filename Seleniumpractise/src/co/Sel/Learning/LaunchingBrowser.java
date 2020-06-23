package co.Sel.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class LaunchingBrowser {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\selenium\\driver\\chromedriver.exe");
		// WebDriver driver=new ChromeDriver();
		// driver.get("https://www.google.com/");
		 
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.close();
		WebElement kar = driver.findElement(By.name("q"));
		kar.sendKeys("vijay"+Keys.ENTER);
		driver.findElement(By.linkText("Wikipedia")).click();
	
		
		

		



		

	}

}
