package co.Sel.Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hyperlinksexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement homepage =driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		
		driver.navigate().back();
		
		WebElement wheretogo = driver.findElement(By.partialLinkText("Find where am "));
		String Value = wheretogo.getAttribute("href");
		System.out.println(Value);
		
		WebElement error = driver.findElement(By.linkText("Verify am I broken?"));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("404")) {
			System.out.println("The page is broken");
		}
		
		driver.navigate().back();
		
		List<WebElement> linksavailable =  driver.findElements(By.tagName("a"));
		int totalsize = linksavailable.size();
		System.out.println(totalsize);
		
		

	}

}
