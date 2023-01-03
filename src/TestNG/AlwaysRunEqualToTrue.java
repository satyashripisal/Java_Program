package TestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AlwaysRunEqualToTrue {
  @Test
  public void login() {
	  System.out.println("Login Successfully");
  }
  @Test
  public void logout() {
	  System.out.println("Logout Successfully");
  }
  @Test(dependsOnMethods= {"advancedSearch"},alwaysRun=true)
  public void search() {
	  System.out.println("Search Successfully");
  }
  @Test
  public void advancedSearch() {
	  Assert.assertEquals("Gmail", "Gmail1");
  }
}
