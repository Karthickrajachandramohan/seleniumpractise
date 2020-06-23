package co.Sel.Learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertsexample {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(" http://www.leafground.com/pages/Alert.html");
		
		WebElement AlertBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		AlertBox.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement ConfirmBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		ConfirmBox.click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		
		
		WebElement promptbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptbox.click();
		
		Alert alert2 = driver.switchTo().alert();
        String Value =alert2.getText();
        System.out.println(Value);
        Thread.sleep(3000);
        alert2.sendKeys("Karthick");
        alert2.accept();
        System.out.println("a");
		


	}

}
