package TestNG_Grouping;

import org.testng.annotations.Test;

public class ClassName {
  @Test(groups = {"sanity","regression"},priority=1)
  public void login() {
	  System.out.println("Login Successfully");
  }
  @Test(groups = {"sanity","regresssion"})
  public void logout() {
	  System.out.println("Logout Successfully");
  }
  @Test(groups = {"sanity"})
  public void search() {
	  System.out.println("Search Successfully");
  }
  @Test(priority=2)
  public void addVendor() {
	  System.out.println("Add Vendor Successfully");//
  }
  @Test(groups = {"regression"},priority=3)
  public void advancedSearch() {
	  System.out.println("Advanced Search Successfully");
  }
  @Test(groups = {"sanity","regression"},priority=5)
  public void prepaidRecharge() {
	  System.out.println("Prepaid Recharge Successfully");
  }
  @Test(groups = {"regression"},priority=6)
  public void billPayment() {
	  System.out.println("Bill Payment Successfully");
  }
  
}


