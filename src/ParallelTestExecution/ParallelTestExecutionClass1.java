package ParallelTestExecution;

import org.testng.annotations.Test;

public class ParallelTestExecutionClass1 {
	@Test
	  public void testCase1(){
		  long id = Thread.currentThread().getId();
		  System.out.println("TestCase 1 is successfull"+"Thread id :"+id);
	  }
	 
		@Test
	  public void testCase2(){
		  long id = Thread.currentThread().getId();
		  System.out.println("TestCase 2 is successfull"+"Thread id :"+id);
	  }
	  
		@Test
	  public void testCase3(){
		  long id = Thread.currentThread().getId();
		  System.out.println("TestCase 3 is successfull"+"Thread id :"+id);
	  }
	 
		@Test
	  public void testCase4(){
		  long id = Thread.currentThread().getId();
		  System.out.println("TestCase 4 is successfull"+"Thread id :"+id);
	  }
}
