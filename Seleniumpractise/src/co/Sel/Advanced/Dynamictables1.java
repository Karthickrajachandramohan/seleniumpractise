package co.Sel.Advanced;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamictables1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");

		List<WebElement> columnname = driver.findElements(By.tagName("th"));
		int columncount = columnname.size();
		System.out.println("The total no of columns present are "+ columncount);

		List<WebElement> rowname = driver.findElements(By.tagName("tr"));
		int rowcount = rowname.size();
		System.out.println("The total no of rows present are " + rowcount );

		WebElement percentage = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String totalpercentage = percentage.getText();
		System.out.println("The total percentage is "+ totalpercentage);
		
		List<WebElement> vitaltask = driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> IndividualValues = new ArrayList<Integer>();
		
		for (WebElement element1 : vitaltask) {
			String seperatevalue = element1.getText().replace("%", "");
			System.out.println(seperatevalue);
			IndividualValues.add(Integer.parseInt(seperatevalue));

			
		}
		System.out.println("The values are " + IndividualValues);
		
		int leastvalue = Collections.min(IndividualValues);
		System.out.println("the least value is " + leastvalue);
		
		String newvalue = Integer.toString(leastvalue )+ "%";
		
		String finalxpath = "//td[normalize-space()="+"\""+ newvalue +"\""+"//following::td[1]";
		System.out.println(finalxpath );
		
		//td[normalize-space()='30']//following::td[1]
		
		WebElement lastelement = driver.findElement(By.xpath(finalxpath));
		lastelement.click();
		
		
		
		


	}


}
