package co.Sel.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textboxexamples {
	
	
	public void method1() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver .get("http://www.leafground.com/");
		
		WebElement EditBox = driver.findElement(By.linkText("Edit"));
		EditBox. click();
		
		WebElement EmailBox = driver.findElement(By.id("email"));
		EmailBox.sendKeys("karthickraja2212@gmail.com");
		
		WebElement AppendBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		AppendBox.sendKeys(" karthi");
		
		WebElement kar = driver.findElement(By.name("username"));
		String name = kar.getAttribute("value");
		
		System.out.println(name);
		
		WebElement Value1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		Value1.clear();
		
		WebElement disableelement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		Boolean Value2 = disableelement.isEnabled();
		System.out.println(Value2);
		
		driver.quit();
		
	}

	public static void main(String[] args) {
		Textboxexamples obj = new Textboxexamples();
		obj.method1();

	}

}
