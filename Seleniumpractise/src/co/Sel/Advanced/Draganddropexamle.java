package co.Sel.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class Draganddropexamle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement Dragelement = driver.findElement(By.id("draggable"));
		
		WebElement dropelement = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		//actions.dragAndDrop(Dragelement, dropelement);
		//actions.build().perform();

		actions.clickAndHold(Dragelement).moveToElement(dropelement).release(dropelement).build().perform();
		driver.close();
		
	}

}
