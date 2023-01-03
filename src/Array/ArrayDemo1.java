package Array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int abc[] = {10,20,30,40};
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
