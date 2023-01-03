package TestNG;

import org.testng.annotations.Test;

public class InvocationCountDemo {
  @Test(invocationCount = 3)
  public void test1() {
	  System.out.println("Test1 is exicute successfully");
  }
}
