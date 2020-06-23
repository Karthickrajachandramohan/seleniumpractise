package co.Sel.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttonexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement radiobutton1 = driver.findElement(By.id("yes"));
		radiobutton1.click();
		
		WebElement radiobutton2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[2]/input"));
		boolean radio1 = radiobutton2.isSelected();
		System.out.println(radio1);
		
		WebElement radiobutton3 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));
		boolean radio2 = radiobutton3.isSelected();
		System.out.println(radio2);
		
		WebElement radiobutton4 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[1]"));
		radiobutton4.click();

	}

}
