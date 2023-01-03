package Array;

public class ArrayOperation1 {


	public static void main(String[] args) {
	   
		int array1[] = {1,2,3,4,5};
		int array2[] = array1;
		System.out.println("Array Length:"+array2.length);
		
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}

	}

}
