package AllJavaPrograms;

import java.util.Scanner;

public class FibonnaciSeriesByUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :: ");
		int no = sc.nextInt();
		int  a =0, b =1, c;
		for(int i=1; i<=no; i++) {
			c = a+b;
			System.out.println(c);
	        a = b;
			b = c;
			
			
		}
		

	}

}
