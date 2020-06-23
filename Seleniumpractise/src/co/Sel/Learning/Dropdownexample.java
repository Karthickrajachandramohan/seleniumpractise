package co.Sel.Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownexample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver .get("http://www.leafground.com/pages/Dropdown.html");
		
		//Select by index
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown1);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByValue("4");
		Thread.sleep(2000);
		select.selectByVisibleText("UFT/QTP");
		
	    List<WebElement>Value = select.getOptions();
	    int Value2 = Value.size();
	    System.out.println(Value2);
	    
	    WebElement Value3 =  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
	    Value3.sendKeys("Appium");
	    
	    WebElement multiselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select/option[1]"));
	    Select Valuebox = new Select(multiselect);
	    Valuebox.selectByValue("0");
	    Valuebox.selectByValue("1");
	    Valuebox.selectByValue("2");
	    System.out.println("a");

		
		
		 
			

	}

}
