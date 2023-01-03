package stringHandling;

public class StringComparision {
	
	public static void main(String[] args) {
		String str1 = "SELENIUM";
		String str2 = "selenium";
		String str3 = "SELENIUM";
		String str4 = "zSelenium";
		
		//Comparision 
		System.out.println(str1==str3);//true compare only object
		System.out.println(str1==str2);//false
		System.out.println(str1==str4);//false
		System.out.println(str1!=str4);//true
		
		//using equals() method
		System.out.println(str1.equals(str3));//true compare character of string
		System.out.println(str1.equals(str2));//false
		
		//compareTo() method
		System.out.println(str1.compareTo(str2));//uppercase to lowercase o/p will be negative value
		System.out.println(str2.compareTo(str1));//lowercase to uppercase o/p will be postive value
		System.out.println(str1.compareTo(str4));//negative
		System.out.println(str1.compareTo(str3));//both same then o/p will be zero
		
		//equalIgnoreCase
		System.out.println(str1.equalsIgnoreCase(str2));//true
		//upper and lower case letter ignored
		
		//toUpperCase()
		System.out.println(str2.toUpperCase());//convert to uppercase 
		
		//toLowerCase()
		System.out.println(str1.toLowerCase());//convert to lowercase
		System.out.println(str1.concat(str2).concat(str4));//multiple String concat at one time using concate()
		
		

	}

}
