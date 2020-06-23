package co.Sel.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Imageexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/Image.html");
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div"));
		element1.click();
		driver.navigate().back();
		
		WebElement brokenimage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		System.out.println("a");
		//To identify whether the image is broken or not we can use naturalwidth
		
			if(brokenimage.getAttribute("naturalwidth").equals("0")) {
			System.out.println("The image is broken");
		}
		
        

	}

}
