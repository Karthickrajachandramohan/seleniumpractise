package co.Sel.Advanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowshandlingexamples2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String parentwindow = driver.getWindowHandle();
		
		WebElement firstwindow = driver.findElement(By.id("home"));
		firstwindow.click();
		
		Set<String>handles = driver.getWindowHandles();
		
		for (String childwindow : handles) {
			driver.switchTo().window(childwindow);
			
		}
		
		WebElement editbox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editbox.click();
		driver.close();
		
		driver.switchTo().window(parentwindow);
		
		
		WebElement secondwindow = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		secondwindow.click();
		
		int value = driver.getWindowHandles().size();
		System.out.println(value);
		
		WebElement Thirdwindow = driver.findElement(By.xpath("//*[@id=\'color\"\']"));
		Thirdwindow.click();
		
		Set<String>Handles2 = driver.getWindowHandles();
		
		for (String newwindow : Handles2) {
			if(!Handles2.equals(parentwindow)) {
				driver.switchTo().window(newwindow);
				driver.close();
		}
			
		}

	}

}
