package co.Sel.Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkexample {

	public void linkMethod() {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");

		WebElement link1 = driver.findElement(By.linkText("Go to Home Page"));
		link1.click();
		driver.navigate().back();

		WebElement link2 = driver.findElement(By.partialLinkText("Find where am "));
		String Value = link2.getAttribute("href");
		System.out.println("The link is going to " +  Value);

		WebElement link3 = driver.findElement(By.partialLinkText("Verify am I "));
		link3.click();

		String name = driver.getTitle();
		System.out.println("Title of the page is " + name);

		if (name.contains("404")) {
			System.out.println("The link is broken");
		}
		else
			System.out.println("The link is fine");

		driver.navigate().back();
		
		WebElement link4 = driver.findElement(By.linkText("Go to Home Page"));
		link4.click();

		//driver.navigate().back();

		List<WebElement> finallink = driver.findElements(By.tagName("a"));
		int totallink = finallink.size();
		System.out.println("total links "+ totallink);

	}


	public static void main(String[] args) {
		Linkexample object1 = new Linkexample();
		object1.linkMethod();

	}

}
