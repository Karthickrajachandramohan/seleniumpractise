package co.Sel.Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frameexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		
		//to gettext
		String Value1 = button1.getText();
		System.out.println(Value1);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement button2 = driver.findElement(By.id("Click1"));
		button2.click();
		
		//to get attributes
		String Value2 = button2.getAttribute("id");
		System.out.println(Value2);
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
		int Framevalue = totalframe.size();
		System.out.println(Framevalue);
		

	}

}
