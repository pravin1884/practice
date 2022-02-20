package com.dataproviderdemo;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name = "Login Data")
	public Object[][] dataProvider() {
		Object[][] obj = { { 12, 34 }, { 34, 89 }, { 56, 90 } };
		return obj;

	}
}
