package co.Sel.Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autocompleteexamples2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement name = driver.findElement(By.name("q"));
		name.sendKeys("vijay");
		
		Thread.sleep(4000);
		
		List<WebElement> allelements = driver.findElements(By.className("sbct"));
		
		for (WebElement webElement : allelements) {
			if(webElement.getText().equals("vijay tv"));
			webElement.click();
			System.out.println("Element ha been identified");
			
			
		}
		

	}

}
