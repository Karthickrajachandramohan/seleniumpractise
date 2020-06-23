package co.Sel.Advanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filedownloadexamples {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement excelfile = driver.findElement(By.linkText("Download Excel"));
		excelfile.click();
		
		Thread.sleep(4000);
		
		File files1 = new File("C:\\Users\\Jayapriya\\Downloads");
		File [] totalfiles = files1.listFiles();
		
		for (File filenew : totalfiles) {
			if(filenew.getName().equals("Download Excel"));{
				System.out.println("File is present");
				break;
			}
			
		}

	}

}
