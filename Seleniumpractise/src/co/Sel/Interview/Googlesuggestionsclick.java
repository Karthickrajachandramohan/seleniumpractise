package co.Sel.Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlesuggestionsclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

		WebElement newvalue = driver.findElement(By.name("q"));
		newvalue.sendKeys("vijay");


		Thread.sleep(4000);

		List<WebElement> elementlist = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		for (WebElement webElement : elementlist) {
			String newelement = webElement.getText();
			System.out.println(newelement);

			if(newelement.contains("age"))
				webElement.click();
			    break;
		}


	}

}
