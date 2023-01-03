package Java;

import java.util.Scanner;

public class RemoveDuplicateCharacter {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int f = 1;
		while(f!=0) {
			
			System.out.println("Enter the String");
			String abc = sc.next();
		
		    String nw = " ";
		
		System.out.println("Original String: "+abc);
		System.out.println(abc.length());
		
		for(int i=0;i<abc.length();i++) {
			char ch = abc.charAt(i);
			
			if(ch!=' ') {
			nw = nw + ch;
			abc = abc.replace(ch, ' ');
			}
		}
		System.out.println("New word = "+nw);
		}
	
//	String str= "$un!t@ !$ $m@rt";   
//	str = str.replaceAll("[@!$]", "");  
//	System.out.println(str);  
	}
}
