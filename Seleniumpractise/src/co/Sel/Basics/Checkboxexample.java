package co.Sel.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement java = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
        java.click();
        
        WebElement VBScript = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[5]"));
        VBScript.click();
        
        WebElement secondelement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div"));
        boolean name = secondelement.isSelected();
        System.out.println(name);
        
        WebElement Thirdelement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]"));
        
        if(Thirdelement.isSelected()) {
        	Thirdelement.click();
        }
        
        WebElement fourthelement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]"));
        
        if(fourthelement.isSelected()) {
        	fourthelement.click();
        }
        
        System.out.println();
	}

}
