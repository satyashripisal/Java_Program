package TestNG;

import org.testng.annotations.Test;

public class PriorityTC {
	 @Test(priority=2)
	  public void verifyTitle() {
		  System.out.println("This is Verify Title method");
	  }
	  @Test(priority=1)
	  public void abcd() {
		  System.out.println("This is abcd method");
	  }
	  @Test(priority=3)
	  public void abc() {
		  System.out.println("This is abc method");
	  }
}
