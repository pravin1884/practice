package com.dataproviderdemo;

import org.testng.annotations.Test;

public class TestClass {
	  @Test(dataProvider = "first",dataProviderClass = DataDemo.class)
      public void testMethod(String name,int age) {
		  System.out.println(name+" "+age);

	}
}
