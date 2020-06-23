package co.Sel.Testng;

import org.testng.annotations.Test;

public class Dependenciesexample {
	@Test(enabled = false)
	public void highSchool() {
		System.out.println("a");
			}

	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("b");
	}
	@Test(dependsOnMethods = "higherSecondary")
	public void degree() {
		System.out.println("c");
	}
}
