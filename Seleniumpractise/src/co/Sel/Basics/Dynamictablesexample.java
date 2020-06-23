package co.Sel.Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamictablesexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		List<WebElement> columncount = driver.findElements(By.tagName("th"));
		int columnsize =  columncount.size();
		System.out.println("The column count is "+ columnsize);
		
		List<WebElement> rowcount = driver.findElements(By.tagName("tr"));
		int rowsize = rowcount.size();
		System.out.println("The row size is " + rowsize);
		
		WebElement getpercent = driver.findElement(By.xpath("//td[normalize-space() ='Learn to interact with Elements']//following::td[1]"));
        String percentageprogress = getpercent.getText();
        System.out.println("The progress percentage  is " + percentageprogress);
        
        
        List<WebElement> tables = driver.findElements(By.xpath("//td[2]"));
        
        List<Integer> individualvalues = new ArrayList<Integer>();
        
        for (WebElement leastvalues : tables) {
        	String allvalues = leastvalues.getText().replace("%", "");
        	individualvalues.add(Integer.parseInt(allvalues));
        	System.out.println(individualvalues);
			
		}
        
       int smallvalue = Collections.min(individualvalues);
       System.out.println("The small value is " + smallvalue);
       
       //td[normalize-space() = "30%"]//following::td[1]
       
       String newvalue = Integer.toString(smallvalue);
       System.out.println(newvalue + "%");
       
       String FinalXpath =   "//td[normalize-space() = newvalue]//following::td[1]" ;
       System.out.println(FinalXpath);
       
       System.out.println("a");
       
       WebElement finalelement = driver.findElement(By.xpath(FinalXpath));
       finalelement.click();
       
       
       
       

       
       

        
        
        
        
	}

}
