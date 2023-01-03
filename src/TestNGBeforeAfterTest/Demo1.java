package TestNGBeforeAfterTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo1 {
  @BeforeSuite
  public void browserOpen() {
	  System.out.println("Open The Browser");
  }
  @AfterSuite
  public void browserClose() {
	  System.out.println("Close The Browser");
  }
  @BeforeClass 
  public void login() {
	  System.out.println("Login Successfully");
  }
  @AfterClass
  public void logout() {
	  System.out.println("Logout Successfully");
  }
  @Test
  public void addProduct() {
	  System.out.println("Add product successfully");
  }
  @Test
  public void addVendor() {
	  System.out.println("Add vendor successfully");
  }
  @Test
  public void addCurrency() {
	  System.out.println("Add currency successfully");
  }

}
