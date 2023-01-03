package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
  @Test(priority=2)
  public void login() {
	  System.out.println("Login Successfully");
  }
  @Test(priority=1)
  public void logout() {
	  System.out.println("Logout Successfully");
  }
  @Test(dependsOnMethods= {"advancedSearch"})
  public void search() {
	  System.out.println("Search Successfully");
  }
  @Test
  public void advancedSearch() {
	  Assert.assertEquals("Gmail", "Gmail");
  }
}
