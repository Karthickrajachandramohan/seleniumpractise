package co.Sel.Interview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inputwithoutsendkeys {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

		WebElement searchbox = 	driver.findElement(By.name("q"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("document.getElementsbyname('q')[0].value='karthick'","");

		//executor.executeScript("arguments[0].value='karthick'", searchbox);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_K);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);





	}

}
