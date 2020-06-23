package testNg;

import org.testng.annotations.Test;

public class Prioritynew {
    @Test(priority = 0)
	public void startTheCar() {
		System.out.println("a");
	}
    @Test(priority = 1)
	public void putTheFirstGear() {
		System.out.println("b");

	}
    @Test(priority = 2)
	public void secondGear() {
		System.out.println("c");
	}
    @Test(priority = 3)
	public void thirdGear() {
		System.out.println("d");
	}
    @Test(priority = 4)
	public void offTheCar() {
		System.out.println("e");
	}


}
