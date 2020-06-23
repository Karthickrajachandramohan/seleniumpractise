package co.Sel.Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectableexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int totalelements = selectable.size();
		System.out.println(totalelements);
		
		Actions action = new  Actions(driver);
		action.clickAndHold(selectable.get(0));
		action.clickAndHold(selectable.get(1));
		action.clickAndHold(selectable.get(2));
		action.clickAndHold(selectable.get(3)).build().perform();
		driver.quit();
		
		System.out.println("a");
		
		/*Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2))
		.build().perform(); */
	

	}

}
