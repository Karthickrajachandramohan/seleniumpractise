package co.Sel.Advanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class downloadfilesexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement files1 = driver.findElement(By.linkText("Download Excel"));
		files1.click();
		
		File file2 = new File("C:\\Users\\Jayapriya\\Downloads");
		File [] filelist = file2.listFiles();
		
		for (File totalfile : filelist) {
			if(totalfile.getName().equals("Download Excel"));
			System.out.println("File name has been found");
			break;
			
			
		}
	

	}

}
