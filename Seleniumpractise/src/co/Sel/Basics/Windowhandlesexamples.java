package co.Sel.Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandlesexamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldwindow = driver.getWindowHandle();

		
		WebElement homebutton = driver.findElement(By.id("home"));
		homebutton.click();
		
		
		Set<String> allhandles = driver.getWindowHandles();
		
		for (String newwindow : allhandles) {
			driver.switchTo().window(newwindow);
			
		}
		System.out.println("a");
		WebElement button1 = driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image'][@alt='Edit / Text Fields']"));
		button1.click();
		driver.close();
		
		driver.switchTo().window(oldwindow);
		
		System.out.println("c");
		
		WebElement numberofwindows = driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
		numberofwindows.click();
		
		int openedwindows = driver.getWindowHandles().size();
		System.out.println("Total windows opened " + openedwindows );
		
		WebElement colorbutton = driver.findElement(By.id("color"));
		colorbutton.click();
		
		Set<String> totalhandles = driver.getWindowHandles();
		
		for (String newhandle : totalhandles) {
			if(!newhandle.equals(oldwindow)){
				driver.switchTo().window(newhandle);
				driver.close();
			}
			
			System.out.println("K");
		}
		
		
		
		
		
		

	}

}
