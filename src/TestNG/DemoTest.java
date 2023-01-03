package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
  @Test
  public void verifyTitle() {
	  Assert.assertEquals("Yahoo", "Yahoo");
  }
  @Test
  public void abcd() {
	  Assert.assertEquals("Gmail", "Gmail1");
  }
  @Test
  public void abc() {
	  Assert.assertEquals("Gmail", "Gmail");
}
 
}