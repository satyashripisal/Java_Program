package AllJavaPrograms;

import java.util.Scanner;

public class ArrayMinElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of Array:");
		int n = sc.nextInt();
		System.out.println("Enter the "+n+" number of Array Element :");
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
				
			}
			
		}
		
		System.out.println("Minimum Element is: "+min );

	}

}
