package co.Sel.Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		
		Select selectvalue = new Select(dropdown1);
		selectvalue.selectByIndex(3);
		
		
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		
		Select select2 =new Select(dropdown2);
		select2.selectByValue("4");
		
		WebElement dropdown3 = driver.findElement(By.xpath("//*[@id='dropdown3'][@name='dropdown3']"));
		
		Select select3 = new Select(dropdown3);
		select3.selectByVisibleText("Selenium");
		
		WebElement dropdown4 = driver.findElement(By.xpath("//*[@class='dropdown']"));
		
        Select select4 = new Select(dropdown4);
        
         List<WebElement> totaloptions = select4.getOptions();
         int totalvalue = totaloptions.size();
         System.out.println("The total options available "+ totalvalue );
         
         WebElement dropdown5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
         dropdown5.sendKeys("Appium");
         
         WebElement dropdown6 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select/option[1]"));
         
         Select select5 = new Select(dropdown6);
         select5.selectByIndex(1);
         select5.selectByIndex(2);
         
         
		

	}

}
