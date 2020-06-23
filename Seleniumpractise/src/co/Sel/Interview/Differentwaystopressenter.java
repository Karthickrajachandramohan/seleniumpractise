package co.Sel.Interview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Differentwaystopressenter {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	/*	different ways to enter
		1. sendkeys("String value " + Enter)
		2. submit
		3. Robot
		4. /n  */
		
		WebElement newvalue = driver.findElement(By.name("q"));
		newvalue.sendKeys("Selenium \n");

		//newvalue.sendKeys("Selenium \n" );
		
		//newvalue.sendKeys("Selenium"+Keys.ENTER);
		//newvalue.sendKeys("Selenium")
		//newvalue.submit();
		
		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER); */
		
	}

}
