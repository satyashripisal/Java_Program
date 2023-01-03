package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer>a = new ArrayList <>();
		a.add(100);//0 index
		a.add(200);//add() method//1st index
		a.add(300);//2nd index
		int val =a.get(1);
		System.out.println(val);//200
		System.out.println(a.get(2));//300
		
		//Return /Print  size of arraylist
		
		int size = a.size();
		System.out.println(size);//3
		
		//Remove an Element
		
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		a.remove(1);
		System.out.println(a.get(1));//300
		//System.out.println(a.get(2));//Run Time Error "Array out of bound"
		
		//check the exitance of elements
		
		System.out.println(a.contains(100));//true
		System.out.println(a.contains(400));//false
		
		boolean status = a.contains(300);
		System.out.println(status);//true
		
		System.out.println(a.size());//2
		
		//100 300 400 500
		
		a.add(400);
		a.add(500);
		
		System.out.println(a.size());//4
		
		//Remove all elements
		
		a.clear();
		int abc1 = a.size();
		
		System.out.println(abc1);//0
		
		
	}

	

}
