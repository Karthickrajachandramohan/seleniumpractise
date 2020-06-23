package co.Sel.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tooltiptext {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");

		WebElement tooltipbox  = 	driver.findElement(By.xpath("//label[@for='age']/following::*"));
		String attributevalue = tooltipbox.getAttribute("title");
		System.out.println(attributevalue);

	}

}
