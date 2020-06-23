package co.Sel.Basics;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Downloadfileexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get( "http://www.leafground.com/pages/download.html");
		
		String urlname = driver.getCurrentUrl();
		System.out.println("The url name is " + urlname);
		
		String Titlename = driver.getTitle();
		System.out.println("The title name is "+ Titlename );
		
		String Windowhandlename = driver.getWindowHandle();
		System.out.println("The window handle name is " + Windowhandlename );
		
		String Pagesourcevalue = driver.getPageSource();
		System.out.println("The page source value is "+ Pagesourcevalue );
		
		
		WebElement excelname = driver.findElement(By.linkText("Download Excel"));
		excelname.click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		
		File filename = new File("C:\\Users\\Jayapriya\\Downloads");
		
		File[] totalfiles = filename.listFiles();
		
		for (File newfile : totalfiles) {
			if(newfile.getName().equals("testleaf")) {
				System.out.println("File is downloaded");
				break;
			}
			
		}
		


	}

}
