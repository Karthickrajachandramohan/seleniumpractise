package co.Sel.Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortableexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		List<WebElement> sortables = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		
		WebElement fromelement = sortables.get(6);
		WebElement toelement = sortables.get(0);
		
		
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(fromelement);
		action.clickAndHold(toelement);
		action.release(toelement);
		action.build().perform();
		
		WebElement element2 = sortables.get(5);
		WebElement element3 = sortables.get(1);
		
		action.dragAndDrop(element2, element3).build().perform();
		
		System.out.println("a");
		
		
		

	}

}
