package Operators;

public class LogicalMain {

	public static void main(String[] args) {

		// && operator
		System.out.println((5>3) && (8>5));
		System.out.println((5>3) && (8<5));
		
		// || operator
		System.out.println((5<3) || (8>5));
	    
		System.out.println((5<3) || (8<5));
		 
		// ! operator
		System.out.println(!(5==3));
		System.out.println(!(5>3));
	}

}
/* &&--> true only if both expressions are true
||--> true if either exp.1 or exp.2 is true
!--> true if exp is false and vice versa */ 

