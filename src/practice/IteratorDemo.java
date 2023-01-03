package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList a = new ArrayList() ;

		a.add(4);
		a.add(5);
		a.add(7);
		a.add("Hello");
		
		Iterator it = a.iterator();//iterator will print element one by one
		//it.remove();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
