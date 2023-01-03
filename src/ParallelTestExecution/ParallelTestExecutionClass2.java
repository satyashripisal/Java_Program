package ParallelTestExecution;

import org.testng.annotations.Test;

public class ParallelTestExecutionClass2 {
	@Test
	  public void testCase5(){
		  long id = Thread.currentThread().getId();
		  System.out.println("TestCase 5 is successfull"+"Thread id :"+id);
	  }
	  
		@Test
	  public void testCase6(){
		  long id = Thread.currentThread().getId();
		  System.out.println("TestCase 6 is successfull"+"Thread id :"+id);
	  }
}
