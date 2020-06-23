package testNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterizedexample {
	@Test
	@Parameters("Name")
	public void method1(String name) {
		
		System.out.println("Name is " + name);
	}

}
