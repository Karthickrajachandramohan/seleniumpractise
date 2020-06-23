package co.Sel.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Editboxexamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement mailaddress = driver.findElement(By.xpath("//*[@for='email']/following::input"));
		mailaddress.sendKeys("karthickraja2212");
		
		WebElement appendelement = driver.findElement(By.xpath("//*[@type='text'][@value='Append ']"));
		appendelement.sendKeys("karthick");
		
		WebElement testleaf = driver.findElement(By.xpath("//input[@name='username']"));
		String value = testleaf.getAttribute("value");
		System.out.println(value);
		
		WebElement clearelement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearelement.clear();
		
		WebElement disabledelement = driver.findElement(By.xpath("//*[@disabled='true']"));
		boolean element1 = disabledelement.isEnabled();
		System.out.println(element1);
		
	}

}
