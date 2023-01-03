package AllJavaPrograms;

import java.util.Scanner;

public class ReverseStringByUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String:: ");
		String name = sc.next();
		int leng = name.length();
		System.out.println(leng);
		String rev = " ";
		for(int i = leng-1; i>=0; i--) {
			rev = rev + name.charAt(i);
			
		}
		System.out.println("Reverse of String::" +rev);
	}

}
