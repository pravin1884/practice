package com.dataproviderdemo;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataDemo {
	@DataProvider(name = "first")
    public Object[][] testData() {
		Object[][] obj = {{"pravin",34},{"swati",38},{"bharti",35}};
		return obj;
		ITestContext

	}
}
