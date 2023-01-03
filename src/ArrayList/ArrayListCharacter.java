package ArrayList;

import java.util.ArrayList;

public class ArrayListCharacter {
	
	public static void main(String[] args) {
	
		ArrayList<Character>a = new ArrayList <>();
		
		a.add('x');//index 0
		a.add('y');//index 1
		a.add('z');//index 2
		
		System.out.println(a.get(1));//y
		
		char var = a.get(2);
		System.out.println(var);//z
		
		//Returns/ print size of the arraylist
		
		int size = a.size();
		System.out.println(size);//3
		
		//Remove an Element
		System.out.println(a.get(1));//y
		System.out.println(a.get(2));//z
		//System.out.println(a.get(3));//Run time Error 'array out of bound'
		
		a.remove(1);
	
		System.out.println(a.get(1));//z
		//System.out.println(a.get(2));//Index out of Exception Run Time Error
		
		//Check existence of the elements
		System.out.println(a.contains('x'));//true
		System.out.println(a.contains('y'));//false
		
		boolean status = a.contains('z');
		System.out.println(status);//true
		
		System.out.println(a.size());//2
		
		//x z p q
		a.add('p');
		a.add('q');
		
		System.out.println(a.size());
		
		//Remove all Elements
		
		a.clear();
		System.out.println(a.size());
		int ab =a.size();
		System.out.println(ab);
	
		
		
		
		
	
	
		
		 
		 
	}

}
