package co.Sel.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tooltiptextexample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		WebElement tooltiptext = driver.findElement(By.cssSelector("#age"));
		
		String Value = tooltiptext.getAttribute("title");
		
		System.out.println(Value);
		

	}

}
