package co.Sel.Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alertbox = driver.findElement(By.xpath("//*[@onclick='normalAlert()']"));
		alertbox.click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		WebElement confirmbox = driver.findElement(By.xpath("//*[@for='home']/following::button[2]"));
		confirmbox.click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		WebElement confirmprompt = driver.findElement(By.xpath("//*[@id='result1']/preceding::button[1]"));
		confirmprompt.click();
		
		Alert alert3 = driver.switchTo().alert();
		
		alert3.sendKeys("Karthick");
		
		
		
		

	}

}
