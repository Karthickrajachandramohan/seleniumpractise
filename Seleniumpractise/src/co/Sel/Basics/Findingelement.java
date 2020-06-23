package co.Sel.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findingelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		WebElement findingname =	driver.findElement(By.xpath("//*[@name='q']"));
		findingname.sendKeys("vijay" + Keys.ENTER);

		WebElement element2 =driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']"));
		element2.click();

	}

}
