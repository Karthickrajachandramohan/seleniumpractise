package co.Sel.Advanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandlwsexamples {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String parentwindow = driver.getWindowHandle();
		
		WebElement firstbox = driver.findElement(By.id("home"));
		firstbox.click();
		
		Set<String>handles = driver.getWindowHandles();
		
		for (String childwindow : handles) {
			driver.switchTo().window(childwindow);
			
		}
		
		WebElement buttonbox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a/h5"));
		buttonbox.click();
		
		driver.close();
		
		driver.switchTo().window(parentwindow);
		
		WebElement multiplewindows = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multiplewindows.click();
		
		int Value = driver.getWindowHandles().size();
		System.out.println(Value);
		
		driver.switchTo().window(parentwindow);
		WebElement window1 = driver.findElement(By.id("color"));
		window1.click();
		
		Set<String>newhandles = driver.getWindowHandles();
		
		for (String childhandle : newhandles) {
			if(!childhandle.equals(parentwindow));
			driver.switchTo().window(childhandle);
			driver.close();
			
			
		}
		
		
		

	}

}
