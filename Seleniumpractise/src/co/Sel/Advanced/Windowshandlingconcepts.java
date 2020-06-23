package co.Sel.Advanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowshandlingconcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		WebElement firstwindow = driver.findElement(By.id("home"));
		firstwindow.click();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		for (String childhandle : handles) {
			driver.switchTo().window(childhandle);
			
		}
		
		WebElement editbox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/h5"));
		editbox.click();
		driver.close();
		
		System.out.println("a");
		
		driver.switchTo().window(parentwindow);
		
		WebElement window2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		window2.click();
		
		int totalwindowsopenend = driver.getWindowHandles().size();
		System.out.println(totalwindowsopenend);
		
		WebElement window3 = driver.findElement(By.id("color"));
		window3.click();
		
		Set<String> allhandles = driver.getWindowHandles();
		
		for (String newhandle : allhandles) {
			if (!allhandles.equals(parentwindow)) {
				driver.switchTo().window(newhandle);
				driver.close();
				
			}
			System.out.println("b");
			
		}
		
		
		

	}

}
