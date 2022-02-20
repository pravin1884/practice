package com.dataproviderdemo;

import org.testng.annotations.Test;

public class FirstDataProvider {
	
	@Test(dataProvider = "Login Data",dataProviderClass = DataProviders.class)
	public void tc_01(int i, int j) {
         System.out.println(i+"\t"+j);
	}

	
}
