package co.Sel.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Buttonexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/Button.html");
		
		WebElement homebutton = driver.findElement(By.xpath("//*[@for='home']/following::button"));
		homebutton.click();
		driver.navigate().back();
		
		//to find the position of the button
		
		WebElement positionbutton = driver.findElement(By.xpath("//*[@id='position']"));
		
		Point pointname = positionbutton.getLocation();
		int Xposition = pointname.getX();
		int Yposition = pointname.getY();
		System.out.println("X position is "+ Xposition + "Y Position is " + Yposition);
		
		//to find the button color
		
		WebElement Buttoncolor = driver.findElement(By.xpath("//*[text()='What color am I?']"));
		String Backgroundcolor = Buttoncolor.getCssValue("background-color");
		System.out.println("Back ground colour is "+ Backgroundcolor );
		
		//to find the buttonsize
		
		WebElement buttonsize = driver.findElement(By.xpath("//button[contains(text(),'What is my size?')]"));
		int height = buttonsize.getSize().getHeight();
		int width = buttonsize.getSize().getWidth();
		System.out.println("The height is " + height + "The width is "+ width);
		
		
	

	}

}
