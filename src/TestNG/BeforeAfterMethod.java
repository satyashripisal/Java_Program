package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeAfterMethod {
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Login Successfully");
  }

  @AfterMethod
  public void afterMethod() {
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
