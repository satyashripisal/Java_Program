package Array;

public class ArrayOperation {

	public static void main(String[] args) {
	    
		int array1[] = {1,2,3,4,5};
	     int array2[] = array1;//copy
	    
	     System.out.println("Array Length = " +array2.length);//length = 5
	     
	     for(int abc:array2) {//Enhanced for loop
	    	 System.out.println(abc);//print
	     }

	}

}
