package co.Sel.Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framesexamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		WebElement frame1 = driver.findElement(By.xpath("//button[@id='Click']"));
		frame1.click();
		String textvalue = frame1.getText();
		System.out.println(textvalue);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("frame2");
		
		WebElement nestedframe = driver.findElement(By.id("Click1"));
		nestedframe.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		int size = totalframes.size();
		System.out.println(size);
	}

}
