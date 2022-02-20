package com.listnersPractice.takeScreenShot;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(MyListnener.class)
public class TestClass extends BaseClass {
	@Test
	public void m1() {
		System.out.println("Test case 1");

	}
	@Test
	public void m2() {
		System.out.println("Test case 2");
		throw new AssertionError();

	}
	@Test
	public void m3() {
		System.out.println("Test case 3");

	}
	@Test
	public void m4() {
		System.out.println("Test case 4");

	}

}
