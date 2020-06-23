package testNg;

import org.testng.annotations.Test;

public class Groupingexample {
	@Test(groups = {"Apple"})
	public void iphone1() {
		System.out.println("iphone testing");

	}
	@Test(groups = {"Apple"})
	public void iphone2() {
		System.out.println("iphone testing");
	}
	@Test(groups = {"moto"})
	public void moto1() {
		System.out.println("moto testing");
	}
	@Test(groups = {"moto"})
	public void moto2() {
		System.out.println("moto testing");
	}
	@Test(groups = {"lenovo"})
	public void lenovo1() {
		System.out.println("lenovo1 testing ");
	}
	@Test(groups = {"lenovo"})
	public void lenovo2() {
		System.out.println("lenovo2 testing");
	}
	@Test(groups = {"vivo"})
	public void vivo1() {
		System.out.println("vivo testig");


	}
	@Test(groups = {"vivo"})
	public void vivo2() {
		System.out.println("vivo testing");
	}
}
