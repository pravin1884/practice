package com.testng.demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeTest
	public void m1() {
		System.out.println("m1 method in class1");
	}

}
