package ArrayList;

import java.util.ArrayList;

public class ArrayListString {
	
	public static void main(String[] args) {
		
		ArrayList <String> a= new ArrayList <> ();
		
		a.add("abc");
		a.add("pqr");
		a.add("xyz");
		String val = a.get(1);
		System.out.println(val);//pqr
		System.out.println(a.get(2));//xyz
		
		//Return/Print size of ArrayList
		
		int size = a.size();
		System.out.println(size);//3
		
		//Remove an Element
		
		System.out.println(a.get(1));//pqr
		System.out.println(a.get(2));//xyz
		//System.out.println(a.get(3));
		a.remove(1);//remove pqr from ArrayList
		System.out.println(a.get(1));//xyz
		
		//Check the existance of an element
		
		System.out.println(a.contains("abc"));//true
		System.out.println(a.contains("pqr"));//false
		
		boolean status = a.contains("abc");
		System.out.println(status);//true
		
		System.out.println(a.size());//2
		
		//abc xyz ArrayList ArrayList1
		
		a.add("ArrayList");
		a.add("ArrayList1");
		
		System.out.println(a.size());//4
		
		//Remove all Elements
		
		a.clear();
		int abc1 =a.size();
		System.out.println(abc1);//0
		
		
		
		
		
		
		

	}

}
