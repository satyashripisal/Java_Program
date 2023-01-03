package statements;

import java.util.Scanner;

public class IfDemoPositiveNegative {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		//int a=60;
		//int number=0;
		if(number>0) {
			System.out.println("POSITIVE");
		}
		else if(number<0) {
			System.out.println("NEGATIVE");
		}
		else {
			System.out.println("ZERO");
		}
		

	}


}

