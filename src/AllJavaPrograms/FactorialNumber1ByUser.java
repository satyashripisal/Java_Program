package AllJavaPrograms;

import java.util.Scanner;

public class FactorialNumber1ByUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int no = sc.nextInt();
		 
		int fact = 1;
		for(int i=1;i<=no;i++) {
		
			fact = fact*i;
		}
		System.out.println(fact);

	}

}
