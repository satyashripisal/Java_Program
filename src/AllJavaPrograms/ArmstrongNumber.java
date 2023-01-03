package AllJavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
        int number = sc.nextInt();
        int t1 = number;
        int length = 0;
        while(t1!=0) {
        	t1 = t1/10;
        	length = length +1;
        }
        int t2 = number;
        int arm = 0;
        int rem;
        while(t2!=0) {
        	int mul =1;
        	rem = t2%10;
        	for(int i=1; i<=length; i++) {
        		mul = mul*rem;
        	
        	}
        	arm =arm + mul;
        	t2 = t2/10;
        	
        }
        if(arm==number) {
        	System.out.println(number + " is Armstrong Number");
        	
        }
        else {
        	System.out.println(number + " is not Armstrong Number");
        	
        }*/
		int no=153;
		int sum=0;//27//152
		int rem;
		for(int i=no;i>0;i=i/10) {//153 true 15//5//
			rem=i%10;//3//5//
			sum= sum+rem*rem*rem;//27//152
		}
			if(sum==no) {
				System.out.println("no is Armstrong");
			}else {
				System.out.println("no is not");
			}
			
		
	}

}
