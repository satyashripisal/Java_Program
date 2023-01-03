package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BeforeAfterClass {
 
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Login Successfully");
  }

  @AfterClass
  public void afterClass() {
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
