package co.Sel.Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Textunderlinedornot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebElement tamil = driver.findElement(By.xpath("//a[contains(text(),'தமிழ்')]"));
		
		String beforehovering = tamil.getCssValue("text-decoration");
		System.out.println("before hovering " + beforehovering);
		
		Actions action = new Actions(driver);
		action.moveToElement(tamil);
		action.build().perform();
		
		String afterhovering = tamil.getCssValue("text-decoration");
		System.out.println("After hovering " + afterhovering);
		
		

	}

}
