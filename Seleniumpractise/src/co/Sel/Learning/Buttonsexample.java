package co.Sel.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Buttonsexample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver .get("http://www.leafground.com/pages/Button.html");
		
		//To get the XY position of the button
		WebElement Getpositionbutton = driver.findElement(By.id("position"));
		Point XYLocation = Getpositionbutton.getLocation();
		int Xvalue = XYLocation.getX();
		int YValue = XYLocation.getY();
		System.out.println("X value is : "+ Xvalue + " Y Value is "+ YValue);
		
		//to find the colour of the button
		WebElement Colourbutton = driver.findElement(By.id("color"));
		String ColourValue = Colourbutton.getCssValue("background-color");
		System.out.println(ColourValue);
		
		//to find the size
		WebElement elementsize = driver.findElement(By.id("size"));
		int height = elementsize.getSize().getHeight();
		int width  = elementsize.getSize().getWidth();
		System.out.println("Height is "+ height + " Width is "+ width );
		//System.out.println(elementsize.getSize());
		
		//go to homepage
		WebElement Homebutton = driver.findElement(By.id("home"));
		Homebutton.click();
		
		
		

	}

}
