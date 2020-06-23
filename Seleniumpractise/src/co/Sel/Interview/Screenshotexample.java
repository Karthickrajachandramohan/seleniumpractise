package co.Sel.Interview;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotexample {

	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");

		/*TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);

		File destinationfile = new File("D://newimagefile ");
		FileHandler.copy(sourcefile, destinationfile);             */


		WebElement alertclick = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		alertclick.click();
		
		Robot robot = new Robot();
		java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screenSize);
		BufferedImage Source = robot.createScreenCapture(rectangle);
		
		File destinationfile = new File("D://oldimage.png");
		
		ImageIO.write(Source, "png", ("D://oldimage.png"));
		
		
		
		
		
		
		
}
}
