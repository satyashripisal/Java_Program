package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
	@Test
	  public void verifyPageTitle() {
		  String expected_Title = "Google";
		  String actual_Title = "Google1";
		 
		  SoftAssert softassert = new SoftAssert();
		  System.out.println("Test Case execution started");
		  softassert.assertEquals(actual_Title, expected_Title);
		  
		  String expected_PageUrl = "google.com";
		  String actual_PageUrl = "google.com1";
		  softassert.assertNotEquals(expected_PageUrl, actual_PageUrl);
		  System.out.println("Test Case execution finished");
    }
}
