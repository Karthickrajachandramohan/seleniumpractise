package co.Sel.Interview;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maximizeexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//driver.manage().window().maximize();
		
		//Dimension dimension = new Dimension(1366, 768);
		
		//driver.manage().window().setSize(dimension);
		
		// 3rd way of maximizing is Chromeoptions
		
		/*ChromeOptions chromeoptions = new ChromeOptions(); -its only applicable for chrome
		chromeoptions.addArguments("--start-maximized"); */
		
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
