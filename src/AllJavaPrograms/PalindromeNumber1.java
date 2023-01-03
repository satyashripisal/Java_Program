package AllJavaPrograms;

import java.util.Scanner;

public class PalindromeNumber1 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter The Number:: ");
//		int no = sc.nextInt();
		int no = 121;
		int temp = no;//121
		int rev = 0, rem;
		
		while(temp!=0) { //12 1
			rem = temp%10;//1 2 1
			rev = rev*10 + rem;//1 12 121
			temp = temp/10;//12 1 0
			
		}
		if(no == rev) {//121==121
			System.out.println(no +" is Palindrome Number");
		}
		else {
			System.out.println(no +" is not a palindrome Number");
		}
		

	}

}
