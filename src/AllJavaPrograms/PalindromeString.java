package AllJavaPrograms;

import java.util.Scanner;


public class PalindromeString {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter The String you want to check:: ");
	    String name = sc.next();
	    //String name = str;//maam
	    String rev = "";
	    int leng = name.length();
	    for(int i = leng-1; i>=0; i--) {
	    	rev = rev + name.charAt(i);
	    	
	    }
	 //   if(name.equals(rev)){
		if(name.equalsIgnoreCase(rev)) {
			System.out.println("The String is Palindrome");
	    	
	    }
		else {
			System.out.println("The String is not Palindrome");
		}

	}

}
