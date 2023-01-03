package TestNG;

import org.testng.annotations.Test;

public class TimeOut {
  @Test
  public void contactVerify() {
	  System.out.println("Contact Verification successful");
  }
  @Test(timeOut = 1000) 
  public void landingPage() {
	  System.out.println("Landing page verification is successful");
  }
  @Test
  public void loanContact() {
	  System.out.println("Loan contact detail verification");
  }
}
