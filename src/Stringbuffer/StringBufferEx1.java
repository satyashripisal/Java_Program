package Stringbuffer;

public class StringBufferEx1 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
	    System.out.println(sb);
		
//		sb.append("Java");//now original string is changed
//		System.out.println(sb);//print HelloJava
		
		sb.insert(1, "Java");//now original string is changed
		System.out.println(sb);//print HJavaelloJava
		
		sb.replace(1, 3, "ABC");
		System.out.println(sb);//print HABClo
		
		sb.delete(1, 3);
		System.out.println(sb);//print Hlo
		
		sb.reverse();
		System.out.println(sb);
//		sb.capacity();
//		System.out.println(sb);
		
//		StringBuffer sb = new StringBuffer();
//		System.out.println(sb.capacity());//default 16
//		sb.append("Hello");
//		System.out.println(sb.capacity());//again 16
//		sb.append("Java is my favourite language");
//		System.out.println(sb.capacity());//now 16*2+2=34
//		sb.append("Java");
//		System.out.println(sb.capacity());//34*2+2=70
		
		
		
		

	}

}