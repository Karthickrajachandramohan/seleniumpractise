package co.Sel.Basics;

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
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> Selectables = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		int Totalselectables = Selectables.size();
		System.out.println(Totalselectables);
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL)
		.click(Selectables.get(0)).
		click(Selectables.get(1)).
		click(Selectables.get(2)).
		click(Selectables.get(4)).build().perform();
		
		/*action.clickAndHold(Selectables.get(0));
		action.clickAndHold(Selectables.get(1));
		action.clickAndHold(Selectables.get(2));
		action.clickAndHold(Selectables.get(4)).build().perform(); */
		
		System.out.println("1");
		
		
		

	}

}
