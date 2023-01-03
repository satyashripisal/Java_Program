package Stringbuilder;


public class StringBuilderExample {

	public static void main(String[] args) {
          // concatenation of string
//		StringBuilder sb = new StringBuilder("Hello");		
//		sb.append("Java");	
//		System.out.println(sb);//HelloJava
		
		//StringBuilder Capacity() method
//		StringBuilder sb = new StringBuilder();
//		System.out.println(sb.capacity());//Bydefault 16
//		sb.append("Hello");
//     	System.out.println(sb.capacity());// 16
//     	sb.append("Java is my favourite language");
//     	System.out.println(sb.capacity());//34
//     	sb.append("abc");
//     	System.out.println(sb.capacity());//70
		
		     //StringBuilder delete() method
//		StringBuilder sb = new StringBuilder("Hello");
//		sb.delete(1, 3);
//		System.out.println(sb);
//		sb.append(" Java");//Hlo Java
//		sb.delete(3,6);
//		System.out.println(sb);
		    
		   //StringBuilder replace() method
//		StringBuilder sb = new StringBuilder("Hello");
//		sb.replace(1, 3, "Java");
//		System.out.println(sb);//HJavalo
//		sb.replace(2, 5, "abcd");
//		System.out.println(sb);//HJabcdlo
		
		    //StringBuilder reverse() method
		StringBuilder sb = new StringBuilder("My Name Is Satyashri");
		
		sb.reverse();
		System.out.println(sb);//olleH
		
		
	
	
		

	}

}
