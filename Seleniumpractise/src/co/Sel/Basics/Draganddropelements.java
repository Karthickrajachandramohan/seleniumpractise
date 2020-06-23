package co.Sel.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement Dragelement = driver.findElement(By.id("draggable"));
		WebElement Dropelement = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		//action.clickAndHold(Dragelement).moveToElement(Dropelement).release(Dropelement).build().perform();
		
		action.dragAndDrop(Dragelement, Dropelement).build().perform();

	}

}
