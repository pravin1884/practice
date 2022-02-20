package com.testng.demo;

import org.testng.annotations.Test;

public class Class2 {
	@Test(priority = 1)
	public void m3() {
		System.out.println("m3 method in class2");
	}
	
	@Test(priority = 0)
	public void m4() {
		System.out.println("m4 method in class2");

	}
	@Test(priority = 2)
	public void m8() {
		System.out.println("m8 method in class2");

	}
	@Test(priority = 3)
	public void m9() {
		System.out.println("m9 method in class2");

	}



}
