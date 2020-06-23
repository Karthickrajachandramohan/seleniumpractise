package co.Sel.Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrinttheURL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

		WebElement newvalue = driver.findElement(By.name("q"));
		newvalue.sendKeys("money heist" + Keys.ENTER);
		
		Thread.sleep(4000);
		
	//	List<WebElement> allelement = driver.findElements(By.xpath("//a"));
		
		//This will print all the URL in the page
		
		/*for (WebElement newelement : allelement) {
			String lastelement = newelement.getAttribute("href");
			System.out.println(lastelement);
			
		}*/
		
		//to fetch the main links
		List<WebElement> firstelement = driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
		
		for(WebElement  totalelement : firstelement) {
			System.out.println(totalelement.getText());
			
		}
		

	}

}
