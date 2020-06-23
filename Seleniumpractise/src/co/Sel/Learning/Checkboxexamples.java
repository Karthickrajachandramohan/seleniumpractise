package co.Sel.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxexamples {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement Checkbox1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[1]/input"));
		Checkbox1.click();
		
		WebElement Checkbox2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[4]/input"));
		Checkbox2.click();
		
		WebElement Checkbox3 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div"));
		boolean status1 = Checkbox3.isSelected();
		System.out.println(status1);
		
		WebElement Checkbox4 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[1]/input"));
		Checkbox4.click();
		
		WebElement Checkbox5 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[2]/input"));
		Checkbox5.click();
		
		WebElement Checkbox6 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[3]/input"));
		Checkbox6.click();
		
		WebElement Checkbox7 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[4]/input"));
		Checkbox7.click();
		
		WebElement Checkbox8 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div[4]/input"));
		Checkbox8.click();
		
		WebElement Checkbox9 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		
		if(Checkbox9.isSelected())
			Checkbox9.click();
		
		Thread.sleep(2000);
		
		WebElement Checkbox10 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if(Checkbox10.isSelected())
			Checkbox10.click();

		}
		
		
		

	}


