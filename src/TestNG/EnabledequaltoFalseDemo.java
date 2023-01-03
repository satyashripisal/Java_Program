package TestNG;

import org.testng.annotations.Test;

public class EnabledequaltoFalseDemo {
  @Test(enabled = false)
  public void test2() {
	  System.out.println("B.Test2");
  }
  @Test
  public void test3() {
	  System.out.println("B.Test3");
  }
}
