package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void verifyPageTitle() {
	  String expected_Title = "Google";
	  String actual_Title = "Google1";
	  System.out.println("Test Case execution started");
	  Assert.assertEquals(expected_Title, actual_Title);
	  System.out.println("Test Case execution finished");
  }
}
