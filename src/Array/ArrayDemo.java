package Array;

public class ArrayDemo {
public static void main(String[] args) {
		
		int abc[] = new int[4];  //declaration or initialization
		
		abc[0] = 10;
		abc[1] = 20;
		abc[2] = 30;
		abc[3] = 40;
		
		System.out.println(abc[0]);//10
		System.out.println(abc[1]);//20
		System.out.println(abc[2]);//30
		System.out.println(abc[3]);//40
		
		System.out.println(abc[0]+abc[1]);//30
		System.out.println(abc[0]-abc[1]);//-10
		System.out.println(abc[0]*abc[1]);//200
		System.out.println(abc[0]/abc[1]);//0.5
		System.out.println(abc[0]>abc[1]);//false
		System.out.println(abc[0]<abc[1]);//true
		System.out.println(abc[0]==abc[1]);//false
		System.out.println(abc[0]!=abc[1]);//true

	}

}
/* Array--> is a collection of similar type of data.The length of an array is established when the array is created.
Declaration = int abc[] = new int[size of array] */

