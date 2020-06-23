package co.Sel.Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Suggestionsexample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

		WebElement newvalue = driver.findElement(By.name("q"));
		newvalue.sendKeys("money heist");
		
		Thread.sleep(4000);
		
		
		List<WebElement> newelement = driver.findElements(By.xpath("//ul[@jsname='erkvQe'][@role='listbox']//following::li"));
		
		int position = 0;
		for (WebElement webElement : newelement) {
			System.out.println(webElement.getText());
			position++;
			
			if(position==3) {
				webElement.click();
				break;
			}
			
		}

	}

}
