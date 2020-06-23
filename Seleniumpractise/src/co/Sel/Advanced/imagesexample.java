package co.Sel.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class imagesexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/pages/Image.html");
		
		WebElement image1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		image1.click();
		
		WebElement image = driver.findElement(By.cssSelector("#post-153 > div.wp-landing-categories > div > ul > li:nth-child(4) > a"));
		image.click();
		
		WebElement brokenimage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		
		
		if(brokenimage.getAttribute("naturalwidth").equals("0")) {
			System.out.println("The image is broken");
		}else
		{
			System.out.println("The image is not broken");
			
		}
		
		

	}

}
