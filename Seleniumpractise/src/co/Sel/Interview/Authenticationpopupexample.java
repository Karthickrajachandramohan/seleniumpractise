package co.Sel.Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Authenticationpopupexample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//To handle the authentication pop ups
		
		//syntax- http://username:password@url.com //sending credentials via url 	
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//we can handle this authentication pop ups by  using the thirdparty tools like sikuli , Autoit 


	}

}
