package co.Sel.Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autocompleteexample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/autoComplete.html");

		WebElement autoelement = driver.findElement(By.xpath("//*[@autocomplete='off']"));
		autoelement.sendKeys("c");
		
		Thread.sleep(4000);

		List<WebElement> allelements = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));


		for (WebElement newelement : allelements) {
			if(newelement.getText().equals("Cucumber"));
			newelement.click();
			System.out.println("Cucumber has been found ");
			break;

		}

	}

}
