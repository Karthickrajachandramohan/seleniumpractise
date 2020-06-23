package co.Sel.Testng;

import org.testng.annotations.Test;

public class Skipatestcase {
	@Test (priority = 0)
	public void startCar() {
		System.out.println("a");
	}
	@Test (priority = 1)
	public void putFirstGear() {
		System.out.println("b");
	}
	@Test (priority = 4 , enabled = false)
	public void turnONMusic() {
		System.out.println("4");
	}
	
	
	@Test (priority = 2)
	public void putSecondGear() {
		System.out.println("c");
	}
	@Test (priority = 3)
	public void offTheCar() {
		System.out.println("d");
	}

}
