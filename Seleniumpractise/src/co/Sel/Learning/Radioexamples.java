package co.Sel.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radioexamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement Value1 = driver.findElement(By.id("yes"));
		Value1.click();
		
		WebElement Value2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
		boolean Status1 = Value2.isSelected(); 
		System.out.println(Status1);
		
		WebElement Value3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]"));
		boolean Status2 = Value3.isSelected();
		System.out.println(Status2);
		
		Value3.click();
		Value2.click();
		
	}

}
