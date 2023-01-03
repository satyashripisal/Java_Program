package AllJavaPrograms;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter The Number::");
//		int n = sc.nextInt();
		
		int n = 5;
		int temp = 0;
		for(int i=2;i<=n-1;i++) {//exclude 1 & 5
			if(n%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("Number is prime");
			
		}
		else {
			System.out.println("Number is not prime");
		}

	}

}
/*public class MyClass {
    public static void main(String args[]) {
      int n = 6;
      int temp=0;
      for(int i=1;i<=n;i++){
          if(n%i==0){
              temp= temp+1;
          }
      }
      if(temp==2){
          System.out.println("Number is  Prime");
      }else{
          System.out.println("Number is not prime");
      }
      
    }
}*/
