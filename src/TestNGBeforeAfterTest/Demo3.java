package TestNGBeforeAfterTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {
  @BeforeTest
  public void login() {
	  System.out.println("Test Login Successfully" );
  }
 @AfterTest
  public void logout() {
	  System.out.println("Test Logout Successfully");
  }
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

