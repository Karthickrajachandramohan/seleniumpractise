package co.Sel.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendarsexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		
		WebElement calendar1 = driver.findElement(By.id("datepicker"));
		//calendar1.sendKeys("06/10/2020" + Keys.ENTER);
		calendar1.click();
		
		WebElement nextbutton = driver.findElement(By.xpath("//a[@title='Next']"));
		nextbutton.click();
		
		WebElement datevalue = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[4]/a"));
		datevalue.click();

	}

}
