package co.Sel.Interview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.xml.internal.bind.v2.runtime.Location;

public class Refreshingbrowser {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://amazon.in/");
		driver.get("https://www.amazon.in/");
		
		//refresh browser using navigate method
		WebElement elemet1 = driver.findElement(By.id("twotabsearchtextbox"));
		elemet1.sendKeys("iphone");
		
		//driver.navigate().refresh();
		
		//getcurrenturl - it is also used to refresh
		//driver.get(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("location.reload");//history.go(0)
		
		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);*/
		
		
		
		

	}

}
