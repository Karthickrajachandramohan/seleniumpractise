package testNg;

import org.testng.annotations.Test;

public class Dependsontest {
	@Test(dependsOnMethods = "lead" )
	public void employee() {
		System.out.println("a");
	}
	@Test(dependsOnMethods = "manager")
	public void lead() {
		System.out.println("b");
	}
	@Test(dependsOnMethods = "ceo")
	public void manager() {
		System.out.println("c");
	}
	@Test(enabled = true)
	public void ceo() {
		System.out.println("d");
	}

}
