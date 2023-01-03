package AllJavaPrograms;

import java.util.Scanner;

public class ArrayAscending {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = sc.nextInt();
		
		//Declare & initialize Array & other Required variables
		
		int a[] = new int[n];//Declaration of Array
		
		int i, j, temp=0;
		
		// Now get all array elements from user
		
		System.out.println("Enter " + n + " number of array elements:");//3
		
		for(i=0;i<n;i++) {//i=0,1,2 <3
			a[i]=sc.nextInt();
			}
		
		//Print all array elements
		
		System.out.println("All array elements are:");
		
		for(i=0;i<n;i++) {
			System.out.println(" "+ a[i]);
		}
		
		//now arrange array element in Ascending Order
		
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] =a[j];
					a[j]=temp;
					
				}
			}
		}
		
		//Print array in Ascending Order
		
		System.out.println("\n Array Elements in Ascending Order:");
		
		for(i=0;i<n;i++) {
			System.out.println(" "+a[i]);
		}

	}

}
