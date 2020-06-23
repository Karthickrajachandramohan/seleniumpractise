package co.Sel.Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tableexample {

		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to("http://www.leafground.com/pages/table.html");

		List<WebElement> column = driver.findElements(By.tagName("th"));
		int columncount = column.size();
		System.out.println("total no of columns "+ columncount);

		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int rowcount = row.size();
		System.out.println("total no of rows "+ rowcount);
		
		WebElement percent = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String totalpercentage = percent.getText();
		System.out.println("the total percent "+ totalpercentage);
		
		WebElement name = driver.findElement(By.xpath("//td[normalize-space()='Learn XPath']//following::td[4]"));
		String Mentor = name.getText();
		System.out.println("name of the mentor is " + Mentor );
	}
}
	