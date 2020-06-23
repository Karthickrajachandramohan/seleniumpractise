package co.Sel.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendarexamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement calendar1 = driver.findElement(By.id("datepicker"));
		//calendar1.sendKeys("06/10/2020" + Keys.ENTER);
		
		calendar1.click();
		
		WebElement calendar2 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
		calendar2.click();
		
		WebElement calendar3 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a"));
		calendar3.click();

	}

}
