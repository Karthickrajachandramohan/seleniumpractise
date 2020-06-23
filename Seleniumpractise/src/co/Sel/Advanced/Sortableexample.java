package co.Sel.Advanced;

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
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");

		List<WebElement> element1 = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));

		WebElement fromelement = element1.get(6);
		WebElement toelement = element1.get(0);
		WebElement fromelement1 = element1.get(5);
		WebElement toelement1 = element1.get(1);


		


		Actions action = new Actions(driver);

		action.clickAndHold(fromelement);
		action.moveToElement(toelement);
		action.release(toelement);
		action.build().perform();
		action.dragAndDrop(fromelement1, toelement1).build().perform();

	}

}
