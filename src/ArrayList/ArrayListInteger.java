package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayListInteger {

	public static void main(String[] args) {
//		List<String> al=new ArrayList<String>();//creating arraylist    
//		  al.add("Sonoo");//adding object in arraylist    
//		  al.add("Michael");    
//		  al.add("James");    
//		  al.add("Andy");    
//		  //traversing elements using Iterator  
//		  Iterator itr=al.iterator();  
//		  while(itr.hasNext()){  
//		   System.out.println(itr.next());  
//		  } 
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();
	        hm.put(100, "Amit");
	        hm.put(104,"Amit"); 
	        hm.put(101,"Vijay");
	        hm.put(102,"Rahul");
	        System.out.println("-----------Hash map-----------");
	        for (Map.Entry m:hm.entrySet()) {
	            System.out.println(m.getKey()+" "+m.getValue());
	        }
	}

}
