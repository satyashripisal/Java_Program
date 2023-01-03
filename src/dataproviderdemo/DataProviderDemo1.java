package dataproviderdemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 {

	@DataProvider(name = "TestData")
	public Object[][] getData1(){//declare Method
		Object[][] data = new Object[1][2];
		data[0][0] = "User1";
		data[0][1] = "Password1";
		
		return data;
		}
	@Test(dataProvider = "TestData")
	public void login (String Username ,String Password) {
		System.out.println("Username is :"+Username);
		System.out.println("Password is :"+Password);
	}
}
