package co.Sel.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxeexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/pages/checkbox.html");
		
		WebElement languageknown1 = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		languageknown1.click();
		
		WebElement languageknown2 = driver.findElement(By.xpath("//input[@type=\"checkbox\"]/following::div[2]"));
		languageknown2.click();
		
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div"));
		boolean element4 = element3.isSelected();
		System.out.println(element4);
		
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		
		if(element5.isSelected()) {
			element5.click();
		}
		
		WebElement element6 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]"));
		
		if(element6.isSelected()) {
			element6.click();
		}
		System.out.println("a");

	}

}
